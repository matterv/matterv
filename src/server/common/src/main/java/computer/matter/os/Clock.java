package computer.matter.os;

import java.time.Instant;

public interface Clock {
  long currentTimeMillis();

  Instant now();
}
