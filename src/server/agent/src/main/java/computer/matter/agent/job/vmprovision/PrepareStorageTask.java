package computer.matter.agent.job.vmprovision;

import com.google.common.base.Preconditions;
import computer.matter.agent.common.storage.UefiUtils;
import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.DiskDao;
import computer.matter.agent.db.model.DiskDo;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.agent.storage.Disk;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualDiskFileType;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class PrepareStorageTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(PrepareStorageTask.class);

  private final StorageFactory storageFactory;
  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;

  PrepareStorageTask(StorageFactory storageFactory, Jdbi jdbi, JsonUtil jsonUtil) {
    this.storageFactory = storageFactory;
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
  }

  private void persistDisk(Disk disk, StorageDo storageDo, UUID vmId) {
    jdbi.useExtension(DiskDao.class, diskDao -> {
      var diskDo = new DiskDo();
      diskDo.path = disk.path;
      diskDo.storageId = storageDo.id;
      diskDo.vmId = vmId;
      diskDo.uuid = UUID.randomUUID();
      diskDo.id = diskDao.insert(diskDo);
    });
  }

  @Override
  public void run(Job job) {
    logger.debug("Start to run PrepareStorageTask");
    VmProvisionJobConfig jobConfig = jsonUtil.fromJson(job.config, VmProvisionJobConfig.class);
    var storageDao = jdbi.onDemand(StorageDao.class);

    jobConfig.provisionedDisks = jobConfig.requirement.diskRequirements.stream().map(diskRequirement -> {
      var storageDo = storageDao.findByUUID(diskRequirement.storageId.toString());
      var storage = storageFactory.getStorage(storageDo);

      var disk = storage.createDisk(diskRequirement.sizeInGB, jobConfig.vmConfig.uuid, diskRequirement.id);
      persistDisk(disk, storageDo, jobConfig.vmId);
      disk.controllerId = diskRequirement.controllerId;
      return disk;
    }).toList();

    if (jobConfig.requirement.cdrom != null) {
      var cdromReq = jobConfig.requirement.cdrom;
      var storageDo = storageDao.findByUUID(cdromReq.getStorageId());
      var storage = storageFactory.getStorage(storageDo);
      if (!storage.exists(cdromReq.getIsoPath())) {
        throw new IllegalArgumentException("Invalid cdrom req" + cdromReq);
      }

      jobConfig.cdRom = new Disk(VirtualDiskFileType.ISO, storage.fullPath(cdromReq.getIsoPath()).toString(), 1);
      jobConfig.cdRom.connected = cdromReq.getConnected();
    }

      try {
          Files.copy(Paths.get(UefiUtils.OVMF_VARS_PATH), Paths.get(jobConfig.vmConfig.uefiFile()));
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

      Preconditions.checkState(
            jobConfig.provisionedDisks.size() == jobConfig.requirement.diskRequirements.size(),
            "Does not provision all the disks");

    var jobDao = jdbi.onDemand(JobDao.class);


    job.config = jsonUtil.toJson(jobConfig);

    jobDao.update(job);

  }

  @Override
  public int weight() {
    return 40;
  }
}
