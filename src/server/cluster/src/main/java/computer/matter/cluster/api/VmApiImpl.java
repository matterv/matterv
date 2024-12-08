package computer.matter.cluster.api;

import computer.matter.cluster.db.model.DiskDao;
import computer.matter.cluster.db.model.DiskDo;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.db.model.VirtualMachineDo;
import computer.matter.cluster.job.createVm.CreateVmJobConfig;
import computer.matter.cluster.job.createVm.CreateVmRunner;
import computer.matter.cluster.job.vmops.VmOpsJobConfig;
import computer.matter.cluster.job.vmops.VmOpsRunner;
import computer.matter.cluster.model.CreateVirtualMachineOnHostRequest;
import computer.matter.cluster.model.CreateVirtualMachineResponse;
import computer.matter.cluster.model.Disk;
import computer.matter.cluster.model.Disks;
import computer.matter.cluster.model.PaginatedVMResponse;
import computer.matter.cluster.model.VMStatus;
import computer.matter.cluster.model.VirtualMachine;
import computer.matter.cluster.model.Vnc;
import computer.matter.job.JobClient;
import computer.matter.json.JsonUtil;
import computer.matter.os.OsInfoUtil;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineStatus;
import computer.matter.vm.VirtualMachineType;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;

public class VmApiImpl implements VmApi {
  private final VirtualMachineDao virtualMachineDao;
  private final DiskDao diskDao;
  private final Jdbi jdbi;
  private final JobClient jobClient;
  private final JsonUtil jsonUtil;

  public VmApiImpl(VirtualMachineDao virtualMachineDao, DiskDao diskDao, Jdbi jdbi, JobClient jobClient,
                   JsonUtil jsonUtil) {
    this.virtualMachineDao = virtualMachineDao;
    this.diskDao = diskDao;
    this.jdbi = jdbi;
    this.jobClient = jobClient;
    this.jsonUtil = jsonUtil;
  }


  static VirtualMachine fromVmDo(VirtualMachineDo vmDo) {
    var vm = new VirtualMachine();
    vm.setCpu(vmDo.cpu);
    vm.setId(vmDo.uuid.toString());
    vm.setName(vmDo.name);
    vm.setStatus(VMStatus.fromString(vmDo.status.name()));
    vm.setUuid(vmDo.uuid);
    vm.setMemory(vmDo.memoryInBytes);

    if (vmDo.uuidOnHost != null) {
      var vnc = new Vnc();
      vnc.setVmId(vmDo.uuidOnHost.toString());
      vm.setVnc(vnc);
    }

    vm.setHostId(vmDo.hostUuid.toString());
    return vm;
  }

  private VirtualMachineConfig createConfig(CreateVirtualMachineOnHostRequest createVirtualMachineRequest,
                                            UUID vmUuid) {
    var vmConfig = new VirtualMachineConfig();
    vmConfig.name = createVirtualMachineRequest.getName();
    vmConfig.uuid = vmUuid;
    vmConfig.cpu = createVirtualMachineRequest.getCpu();
    vmConfig.memoryInMB = createVirtualMachineRequest.getMemory();
    vmConfig.machineType = VirtualMachineType.Q35;
    return vmConfig;
  }

  @Override
  public CreateVirtualMachineResponse createVm(CreateVirtualMachineOnHostRequest createVirtualMachineRequest) {
    var vm = new VirtualMachineDo();

    var vmUuid = UUID.randomUUID();
    jdbi.useTransaction(handle -> {
      var vmDao = handle.attach(VirtualMachineDao.class);
      var diskDao = handle.attach(DiskDao.class);

      vm.cpu = createVirtualMachineRequest.getCpu();
      vm.memoryInBytes = createVirtualMachineRequest.getMemory();
      vm.uuid = vmUuid;
      vm.status = VirtualMachineStatus.CREATING;
      vm.name = createVirtualMachineRequest.getName();
      vm.config = createConfig(createVirtualMachineRequest, vmUuid);
      vm.hostUuid = UUID.fromString(createVirtualMachineRequest.getHostId());
      vm.osId = OsInfoUtil.getOsId(createVirtualMachineRequest.getOsInfo().getOsType().toString());
      vm.id = vmDao.insert(vm);

      createVirtualMachineRequest.getDisks().forEach(diskReq -> {
        var disk = new DiskDo();
        disk.vmId = vm.uuid;
        disk.diskOrder = diskReq.getId();
        disk.uuid = UUID.randomUUID();
        disk.sizeInBytes = diskReq.getSize();
        disk.storageId = UUID.fromString(diskReq.getStorageId());
        diskDao.insert(disk);
      });
    });

    var createVmJobConfig = new CreateVmJobConfig();
    createVmJobConfig.vmId = vmUuid;
    createVmJobConfig.hostId = UUID.fromString(createVirtualMachineRequest.getHostId());
    createVmJobConfig.request = createVirtualMachineRequest;

    var job = jobClient.schedule(jsonUtil.toJson(createVmJobConfig), CreateVmRunner.jobType,
        vmUuid.toString(), null);

    var rsp = new CreateVirtualMachineResponse();
    rsp.setJobId(job.uuid.toString());
    rsp.setVm(fromVmDo(vm));
    return rsp;
  }

  @Override
  public VirtualMachine getVm(String vmId) {
    var vm = virtualMachineDao.findByUuid(UUID.fromString(vmId));
    return fromVmDo(vm);
  }

  private Disk fromDiskDo(DiskDo diskDo) {
    var disk = new Disk();
    disk.setId(diskDo.diskOrder);
    disk.setSize(diskDo.sizeInBytes);
    disk.setUuid(diskDo.uuid.toString());
    disk.setStorageId(diskDo.storageId.toString());
    return disk;
  }

  @Override
  public Disks getVmDisks(String vmId) {
    var disks = diskDao.getAllForVm(UUID.fromString(vmId)).stream().map(this::fromDiskDo).toList();
    var rsp = new Disks();
    rsp.setItems(disks);
    return rsp;
  }

  @Override
  public PaginatedVMResponse getVms(Integer limit, Integer page) {
    if (page == null) {
      page = 1;
    }
    var vms = virtualMachineDao.getAll(page, limit);
    var response = new PaginatedVMResponse();
    if (vms == null || vms.isEmpty()) {
      return response;
    }

    response.setItems(vms.stream().map(VmApiImpl::fromVmDo).toList());
    response.setNextPage(String.valueOf(vms.getLast().id + 1));
    return response;
  }

  @Override
  public VirtualMachine powerOffVm(String vmId) {
    var vm = virtualMachineDao.findByUuid(UUID.fromString(vmId));
    if (vm == null) {
      throw new IllegalArgumentException("vm not found: " + vmId);
    }
    if (vm.status != VirtualMachineStatus.RUNNING) {
      throw new IllegalArgumentException("vm is not running: " + vmId);
    }

    vm.status = VirtualMachineStatus.STOPPING;
    virtualMachineDao.update(vm);

    var config = new VmOpsJobConfig();
    config.vmId = UUID.fromString(vmId);
    config.vmOpsType = VmOpsJobConfig.VmOpsType.PowerOff;

    jobClient.schedule(jsonUtil.toJson(config), VmOpsRunner.jobType,
        vmId, null);

    return fromVmDo(vm);
  }

  @Override
  public VirtualMachine powerOnVm(String vmId) {
    var vm = virtualMachineDao.findByUuid(UUID.fromString(vmId));
    if (vm == null) {
      throw new IllegalArgumentException("vm not found: " + vmId);
    }
    if (vm.status != VirtualMachineStatus.STOPPED) {
      throw new IllegalArgumentException("vm is not stopped: " + vmId);
    }

    vm.status = VirtualMachineStatus.STARTING;
    virtualMachineDao.update(vm);

    var config = new VmOpsJobConfig();
    config.vmId = UUID.fromString(vmId);
    config.vmOpsType = VmOpsJobConfig.VmOpsType.PowerOn;

    jobClient.schedule(jsonUtil.toJson(config), VmOpsRunner.jobType,
        vmId, null);

    return fromVmDo(vm);
  }

  @Override
  public VirtualMachine resetVm(String vmId) {
    var vm = virtualMachineDao.findByUuid(UUID.fromString(vmId));
    if (vm == null) {
      throw new IllegalArgumentException("vm not found: " + vmId);
    }
    if (vm.status != VirtualMachineStatus.RUNNING && vm.status != VirtualMachineStatus.STOPPED) {
      throw new IllegalArgumentException("vm is not stopped or running: " + vmId);
    }
    vm.status = VirtualMachineStatus.REBOOTING;
    virtualMachineDao.update(vm);

    var config = new VmOpsJobConfig();
    config.vmId = UUID.fromString(vmId);
    config.vmOpsType = VmOpsJobConfig.VmOpsType.Reset;

    jobClient.schedule(jsonUtil.toJson(config), VmOpsRunner.jobType,
        vmId, null);

    return fromVmDo(vm);
  }
}
