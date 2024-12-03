package computer.matter.job;


import computer.matter.job.model.JobDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

public interface JobRunner {
  Logger logger = LoggerFactory.getLogger(JobRunner.class);

  default void run(Job job) {
    var jobDao = jobDao();
    var tasks = getTasks(job);
    var reverseTasks = new LinkedList<Task>();
    try {
      tasks.forEach(task -> {
        var j = jobDao().findByUuid(job.uuid.toString());
        reverseTasks.addFirst(task);
        runTask(j, task);
      });
    } catch (Exception e) {
      logger.error("Failed to run the job", e);
      try {
        reverseTasks.forEach(task -> {
          var j = jobDao().findByUuid(job.uuid.toString());
          task.undo(j);
        });
      } catch (Exception ee) {
        logger.debug("Failed to run undo", ee);
      }

      var updatedJob = jobDao.findByUuid(job.uuid.toString());
      updatedJob.status = JobStatus.FAILED;
      updatedJob.endTime = Instant.now();
      jobDao.update(updatedJob);
      return;
    }

    var updatedJob = jobDao.findByUuid(job.uuid.toString());
    updatedJob.status = JobStatus.FINISHED;
    updatedJob.endTime = Instant.now();
    jobDao.update(updatedJob);
  }

  List<Task> getTasks(Job job);

  JobDao jobDao();

  default void runTask(Job job, Task task) {
    var jobDao = jobDao();

    task.run(job);

    var updatedJob = jobDao.findByUuid(job.uuid.toString());
    updatedJob.progress.progress += task.weight();
    jobDao.update(updatedJob);
  }
}
