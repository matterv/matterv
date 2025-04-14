package computer.matter.common.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.db.cluster.HostDao;
import computer.matter.db.cluster.HostDo;
import computer.matter.db.cluster.StorageDao;
import computer.matter.db.cluster.StorageDo;
import computer.matter.json.JsonUtil;
import computer.matter.storage.StorageStatus;
import computer.matter.storage.StorageType;

import java.util.List;
import java.util.UUID;

public class ClusterDbTestBase extends DbTestBase {
  @Override
  public String migrationFile() {
    return "cluster-migration.xml";
  }

  public ClusterEnv setupCluster() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var hostDo = HostDo.creatInitHost();
    hostDo.id = hostDao.insert(hostDo);

    var storageDao = jdbi.onDemand(StorageDao.class);
    var storageDo = new StorageDo();
    storageDo.uuid = UUID.randomUUID();
    storageDo.uuidOnHost = UUID.randomUUID();
    storageDo.name = "datastore1";
    storageDo.storageType = StorageType.LOCAL;
    storageDo.hostUuid = hostDo.uuid;
    storageDo.mountedPath = "/home";
    storageDo.assigned = true;
    storageDo.url = "/home";
    storageDo.status = StorageStatus.READY;
    storageDao.insert(storageDo);

    var ob = new ObjectMapper();
    var jsonUtil = new JsonUtil(ob);
    return new ClusterEnv(hostDo, List.of(storageDo), jsonUtil);
  }
}
