package computer.matter.agent.job.vmops;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

public class VmEditTask implements Task {
  private final QemuCli qemuCli;
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;

  public VmEditTask(QemuCli qemuCli, JsonUtil jsonUtil, Jdbi jdbi) {
    this.qemuCli = qemuCli;
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
  }

  @Override
  public void run(Job job) {
    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    var vmId = jobConfig.vmId;
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    qemuCli.editVm(jobConfig.vmConfig);
  }


  @Override
  public int weight() {
    return 100;
  }
}
