package computer.matter.agent.job.storageops;

import computer.matter.job.Job;
import computer.matter.job.Task;

public class AttachStorageTask implements Task {
  @Override
  public void run(Job job) {

  }

  @Override
  public int weight() {
    return 100;
  }
}
