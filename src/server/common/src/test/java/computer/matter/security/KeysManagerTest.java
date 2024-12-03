package computer.matter.security;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class KeysManagerTest {

  @Test
  @Disabled
  void load() {
    var keyManager = new KeysManager();
    keyManager.load("/opt/dev/matterv/src/server/agent/config/certs/host.jks", "hoststorepass");
  }
}