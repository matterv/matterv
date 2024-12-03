package computer.matter.app;

import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.HostDo;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.storage.StorageType;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class CreateFakeData {
  public static void create(Jdbi jdbi) {

    AtomicBoolean hostExists = new AtomicBoolean(false);
    jdbi.useExtension(HostDao.class, hostDao -> {
      try {
        var host = hostDao.get();
        if (host != null) {
          hostExists.set(true);
        }
      } catch (Exception e) {
        hostExists.set(true);
      }

      if (hostExists.get()) {
        return;
      }
      var host = new HostDo();
      host.cpu = 100;
      host.memory = 512;
      host.name = "localhost";
      host.uuid = UUID.randomUUID();
      hostDao.insert(host);
    });

    if (hostExists.get()) {
      return;
    }

    jdbi.useExtension(StorageDao.class, storageDao -> {
      var storage = new StorageDo();
      storage.storageType = StorageType.NFS;
      storage.freeInBytes = 1;
      storage.capacityInBytes = 100;
      storage.url = "nfs://nfs-server/mnt";
      storage.mountedPath = "/home/edison/data";
      storage.name = "nfs1";
      storage.uuid = UUID.randomUUID();
      storageDao.insert(storage);
    });


  }
}
