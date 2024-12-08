package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import computer.matter.cluster.model.StorageStatus;
import computer.matter.storage.StorageType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class StorageDaoTest extends ClusterDbTestBase {

  @Test
  void insert() {
    var storage = new StorageDo();
    var storageDao = jdbi.onDemand(StorageDao.class);
    storage.assigned = true;
    storage.uuidOnHost = UUID.randomUUID();
    storage.uuid = UUID.randomUUID();
    storage.name = UUID.randomUUID().toString();
    storage.hostUuid = UUID.randomUUID();
    storage.storageType = StorageType.NFS;
    storage.mountedPath = UUID.randomUUID().toString();
    storage.capacityInBytes = 1;
    storage.freeInBytes = 1;
    storage.url = UUID.randomUUID().toString();
    storage.status = StorageStatus.INITIAL;
    storage.id = storageDao.insert(storage);
    var storage2 = storageDao.findByUUID(storage.uuid.toString());
    assertThat(storage).usingRecursiveComparison().isEqualTo(storage2);

    storage.assigned = false;
    storage.uuidOnHost = UUID.randomUUID();
    storage.name = UUID.randomUUID().toString();
    storage.hostUuid = UUID.randomUUID();
    storage.storageType = StorageType.LOCAL;
    storage.mountedPath = UUID.randomUUID().toString();
    storage.capacityInBytes = 10;
    storage.freeInBytes = 110;
    storage.url = UUID.randomUUID().toString();
    storage.status = StorageStatus.READY;
    storageDao.update(storage);
    storage2 = storageDao.findByUUID(storage.uuid.toString());
    assertThat(storage).usingRecursiveComparison().isEqualTo(storage2);
  }
}