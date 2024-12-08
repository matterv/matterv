package computer.matter.job;

import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;

public interface JobSchedulerFactory {
  JobScheduler getJobScheduler(Map<String, JobRunner> jobTypeToRunnerMap, Jdbi jdbi, Clock clock);
}
