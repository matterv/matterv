package computer.matter.cluster.api;

import computer.matter.cluster.model.AddHostRequest;
import computer.matter.host.ApiException;
import computer.matter.host.client.model.AsyncRequestStatus;
import computer.matter.host.client.model.Host;
import computer.matter.host.client.model.HostRefreshResponse;
import computer.matter.host.client.model.HostStatus;
import computer.matter.host.client.model.Job;
import computer.matter.host.client.model.Network;
import computer.matter.host.client.model.Storage;
import computer.matter.host.client.model.StorageType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
class DataCenterApiImplTest extends ApiTestBase {

  @Test
  void createHost() throws ApiException {

    var req3 = new AddHostRequest();
    req3.setDescription(UUID.randomUUID().toString());
    req3.setHostName("localhost");
    req3.setPort(1234);
    var initialHost = datacenterApi.addHost(req3);
    assertEquals(computer.matter.cluster.model.HostStatus.UNINITIALIZED, initialHost.getStatus());
    var mockHostApi = Mockito.mock(computer.matter.host.client.HostApi.class);
    var mockJobApi = Mockito.mock(computer.matter.host.client.JobApi.class);
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

    var localStorage = new Storage();
    localStorage.setId(UUID.randomUUID().toString());
    localStorage.setName("localStorage");
    localStorage.setStorageType(StorageType.LOCAL);
    localStorage.setMountPoint(UUID.randomUUID().toString());
    localStorage.setCapacityInBytes(1L);
    mockHost.setLocalStorages(List.of(localStorage));


    Mockito.when(mockHostApi.getHostInfo()).thenReturn(mockHost);
    var refreshHostRsp = new HostRefreshResponse();
    refreshHostRsp.setJobId(UUID.randomUUID().toString());
    Mockito.when(mockHostApi.refreshHost()).thenReturn(refreshHostRsp);

    var refreshJob = new Job();
    refreshJob.setStatus(AsyncRequestStatus.FINISHED);
    Mockito.when(mockJobApi.queryJob(anyString())).thenReturn(refreshJob);
    Mockito.when(apiClientProvider.getHostApi(anyString())).thenReturn(mockHostApi);
    Mockito.when(apiClientProvider.getJobApi(anyString())).thenReturn(mockJobApi);
    jobClient.getJobScheduler().start();

    var hosts = datacenterApi.getHosts(10, 0);
    var hostInfo = hosts.getItems().getFirst();
    assertEquals(1, hosts.getItems().size());
    assertEquals(mockHost.getName(), hostInfo.getName());
    assertEquals(mockHost.getCpu(), hostInfo.getCpu());
    assertEquals(mockHost.getMemory(), hostInfo.getMemory());
    var vmStorage = hostInfo.getVmStorages().getFirst();
    assertEquals(storage.getName(), vmStorage.getName());
    assertEquals(storage.getMountPoint(), vmStorage.getMountPoint());
    assertEquals(storage.getCapacityInBytes(), vmStorage.getCapacityInBytes());
    assertEquals(storage.getFreeInBytes(), vmStorage.getFreeInBytes());
    assertEquals(storage.getStorageType().toString(), vmStorage.getStorageType().toString());
    assertEquals(hostInfo.getId(), vmStorage.getHostId());

    var vmNetwork = hostInfo.getVmNetwork();
    assertEquals(network.getName(), vmNetwork.getName());

    var localStorage2 = hostInfo.getLocalStorages().getFirst();
    assertEquals(localStorage.getName(), localStorage2.getName());
  }
}