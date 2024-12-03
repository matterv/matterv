package computer.matter.cluster.db.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class NodeRelationshipDo {
  @ColumnName("parent_uuid")
  public UUID parentUuid;
  @ColumnName("child_uuid")
  public UUID childUuid;
}
