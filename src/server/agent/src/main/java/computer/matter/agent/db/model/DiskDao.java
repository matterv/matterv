package computer.matter.agent.db.model;

import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface DiskDao {
  @SqlUpdate("insert into disk (path, storage_id, vm_id, uuid) values (:path, :storageId, :vmId, :uuid)")
  @GetGeneratedKeys
  int insert(@BindFields DiskDo disk);
}
