package computer.matter.agent.db.model;

import computer.matter.common.test.DbTestBase;
import computer.matter.storage.StorageType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StorageDoDaoTest extends DbTestBase {

  @Test
  void getAll() {
    jdbi.useExtension(StorageDao.class, storageDao -> {
      var storage = new StorageDo();
      storage.name = "storage1";
      storage.capacityInBytes = 3;
      storage.freeInBytes = 2;
      storage.storageType = StorageType.NFS;
      storage.url = "nfs://foo";
      storage.uuid = UUID.randomUUID();
      storage.id = storageDao.insert(storage);
      var storages = storageDao.getAll();
      assertEquals(1, storages.size());
      assertEquals(1, storages.get(0).id);

      storage.freeInBytes = 3;
      storageDao.update(storage);
      storages = storageDao.getAll();
      assertEquals(3, storages.get(0).freeInBytes);
    });
  }
}