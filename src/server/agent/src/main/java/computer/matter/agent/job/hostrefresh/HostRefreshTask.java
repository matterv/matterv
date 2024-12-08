package computer.matter.agent.job.hostrefresh;

import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.agent.db.model.NetworkDao;
import computer.matter.agent.db.model.NetworkDo;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.host.model.Storage;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.network.NetworkType;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.storage.StorageType;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.stream.Collectors;

public class HostRefreshTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(HostRefreshTask.class);

  private final LocalStorageProvider localStorageProvider;
  private final PhysicalNetworkProvider physicalNetworkProvider;
  private final StorageDao storageDao;
  private final NetworkDao networkDao;


  public HostRefreshTask(LocalStorageProvider localStorageProvider, PhysicalNetworkProvider physicalNetworkProvider, Jdbi jdbi) {
    this.localStorageProvider = localStorageProvider;
    this.physicalNetworkProvider = physicalNetworkProvider;
    this.storageDao = jdbi.onDemand(StorageDao.class);
    this.networkDao = jdbi.onDemand(NetworkDao.class);
  }

  private void addNewLocalStorage(Storage localStorage) {
    var s = new StorageDo();
    s.mountedPath = localStorage.getMountPoint();
    s.name = localStorage.getName();
    s.capacityInBytes = localStorage.getCapacityInBytes();
    s.freeInBytes = localStorage.getFreeInBytes();
    s.storageType = StorageType.LOCAL;
    s.assigned = false;
    s.uuid = UUID.randomUUID();
    s.url = localStorage.getMountPoint();
    storageDao.insert(s);
  }

  private void updateExistingStorage(Storage localStorage, StorageDo existingStorage) {
    existingStorage.mountedPath = localStorage.getMountPoint();
    existingStorage.name = localStorage.getName();
    existingStorage.capacityInBytes = localStorage.getCapacityInBytes();
    existingStorage.freeInBytes = localStorage.getFreeInBytes();
    existingStorage.storageType = StorageType.LOCAL;
    storageDao.update(existingStorage);
  }

  private void refreshStorages() {
    var localStorages = localStorageProvider.discoverStorages();
    var physicalStorages = storageDao.getAllPhysicalStorages();
    var mountPointToStorageMap = physicalStorages.stream().collect(Collectors.toMap(s -> s.mountedPath, s -> s));
    localStorages.forEach(storage -> {
      if (mountPointToStorageMap.containsKey(storage.getMountPoint())) {
        updateExistingStorage(storage, mountPointToStorageMap.get(storage.getMountPoint()));
      } else {
        addNewLocalStorage(storage);
      }
    });
  }

  private void refreshNetworks() {
    var networks = physicalNetworkProvider.listNetworks();
    var existingNetworkNames = networkDao.getAll().stream().map(networkDo -> networkDo.name).toList();
    networks.forEach(n -> {
      if (!existingNetworkNames.contains(n.name())) {
        var network = new NetworkDo();
        network.uuid = UUID.randomUUID();
        network.name = n.name();
        network.networkType = NetworkType.valueOf(n.type());
        networkDao.insert(network);
      }
    });
  }

  @Override
  public void run(Job job) {
    //refreshStorages();
    refreshNetworks();
  }


  @Override
  public int weight() {
    return 100;
  }
}
