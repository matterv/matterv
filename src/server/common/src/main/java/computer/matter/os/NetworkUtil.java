package computer.matter.os;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Optional;

public class NetworkUtil {
  public static Optional<IpAddress> getHostIpAddress() {
    try {
      var nets = NetworkInterface.getNetworkInterfaces();
      return Collections
              .list(nets)
              .stream()
              .filter(n -> n.getName().equalsIgnoreCase(PhysicalNetworkProvider.DEFAULT_VM_NAME_NETWORK_NAME))
              .flatMap(n ->
                      Collections.list(n.getInetAddresses())
                              .stream()
                              .filter(i -> i instanceof Inet4Address)
              )
              .map(i -> new IpAddress(i.getHostAddress(), IpAddressType.IPV4))
              .findFirst();
    } catch (Exception e) {
      return Optional.empty();
    }
  }
}