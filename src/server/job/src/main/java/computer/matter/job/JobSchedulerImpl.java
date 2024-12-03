package computer.matter.job;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import computer.matter.job.model.JobDao;
import computer.matter.os.Clock;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobSchedulerImpl implements JobScheduler {
  private static final Logger logger = LoggerFactory.getLogger(JobSchedulerImpl.class);
  private final Clock clock;
  private final ExecutorService executor;
  private final Map<String, JobRunner> jobTypeToRunnerMap;
  private final JobDao jobDao;
  private final Object waitObject = new Object();
  private Thread schedulerThread;

  public JobSchedulerImpl(Map<String, JobRunner> jobTypeToRunnerMap, Jdbi jdbi, Clock clock) {
    this.clock = clock;
    this.jobTypeToRunnerMap = jobTypeToRunnerMap;
    this.jobDao = jdbi.onDemand(JobDao.class);

    var threadFactory = new ThreadFactoryBuilder()
            .setNameFormat("Job-scheduler-%d")
            .build();
    executor = Executors.newFixedThreadPool(4, threadFactory);
  }

  private void reschedule(Job job) {
    if (job.frequency == null) {
      return;
    }

    logger.debug("Reschedule job: {}", job);
    try {
      Jobs.cloneJob(jobDao, job, clock);
    } catch (Exception e) {
      logger.error("Failed to reschedule job", e);
    }
  }

  private void runJob(Job job) {
    try {
      var runner = jobTypeToRunnerMap.get(job.type);
      runner.run(job);
    } catch (Exception e) {
      logger.error("Failed to run the job", e);
    }
  }

  private void jobRunner(Job job) {
    logger.debug("Scheduling job: {}", job);
    runJob(job);
    reschedule(job);
  }

  @Override
  public void notifyNewJobs() {
    synchronized (waitObject) {
      waitObject.notify();
    }
  }

  private void fetchAndSchedule() {
    jobDao
            .listQueuedJobs(10)
            .stream()
            .filter(j -> j.isSchedule(clock))
            .forEach(job -> {
              job.status = JobStatus.SCHEDULED;
              jobDao.update(job);
              executor.submit(() -> jobRunner(job));
            });
  }

  @Override
  public void start() {
    schedulerThread = new Thread(() -> {
      try {
        while (!Thread.currentThread().isInterrupted()) {
          logger.debug("Scheduling job");

          fetchAndSchedule();

          synchronized (waitObject) {
            waitObject.wait(Duration.ofMinutes(3).toMillis());
          }
        }
      } catch (Exception e) {
        logger.error("Job scheduler thread is terminated", e);
      }
    }, "job-scheduler");
    schedulerThread.start();
  }

  @Override
  public void stop() {
    try {
      executor.shutdownNow();
      try {
        if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
          executor.shutdownNow();
        }
      } catch (InterruptedException e) {
        executor.shutdownNow();
      }
      schedulerThread.interrupt();
    } catch (Exception e) {
      logger.error("Failed to stop job scheduler thread", e);
    }
  }
}
