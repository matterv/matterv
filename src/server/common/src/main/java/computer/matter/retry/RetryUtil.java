package computer.matter.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class RetryUtil {
  static Logger logger = LoggerFactory.getLogger(RetryUtil.class);

  public static <T> Optional<T> retry(Supplier<Optional<T>> operation, Duration waitTimeoutSeconds, int maxAttempts) {
    int attempts = 0;
    while (attempts < maxAttempts) {
      try {
        var result = operation.get();
        if (result.isPresent()) {
          return result;
        }
      } catch (Exception e) {
        logger.error("Failed to execute, ignore, retry: {}", attempts, e);
      }

      attempts++;
      if (attempts >= maxAttempts) {
        logger.warn("Retries exhausted, return false");
        return Optional.empty();  // All attempts exhausted, return false
      }

      try {
        TimeUnit.SECONDS.sleep(waitTimeoutSeconds.toSeconds());
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        logger.debug("Thread is interrupted", ie);
        return Optional.empty();
      }
    }

    return Optional.empty();
  }
}
