package computer.matter.agent.job.vmops;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VmResetTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(VmResetTask.class);

  private final QemuCli qemuCli;
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;

  public VmResetTask(QemuCli qemuCli, JsonUtil jsonUtil, Jdbi jdbi) {
    this.qemuCli = qemuCli;
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
  }

  @Override
  public void run(Job job) {
    logger.debug("Start to run VmResetTask");
    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    var vmId = jobConfig.vmId;
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vmDo = vmDao.findByUUID(vmId.toString());
    qemuCli.resetVm(vmDo.config);
  }

  @Override
  public int weight() {
    return 100;
  }
}
