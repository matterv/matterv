package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataCenterDaoTest extends ClusterDbTestBase {

  @Test
  void getAll() {
    var dcDao = jdbi.onDemand(DataCenterDao.class);
    var dc = new DataCenterDo();
    dc.uuid = UUID.randomUUID();
    dc.name = UUID.randomUUID().toString();
    dcDao.insert(dc);
    var dcs = dcDao.getAll();
    assertEquals(dc.name, dcs.getFirst().name);

    dc.name = UUID.randomUUID().toString();
    dc.isDeleted = true;
    dc.updatedAt = Instant.now();
    dcDao.update(dc);
    dcs = dcDao.getAll();
    assertEquals(dc.name, dcs.getFirst().name);
    assertTrue(dcs.getFirst().isDeleted);
  }
}