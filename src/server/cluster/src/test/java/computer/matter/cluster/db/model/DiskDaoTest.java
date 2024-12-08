package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DiskDaoTest extends ClusterDbTestBase {

  @Test
  void insert() {
    var disk = new DiskDo();
    disk.diskOrder = 1;
    disk.uuid = UUID.randomUUID();
    disk.sizeInBytes = 1;
    disk.vmId = UUID.randomUUID();
    disk.storageId = UUID.randomUUID();
    disk.path = UUID.randomUUID().toString();
    var diskDao = jdbi.onDemand(DiskDao.class);
    disk.id = diskDao.insert(disk);
    var disk2 = diskDao.getAllForVm(disk.vmId).getFirst();
    assertThat(disk).usingRecursiveComparison().isEqualTo(disk2);

    disk.diskOrder = 2;
    disk.sizeInBytes = 3;
    disk.vmId = UUID.randomUUID();
    disk.storageId = UUID.randomUUID();
    disk.path = UUID.randomUUID().toString();
    diskDao.update(disk);
    disk2 = diskDao.getAll().getFirst();
    assertThat(disk).usingRecursiveComparison().isEqualTo(disk2);
  }
}