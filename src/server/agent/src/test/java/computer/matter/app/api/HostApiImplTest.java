package computer.matter.app.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.HostDo;
import computer.matter.agent.job.hostconfig.HostConfigJobRunner;
import computer.matter.agent.job.hostrefresh.HosRefreshJobRunner;
import computer.matter.common.test.DbTestBase;
import computer.matter.host.api.JobApi;
import computer.matter.host.model.Storage;
import computer.matter.host.model.StorageType;
import computer.matter.job.JobClient;
import computer.matter.job.JobClientImpl;
import computer.matter.job.JobRunner;
import computer.matter.job.JobScheduler;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.Clock;
import computer.matter.os.LinuxSystemInfo;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.os.SystemInfoUtil;
import computer.matter.os.TestClock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HostApiImplTest extends DbTestBase {

  @Mock
  PhysicalNetworkProvider physicalNetworkProvider;

  @Mock
  LocalStorageProvider localStorageProvider;
  SystemInfoUtil systemInfoUtil = new LinuxSystemInfo();

  JobClient jobClient;
  JsonUtil jsonUtil;
  HostApiImpl hostApi;
  JobApi jobApi;
  JobScheduler jobScheduler;
  Clock clock;

  @BeforeEach
  public void setup() {
    super.setup();
    var ob = new ObjectMapper();
    jsonUtil = new JsonUtil(ob);
    clock = new TestClock();
    JobRunner jobRunner = new HostConfigJobRunner(jdbi, jsonUtil, physicalNetworkProvider, systemInfoUtil);
    JobRunner hostRefresh = new HosRefreshJobRunner(jdbi, jsonUtil, physicalNetworkProvider, systemInfoUtil,
        localStorageProvider);
    jobScheduler = new SimpleJobScheduler(
        Map.of(HostConfigJobRunner.jobType, jobRunner, HosRefreshJobRunner.jobType, hostRefresh), jdbi, clock);

    jobClient = new JobClientImpl(new TestClock(), jobScheduler, jdbi);

    hostApi = new HostApiImpl(jdbi, physicalNetworkProvider, localStorageProvider, jobClient, jsonUtil);
    jobApi = new JobApiImpl(jdbi.onDemand(JobDao.class));
  }

  @Test
  void getPhysicalHostInfo() {
    var nic = new PhysicalNetworkProvider.NetworkInterface("a", "192.168.1.1", "up", "PHYSICAL", "");
    when(physicalNetworkProvider.listNetworks()).thenReturn(List.of(nic));
    var s = new Storage();
    s.setName("s");
    s.setStorageType(StorageType.LOCAL);
    when(localStorageProvider.discoverStorages()).thenReturn(List.of(s));
    var hostInfo = hostApi.getPhysicalHostInfo();
    var n = hostInfo.getNetwork();
    assertEquals("a", n.getFirst().getName());
    assertEquals("s", hostInfo.getStorage().getFirst().getName());
  }

  @Test
  void refreshHost() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = HostDo.creatInitHost();
    host.id = hostDao.insert(host);

    var s = new Storage();
    s.setName("s");
    s.setMountPoint("/opt");
    s.setCapacityInBytes(1L);
    s.setFreeInBytes(1L);
    s.setStorageType(StorageType.LOCAL);
    when(localStorageProvider.discoverStorages()).thenReturn(List.of(s));
    var rsp = hostApi.refreshHost();
    jobScheduler.start();
    var hostInfo = hostApi.getHostInfo();
    assertEquals(1, hostInfo.getLocalStorages().size());
    assertEquals("s", hostInfo.getLocalStorages().get(0).getName());
    assertEquals("/opt", hostInfo.getLocalStorages().get(0).getMountPoint());
  }

  @Test
  void updateHost() {

  }
}