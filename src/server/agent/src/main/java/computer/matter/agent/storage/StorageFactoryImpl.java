package computer.matter.agent.storage;

import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.storage.StorageType;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class StorageFactoryImpl implements StorageFactory {
  private final Map<UUID, Storage> storageMap = new ConcurrentHashMap<>();

  @Override
  public Storage getStorage(StorageDo storageDo) {
    Storage s;
    if (storageMap.containsKey(storageDo.uuid)) {
      return storageMap.get(storageDo.uuid);
    }

    switch (storageDo.storageType) {
      case StorageType.LOCAL, StorageType.NFS -> {
        s = new FileSystemBasedStorage(storageDo.mountedPath);
        storageMap.put(storageDo.uuid, s);
      }
      default -> throw new IllegalStateException("Unexpected value: " + storageDo.storageType);
    }
    return s;
  }
}
