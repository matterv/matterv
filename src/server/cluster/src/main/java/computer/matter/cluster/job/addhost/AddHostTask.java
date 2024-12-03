package computer.matter.cluster.job.addhost;

import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.HostDo;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.NetworkDo;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.StorageDo;
import computer.matter.cluster.job.hostrefresh.HostRefreshJobConfig;
import computer.matter.cluster.job.hostrefresh.HostRefreshRunner;
import computer.matter.cluster.model.StorageStatus;
import computer.matter.host.ApiException;
import computer.matter.host.client.HostApi;
import computer.matter.host.client.JobApi;
import computer.matter.host.client.model.Host;
import computer.matter.host.client.model.Storage;
import computer.matter.host.client.model.UpdateHostRequest;
import computer.matter.job.Job;
import computer.matter.job.JobClient;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.network.NetworkType;
import computer.matter.os.IpAddress;
import computer.matter.storage.StorageType;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.JobUtils;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public class AddHostTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(AddHostTask.class);

  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;
  private final ApiClientProvider apiClientProvider;
  private final JobClient jobClient;

  public AddHostTask(JsonUtil jsonUtil, Jdbi jdbi, ApiClientProvider apiClientProvider, JobClient jobClient) {
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
    this.apiClientProvider = apiClientProvider;
    this.jobClient = jobClient;
  }

  private void createStorage(Storage s, HostDo hostDo, StorageDao storageDao, boolean assigned) {
    var storageDo = new StorageDo();
    storageDo.name = s.getName();
    storageDo.uuid = UUID.fromString(s.getId());
    storageDo.uuidOnHost = storageDo.uuid;
    storageDo.hostUuid = hostDo.uuid;
    storageDo.assigned = assigned;
    storageDo.mountedPath = s.getMountPoint();
    if (s.getCapacityInBytes() != null) {
      storageDo.capacityInBytes = s.getCapacityInBytes();
    }
    if (s.getFreeInBytes() != null) {
      storageDo.freeInBytes = s.getFreeInBytes();
    }
    storageDo.storageType = StorageType.valueOf(s.getStorageType().name());
    storageDo.url = s.getMountPoint();
    storageDo.status = StorageStatus.READY;
    storageDo.id = storageDao.insert(storageDo);
  }

  private void fromHostInfo(Handle handle, HostDo existingHost, Host host) {

    var hostDao = handle.attach(HostDao.class);
    var networkDao = handle.attach(NetworkDao.class);
    var storageDao = handle.attach(StorageDao.class);

    existingHost.cpu = host.getCpu();
    existingHost.memory = host.getMemory();
    existingHost.hostUuid = UUID.fromString(host.getId());
    existingHost.status = HostDo.Status.valueOf(host.getStatus().name());
    hostDao.update(existingHost);

    if (host.getPhysicalNetworks() != null && !host.getPhysicalNetworks().isEmpty()) {
      var physicalNetworks = host.getPhysicalNetworks();

      var existingNetworkUuids = networkDao.findByUUIDs((physicalNetworks.stream().map(network -> UUID.fromString(network.getId())).toList())).stream().map(networkDo -> networkDo.uuidOnHost.toString()).toList();
      physicalNetworks.forEach(network -> {
        if (!existingNetworkUuids.contains(network.getId())) {
          var networkDo = new NetworkDo();
          networkDo.networkType = NetworkType.BRIDGE;
          networkDo.name = network.getName();
          networkDo.uuid = UUID.randomUUID();
          networkDo.uuidOnHost = UUID.fromString(network.getId());
          networkDo.hostUuid = existingHost.uuid;
          networkDo.assigned = false;
          networkDao.insert(networkDo);
        }
      });
    }

    if (host.getVmStorages() != null && !host.getVmStorages().isEmpty()) {
      var hostVmStorages = host.getVmStorages();
      hostVmStorages.forEach(s -> createStorage(s, existingHost, storageDao, true));
    }

    if (host.getLocalStorages() != null && !host.getLocalStorages().isEmpty()) {
      var localStorages = host.getLocalStorages();
      localStorages.forEach(s -> createStorage(s, existingHost, storageDao, false));
    }
  }

  private void triggerHostRefreshJob(HostDo hostDo) {
    var hostRefreshConfig = new HostRefreshJobConfig();
    hostRefreshConfig.hostUuid = hostDo.uuid;
    jobClient.schedule(jsonUtil.toJson(hostRefreshConfig), HostRefreshRunner.jobType, hostDo.uuid.toString(),
            Duration.ofMinutes(15));
  }

  private void refreshHost(HostApi hostApi, JobApi jobApi) {
    try {
      var rsp = hostApi.refreshHost();
      logger.info("Calling refresh host {}", rsp);
      JobUtils.waitForJob(jobApi, rsp.getJobId());
    } catch (ApiException e) {
      logger.error("Failed to refresh host", e);
    }
  }

  private void updateHost(HostApi hostApi, String hostName) {
    try {
      var req = new UpdateHostRequest();
      req.setHostName(hostName);
      var rsp = hostApi.updateHost(req);
      logger.info("Calling update host {}", rsp);
    } catch (ApiException e) {
      logger.error("Failed to refresh host", e);
    }
  }

  @Override
  public void run(Job job) {
    var jobConfig = jsonUtil.fromJson(job.config, AddHostJobConfig.class);
    var hostDao = jdbi.onDemand(HostDao.class);
    var existingHost = hostDao.findByUuid(jobConfig.hostId);
    if (existingHost == null) {
      throw new RuntimeException("Failed to find host with id " + jobConfig.hostId);
    }

    var hostApi = apiClientProvider.getHostApi(existingHost.endpoint);
    var jobApi = apiClientProvider.getJobApi(existingHost.endpoint);

    try {
      updateHost(hostApi, jobConfig.hostName);

      refreshHost(hostApi, jobApi);

      var hostInfo = hostApi.getHostInfo();
      jdbi.useTransaction(handle -> fromHostInfo(handle, existingHost, hostInfo));
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }

    triggerHostRefreshJob(existingHost);
  }

  @Override
  public int weight() {
    return 100;
  }
}
