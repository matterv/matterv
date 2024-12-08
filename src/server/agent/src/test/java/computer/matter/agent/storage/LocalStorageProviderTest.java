package computer.matter.agent.storage;

import computer.matter.host.model.StorageType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalStorageProviderTest {

  @Test
  void discoverStorages() {
    var l = new LocalStorageProviderImpl();
    var storages = l.discoverStorages();
    assertEquals(StorageType.LOCAL, storages.getFirst().getStorageType());
  }
}