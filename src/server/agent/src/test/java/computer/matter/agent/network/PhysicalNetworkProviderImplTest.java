package computer.matter.agent.network;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhysicalNetworkProviderImplTest {

  @Test
  @Disabled
  void listNetworks() {
    var networks = new PhysicalNetworkProviderImpl().listNetworks();
    assertEquals("virbr0", networks.getFirst().name());
  }
}