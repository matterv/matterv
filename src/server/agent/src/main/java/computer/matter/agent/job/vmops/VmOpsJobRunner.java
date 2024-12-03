package computer.matter.agent.job.vmops;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.Map;

public class VmOpsJobRunner implements JobRunner {
  public static final String jobType = "VmOpsJob";

  private final JsonUtil jsonUtil;
  private final Map<VmOps, Task> tasks;
  private final JobDao jobDao;


  public VmOpsJobRunner(JsonUtil jsonUtil,
                        QemuCli qemuCli,
                        Jdbi jdbi) {
    this.jsonUtil = jsonUtil;
    this.jobDao = jdbi.onDemand(JobDao.class);
    this.tasks = Map.of(
            VmOps.POWER_ON, new VmPowerOnTask(qemuCli, jsonUtil, jdbi),
            VmOps.POWER_OFF, new VmPowerOffTask(qemuCli, jsonUtil, jdbi),
            VmOps.RESET, new VmResetTask(qemuCli, jsonUtil, jdbi),
            VmOps.EDIT, new VmEditTask(qemuCli, jsonUtil, jdbi)
    );
  }

  @Override
  public List<Task> getTasks(Job job) {
    var jobConfig = jsonUtil.fromJson(job.config, VmOpsJobConfig.class);
    return List.of(tasks.get(jobConfig.ops));
  }

  @Override
  public JobDao jobDao() {
    return jobDao;
  }
}
