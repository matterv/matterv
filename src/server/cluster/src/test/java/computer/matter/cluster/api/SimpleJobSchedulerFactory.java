package computer.matter.cluster.api;

import computer.matter.job.JobRunner;
import computer.matter.job.JobScheduler;
import computer.matter.job.JobSchedulerFactory;
import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;

public class SimpleJobSchedulerFactory implements JobSchedulerFactory {
  @Override
  public JobScheduler getJobScheduler(Map<String, JobRunner> jobTypeToRunnerMap, Jdbi jdbi, Clock clock) {
    return new SimpleJobScheduler(jobTypeToRunnerMap, jdbi, clock);
  }
}
