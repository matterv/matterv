package computer.matter.job;

import java.util.List;

public enum JobStatus {
  QUEUED,
  SCHEDULED,
  RUNNING,
  FINISHED,
  FAILED;

  public static List<JobStatus> notInTerminalState() {
    return List.of(QUEUED, RUNNING);
  }
}
