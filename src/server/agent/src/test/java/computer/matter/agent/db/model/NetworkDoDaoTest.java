package computer.matter.agent.db.model;

import computer.matter.common.test.DbTestBase;
import computer.matter.network.NetworkType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkDoDaoTest extends DbTestBase {

  @Test
  void getAll() {
    jdbi.useExtension(NetworkDao.class, networkDao -> {
      var network1 = new NetworkDo();
      network1.id = 1;
      network1.name = "network1";
      network1.networkType = NetworkType.BRIDGE;
      network1.uuid = UUID.randomUUID();
      networkDao.insert(network1);
      var networks = networkDao.getAll();
      assertEquals(1, networks.size());
      assertEquals(NetworkType.BRIDGE, networks.get(0).networkType);
    });
  }
}