package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.UUID;

public interface DiskDao {
  @SqlUpdate("insert into disk (uuid, storage_id, vm_id, size_in_bytes, updated_at, disk_order, path, is_deleted, is_gced) values (:uuid, :storageId, :vmId, :sizeInBytes, :updatedAt, :diskOrder, :path, :isDeleted, :isGCed)")
  @GetGeneratedKeys
  long insert(@BindFields DiskDo disk);

  @SqlUpdate("update disk set storage_id = :storageId, vm_id = :vmId, size_in_bytes = :sizeInBytes, updated_at = :updatedAt, disk_order = :diskOrder, path = :path, is_deleted = :isDeleted, is_gced = :isGCed where uuid = :uuid")
  void update(@BindFields DiskDo disk);

  @SqlQuery("select * from disk where vm_id = :vmId")
  @RegisterFieldMapper(DiskDo.class)
  List<DiskDo> getAllForVm(@Bind("vmId") UUID vmId);

  @SqlQuery("select * from disk")
  @RegisterFieldMapper(DiskDo.class)
  List<DiskDo> getAll();
}
