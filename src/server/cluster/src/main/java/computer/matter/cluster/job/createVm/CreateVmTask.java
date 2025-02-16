package computer.matter.cluster.job.createVm;

import computer.matter.cluster.common.vm.VirtualMachines;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.db.model.VirtualMachineDo;
import computer.matter.host.ApiException;
import computer.matter.host.client.VmApi;
import computer.matter.host.client.model.*;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualMachineStatus;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.JobUtils;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;

public class CreateVmTask implements Task {
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;
  private final ApiClientProvider apiClientProvider;

  public CreateVmTask(JsonUtil jsonUtil, Jdbi jdbi, ApiClientProvider apiClientProvider) {
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
    this.apiClientProvider = apiClientProvider;
  }

  private NetworkRequest from(computer.matter.cluster.model.NetworkRequest networkRequest) {
    var networkDao = jdbi.onDemand(NetworkDao.class);
    var network = networkDao.findByUuid(UUID.fromString(networkRequest.getNetworkId()));
    if (network == null) {
      throw new IllegalArgumentException("Invalid network id: " + networkRequest.getNetworkId());
    }
    var req = new NetworkRequest();
    req.setConnected(networkRequest.getConnected());
    req.setId(networkRequest.getId());
    req.setNetworkId(network.uuidOnHost.toString());
    return req;
  }

  private DiskController from(computer.matter.cluster.model.DiskController diskController) {
    var req = new DiskController();
    req.setId(diskController.getId());
    req.setType(DiskController.TypeEnum.fromValue(diskController.getType().value()));
    req.setModel(DiskController.ModelEnum.fromValue(diskController.getModel().value()));
    return req;
  }

  private DiskRequest from(computer.matter.cluster.model.DiskRequest diskRequest) {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storage = storageDao.findByUUID(diskRequest.getStorageId());
    if (storage == null) {
      throw new IllegalArgumentException("Invalid storage id: " + diskRequest.getStorageId());
    }

    var req = new DiskRequest();
    req.setSize(diskRequest.getSize());
    req.setStorageId(storage.uuidOnHost.toString());
    req.setId(diskRequest.getId());
    req.setStorageName(diskRequest.getStorageName());
    req.setControllerId(diskRequest.getControllerId());
    return req;
  }

  private CreateVirtualMachineRequestCdrom from(computer.matter.cluster.model.CreateVirtualMachineOnHostRequestCdrom req) {
    if (req == null) {return null;}

    var cdromReq = new CreateVirtualMachineRequestCdrom();
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storage = storageDao.findByUUID(req.getStorageId());
    if (storage == null) {
      throw new IllegalArgumentException("Invalid storage id: " + req.getStorageId());
    }
    cdromReq.setConnected(req.getConnected());
    cdromReq.setStorageId(storage.uuidOnHost.toString());
    cdromReq.setIsoPath(req.getIsoPath());
    return cdromReq;
  }

  private OsInfo from(computer.matter.cluster.model.OsInfo osInfo) {
    var rsp = new OsInfo();
    rsp.setOsType(OsType.fromValue(osInfo.getOsType().toString()));
    return rsp;
  }
  private CreateVirtualMachineRequest from(computer.matter.cluster.model.CreateVirtualMachineOnHostRequest req) {
    var createVirtualMachineRequest = new CreateVirtualMachineRequest();
    createVirtualMachineRequest.setName(req.getName());
    createVirtualMachineRequest.setCpu(req.getCpu());
    createVirtualMachineRequest.setMemory(req.getMemory());
    createVirtualMachineRequest.setOsInfo(from(req.getOsInfo()));

    createVirtualMachineRequest.setCdrom(from(req.getCdrom()));

    createVirtualMachineRequest.setDisks(req.getDisks().stream().map(this::from).toList());
    createVirtualMachineRequest.setNetworks(req.getNetworks().stream().map(this::from).toList());
    createVirtualMachineRequest.setDiskControllers(req.getDiskControllers().stream().map(this::from).toList());

    return createVirtualMachineRequest;
  }

  private void waitForJobDone(VirtualMachineDo vm, String jobId, String endpoint, VmApi vmApi) {
    var jobApi = apiClientProvider.getJobApi(endpoint);
    JobUtils.waitForJob(jobApi, jobId).ifPresent(job -> {
      try {
        var hostVm = vmApi.getVm(vm.uuidOnHost.toString());
        VirtualMachines.updateVm(jsonUtil, jdbi, vm, hostVm);
      } catch (ApiException e) {
        throw new RuntimeException(e);
      }
    });
  }

  @Override
  public void run(Job job) {
    var jobConfig = jsonUtil.fromJson(job.config, CreateVmJobConfig.class);
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var existingVm = vmDao.findByUuid(jobConfig.vmId);
    if (existingVm == null) {
      throw new RuntimeException("Failed to find vm with id " + jobConfig.vmId);
    }

    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.findByUuid(jobConfig.hostId);
    if (host == null) {
      throw new RuntimeException("Failed to find host with id " + jobConfig.hostId);
    }

    var vmApi = apiClientProvider.getVmApi(host.endpoint);
    var req = from(jobConfig.request);

    try {
      var rsp = vmApi.createVm(req);

      existingVm.status = VirtualMachineStatus.valueOf(rsp.getVm().getStatus().name());
      existingVm.uuidOnHost = rsp.getVm().getUuid();
      vmDao.update(existingVm);

      waitForJobDone(existingVm, rsp.getJobId(), host.endpoint, vmApi);
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public int weight() {
    return 100;
  }
}
