package computer.matter.agent.network;


import computer.matter.os.PhysicalNetworkProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class PhysicalNetworkProviderImpl implements PhysicalNetworkProvider {

  final BridgeNetworkProvider bridgeNetworkProvider;
  final PhysicalNicProvider physicalNicProvider;
  private final Logger logger = LoggerFactory.getLogger(PhysicalNetworkProviderImpl.class);

  public PhysicalNetworkProviderImpl() {
    bridgeNetworkProvider = new BridgeNetworkProvider();
    physicalNicProvider = new PhysicalNicProvider();
  }

  @Override
  public void setupBasicVmNetwork(String physicalNic) {
    bridgeNetworkProvider.setupBridge(DEFAULT_VM_NAME_NETWORK_NAME, physicalNic);
  }

  @Override
  public List<NetworkInterface> listNetworks() {
    return physicalNicProvider.listNetworks();
  }

  @Override
  public Optional<String> hostName() {
    return physicalNicProvider.hostName();
  }
}
