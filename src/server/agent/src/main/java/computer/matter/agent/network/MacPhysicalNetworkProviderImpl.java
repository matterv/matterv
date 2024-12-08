package computer.matter.agent.network;

import computer.matter.host.model.PhysicalNetworkType;
import computer.matter.os.PhysicalNetworkProvider;

import java.util.List;
import java.util.Optional;

public class MacPhysicalNetworkProviderImpl implements PhysicalNetworkProvider {
  @Override
  public void setupBasicVmNetwork(String physicalNic) {

  }

  @Override
  public List<NetworkInterface> listNetworks() {
    var nic = new NetworkInterface(PhysicalNetworkProvider.DEFAULT_VM_NAME_NETWORK_NAME, "192.168.1.1", "",
            PhysicalNetworkType.BRIDGE.name(), "");
    return List.of(nic);
  }

  @Override
  public Optional<String> hostName() {
    return Optional.of("192.168.1.1");
  }
}
