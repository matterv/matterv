package computer.matter.os;

import java.time.Instant;

public class TestClock implements Clock {
  public Instant currentTime;

  @Override
  public long currentTimeMillis() {
    if (currentTime == null) {
      return Instant.now().toEpochMilli();
    }
    return currentTime.toEpochMilli();
  }

  @Override
  public Instant now() {
    if (currentTime == null) {
      return Instant.now();
    } else {
      return currentTime;
    }
  }
}
