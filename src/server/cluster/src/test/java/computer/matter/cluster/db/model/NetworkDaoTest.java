package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import computer.matter.network.NetworkType;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDaoTest extends ClusterDbTestBase {

  @Test
  void insert() {
    var network = new NetworkDo();
    var networkDao = jdbi.onDemand(NetworkDao.class);
    network.uuidOnHost = UUID.randomUUID();
    network.uuid = UUID.randomUUID();
    network.hostUuid = UUID.randomUUID();
    network.networkType = NetworkType.BRIDGE;
    network.ipAddresses = List.of(new IpAddress("192.168.1.1", IpAddressType.IPV4));
    network.assigned = true;
    network.name = UUID.randomUUID().toString();
    network.id = networkDao.insert(network);
    var network2 = networkDao.findByUuid(network.uuid);
    assertThat(network).usingRecursiveComparison().isEqualTo(network2);

    network.uuidOnHost = UUID.randomUUID();
    network.hostUuid = UUID.randomUUID();
    network.networkType = NetworkType.BRIDGE;
    network.ipAddresses = List.of(new IpAddress("192.168.1.2", IpAddressType.IPV4));
    network.assigned = false;
    network.name = UUID.randomUUID().toString();
    networkDao.update(network);
    network2 = networkDao.findByUuid(network.uuid);
    assertThat(network).usingRecursiveComparison().isEqualTo(network2);
  }
}