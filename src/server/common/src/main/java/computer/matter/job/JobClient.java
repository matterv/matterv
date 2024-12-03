package computer.matter.job;

import java.time.Duration;

public interface JobClient {
  JobScheduler getJobScheduler();

  Job schedule(String jobConfig, String type, String objectId, Duration freq);
}
