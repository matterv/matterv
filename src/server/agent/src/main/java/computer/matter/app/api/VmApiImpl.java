package computer.matter.app.api;

import com.google.common.collect.Streams;
import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.NetworkDao;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.agent.db.model.VirtualMachineDo;
import computer.matter.agent.job.vmops.VmOps;
import computer.matter.agent.job.vmops.VmOpsJobConfig;
import computer.matter.agent.job.vmops.VmOpsJobRunner;
import computer.matter.agent.job.vmprovision.VmProvisionJobConfig;
import computer.matter.agent.job.vmprovision.VmProvisionJobRunner;
import computer.matter.agent.job.vmprovision.VmProvisionRequirement;
import computer.matter.host.api.VmApi;
import computer.matter.host.model.*;
import computer.matter.job.Job;
import computer.matter.job.JobClient;
import computer.matter.job.JobStatus;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.BinaryUnits;
import computer.matter.os.OsInfoUtil;
import computer.matter.pagination.PaginationUtil;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineStatus;
import computer.matter.vm.Vnc;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class VmApiImpl implements VmApi {
  private final Logger logger = LoggerFactory.getLogger(VmApiImpl.class);
  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;
  private JobClient jobClient;

  public VmApiImpl(JobClient jobClient, Jdbi jdbi, JsonUtil jsonUtil) {
    this.jobClient = jobClient;
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
  }

  @Override
  public ConfigVirtualMachineResponse configVm(String vmId) {
    return null;
  }

  @Override
  public CreateVirtualMachineResponse createVm(CreateVirtualMachineRequest createVirtualMachineRequest) {
    logger.debug("Starting to create vm: {}", createVirtualMachineRequest);
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var networkDao = jdbi.onDemand(NetworkDao.class);

    var vm = new VirtualMachineDo();
    vm.memoryInMB = createVirtualMachineRequest.getMemory();
    vm.cpu = createVirtualMachineRequest.getCpu();
    vm.name = createVirtualMachineRequest.getName();
    vm.status = VirtualMachineStatus.CREATING;
    vm.uuid = UUID.randomUUID();
    vm.config = new VirtualMachineConfig();
    vm.osId = OsInfoUtil.getOsId(createVirtualMachineRequest.getOsInfo().getOsType().toString());
    vm.id = vmDao.insert(vm);

    var config = new VmProvisionJobConfig();

    var requirement = new VmProvisionRequirement();
    requirement.osId = vm.osId;
    requirement.name = createVirtualMachineRequest.getName();
    requirement.cpu = createVirtualMachineRequest.getCpu();
    requirement.memoryInMB = BinaryUnits.toMiB(createVirtualMachineRequest.getMemory());
    requirement.diskControllers = createVirtualMachineRequest.getDiskControllers();
    requirement.diskRequirements = Streams.mapWithIndex(
            createVirtualMachineRequest.getDisks().stream(),
            (d, idx) -> {
              var dr = new VmProvisionRequirement.DiskRequirement();
              dr.sizeInGB = d.getSize();
              dr.storageId = UUID.fromString(d.getStorageId());
              dr.id = (int) idx;
              dr.controllerId = d.getControllerId();
              return dr;
            }
    ).toList();
    requirement.networkRequirements =
            createVirtualMachineRequest
                    .getNetworks()
                    .stream()
                    .map(n -> {
                              var networkDo = networkDao.getAll()
                                      .stream()
                                      .filter(no -> no.uuid.toString().equals(n.getNetworkId()))
                                      .findFirst();
                              if (networkDo.isEmpty()) {
                                throw new IllegalArgumentException("network id is invalid: " + n.getNetworkId());
                              }

                              return new VmProvisionRequirement.NetworkRequirement(
                                      n.getId(), networkDo.get().name, n.getConnected());
                            }
                    ).toList();

    requirement.cdrom = createVirtualMachineRequest.getCdrom();
    config.requirement = requirement;
    config.vmId = vm.uuid;

    var configStr = jsonUtil.toJson(config);

    var job = jobClient.schedule(configStr, VmProvisionJobRunner.jobType, vm.uuid.toString(), null);

    var rsp = new CreateVirtualMachineResponse();
    rsp.setJobId(job.uuid.toString());
    rsp.setVm(fromVmDo(vm, Optional.of(job)));
    return rsp;
  }

  private computer.matter.host.model.Vnc fromVnc(Vnc vnc) {
    var v = new computer.matter.host.model.Vnc();
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.get();
    if (host.name != null) {
      v.setHost(host.name);
    }
    v.setPort(vnc.port());
    return v;
  }

  private VirtualMachine fromVmDo(VirtualMachineDo vmDo, Optional<Job> jobOpt) {
    var vm = new VirtualMachine();
    vm.id(vmDo.uuid.toString());
    vm.cpu(vmDo.cpu);
    vm.setMemory(vmDo.memoryInMB);
    vm.name(vmDo.name);
    vm.setUuid(vmDo.uuid);
    vm.setStatus(VMStatus.fromString(vmDo.status.name()));
    vm.setVmConfig(jsonUtil.toJson(vmDo.config));
    vm.setIpAddresses(vmDo.ipAddresses.stream().map(i -> {
      var ip = new IpAddress();
      ip.setIp(i.ip());
      ip.setType(IpAddressType.fromString(i.type().name()));
      return ip;
    }).toList());

    if (vmDo.vnc != null) {
      vm.setVnc(fromVnc(vmDo.vnc));
    }
    return vm;
  }

  @Override
  public VirtualMachine getVm(String vmId) {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var jobDao = jdbi.onDemand(JobDao.class);
    var pendingJobs = jobDao.findByObjectIdAndStatus(vmId, JobStatus.notInTerminalState());
    return fromVmDo(vmDao.findByUUID(vmId), pendingJobs.stream().findFirst());
  }

  @Override
  public PaginatedVMResponse getVms(Integer page, Integer limit) {
    List<VirtualMachineDo> vmsDos = new LinkedList<>();
    jdbi.useExtension(VirtualMachineDao.class, vmDao -> vmsDos.addAll(vmDao.getAll()));
    var jobDao = jdbi.onDemand(JobDao.class);
    var vms = vmsDos.stream().map(v -> {
      var pendingJobs = jobDao.findByObjectIdAndStatus(v.uuid.toString(), JobStatus.notInTerminalState());
      return fromVmDo(v, pendingJobs.stream().findFirst());
    }).toList();

    var response = new PaginatedVMResponse();

    response.setItems(PaginationUtil.getPage(vms, page, limit));
    return response;
  }

  @Override
  public PowerOffVirtualMachineResponse powerOffVm(String vmId) {
    logger.debug("Starting to poweroff vm: {}", vmId);
    var jobConfig = new VmOpsJobConfig();
    jobConfig.ops = VmOps.POWER_OFF;
    jobConfig.vmId = UUID.fromString(vmId);

    var jobConfigStr = jsonUtil.toJson(jobConfig);
    var job = jobClient.schedule(jobConfigStr, VmOpsJobRunner.jobType, vmId, null);
    var rsp = new PowerOffVirtualMachineResponse();
    rsp.setJobId(job.uuid.toString());
    rsp.setVmId(vmId);
    return rsp;
  }

  @Override
  public PowerOnVirtualMachineResponse powerOnVm(String vmId) {
    logger.debug("Starting to powerOn vm: {}", vmId);
    var jobConfig = new VmOpsJobConfig();
    jobConfig.ops = VmOps.POWER_ON;
    jobConfig.vmId = UUID.fromString(vmId);

    var jobConfigStr = jsonUtil.toJson(jobConfig);
    var job = jobClient.schedule(jobConfigStr, VmOpsJobRunner.jobType, vmId, null);
    var rsp = new PowerOnVirtualMachineResponse();
    rsp.setJobId(job.uuid.toString());
    rsp.setVmId(vmId);
    return rsp;
  }

  @Override
  public ResetVirtualMachineResponse resetVm(String vmId) {
    logger.debug("Starting to reset vm: {}", vmId);
    var jobConfig = new VmOpsJobConfig();
    jobConfig.ops = VmOps.RESET;
    jobConfig.vmId = UUID.fromString(vmId);

    var jobConfigStr = jsonUtil.toJson(jobConfig);
    var job = jobClient.schedule(jobConfigStr, VmOpsJobRunner.jobType, vmId, null);
    var rsp = new ResetVirtualMachineResponse();
    rsp.setJobId(job.uuid.toString());
    rsp.setVmId(vmId);
    return rsp;
  }
}
