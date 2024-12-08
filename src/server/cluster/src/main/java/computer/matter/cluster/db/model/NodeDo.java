package computer.matter.cluster.db.model;

import java.util.UUID;

public class NodeDo {
  public UUID uuid;
  public NodeType type;

  public enum NodeType {
    DATA_CENTER,
    COMPUTE_CLUSTER,
    HOST,
    VIRTUAL_MACHINE,
    NETWORK,
    STORAGE
  }
}
