package computer.matter.app.api;

import computer.matter.job.JobRunner;
import computer.matter.job.JobScheduler;
import computer.matter.job.Jobs;
import computer.matter.job.model.JobDao;
import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;

public class SimpleJobScheduler implements JobScheduler {
  private final Map<String, JobRunner> jobRunnerMap;
  private final JobDao jobDao;
  private final Clock clock;

  public SimpleJobScheduler(Map<String, JobRunner> jobRunnerMap, Jdbi jdbi, Clock clock) {
    this.jobRunnerMap = jobRunnerMap;
    jobDao = jdbi.onDemand(JobDao.class);

    this.clock = clock;
  }

  @Override
  public void notifyNewJobs() {

  }

  @Override
  public void start() {
    while (true) {
      var jobs = jobDao.listQueuedJobs(10);
      var scheduleJobs = jobs.stream().filter(j -> j.isSchedule(clock)).toList();
      if (scheduleJobs.isEmpty()) {
        return;
      }
      scheduleJobs.forEach(j -> {
        jobRunnerMap.get(j.type).run(j);
        if (j.frequency != null) {
          Jobs.cloneJob(jobDao, j, clock);
        }
      });

    }
  }

  @Override
  public void stop() {

  }
}
