package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.customizer.BindList;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.UUID;

public interface NetworkDao {
  @SqlUpdate("insert into network (name, network_type, ip_addresses, uuid, host_uuid, updated_at, is_deleted, is_gced, uuid_on_host, assigned) values (:name, :networkType, :ipAddresses, :uuid, :hostUuid, :updatedAt, :isDeleted, :isGCed, :uuidOnHost, :assigned)")
  @GetGeneratedKeys
  long insert(@BindFields NetworkDo network);

  @SqlUpdate("update network set name = :name, network_type = :networkType, ip_addresses = :ipAddresses, host_uuid = :hostUuid, updated_at = :updatedAt, is_deleted = :isDeleted, is_gced = :isGCed, uuid_on_host = :uuidOnHost, assigned = :assigned where uuid = :uuid")
  void update(@BindFields NetworkDo network);

  @SqlQuery("select * from network")
  @RegisterFieldMapper(NetworkDo.class)
  List<NetworkDo> getAll();

  @SqlQuery("select * from network where uuid in (<uuids>)")
  @RegisterFieldMapper(NetworkDo.class)
  List<NetworkDo> findByUUIDs(@BindList("uuids") List<UUID> uuids);

  @SqlQuery("select * from network where uuid = :uuid")
  @RegisterFieldMapper(NetworkDo.class)
  NetworkDo findByUuid(@Bind("uuid") UUID uuid);

  @SqlUpdate("delete from network")
  void deleteAll();

  @SqlQuery("select * from network where host_uuid = :hostId and assigned = :assigned")
  @RegisterFieldMapper(NetworkDo.class)
  List<NetworkDo> getAllByHostId(@Bind("hostId") UUID hostId, @Bind("assigned") boolean assigned);
}
