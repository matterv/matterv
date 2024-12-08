package computer.matter.agent.storage;

import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.host.model.Storage;
import computer.matter.host.model.StorageType;

import java.util.List;

public class MacLocalStorageProviderImpl implements LocalStorageProvider {
  @Override
  public List<Storage> discoverStorages() {
    var s = new Storage();
    s.setStorageType(StorageType.LOCAL);
    s.setName("/opt");
    s.setCapacityInBytes(1024 * 1024 * 1024 * 1024L);
    s.setFreeInBytes(900 * 1024 * 1024 * 1024L);
    s.setMountPoint("/opt");
    return List.of(s);
  }
}
