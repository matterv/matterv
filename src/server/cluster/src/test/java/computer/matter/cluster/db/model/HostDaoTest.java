package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class HostDaoTest extends ClusterDbTestBase {

  @Test
  void getAll() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = new HostDo();
    host.cpu = 1;
    host.memory = 2;
    host.uuid = UUID.randomUUID();
    host.status = HostDo.Status.READY;
    host.endpoint = "http://localhost:8080";
    host.name = UUID.randomUUID().toString();
    host.hostUuid = UUID.randomUUID();
    host.ipAddress = new IpAddress("192.168.1.1", IpAddressType.IPV4);
    host.id = hostDao.insert(host);
    var host2 = hostDao.findByUuid(host.uuid);
    assertThat(host).usingRecursiveComparison().isEqualTo(host2);

    host.cpu = 2;
    host.memory = 4;
    host.status = HostDo.Status.UNINITIALIZED;
    host.endpoint = "http://localhost:8081";
    host.name = UUID.randomUUID().toString();
    host.hostUuid = UUID.randomUUID();
    host.ipAddress = new IpAddress("192.168.1.2", IpAddressType.IPV4);
    hostDao.update(host);

    host2 = hostDao.findByUuid(host.uuid);
    assertThat(host).usingRecursiveComparison().isEqualTo(host2);
  }
}