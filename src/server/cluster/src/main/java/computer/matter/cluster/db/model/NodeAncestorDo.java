package computer.matter.cluster.db.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class NodeAncestorDo {
  public UUID uuid;
  public NodeDo.NodeType type;
  public int depth;
  @ColumnName("leaf_uuid")
  public UUID leafUuid;
}
