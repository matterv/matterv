package computer.matter.agent.job.vmprovision;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.app.AppConfig;
import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class VmProvisionJobRunner implements JobRunner {
  public static final String jobType = "VmProvisionJob";
  private final JsonUtil jsonUtil;
  private final JobDao jobDao;
  private final AppConfig appConfig;
  List<Task> tasks;

  public VmProvisionJobRunner(
          JsonUtil jsonUtil,
          QemuCli qemuCli,
          Jdbi jdbi,
          StorageFactory storageFactory, AppConfig appConfig) {
    this.jsonUtil = jsonUtil;
    jobDao = jdbi.onDemand(JobDao.class);
    this.appConfig = appConfig;
    tasks = List.of(
            new InitProvisionTask(jdbi, jsonUtil, appConfig),
            new PrepareStorageTask(storageFactory, jdbi, jsonUtil),
            new CreateVmTask(qemuCli, jdbi, jsonUtil)
    );
  }

  @Override
  public List<Task> getTasks(Job job) {
    return tasks;
  }

  @Override
  public JobDao jobDao() {
    return jobDao;
  }
}
