package computer.matter.cluster.db.model;

import computer.matter.cluster.model.StorageType;
import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.customizer.BindList;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.UUID;

public interface StorageDao {
  @SqlUpdate("insert into storage (name, capacity_in_bytes, free_in_bytes, storage_type, url, mounted_path, uuid, host_uuid, updated_at, uuid_on_host, assigned, status) values (:name, :capacityInBytes, :freeInBytes, :storageType, :url, :mountedPath, :uuid, :hostUuid, :updatedAt, :uuidOnHost, :assigned, :status)")
  @GetGeneratedKeys
  int insert(@BindFields StorageDo storage);

  @SqlUpdate("update storage set capacity_in_bytes = :capacityInBytes, free_in_bytes = :freeInBytes, storage_type = :storageType, url = :url, mounted_path = :mountedPath, host_uuid = :hostUuid, is_deleted = :isDeleted, is_gced = :isGCed, updated_at = :updatedAt, assigned = :assigned, name = :name, uuid_on_host = :uuidOnHost, status = :status where id = :id")
  void update(@BindFields StorageDo storage);

  @SqlQuery("select * from storage")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAll();

  @SqlQuery("select * from storage where host_uuid = :hostId and assigned = :assigned")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAllByHostId(@Bind("hostId") UUID hostId, @Bind("assigned") boolean assigned);

  @SqlQuery("select * from storage where uuid = :uuid")
  @RegisterFieldMapper(StorageDo.class)
  StorageDo findByUUID(@Bind("uuid") String uuid);

  @SqlQuery("select * from storage where uuid in (<uuids>) and assigned = :assigned")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> findByUUIDs(@BindList("uuids") List<UUID> uuids, @Bind("assigned") boolean assigned);

  @SqlQuery("select * from storage where host_uuid = :hostId and id >= :page and assigned = :assigned order by id limit :limit")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getInRangeByHostUuid(@Bind("hostId") UUID hostId, @Bind("page") long page, @Bind("limit") int limit,
                                       @Bind("assigned") boolean assigned);

  @SqlQuery("select * from storage where id >= :page and assigned = true order by id limit :limit")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> getAllInRange(@Bind("page") long page, @Bind("limit") int limit);


  @SqlQuery("select * from storage where storage_type = :storageType")
  @RegisterFieldMapper(StorageDo.class)
  List<StorageDo> findByType(@Bind("storageType") String storageType);

  @SqlQuery("select * from storage where storage_type = :storageType and host_uuid = :hostUuid and mounted_path = :mountedPath limit 1")
  @RegisterFieldMapper(StorageDo.class)
  StorageDo findByHostAndMountPoint(@Bind("storageType") StorageType storageType, @Bind("hostUuid") UUID hostUuid,
                                    @Bind("mountedPath") String mountedPath);

  @SqlUpdate("delete from storage")
  void deleteAll();
}
