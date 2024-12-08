package computer.matter.agent.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface StorageDao {
  @SqlUpdate("insert into storage (name, capacity_in_bytes, free_in_bytes, storage_type, url, mounted_path, uuid, assigned) values (:name, :capacityInBytes, :freeInBytes, :storageType, :url, :mountedPath, :uuid, :assigned)")
  @GetGeneratedKeys
  int insert(@BindFields StorageDo storage);

  @SqlUpdate("update storage set capacity_in_bytes = :capacityInBytes, free_in_bytes = :freeInBytes, storage_type = :storageType, url = :url, mounted_path = :mountedPath, assigned = :assigned where id = :id")
  void update(@BindFields StorageDo storage);

  @SqlQuery("select * from storage")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAll();

  @SqlQuery("select * from storage where assigned = false")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAllPhysicalStorages();

  @SqlQuery("select * from storage where assigned = true")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAllVmStorages();


  @SqlQuery("select * from storage where uuid = :uuid")
  @RegisterFieldMapper(StorageDo.class)
  StorageDo findByUUID(@Bind("uuid") String uuid);

  @SqlQuery("select * from storage where storage_type = :storageType")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> findByType(@Bind("storageType") String storageType);

  @SqlUpdate("delete from storage")
  void deleteAll();
}
