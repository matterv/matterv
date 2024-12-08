package computer.matter.agent.job.hostconfig;

import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.storage.StorageType;
import org.jdbi.v3.core.Jdbi;

import java.util.UUID;

public class ConfigureStorageTask implements Task {
  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;

  public ConfigureStorageTask(Jdbi jdbi, JsonUtil jsonUtil) {
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
  }

  @Override
  public void run(Job job) {
    HostConfigJobConfig jobConfig = jsonUtil.fromJson(job.config, HostConfigJobConfig.class);

    var storageDao = jdbi.onDemand(StorageDao.class);
    storageDao.deleteAll();

    jobConfig.storages.forEach(s -> {
      var storageDo = new StorageDo();
      storageDo.name = s.getName();
      storageDo.mountedPath = s.getMountPoint();
      storageDo.storageType = StorageType.valueOf(s.getStorageType().name());
      storageDo.url = "file://" + s.getMountPoint();
      storageDo.uuid = UUID.randomUUID();
      storageDao.insert(storageDo);
    });
  }

  @Override
  public int weight() {
    return 20;
  }
}
