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

public interface ComputeClusterDao {
  @SqlUpdate("insert into compute_cluster (id, name, uuid, updated_at) values (:id, :name,  :uuid, :updatedAt)")
  @GetGeneratedKeys
  long insert(@BindFields ComputeClusterDo cc);

  @SqlUpdate("update compute_cluster set name = :name, is_deleted = :isDeleted, is_gced = :isGCed, updated_at = :updatedAt where id = :id")
  void update(@BindFields ComputeClusterDo cc);

  @SqlQuery("select * from compute_cluster")
  @RegisterFieldMapper(ComputeClusterDo.class)
  List<ComputeClusterDo> getAll();

  @SqlQuery("select * from compute_cluster where uuid in (<compute_cluster_uuids>)")
  @RegisterFieldMapper(ComputeClusterDo.class)
  List<ComputeClusterDo> findByUuids(@BindList("compute_cluster_uuids") List<UUID> ccIds);

  @SqlQuery("select * from compute_cluster where name = :name")
  @RegisterFieldMapper(ComputeClusterDo.class)
  ComputeClusterDo findByName(@Bind("name") String name);

  default List<ComputeClusterDo> getAllByDataCenterUuid(NodeHierarchyDao descendentsDao, UUID dcUuid) {
    var ccIds = descendentsDao.getDescendants(dcUuid, 1, NodeDo.NodeType.COMPUTE_CLUSTER).stream()
            .map(ccId -> ccId.uuid).toList();
    if (ccIds.isEmpty()) {
      return List.of();
    }
    return findByUuids(ccIds);
  }
}
