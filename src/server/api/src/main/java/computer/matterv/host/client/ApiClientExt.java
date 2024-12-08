package computer.matterv.host.client;

import computer.matter.host.ApiClient;
import jakarta.ws.rs.client.ClientBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.glassfish.jersey.apache5.connector.Apache5ConnectorProvider;
import org.glassfish.jersey.client.ClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.security.KeyStore;

public class ApiClientExt extends ApiClient {
  private static CertConfig certConfig = null;
  private final Logger logger = LoggerFactory.getLogger(ApiClientExt.class);

  public static synchronized void setCertConfig(CertConfig certConfig) {
    if (ApiClientExt.certConfig == null) {
      ApiClientExt.certConfig = certConfig;
    }
  }

  @Override
  protected void customizeClientBuilder(ClientBuilder clientBuilder) {
    clientBuilder.hostnameVerifier(new NoopHostnameVerifier());
    clientBuilder.property(ClientProperties.CONNECTOR_PROVIDER, Apache5ConnectorProvider.class.getName());
    try {
      var trustStore = KeyStore.getInstance("JKS");
      try (var inStream = new FileInputStream(certConfig.truststorePath())) {
        trustStore.load(inStream, certConfig.truststorePassword().toCharArray());
      }

      var keyStore = KeyStore.getInstance("JKS");
      try (var inStream = new FileInputStream(certConfig.keystorePath())) {
        keyStore.load(inStream, certConfig.keystorePassword().toCharArray());
      }
      var kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      kmf.init(keyStore, certConfig.keystorePassword().toCharArray());
      var tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      tmf.init(trustStore);

      var sslContext = SSLContext.getInstance("TLS");
      sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
      clientBuilder.sslContext(sslContext);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
