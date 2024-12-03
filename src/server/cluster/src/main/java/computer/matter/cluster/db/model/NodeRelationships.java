package computer.matter.cluster.db.model;


import computer.matter.cluster.common.hierarchy.Hierarchy;
import computer.matter.cluster.common.hierarchy.HierarchyInfo;
import computer.matter.cluster.common.hierarchy.NodeType;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;

public class NodeRelationships {

  public static void buildRelationship(Handle handle, UUID parentUuid, UUID childUuid, NodeDo.NodeType childType) {
    var nodeDao = handle.attach(NodeDao.class);
    var nodeRelationshipDao = handle.attach(NodeRelationshipDao.class);
    var childNode = new NodeDo();
    childNode.type = childType;
    childNode.uuid = childUuid;
    nodeDao.insert(childNode);

    var nrDo = new NodeRelationshipDo();
    nrDo.parentUuid = parentUuid;
    nrDo.childUuid = childUuid;
    nodeRelationshipDao.insert(nrDo);
  }

  public static HierarchyInfo getAncestors(Jdbi jdbi, UUID childUuid) {
    var hierarchyDao = jdbi.onDemand(NodeHierarchyDao.class);
    var lists = hierarchyDao.getAncestors(childUuid).stream()
            .map(h -> new Hierarchy(h.uuid, NodeType.valueOf(h.type.name()))).toList();
    return new HierarchyInfo(lists);
  }
}
