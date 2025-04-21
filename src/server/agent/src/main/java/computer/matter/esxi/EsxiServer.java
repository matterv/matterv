package computer.matter.esxi;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpsServer;
import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.host.api.VmApi;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executors;

public class EsxiServer {
  static final Logger logger = LoggerFactory.getLogger(EsxiServer.class);

  private final VmApi vmApi;
  private final JsonUtil jsonUtil;

  public EsxiServer(VmApi vmApi, JsonUtil jsonUtil) {
    this.vmApi = vmApi;
    this.jsonUtil = jsonUtil;
  }
  private static void logRequest(HttpExchange exchange) throws IOException {
    logger.info("Received HTTP Request:");
    logger.info("  Method: {}", exchange.getRequestMethod());
    logger.info("  URI: {}", exchange.getRequestURI());
    logger.info("  Headers: {}", exchange.getRequestHeaders());

    // Log the request body (if any)
    try (InputStream is = exchange.getRequestBody()) {
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      byte[] data = new byte[4096];
      int nRead;
      while ((nRead = is.read(data, 0, data.length)) != -1) {
        buffer.write(data, 0, nRead);
      }
      byte[] requestBodyBytes = buffer.toByteArray();

      if (requestBodyBytes.length > 0) {
        String requestBody = new String(requestBodyBytes); // Assuming UTF-8 encoding
        logger.debug("  Body:\n{}", requestBody);
      } else {
        logger.debug("  Body: (empty)");
      }
    }
  }

  public void start(String keyStorePath, String keyStorePassword, int port) {

    // Load the KeyStore with the server's certificate and private key
    KeyStore keyStore = null; // or "PKCS12"
    try {
      keyStore = KeyStore.getInstance("JKS");

      try (FileInputStream keyStoreStream = new FileInputStream(keyStorePath)) {
        keyStore.load(keyStoreStream, keyStorePassword.toCharArray());
      }

      // Initialize KeyManagerFactory
      KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      kmf.init(keyStore, keyStorePassword.toCharArray());

      // Initialize SSLContext
      SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(kmf.getKeyManagers(), null, null);

      var httpsServer = HttpsServer.create(new InetSocketAddress("0.0.0.0", port), 0);
      httpsServer.setHttpsConfigurator(new HttpsConfigurator(sslContext) {
        public void configure(HttpsParameters params) {
          params.setNeedClientAuth(false); // Set to true if you require client certificates
          params.setSSLParameters(sslContext.getDefaultSSLParameters());
        }
      });

      httpsServer.createContext("/ha-nfc", new NfcReceiver(vmApi, jsonUtil));

      httpsServer.setExecutor(Executors.newFixedThreadPool(10)); // Provide a thread pool

      httpsServer.start();
    } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException |
             UnrecoverableKeyException | KeyManagementException e) {
      throw new RuntimeException(e);
    }

  }
}
