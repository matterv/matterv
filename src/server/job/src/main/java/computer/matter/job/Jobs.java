package computer.matter.job;

import computer.matter.job.model.JobDao;
import computer.matter.os.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

public class Jobs {
  private static final Logger logger = LoggerFactory.getLogger(Jobs.class);

  public static Job createNewJob(JobDao jobDao, String jobConfig, String type, Instant startTime, String objectId,
                                 Duration freq) {
    var job = new Job();
    job.status = JobStatus.QUEUED;
    job.type = type;
    job.config = jobConfig;
    job.startTime = startTime;
    job.objectId = objectId;
    job.uuid = UUID.randomUUID();
    job.progress = new JobProgress();
    if (freq != null) {
      job.frequency = freq.getSeconds();
    }
    job.id = jobDao.insert(job);
    logger.info("Created new job: {}", job.uuid.toString());
    return job;
  }

  public static Job cloneJob(JobDao jobDao, Job job, Clock clock) {
    var clone = new Job();
    clone.uuid = UUID.randomUUID();
    clone.status = JobStatus.QUEUED;
    clone.type = job.type;
    clone.config = job.config;
    if (job.frequency != null) {
      clone.startTime = clock.now().plusSeconds(job.frequency);
    } else {
      clone.startTime = clock.now();
    }
    clone.objectId = job.objectId;
    clone.progress = new JobProgress();
    clone.frequency = job.frequency;
    clone.id = jobDao.insert(clone);
    logger.info("Cloned new job: {}", job.uuid.toString());
    return clone;
  }
}
