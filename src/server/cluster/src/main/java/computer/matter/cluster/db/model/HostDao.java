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

public interface HostDao {
  @SqlUpdate("insert into host (name, cpu, memory, uuid, status, ip_address, system_info, host_uuid, endpoint, updated_at) values (:name, :cpu, :memory, :uuid, :status, :ipAddress, :systemInfo, :hostUuid, :endpoint, :updatedAt)")
  @GetGeneratedKeys
  long insert(@BindFields HostDo host);

  @SqlUpdate("update host set name = :name, cpu = :cpu, memory = :memory, uuid = :uuid, status = :status, ip_address = :ipAddress, system_info = :systemInfo, host_uuid = :hostUuid, endpoint = :endpoint, is_deleted = :isDeleted, is_gced = :isGCed, updated_at = :updatedAt where id = :id")
  void update(@BindFields HostDo host);

  @SqlQuery("select * from host")
  @RegisterFieldMapper(HostDo.class)
  List<HostDo> getAll();

  @SqlQuery("select * from host where id >= :page order by id limit :limit")
  @RegisterFieldMapper(HostDo.class)
  List<HostDo> getAllInRange(@Bind("page") long page, @Bind("limit") int limit);

  @SqlQuery("select * from host where uuid in (<host_uuids>)")
  @RegisterFieldMapper(HostDo.class)
  List<HostDo> findByUuids(@BindList("host_uuids") List<UUID> hostUuids);

  @SqlQuery("select * from host where uuid = :host_uuid")
  @RegisterFieldMapper(HostDo.class)
  HostDo findByUuid(@Bind("host_uuid") UUID hostUuid);

  default List<HostDo> getAllByComputeClusterUuid(NodeHierarchyDao descendentsDao, UUID ccUuid) {
    var hostUuids = descendentsDao.getDescendants(ccUuid, 1, NodeDo.NodeType.HOST).stream()
            .map(descendentDo -> descendentDo.uuid).toList();
    if (hostUuids.isEmpty()) {
      return List.of();
    }
    return findByUuids(hostUuids);
  }
}
