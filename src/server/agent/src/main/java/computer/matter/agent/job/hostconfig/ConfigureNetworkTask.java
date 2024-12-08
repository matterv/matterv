package computer.matter.agent.job.hostconfig;

import computer.matter.agent.db.model.NetworkDao;
import computer.matter.agent.db.model.NetworkDo;
import computer.matter.agent.network.PhysicalNetworkProviderImpl;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.network.NetworkType;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import computer.matter.os.PhysicalNetworkProvider;
import computer.matter.retry.RetryUtil;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ConfigureNetworkTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(ConfigureNetworkTask.class);

  private final JsonUtil jsonUtil;
  private final PhysicalNetworkProvider physicalNetworkProvider;
  private final Jdbi jdbi;


  public ConfigureNetworkTask(JsonUtil jsonUtil, PhysicalNetworkProvider physicalNetworkProvider, Jdbi jdbi) {
    this.jsonUtil = jsonUtil;
    this.physicalNetworkProvider = physicalNetworkProvider;
    this.jdbi = jdbi;
  }

  private Optional<PhysicalNetworkProvider.NetworkInterface> waitForBridgeNetworkReady() {
    return RetryUtil.retry(() -> {
      logger.debug("waitForBridgeNetworkReady");
      var networks = physicalNetworkProvider.listNetworks();
      return networks
              .stream()
              .filter(n -> n.name().equalsIgnoreCase(PhysicalNetworkProviderImpl.DEFAULT_VM_NAME_NETWORK_NAME))
              .findFirst();
    }, Duration.ofSeconds(1), 60);
  }

  @Override
  public void run(Job job) {
    HostConfigJobConfig jobConfig = jsonUtil.fromJson(job.config, HostConfigJobConfig.class);
    logger.debug("Setup bridge network on nic: {}", jobConfig.vmNetwork.getName());

    if (jobConfig.vmNetwork.getName().equalsIgnoreCase(PhysicalNetworkProviderImpl.DEFAULT_VM_NAME_NETWORK_NAME)) {
      logger.debug("Skip network setup");
    } else {
      physicalNetworkProvider.setupBasicVmNetwork(jobConfig.vmNetwork.getName());
    }

    var vmNetworkOpt = waitForBridgeNetworkReady();
    if (vmNetworkOpt.isEmpty()) {
      throw new RuntimeException("Failed to create bridge network");
    }
    var vmNetwork = vmNetworkOpt.get();

    var networkDao = jdbi.onDemand(NetworkDao.class);
    networkDao.deleteAll();

    var networkDo = new NetworkDo();
    networkDo.name = vmNetwork.name();
    networkDo.ipAddresses = List.of(new IpAddress(vmNetwork.ipAddress(), IpAddressType.IPV4));
    networkDo.networkType = NetworkType.valueOf(vmNetwork.type());
    networkDo.uuid = UUID.randomUUID();
    networkDo.id = networkDao.insert(networkDo);
  }


  @Override
  public int weight() {
    return 60;
  }
}
