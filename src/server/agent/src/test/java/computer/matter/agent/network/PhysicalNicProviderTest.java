package computer.matter.agent.network;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhysicalNicProviderTest {

  @Test
  @Disabled
  void hostName() {
    var hostname = new PhysicalNicProvider().hostName();
    assertEquals("localhost.localdomain", hostname.get());
  }
}