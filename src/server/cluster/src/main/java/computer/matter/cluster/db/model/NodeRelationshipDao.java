package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface NodeRelationshipDao {
  @SqlUpdate("insert into node_relationship (parent_uuid, child_uuid) values (:parentUuid, :childUuid)")
  void insert(@BindFields NodeRelationshipDo relationshipDo);

  @SqlQuery("select * from node_relationship")
  @RegisterFieldMapper(NodeRelationshipDo.class)
  List<NodeRelationshipDo> getAll();
}
