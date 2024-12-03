package computer.matter.os;

import java.time.Instant;

public class SystemClock implements Clock {
  @Override
  public long currentTimeMillis() {
    return System.currentTimeMillis();
  }

  @Override
  public Instant now() {
    return Instant.now();
  }
}
