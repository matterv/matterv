package computer.matter.job;

import computer.matter.job.model.JobDao;
import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;

import java.time.Duration;

public class JobClientImpl implements JobClient {
  private final Clock clock;
  private final JobDao jobDao;
  public JobScheduler jobScheduler;

  public JobClientImpl(Clock clock, JobScheduler jobScheduler, Jdbi jdbi) {
    this.clock = clock;
    this.jobScheduler = jobScheduler;
    jobDao = jdbi.onDemand(JobDao.class);
  }


  public JobClientImpl(Clock clock, Jdbi jdbi) {
    this.clock = clock;
    jobDao = jdbi.onDemand(JobDao.class);
  }

  @Override
  public JobScheduler getJobScheduler() {
    return jobScheduler;
  }

  @Override
  public Job schedule(String jobConfig, String type, String objectId, Duration freq) {
    var job = Jobs.createNewJob(jobDao, jobConfig, type, clock.now(), objectId, freq);
    jobScheduler.notifyNewJobs();
    return job;
  }
}
