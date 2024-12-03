package computer.matter.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import computer.matter.security.KeysManager;

public class Jwt {
  private final Algorithm algorithm;
  private final String issuer = "matterv";
  private final String subject = "Delegate";

  public Jwt(KeysManager.KeyPair keyPair) {
    this.algorithm = Algorithm.RSA256(keyPair.publicKey(), keyPair.privateKey());
  }

  public String createToken() {
    return JWT.create()
            .withIssuer(issuer)
            .withSubject(subject)
            .sign(algorithm);
  }

  public boolean verifyToken(String token) {
    var verifier = JWT.require(algorithm)
            // specify any specific claim validations
            .withIssuer(issuer)
            .withSubject(subject)
            // reusable verifier instance
            .build();

    var decodedJWT = verifier.verify(token);
    return decodedJWT.getIssuer().equals(issuer);
  }
}
