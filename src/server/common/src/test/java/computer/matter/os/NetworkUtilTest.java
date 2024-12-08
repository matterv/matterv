package computer.matter.os;

import org.junit.jupiter.api.Test;

class NetworkUtilTest {
  @Test
  void testGetIpAddresses() {
    var ips = NetworkUtil.getHostIpAddress();
  }
}