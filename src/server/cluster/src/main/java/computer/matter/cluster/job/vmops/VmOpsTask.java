package computer.matter.cluster.job.vmops;

import computer.matter.cluster.common.vm.VirtualMachines;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.db.model.VirtualMachineDo;
import computer.matter.host.ApiException;
import computer.matter.host.client.VmApi;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualMachineStatus;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.JobUtils;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VmOpsTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(VmOpsTask.class);

  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;
  private final ApiClientProvider apiClientProvider;

  public VmOpsTask(JsonUtil jsonUtil, Jdbi jdbi, ApiClientProvider apiClientProvider) {
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
    this.apiClientProvider = apiClientProvider;
  }

  private String powerOff(VmApi vmApi, VirtualMachineDo vm) {

    if (vm.status != VirtualMachineStatus.STOPPING) {
      logger.debug("Vm status is not STOPPING");
      return null;
    }

    try {
      var rsp = vmApi.powerOffVm(vm.uuidOnHost.toString());
      return rsp.getJobId();
    } catch (ApiException e) {
      logger.error("Failed to power off vm " + vm.uuidOnHost, e);
      throw new RuntimeException(e);
    }
  }

  private String reset(VmApi vmApi, VirtualMachineDo vm) {
    try {
      var rsp = vmApi.resetVm(vm.uuidOnHost.toString());
      return rsp.getJobId();
    } catch (ApiException e) {
      logger.error("Failed to reset vm " + vm.uuidOnHost, e);
      throw new RuntimeException(e);
    }
  }

  private String powerOn(VmApi vmApi, VirtualMachineDo vm) {
    if (vm.status != VirtualMachineStatus.STARTING) {
      logger.debug("Vm status is not starting");
      return null;
    }

    try {
      var rsp = vmApi.powerOnVm(vm.uuidOnHost.toString());
      return rsp.getJobId();
    } catch (ApiException e) {
      logger.error("Failed to power on vm " + vm.uuidOnHost, e);
      throw new RuntimeException(e);
    }
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
    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vm = vmDao.findByUuid(jobConfig.vmId);
    if (vm == null) {
      logger.debug("No vm found for id {}", jobConfig.vmId);
      return;
    }

    var hostDao = jdbi.onDemand(HostDao.class);

    var host = hostDao.findByUuid(vm.hostUuid);
    if (host == null) {
      logger.debug("No host found for id {}", vm.hostUuid);
      return;
    }

    var vmApi = apiClientProvider.getVmApi(host.endpoint);

    var jobId = switch (jobConfig.vmOpsType) {
      case VmOpsJobConfig.VmOpsType.PowerOff -> powerOff(vmApi, vm);
      case VmOpsJobConfig.VmOpsType.PowerOn -> powerOn(vmApi, vm);
      case VmOpsJobConfig.VmOpsType.Reset -> reset(vmApi, vm);
      default -> null;
    };

    if (jobId != null) {
      waitForJobDone(vm, jobId, host.endpoint, vmApi);
    }
  }

  @Override
  public int weight() {
    return 100;
  }
}
