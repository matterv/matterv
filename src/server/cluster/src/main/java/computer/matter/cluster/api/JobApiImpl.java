package computer.matter.cluster.api;

import computer.matter.cluster.model.AsyncRequestStatus;
import computer.matter.job.Job;
import computer.matter.cluster.model.PaginatedJobResponse;
import computer.matter.job.model.JobDao;

public class JobApiImpl implements JobApi {

  private final JobDao jobDao;

  public JobApiImpl(JobDao jobDao) {
    this.jobDao = jobDao;
  }

  public computer.matter.cluster.model.Job getJobInfo(Job job) {
    var info = new computer.matter.cluster.model.Job();
    info.setId(job.uuid.toString());
    info.setObjectId(job.objectId);
    info.setStatus(AsyncRequestStatus.fromString(job.status.name().toLowerCase()));
    info.setType(job.type);
    info.setProgress(job.progress.progress);
    return info;
  }

  @Override
  public PaginatedJobResponse listJobsForObject(Integer page, Integer limit, String objectId) {
    var jobs = jobDao.findByObjectId(objectId, page, limit);
    var rsp = new PaginatedJobResponse();
    if (jobs.isEmpty()) {
      return rsp;
    }

    rsp.setItems(jobs.stream().map(this::getJobInfo).toList());
    rsp.setNextPage(String.valueOf(jobs.getLast().id + 1));
    return rsp;
  }

  @Override
  public computer.matter.cluster.model.Job queryJob(String jobId) {
    var job = jobDao.findByUuid(jobId);
    return getJobInfo(job);
  }
}
