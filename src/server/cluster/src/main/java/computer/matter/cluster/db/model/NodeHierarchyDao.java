package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.UUID;

public interface NodeHierarchyDao {
  @SqlQuery("select * from get_descendants where root_uuid = :parentUuid and depth = :depth and type = :type")
  @RegisterFieldMapper(NodeDescendentDo.class)
  List<NodeDescendentDo> getDescendants(@Bind("parentUuid") UUID parentUuid, @Bind("depth") int depth,
                                        @Bind("type") NodeDo.NodeType type);

  @SqlQuery("select * from get_ancestors where leaf_uuid = :leafUuid and depth > 0")
  @RegisterFieldMapper(NodeAncestorDo.class)
  List<NodeAncestorDo> getAncestors(@Bind("leafUuid") UUID leafUuid);
}
