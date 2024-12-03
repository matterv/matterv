package computer.matter.app.api;

import computer.matter.host.api.JobApi;
import computer.matter.host.model.AsyncRequestStatus;
import computer.matter.host.model.PaginatedJobResponse;
import computer.matter.host.model.PaginationInfo;
import computer.matter.job.Job;
import computer.matter.job.model.JobDao;
import computer.matter.pagination.PaginationUtil;

public class JobApiImpl implements JobApi {

  private final JobDao jobDao;

  public JobApiImpl(JobDao jobDao) {
    this.jobDao = jobDao;
  }

  public computer.matter.host.model.Job getJobInfo(Job job) {
    var info = new computer.matter.host.model.Job();
    info.setId(job.uuid.toString());
    info.setObjectId(job.objectId);
    info.setStatus(AsyncRequestStatus.fromString(job.status.name().toLowerCase()));
    info.setType(job.type);
    info.setProgress(job.progress.progress);
    return info;
  }

  @Override
  public PaginatedJobResponse listJobsForObject(Integer page, Integer limit, String objectId) {
    var jobs = jobDao.findByObjectId(objectId).stream().map(this::getJobInfo).toList();
    var subJobs = PaginationUtil.getPage(jobs, page, limit);
    var rsp = new PaginatedJobResponse();
    rsp.setData(subJobs);
    var info = new PaginationInfo();
    info.setLimit(limit);
    info.setPage(page);
    info.setTotal(jobs.size());
    rsp.setPagination(info);
    return rsp;
  }

  @Override
  public computer.matter.host.model.Job queryJob(String jobId) {
    var job = jobDao.findByUuid(jobId);
    return getJobInfo(job);
  }
}
