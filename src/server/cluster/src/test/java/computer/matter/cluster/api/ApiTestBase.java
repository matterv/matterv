package computer.matter.cluster.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.cluster.common.ClusterDbTestBase;
import computer.matter.cluster.db.model.ComputeClusterDao;
import computer.matter.cluster.db.model.DataCenterDao;
import computer.matter.cluster.db.model.DiskDao;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.NodeHierarchyDao;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.job.JobClientFactory;
import computer.matter.cluster.model.AddHostRequest;
import computer.matter.host.ApiException;
import computer.matter.host.client.AuthApi;
import computer.matter.host.client.HostApi;
import computer.matter.host.client.JobApi;
import computer.matter.host.client.model.Host;
import computer.matter.host.client.model.HostStatus;
import computer.matter.host.client.model.Network;
import computer.matter.host.client.model.PaginatedVMResponse;
import computer.matter.host.client.model.Storage;
import computer.matter.host.client.model.StorageType;
import computer.matter.job.JobClient;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.TestClock;
import computer.matterv.host.client.ApiClientProvider;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;


public class ApiTestBase extends ClusterDbTestBase {

  DatacenterApi datacenterApi;
  VmApi vmApi;
  StorageApi storageApi;
  JobClient jobClient;
  JsonUtil jsonUtil;
  @Mock
  ApiClientProvider apiClientProvider;
  @Mock
  HostApi agentHostApi;
  @Mock
  computer.matter.host.client.VmApi agentVmApi;
  @Mock
  JobApi agentJobApi;
  @Mock
  AuthApi authApi;
  TestClock clock;

  Host getHost() {
    var mockHost = new Host();
    mockHost.setId(UUID.randomUUID().toString());
    mockHost.setName("localhost");
    mockHost.setMemory(1L);
    mockHost.setCpu(1L);
    mockHost.setStatus(HostStatus.READY);

    var network = new Network();
    network.setId(UUID.randomUUID().toString());
    network.setName("test");
    mockHost.setVmNetwork(network);

    var storage = new Storage();
    storage.setId(UUID.randomUUID().toString());
    storage.setName("test");
    storage.setStorageType(StorageType.LOCAL);
    storage.setMountPoint(UUID.randomUUID().toString());
    storage.setCapacityInBytes(1L);
    storage.setFreeInBytes(1L);
    mockHost.setVmStorages(List.of(storage));
    return mockHost;
  }

  @BeforeEach
  public void setup() {
    super.setup();
    clock = new TestClock();

    var ob = new ObjectMapper();
    jsonUtil = new JsonUtil(ob);
    var jobSchedulerFactory = new SimpleJobSchedulerFactory();
    var jobClientFactory = new JobClientFactory(jdbi.onDemand(JobDao.class), jdbi, jsonUtil, apiClientProvider,
            jobSchedulerFactory, clock);
    jobClient = jobClientFactory.getJobClient();
    datacenterApi = new DataCenterApiImpl(jdbi.onDemand(DataCenterDao.class), jdbi.onDemand(ComputeClusterDao.class),
            jdbi.onDemand(
                    HostDao.class), jdbi.onDemand(VirtualMachineDao.class), jdbi.onDemand(StorageDao.class),
            jdbi.onDemand(
                    NetworkDao.class), jdbi.onDemand(NodeHierarchyDao.class), jdbi, jobClient, jsonUtil, clock,
            apiClientProvider);
    vmApi = new VmApiImpl(jdbi.onDemand(VirtualMachineDao.class), jdbi.onDemand(DiskDao.class), jdbi, jobClient,
            jsonUtil);
    storageApi = new StorageApiImpl(jdbi.onDemand(StorageDao.class), apiClientProvider, jdbi);
  }

  DataCenterInfo setupEnv() throws ApiException {
    Mockito.when(agentHostApi.getHostInfo()).thenReturn(getHost());

    Mockito.when(apiClientProvider.getHostApi(anyString())).thenReturn(agentHostApi);

    var vmRsp = new PaginatedVMResponse();
    vmRsp.setItems(List.of());
    Mockito.when(agentVmApi.getVms(anyInt(), anyInt())).thenReturn(vmRsp);
    Mockito.when(apiClientProvider.getVmApi(anyString())).thenReturn(agentVmApi);
    Mockito.when(apiClientProvider.getJobApi(anyString())).thenReturn(agentJobApi);

    var req3 = new AddHostRequest();
    req3.setDescription(UUID.randomUUID().toString());
    req3.setHostName("localhost");
    req3.setPort(1234);
    var rsp3 = datacenterApi.addHost(req3);
    jobClient.getJobScheduler().start();
    return new DataCenterInfo(null, null, rsp3.getId());
  }

  record DataCenterInfo(String dcId, String ccId, String hostId) {
  }
}
