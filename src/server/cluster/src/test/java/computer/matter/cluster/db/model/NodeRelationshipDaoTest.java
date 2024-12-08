package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeRelationshipDaoTest extends ClusterDbTestBase {

  @Test
  void getAll() {
    var nodeDao = jdbi.onDemand(NodeDao.class);
    var nodeRelationshipDao = jdbi.onDemand(NodeRelationshipDao.class);
    var nodDescedentsDao = jdbi.onDemand(NodeHierarchyDao.class);
    var node = new NodeDo();
    node.type = NodeDo.NodeType.DATA_CENTER;
    node.uuid = UUID.randomUUID();
    nodeDao.insert(node);

    var node2 = new NodeDo();
    node2.type = NodeDo.NodeType.COMPUTE_CLUSTER;
    node2.uuid = UUID.randomUUID();
    nodeDao.insert(node2);

    var node3 = new NodeDo();
    node3.type = NodeDo.NodeType.COMPUTE_CLUSTER;
    node3.uuid = UUID.randomUUID();
    nodeDao.insert(node3);

    var nrdo = new NodeRelationshipDo();
    nrdo.parentUuid = node.uuid;
    nrdo.childUuid = node2.uuid;
    nodeRelationshipDao.insert(nrdo);

    var nrdo2 = new NodeRelationshipDo();
    nrdo2.parentUuid = node.uuid;
    nrdo2.childUuid = node3.uuid;
    nodeRelationshipDao.insert(nrdo2);

    var node4 = new NodeDo();
    node4.type = NodeDo.NodeType.HOST;
    node4.uuid = UUID.randomUUID();
    nodeDao.insert(node4);
    var node5 = new NodeDo();
    node5.type = NodeDo.NodeType.HOST;
    node5.uuid = UUID.randomUUID();
    nodeDao.insert(node5);

    var nrdo3 = new NodeRelationshipDo();
    nrdo3.parentUuid = node3.uuid;
    nrdo3.childUuid = node4.uuid;
    nodeRelationshipDao.insert(nrdo3);

    var nrdo4 = new NodeRelationshipDo();
    nrdo4.parentUuid = node2.uuid;
    nrdo4.childUuid = node5.uuid;
    nodeRelationshipDao.insert(nrdo4);

    var nodes = nodeDao.getAll();
    assertEquals(5, nodes.size());
    var relationships = nodeRelationshipDao.getAll();
    assertEquals(4, relationships.size());

    var children = nodDescedentsDao.getDescendants(node.uuid, 1, NodeDo.NodeType.COMPUTE_CLUSTER);
    assertEquals(2, children.size());

    children = nodDescedentsDao.getDescendants(node2.uuid, 1, NodeDo.NodeType.HOST);
    assertEquals(1, children.size());

    children = nodDescedentsDao.getDescendants(node3.uuid, 1, NodeDo.NodeType.HOST);
    assertEquals(1, children.size());

    children = nodDescedentsDao.getDescendants(node.uuid, 2, NodeDo.NodeType.HOST);
    assertEquals(2, children.size());

    var ancestors = nodDescedentsDao.getAncestors(node5.uuid);
    assertEquals(2, ancestors.size());
  }
}