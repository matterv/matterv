package computer.matter.agent.job.storageops;

import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;

import java.util.List;

public class StorageOpsRunner implements JobRunner {
  public static final String jobType = "StorageOps";

  @Override
  public List<Task> getTasks(Job job) {
    return List.of();
  }

  @Override
  public JobDao jobDao() {
    return null;
  }
}
