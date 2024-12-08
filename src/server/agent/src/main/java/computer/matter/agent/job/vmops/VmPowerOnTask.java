package computer.matter.agent.job.vmops;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualMachineStatus;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VmPowerOnTask implements Task {
  private static final Logger logger = LoggerFactory.getLogger(VmPowerOnTask.class);
  private final QemuCli qemuCli;
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;

  public VmPowerOnTask(QemuCli qemuCli, JsonUtil jsonUtil, Jdbi jdbi) {
    this.qemuCli = qemuCli;
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
  }

  @Override
  public void run(Job job) {
    logger.debug("Start VmPowerOnTask job");

    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    var vmId = jobConfig.vmId;
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vmDo = vmDao.findByUUID(vmId.toString());
    qemuCli.startVm(vmDo.config);

    vmDo.status = VirtualMachineStatus.RUNNING;

    vmDao.update(vmDo);
  }


  @Override
  public int weight() {
    return 100;
  }
}
