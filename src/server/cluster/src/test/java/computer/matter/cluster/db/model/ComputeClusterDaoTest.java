package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeClusterDaoTest extends ClusterDbTestBase {

  @Test
  void getAll() {
    var ccDao = jdbi.onDemand(ComputeClusterDao.class);
    var cc = new ComputeClusterDo();
    cc.uuid = UUID.randomUUID();
    cc.name = UUID.randomUUID().toString();
    ccDao.insert(cc);
    var ccs = ccDao.getAll();

    cc.name = UUID.randomUUID().toString();
    ccDao.update(cc);
    ccs = ccDao.getAll();
    assertEquals(cc.name, ccs.getFirst().name);
  }
}