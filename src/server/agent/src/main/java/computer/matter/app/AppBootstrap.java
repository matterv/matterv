package computer.matter.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.HostDo;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.agent.job.hostconfig.HostConfigJobRunner;
import computer.matter.agent.job.hostrefresh.HosRefreshJobRunner;
import computer.matter.agent.job.vmops.VmOpsJobRunner;
import computer.matter.agent.job.vmprovision.VmProvisionJobRunner;
import computer.matter.agent.network.MacPhysicalNetworkProviderImpl;
import computer.matter.agent.network.PhysicalNetworkProviderImpl;
import computer.matter.agent.qemu.InMemoryQemuCliImpl;
import computer.matter.agent.qemu.QemuCliImpl;
import computer.matter.agent.storage.InMemoryStorageFactory;
import computer.matter.agent.storage.LocalStorageProviderImpl;
import computer.matter.agent.storage.MacLocalStorageProviderImpl;
import computer.matter.agent.storage.StorageFactoryImpl;
import computer.matter.job.JobClientImpl;
import computer.matter.job.JobRunner;
import computer.matter.job.JobScheduler;
import computer.matter.job.JobSchedulerImpl;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.LinuxSystemInfo;
import computer.matter.os.MacosSystemInfoUtil;
import computer.matter.os.OsUtil;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.os.SystemClock;
import computer.matter.os.SystemInfoUtil;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class AppBootstrap {
  private final Logger logger = LoggerFactory.getLogger(AppBootstrap.class);

  private void initHost(Jdbi jdbi, SystemInfoUtil systemInfoUtil) {
    var hostDao = jdbi.onDemand(HostDao.class);
    if (hostDao.get() == null) {
      logger.debug("Host is not initialized, create am empty entry in host table");
      var host = HostDo.creatInitHost();
      var systemInfo = systemInfoUtil.getSystemInfo();
      systemInfo.ifPresent(info -> {
        host.cpu = info.cpuInfo().cores();
        host.memory = info.memoryInfo().totalInBytes();
      });
      hostDao.insert(host);
    }
  }

  public AppDependence bootstrap(Jdbi jdbi, AppConfig appConfig) {

    try {
      Files.createDirectories(Paths.get(appConfig.getVmMetadataRootDir()));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    var d = new AppDependence();

    var ob = new ObjectMapper();
    var jsonUtil = new JsonUtil(ob);

    var clock = new SystemClock();

    QemuCli qemuCli = new QemuCliImpl(ob, appConfig);
    if (OsUtil.isMacOs()) {
      qemuCli = new InMemoryQemuCliImpl();
    }
    StorageFactory sf = new StorageFactoryImpl();
    if (OsUtil.isMacOs()) {
      sf = new InMemoryStorageFactory();
    }
    PhysicalNetworkProvider networkProvider = new PhysicalNetworkProviderImpl();
    if (OsUtil.isMacOs()) {
      networkProvider = new MacPhysicalNetworkProviderImpl();
    }

    LocalStorageProvider localStorageProvider = new LocalStorageProviderImpl();
    if (OsUtil.isMacOs()) {
      localStorageProvider = new MacLocalStorageProviderImpl();
    }

    SystemInfoUtil systemInfoUtil = new LinuxSystemInfo();
    if (OsUtil.isMacOs()) {
      systemInfoUtil = new MacosSystemInfoUtil();
    }

    JobRunner vmProvisionRunner = new VmProvisionJobRunner(jsonUtil, qemuCli, jdbi, sf, appConfig);
    JobRunner vmOpsRunner = new VmOpsJobRunner(jsonUtil, qemuCli, jdbi);
    JobRunner hostConfigRunner = new HostConfigJobRunner(jdbi, jsonUtil, networkProvider, systemInfoUtil);
    JobRunner hostRefreshRunner = new HosRefreshJobRunner(jdbi, jsonUtil, networkProvider, systemInfoUtil,
        localStorageProvider);
    var jobRunnerType =
        Map.of(
            VmProvisionJobRunner.jobType, vmProvisionRunner,
            VmOpsJobRunner.jobType, vmOpsRunner,
            HostConfigJobRunner.jobType, hostConfigRunner,
            HosRefreshJobRunner.jobType, hostRefreshRunner
        );
    JobScheduler jobScheduler = new JobSchedulerImpl(jobRunnerType, jdbi, clock);
    jobScheduler.start();
    d.jobClient = new JobClientImpl(clock, jobScheduler, jdbi);
    d.objectMapper = ob;
    d.jsonUtil = new JsonUtil(ob);
    d.jobDao = jdbi.onDemand(JobDao.class);
    d.physicalNetworkProvider = networkProvider;
    d.localStorageProvider = localStorageProvider;
    d.storageFactory = sf;
    d.virtualMachineDao = jdbi.onDemand(VirtualMachineDao.class);


    initHost(jdbi, systemInfoUtil);
    return d;
  }
}
