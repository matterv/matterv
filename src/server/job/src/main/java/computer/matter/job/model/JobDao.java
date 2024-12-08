package computer.matter.job.model;

import computer.matter.job.Job;
import computer.matter.job.JobStatus;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.customizer.BindList;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface JobDao {
  @SqlUpdate("insert into job (type, config, status, start_time, object_id, progress, uuid, frequency) values (:type, :config, :status, :startTime, :objectId, :progress, :uuid, :frequency)")
  @GetGeneratedKeys
  int insert(@BindFields Job job);

  @SqlUpdate("update job set config = :config, status = :status, end_time = :endTime, progress = :progress where uuid = :uuid")
  void update(@BindFields Job job);

  @SqlQuery("select * from job")
  @RegisterFieldMapper(Job.class)
  List<Job> getAll();

  @SqlQuery("select * from job where uuid = :uuid")
  @RegisterFieldMapper(Job.class)
  Job findByUuid(@Bind("uuid") String uuid);

  @SqlQuery("select * from job where object_id = :objectId and status in (<status>)")
  @RegisterFieldMapper(Job.class)
  List<Job> findByObjectIdAndStatus(@Bind("objectId") String objectId, @BindList("status") List<JobStatus> status);

  @SqlQuery("select * from job where object_id = :objectId")
  @RegisterFieldMapper(Job.class)
  List<Job> findByObjectId(@Bind("objectId") String objectId);

  @SqlQuery("select * from job where status = 'QUEUED' order by start_time limit :batchSize")
  @RegisterFieldMapper(Job.class)
  List<Job> listQueuedJobs(@Bind("batchSize") int batchSize);


  @SqlQuery("select * from job where uuid in (<uuids>)")
  @RegisterFieldMapper(Job.class)
  List<Job> findByUuids(@BindList("uuids") List<String> uuids);
}
