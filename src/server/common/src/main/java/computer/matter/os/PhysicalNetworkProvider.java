package computer.matter.os;

import java.util.List;
import java.util.Optional;

public interface PhysicalNetworkProvider {
  String DEFAULT_VM_NAME_NETWORK_NAME = "virbr0";

  void setupBasicVmNetwork(String physicalNic);

  List<NetworkInterface> listNetworks();

  Optional<String> hostName();

  record NetworkInterface(String name, String ipAddress, String status, String type, String bridgeInfo) {
  }
}
