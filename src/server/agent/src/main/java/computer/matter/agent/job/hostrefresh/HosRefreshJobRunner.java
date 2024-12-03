package computer.matter.agent.job.hostrefresh;

import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.os.SystemInfoUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class HosRefreshJobRunner implements JobRunner {
  public static final String jobType = "HostRefreshJob";
  private final JobDao jobDao;
  private List<Task> tasks;


  public HosRefreshJobRunner(Jdbi jdbi, JsonUtil jsonUtil, PhysicalNetworkProvider physicalNetworkProvider,
                             SystemInfoUtil systemInfoUtil, LocalStorageProvider localStorageProvider) {
    this.jobDao = jdbi.onDemand(JobDao.class);
    tasks = List.of(
            new HostRefreshTask(localStorageProvider, physicalNetworkProvider, jdbi)
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
