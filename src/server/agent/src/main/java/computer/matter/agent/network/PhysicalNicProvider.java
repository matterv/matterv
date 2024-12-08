package computer.matter.agent.network;

import computer.matter.os.PhysicalNetworkProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PhysicalNicProvider {
  private final Logger logger = LoggerFactory.getLogger(PhysicalNicProvider.class);

  private final String SCRIPT_TEMPLATE = """
          #!/bin/bash

          is_bridge_slave() {
              local interface=$1
              for bridge in $(ls /sys/class/net/*/bridge/bridge_id 2>/dev/null | cut -d'/' -f5); do
                  if [ -e "/sys/class/net/$bridge/brif/$interface" ]; then
                      echo "$bridge"
                      return 0
                  fi
              done
              echo "-"
              return 1
          }

          ip -br link show up | while read line
          do
              interface=$(echo $line | awk '{print $1}')
              status=$(echo $line | awk '{print $2}')

              if [ "$interface" != "lo" ]; then
                  ip_address=$(ip -f inet addr show $interface | grep -Po 'inet \\K[\\d.]+')
                  [ -z "$ip_address" ] && ip_address="-"

                  if [ -d "/sys/class/net/$interface/bridge" ]; then
                      type="BRIDGE"
                      bridge_info="$interface"
                  elif [ -e "/sys/class/net/$interface/device" ]; then
                      type="PHYSICAL"
                      bridge_info=$(is_bridge_slave $interface)
                  else
                      type="Virtual"
                      bridge_info="-"
                  fi

                  echo "$interface:$ip_address:$status:$type:$bridge_info"
              fi
          done
          """;

  public List<PhysicalNetworkProvider.NetworkInterface> listNetworks() {
    List<PhysicalNetworkProvider.NetworkInterface> interfaces = new ArrayList<>();
    var pb = new ProcessBuilder("bash", "-c", SCRIPT_TEMPLATE);
    pb.redirectErrorStream(true);

    try {
      var process = pb.start();
      try (var reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
        String line;
        while ((line = reader.readLine()) != null) {
          logger.debug("result: {}", line);
          var parts = line.split(":");
          if (parts.length == 5) {
            var ipAddress = parts[1];
            if (parts[1].equalsIgnoreCase("-")) {
              logger.debug("Ignore the device as it does not have ip addresses {}", parts[0]);
              continue;
            }
            var intf = new PhysicalNetworkProvider.NetworkInterface(parts[0], ipAddress, parts[2], parts[3], parts[4]);
            interfaces.add(intf);
          }
        }
      }

      int exitCode = process.waitFor();
      if (exitCode != 0) {
        throw new RuntimeException("Script execution failed with exit code: " + exitCode);
      }
    } catch (IOException | InterruptedException e) {
      logger.error("Failed to list networks", e);
    }

    return interfaces;
  }

  public Optional<String> hostName() {
    Optional<String> hostname;
    try {
      hostname = Optional.of(InetAddress.getLocalHost().getHostName());
    } catch (Exception e) {
      logger.debug("Failed to get hostname", e);
      try {
        var process = Runtime.getRuntime().exec("hostname");
        var reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        hostname = Optional.of(reader.readLine());
      } catch (Exception e2) {
        logger.debug("Failed to get hostname from hostname command", e2);
        hostname = Optional.empty();
      }
    }
    return hostname;
  }

}
