package computer.matter.agent.job.vmprovision;

import com.google.common.io.MoreFiles;
import computer.matter.app.AppConfig;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineType;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class InitProvisionTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(InitProvisionTask.class);

  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;
  private final AppConfig appConfig;

  InitProvisionTask(Jdbi jdbi, JsonUtil jsonUtil, AppConfig appConfig) {
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
    this.appConfig = appConfig;
  }

  @Override
  public void run(Job job) {
    logger.debug("Start to run InitProvisionTask");
    VmProvisionJobConfig jobConfig = jsonUtil.fromJson(job.config, VmProvisionJobConfig.class);
    var jobDao = jdbi.onDemand(JobDao.class);

    var vmUuid = UUID.randomUUID();
    var vmPath = Paths.get(appConfig.getVmMetadataRootDir(), vmUuid.toString());
    try {
      Files.createDirectories(vmPath);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    var vmConfig = new VirtualMachineConfig();
    vmConfig.name = jobConfig.requirement.name;
    vmConfig.uuid = vmUuid;
    vmConfig.cpu = jobConfig.requirement.cpu;
    vmConfig.memoryInMB = jobConfig.requirement.memoryInMB;
    vmConfig.machineType = VirtualMachineType.Q35;
    vmConfig.vmDirPath = vmPath.toAbsolutePath().toString();
    jobConfig.vmConfig = vmConfig;

    job.config = jsonUtil.toJson(jobConfig);

    jobDao.update(job);

  }

  @Override
  public void undo(Job job) {
    var jobConfig = jsonUtil.fromJson(job.config, VmProvisionJobConfig.class);
    if (jobConfig.vmConfig.vmDirPath != null) {
        try {
            MoreFiles.deleteRecursively(Paths.get(jobConfig.vmConfig.vmDirPath));
        } catch (IOException e) {
          logger.debug("Failed to delete {}", jobConfig.vmConfig.vmDirPath, e);
        }
    }
  }

  @Override
  public int weight() {
    return 10;
  }
}
