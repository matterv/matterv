package computer.matter.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class KeysManager {
  private static final Logger logger = LoggerFactory.getLogger(KeysManager.class);

  public record KeyPair(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
  }

  private KeyPair keyPair;

  public void load(String keyStorePath, String password) {
    try {
      var keystore = KeyStore.getInstance("JKS");
      keystore.load(new FileInputStream(keyStorePath), password.toCharArray());
      var ns = keystore.aliases();
      var c = keystore.getCertificate("host");
      var pubKey = (RSAPublicKey) c.getPublicKey();
      var privateKey = (RSAPrivateKey) keystore.getKey("host", password.toCharArray());
      keyPair = new KeyPair(pubKey, privateKey);
    } catch (Exception e) {
      logger.error("Failed to load key pair", e);
      throw new RuntimeException(e);
    }
  }

  public KeyPair getKeyPair() {
    return keyPair;
  }
}
