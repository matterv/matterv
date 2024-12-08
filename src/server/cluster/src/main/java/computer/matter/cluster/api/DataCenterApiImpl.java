package computer.matter.cluster.api;

import computer.matter.cluster.db.model.ComputeClusterDao;
import computer.matter.cluster.db.model.DataCenterDao;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.HostDo;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.NetworkDo;
import computer.matter.cluster.db.model.NodeHierarchyDao;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.StorageDo;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.job.addhost.AddHostJobConfig;
import computer.matter.cluster.job.addhost.AddHostRunner;
import computer.matter.cluster.job.hostrefresh.HostRefreshJobConfig;
import computer.matter.cluster.job.hostrefresh.HostRefreshRunner;
import computer.matter.cluster.model.AddHostRequest;
import computer.matter.cluster.model.AddNetworkRequest;
import computer.matter.cluster.model.AddStorageRequest;
import computer.matter.cluster.model.Host;
import computer.matter.cluster.model.HostStats;
import computer.matter.cluster.model.HostStatus;
import computer.matter.cluster.model.Network;
import computer.matter.cluster.model.NetworkType;
import computer.matter.cluster.model.PaginatedHostResponse;
import computer.matter.cluster.model.PaginatedStorageResponse;
import computer.matter.cluster.model.PaginatedVMResponse;
import computer.matter.cluster.model.RefreshHostResponse;
import computer.matter.cluster.model.Storage;
import computer.matter.cluster.model.StorageStatus;
import computer.matter.cluster.model.StorageType;
import computer.matter.host.ApiException;
import computer.matter.job.JobClient;
import computer.matter.json.JsonUtil;
import computer.matter.os.Clock;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import computer.matterv.host.client.ApiClientProvider;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;

public class DataCenterApiImpl implements DatacenterApi {
  private final HostDao hostDao;
  private final StorageDao storageDao;
  private final NetworkDao networkDao;
  private final NodeHierarchyDao nodeDescendentsDao;
  private final Jdbi jdbi;
  private final JobClient jobClient;
  private final JsonUtil jsonUtil;
  private final VirtualMachineDao virtualMachineDao;
  private final Clock clock;
  private final ApiClientProvider apiClientProvider;


  public DataCenterApiImpl(DataCenterDao dataCenterDao, ComputeClusterDao computeClusterDao, HostDao hostDao,
                           VirtualMachineDao virtualMachineDao, StorageDao storageDao, NetworkDao networkDao,
                           NodeHierarchyDao nodeDescendentsDao, Jdbi jdbi, JobClient jobClient, JsonUtil jsonUtil,
                           Clock clock, ApiClientProvider apiClientProvider) {
    this.hostDao = hostDao;
    this.storageDao = storageDao;
    this.networkDao = networkDao;
    this.nodeDescendentsDao = nodeDescendentsDao;
    this.jdbi = jdbi;
    this.jobClient = jobClient;
    this.jsonUtil = jsonUtil;
    this.virtualMachineDao = virtualMachineDao;
    this.clock = clock;
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public Host addHost(AddHostRequest addHostRequest) {
    var hostUuid = UUID.randomUUID();
    jdbi.useTransaction(handle -> {
      var hostDao = handle.attach(HostDao.class);
      var hostDo = new HostDo();
      hostDo.uuid = hostUuid;
      hostDo.status = HostDo.Status.UNINITIALIZED;
      hostDo.name = addHostRequest.getHostName();
      hostDo.ipAddress = new IpAddress(addHostRequest.getHostName(), IpAddressType.IPV4);
      hostDo.endpoint = "https://" + addHostRequest.getHostName() + ":" + addHostRequest.getPort() + "/api";
      hostDo.id = hostDao.insert(hostDo);
    });


    var addHostConfig = new AddHostJobConfig();
    addHostConfig.hostName = addHostRequest.getHostName();
    addHostConfig.port = addHostRequest.getPort();
    addHostConfig.hostId = hostUuid;
    jobClient.schedule(jsonUtil.toJson(addHostConfig), AddHostRunner.jobType,
            hostUuid.toString(), null);
    return fromHost(hostDao.findByUuid(hostUuid));
  }

  @Override
  public Network addNetwork(String hostId, AddNetworkRequest addNetworkRequest) {
    var network = networkDao.findByUuid(UUID.fromString(addNetworkRequest.getNetworkId()));
    if (network == null) {
      throw new IllegalArgumentException("No network with id " + addNetworkRequest.getNetworkId());
    }

    network.assigned = true;
    networkDao.update(network);
    return fromNetwork(network);
  }

  private Storage addLocalStorageAsVmStorage(HostDo host, AddStorageRequest addStorageRequest) {

    var storageApi = apiClientProvider.storageApi(host.endpoint);
      try {
        var req = new computer.matter.host.client.model.AddStorageRequest();
        req.setName(addStorageRequest.getName());
        req.setPath(addStorageRequest.getPath());
        req.setType(computer.matter.host.client.model.StorageType.fromValue(addStorageRequest.getType().name()));
        var storage = storageApi.addStorage(req);

        var storageDo = new StorageDo();
        storageDo.uuidOnHost = UUID.fromString(storage.getId());
        storageDo.hostUuid = host.uuid;
        storageDo.mountedPath = storage.getMountPoint();
        storageDo.name = storage.getName();
        if (storage.getCapacityInBytes() != null) {
          storageDo.capacityInBytes = storage.getCapacityInBytes();
        }
        if (storage.getFreeInBytes() != null) {
          storageDo.freeInBytes = storage.getFreeInBytes();
        }
        storageDo.storageType = computer.matter.storage.StorageType.LOCAL;
        storageDo.assigned = true;
        storageDo.uuid = UUID.randomUUID();
        storageDo.status = StorageStatus.READY;
        storageDo.url = storage.getMountPoint();
        storageDao.insert(storageDo);
        return fromStorage(storageDo);
      } catch (ApiException e) {
          throw new RuntimeException(e);
      }
  }

  @Override
  public Storage addStorage(String hostId, AddStorageRequest addStorageRequest) {
    var host = hostDao.findByUuid(UUID.fromString(hostId));
    if (host == null) {
      throw new IllegalArgumentException("No host with id " + hostId);
    }

    if (addStorageRequest.getType() == StorageType.LOCAL) {
      return addLocalStorageAsVmStorage(host, addStorageRequest);
    } else {
      throw new IllegalArgumentException("Only local storages are supported");
    }
  }

  @Override
  public Host getHost(String hostId) {
    var host = hostDao.findByUuid(UUID.fromString(hostId));
    if (host == null) {
      throw new IllegalArgumentException("No host with id " + hostId);
    }
    return fromHost(host);
  }

  @Override
  public PaginatedHostResponse getHosts(Integer limit, Integer page) {
    if (page == null) {
      page = 1;
    }
    var hosts = hostDao.getAllInRange(page, limit);
    if (hosts == null || hosts.isEmpty()) {
      return new PaginatedHostResponse();
    }

    var rsp = new PaginatedHostResponse();
    rsp.setItems(hosts.stream().map(this::fromHost).toList());
    rsp.setNextPage(String.valueOf(hosts.getLast().id + 1));
    return rsp;
  }

  @Override
  public PaginatedStorageResponse getStoragesOnHost(String hostId, Integer limit, Integer page) {
    if (page == null) {
      page = 1;
    }
    var host = hostDao.findByUuid(UUID.fromString(hostId));
    if (host == null) {
      throw new IllegalArgumentException("No host with id " + hostId);
    }
    var storages = storageDao.getInRangeByHostUuid(host.uuid, page, limit, true);
    var rsp = new PaginatedStorageResponse();
    rsp.setItems(storages.stream().map(this::fromStorage).toList());
    return rsp;
  }

  @Override
  public PaginatedVMResponse getVmsOnHost(String hostId, Integer limit, Integer page) {
    if (page == null) {
      page = 1;
    }
    var host = hostDao.findByUuid(UUID.fromString(hostId));
    if (host == null) {
      throw new IllegalArgumentException("No host with id " + hostId);
    }
    var vms = virtualMachineDao.getInRangeByHostUuid(host.uuid, page, limit).stream().map(VmApiImpl::fromVmDo).toList();
    var rsp = new PaginatedVMResponse();
    rsp.setItems(vms);
    if (!vms.isEmpty()) {
      rsp.nextPage(vms.getLast().getId() + 1);
    }
    return rsp;
  }


  private Storage fromStorage(StorageDo storageDo) {
    var s = new Storage();
    s.setCapacityInBytes(storageDo.capacityInBytes);
    s.setId(storageDo.uuid.toString());
    s.setName(storageDo.name);
    s.setStorageType(StorageType.fromString(storageDo.storageType.name()));
    s.setMountPoint(storageDo.mountedPath);
    s.setFreeInBytes(storageDo.freeInBytes);
    s.setHostId(storageDo.hostUuid.toString());
    return s;
  }

  private computer.matter.cluster.model.IpAddress toIpAddress(computer.matter.os.IpAddress ip) {
    var addr = new computer.matter.cluster.model.IpAddress();
    addr.setIp(ip.ip());
    addr.setType(computer.matter.cluster.model.IpAddressType.fromString(ip.type().name()));
    return addr;
  }

  private Network fromNetwork(NetworkDo networkDo) {
    var n = new Network();
    n.setId(networkDo.uuid.toString());
    n.setName(networkDo.name);
    n.setType(NetworkType.fromString(networkDo.networkType.name()));
    return n;
  }

  Host fromHost(HostDo hostDo) {
    var host = new Host();
    host.setCpu(hostDo.cpu);
    host.setId(hostDo.uuid.toString());
    host.setName(hostDo.name);
    host.setMemory(hostDo.memory);
    host.setStatus(HostStatus.fromString(hostDo.status.name()));
    if (hostDo.status != HostDo.Status.UNINITIALIZED) {
      var storages = storageDao.getAllByHostId(hostDo.uuid, true);
      host.setVmStorages(storages.stream().map(this::fromStorage).toList());
      var networks = networkDao.getAllByHostId(hostDo.uuid, true);
      if (!networks.isEmpty()) {
        host.setVmNetwork(fromNetwork(networks.getFirst()));
      }
    }

    var localStorages = storageDao.getAllByHostId(hostDo.uuid, false);
    host.setLocalStorages(localStorages.stream().map(this::fromStorage).toList());

    var networks = networkDao.getAllByHostId(hostDo.uuid, false);
    host.setPhysicalNetworks(networks.stream().map(this::fromNetwork).toList());
    var stats = new HostStats();
    stats.setUsedCpu(1L);
    stats.setUsedMemory(1L);
    stats.setUsedStorages(1L);
    host.setHostStats(stats);
    return host;
  }


  @Override
  public RefreshHostResponse refreshHost(String hostId) {
    var config = new HostRefreshJobConfig();
    config.hostUuid = UUID.fromString(hostId);
    var job = jobClient.schedule(jsonUtil.toJson(config), HostRefreshRunner.jobType,
            hostId, null);
    var rsp = new RefreshHostResponse();
    rsp.setJobId(job.uuid.toString());
    return rsp;
  }
}
