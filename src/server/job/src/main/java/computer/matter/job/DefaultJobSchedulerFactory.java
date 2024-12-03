package computer.matter.job;

import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;

public class DefaultJobSchedulerFactory implements JobSchedulerFactory {
  @Override
  public JobScheduler getJobScheduler(Map<String, JobRunner> jobTypeToRunnerMap, Jdbi jdbi, Clock clock) {
    return new JobSchedulerImpl(jobTypeToRunnerMap, jdbi, clock);
  }
}
