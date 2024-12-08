package computer.matter.app.api.common;

import computer.matter.host.model.AsyncRequestStatus;
import computer.matter.job.JobStatus;

public class JobUtil {
  static private AsyncRequestStatus fromJobStatus(JobStatus jobStatus) {
    return switch (jobStatus) {
      case QUEUED -> AsyncRequestStatus.QUEUED;
      case RUNNING -> AsyncRequestStatus.RUNNING;
      case FINISHED -> AsyncRequestStatus.FINISHED;
      case FAILED -> AsyncRequestStatus.FAILED;
      case SCHEDULED -> AsyncRequestStatus.SCHEDULED;
    };
  }
}
