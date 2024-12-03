package computer.matter.cluster.job;

import computer.matter.cluster.job.addhost.AddHostRunner;
import computer.matter.cluster.job.createVm.CreateVmRunner;
import computer.matter.cluster.job.hostrefresh.HostRefreshRunner;
import computer.matter.cluster.job.vmops.VmOpsRunner;
import computer.matter.job.JobClient;
import computer.matter.job.JobClientImpl;
import computer.matter.job.JobRunner;
import computer.matter.job.JobSchedulerFactory;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.Clock;
import computer.matterv.host.client.ApiClientProvider;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;

public class JobClientFactory {
  private final JobDao jobDao;
  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;
  private final ApiClientProvider apiClientProvider;
  private final JobSchedulerFactory jobSchedulerFactory;
  private final Clock clock;

  public JobClientFactory(JobDao jobDao, Jdbi jdbi, JsonUtil jsonUtil, ApiClientProvider apiClientProvider,
                          JobSchedulerFactory jobSchedulerFactory, Clock clock) {
    this.jobDao = jobDao;
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
    this.apiClientProvider = apiClientProvider;
    this.jobSchedulerFactory = jobSchedulerFactory;
    this.clock = clock;
  }

  public JobClient getJobClient() {
    var jobClient = new JobClientImpl(clock, jdbi);
    JobRunner addHostRunner = new AddHostRunner(jobDao, jdbi, jsonUtil, apiClientProvider, jobClient);
    JobRunner createVmRunner = new CreateVmRunner(jobDao, jdbi, jsonUtil, apiClientProvider);
    JobRunner vmOpsRunner = new VmOpsRunner(jobDao, jdbi, jsonUtil, apiClientProvider);
    JobRunner hostRefreshRunner = new HostRefreshRunner(jobDao, jdbi, jsonUtil, apiClientProvider);

    var jobRunnerType =
            Map.of(
                    AddHostRunner.jobType, addHostRunner,
                    CreateVmRunner.jobType, createVmRunner,
                    VmOpsRunner.jobType, vmOpsRunner,
                    HostRefreshRunner.jobType, hostRefreshRunner
            );
    jobClient.jobScheduler = jobSchedulerFactory.getJobScheduler(jobRunnerType, jdbi, clock);
    return jobClient;
  }
}
