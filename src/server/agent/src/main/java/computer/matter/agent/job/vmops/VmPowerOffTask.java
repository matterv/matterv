package computer.matter.agent.job.vmops;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.qemu.client.QemuConnectionFailure;
import computer.matter.vm.VirtualMachineStatus;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VmPowerOffTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(VmPowerOffTask.class);

  private final QemuCli qemuCli;
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;

  public VmPowerOffTask(QemuCli qemuCli, JsonUtil jsonUtil, Jdbi jdbi) {
    this.qemuCli = qemuCli;
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
  }

  @Override
  public void run(Job job) {
    logger.debug("Start to run VmPowerOffTask");
    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    var vmId = jobConfig.vmId;
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vm = vmDao.findByUUID(vmId.toString());
    try {
      qemuCli.stopVm(vm.config);
    } catch (QemuConnectionFailure e) {
      logger.debug("Failed to connect to vm, assume it's stopped", e);
    }
    vm.status = VirtualMachineStatus.STOPPED;
    vmDao.update(vm);
  }


  @Override
  public int weight() {
    return 100;
  }
}
