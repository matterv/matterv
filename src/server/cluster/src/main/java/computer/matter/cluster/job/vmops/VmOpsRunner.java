package computer.matter.cluster.job.vmops;

import computer.matter.job.Job;
import computer.matter.job.JobRunner;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matterv.host.client.ApiClientProvider;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public record VmOpsRunner(JobDao jobDao, Jdbi jdbi, JsonUtil jsonUtil,
                          ApiClientProvider apiClientProvider) implements JobRunner {
  public static final String jobType = "VmOps";

  @Override
  public List<Task> getTasks(Job job) {
    return List.of(new VmOpsTask(jsonUtil, jdbi, apiClientProvider));
  }
}
