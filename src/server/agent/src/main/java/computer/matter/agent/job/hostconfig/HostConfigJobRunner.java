package computer.matter.agent.job.hostconfig;

import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.os.SystemInfoUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class HostConfigJobRunner implements JobRunner {
  public static final String jobType = "HostConfigJob";
  private final JobDao jobDao;
  private List<Task> tasks;


  public HostConfigJobRunner(Jdbi jdbi, JsonUtil jsonUtil, PhysicalNetworkProvider physicalNetworkProvider,
                             SystemInfoUtil systemInfoUtil) {
    this.jobDao = jdbi.onDemand(JobDao.class);
    tasks = List.of(
            new ConfigureNetworkTask(jsonUtil, physicalNetworkProvider, jdbi),
            new ConfigureStorageTask(jdbi, jsonUtil),
            new ConfigureHostTask(jsonUtil, jdbi, systemInfoUtil)
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
