package computer.matter.agent.db.model;

import computer.matter.common.test.DbTestBase;
import computer.matter.os.LinuxSystemInfo;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HostDaoTest extends DbTestBase {

  @Test
  void createHostTable() {
    var hostDao = jdbi.onDemand(HostDao.class);
    assertNull(hostDao.get());

    var host = new HostDo();
    host.id = 1;
    host.name = "host1";
    host.cpu = 1;
    host.memory = 2;
    host.uuid = UUID.randomUUID();
    host.status = HostDo.Status.READY;
    hostDao.insert(host);
    var newHost = hostDao.get();
    assertEquals(1, newHost.id);

    var info = new LinuxSystemInfo.SystemInfo(
            new LinuxSystemInfo.CpuInfo(12, "AMD", 2.0),
            new LinuxSystemInfo.MemoryInfo(1, 2),
            new LinuxSystemInfo.HostInfo("linux", "5.14", "localhost", "x64"),
            "0.1");
    newHost.systemInfo = info;
    hostDao.update(newHost);
    var host2 = hostDao.get();
    assertEquals("5.14", host2.systemInfo.hostInfo().kernel());

  }
}