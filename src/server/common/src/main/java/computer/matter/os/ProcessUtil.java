package computer.matter.os;

import computer.matter.retry.RetryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Optional;

public class ProcessUtil {
  private static final Logger logger = LoggerFactory.getLogger(ProcessUtil.class);

  public static boolean isProcessRunning(String pid) {
    var builder = new ProcessBuilder("ps", "-p", pid);
    try {
      var p = builder.start();
      return p.waitFor() == 0;
    } catch (IOException | InterruptedException e) {
      return false;
    }
  }

  public static boolean waitForProcessExit(String pidFile, Duration waitInSeconds, int maxAttempt) {
    try {
      var pid = Files.readString(Paths.get(pidFile)).strip();
      var r = RetryUtil.retry(() -> ProcessUtil.isProcessRunning(pid) ? Optional.empty() : Optional.of(true),
              waitInSeconds, maxAttempt);
      return r.orElse(false);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
