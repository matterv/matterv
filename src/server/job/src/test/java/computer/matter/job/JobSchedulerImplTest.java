package computer.matter.job;

import computer.matter.common.test.DbTestBase;
import computer.matter.job.model.JobDao;
import computer.matter.os.TestClock;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobSchedulerImplTest extends DbTestBase {

  @Test
  @Disabled
  void start() throws InterruptedException {
    var jobRunner = new TestJobRunner();
    var scheduler = new JobSchedulerImpl(Map.of(TestJobRunner.jobType, jobRunner), jdbi, new TestClock());
    var job = new Job();
    job.startTime = Instant.now().plusSeconds(Duration.ofSeconds(5).toSeconds());
    job.type = TestJobRunner.jobType;
    scheduler.start();
    Thread.sleep(Duration.ofSeconds(10).toMillis());
    scheduler.stop();

    assertEquals(true, jobRunner.executed);
  }

  static class TestJobRunner implements JobRunner {
    static String jobType = "TestJob";
    boolean executed = false;

    @Override
    public void run(Job job) {
      executed = true;
    }

    @Override
    public List<Task> getTasks(Job job) {
      return List.of();
    }

    @Override
    public JobDao jobDao() {
      return null;
    }
  }
}