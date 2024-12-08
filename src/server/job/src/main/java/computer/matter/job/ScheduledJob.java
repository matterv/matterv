package computer.matter.job;

import computer.matter.os.Clock;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ScheduledJob implements Delayed {
  public final Job job;
  private final long scheduleTime;
  private final Clock clock;

  public ScheduledJob(Job job, Clock clock) {
    this.job = job;
    this.scheduleTime = job.startTime.toEpochMilli();
    this.clock = clock;
  }

  @Override
  public long getDelay(TimeUnit unit) {
    long delay = scheduleTime - clock.currentTimeMillis();
    return unit.convert(delay, TimeUnit.MILLISECONDS);
  }

  @Override
  public int compareTo(Delayed other) {
    if (this.scheduleTime < ((ScheduledJob) other).scheduleTime) {
      return -1;
    } else if (this.scheduleTime > ((ScheduledJob) other).scheduleTime) {
      return 1;
    }
    return 0;
  }
}
