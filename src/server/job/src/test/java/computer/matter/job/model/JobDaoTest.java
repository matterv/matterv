package computer.matter.job.model;

import computer.matter.common.test.DbTestBase;
import computer.matter.job.Job;
import computer.matter.job.JobProgress;
import computer.matter.job.JobStatus;
import computer.matter.job.Jobs;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobDaoTest extends DbTestBase {

  @Test
  void insert() {
    var job = new Job();
    job.type = "test";
    job.config = "a";
    job.status = JobStatus.QUEUED;
    job.startTime = Instant.now();
    job.objectId = "1";
    job.uuid = UUID.randomUUID();
    job.frequency = Duration.ofSeconds(1).toSeconds();

    job.progress = new JobProgress();
    var jobDao = jdbi.onDemand(JobDao.class);
    job.id = jobDao.insert(job);

    var j = jobDao.getAll().getFirst();
    assertEquals(1, job.id);
    assertEquals(job.type, j.type);
    assertEquals(job.startTime.truncatedTo(ChronoUnit.MILLIS), j.startTime);
    assertEquals(job.objectId, j.objectId);
    assertEquals(job.frequency, Duration.ofSeconds(1).toSeconds());


    Jobs.createNewJob(jobDao, "a", "test", Instant.now().plusSeconds(1), "1", null);

    var jobs = jobDao.listQueuedJobs(2);
    assertEquals(2, jobs.size());
    assertEquals(job.uuid, jobs.getFirst().uuid);
  }

  @Test
  void findByObjectIds() {
    var jobs = IntStream.range(0, 10).mapToObj(i -> {
      var job = new Job();
      job.type = "test";
      job.config = "a";
      job.status = JobStatus.RUNNING;
      job.startTime = Instant.now();
      job.objectId = UUID.randomUUID().toString();
      job.uuid = UUID.randomUUID();
      return job;
    }).toList();

    var jobDao = jdbi.onDemand(JobDao.class);
    jobs.forEach(j -> {
      j.id = jobDao.insert(j);
    });

    jobs.forEach(j -> {
      var queryJobs = jobDao.findByObjectIdAndStatus(j.objectId, List.of(JobStatus.RUNNING));
      assertEquals(1, queryJobs.size());
    });
  }
}