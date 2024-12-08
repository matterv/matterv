package computer.matterv.host.client;

import computer.matter.host.ApiException;
import computer.matter.host.client.JobApi;
import computer.matter.host.client.model.AsyncRequestStatus;
import computer.matter.host.client.model.Job;
import computer.matter.retry.RetryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Optional;

public class JobUtils {
  private static final Logger logger = LoggerFactory.getLogger(JobUtils.class);

  private static Optional<Job> queryJob(JobApi jobApi, String jobId) {
    try {
      var job = jobApi.queryJob(jobId);

      if (job != null && (job.getStatus() == AsyncRequestStatus.FAILED || job.getStatus() == AsyncRequestStatus.FINISHED)) {
        return Optional.of(job);
      }
    } catch (ApiException e) {
      logger.debug("Failed to query job", e);
    }

    return Optional.empty();
  }

  public static Optional<Job> waitForJob(JobApi jobApi, String jobId) {
    return RetryUtil.retry(() -> queryJob(jobApi, jobId), Duration.ofSeconds(1), 60);

  }
}
