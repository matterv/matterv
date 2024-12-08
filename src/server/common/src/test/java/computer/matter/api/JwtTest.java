package computer.matter.api;

import computer.matter.security.KeysManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JwtTest {

  @Test
  @Disabled
  void createToken() {
    var keyManager = new KeysManager();
    keyManager.load("/opt/dev/matterv/src/server/agent/config/certs/host.jks", "hoststorepass");
    var jwt = new Jwt(keyManager.getKeyPair());
    var t = jwt.createToken();
    jwt.verifyToken(t);
    int i = 1;
  }
}