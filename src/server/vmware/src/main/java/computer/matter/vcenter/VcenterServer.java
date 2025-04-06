package computer.matter.vcenter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpsServer;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executors;

public class VcenterServer {
  static final Logger logger = LoggerFactory.getLogger(VcenterServer.class);
  static final String xmlVersion = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><namespaces version=\"1.0\"><namespace><name>urn:vim25</name><version>8.0.3.0</version><priorVersions><version>7.0.2.1</version><version>7.0.2.0</version><version>7.0.1.1</version><version>7.0.1.0</version><version>7.0.0.2</version><version>7.0.0.0</version><version>6.9.1</version><version>6.8.7</version><version>6.7.3</version><version>6.7.2</version><version>6.7.1</version><version>6.7</version><version>6.5</version><version>6.0</version><version>5.5</version><version>5.1</version><version>5.0</version><version>4.1</version><version>4.0</version></priorVersions></namespace></namespaces>";
  private Jdbi jdbi;
  public VcenterServer(Jdbi jdbi) {
    this.jdbi = jdbi;
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

      var scManager = new ServiceContentManager(jdbi);
      var vcenterVimServer = new VcenterVimServer(scManager);

      var context = httpsServer.createContext("/sdk", new SoapHandler("com.vmware.vim25.VimPortType", vcenterVimServer));
      context.getAttributes().put("com.sun.net.httpserver.exchange.keepalive", "120");

      httpsServer.createContext("/ha-nfc", new NfcReceiver());

      HttpHandler handler2 = exchange -> {
        logRequest(exchange);

        exchange.getResponseHeaders().set("Content-Type", "application/xml");
        exchange.getResponseHeaders().set("Content-Length", String.valueOf(xmlVersion.getBytes(StandardCharsets.UTF_8).length));

        // Send the response
        try (OutputStream os = exchange.getResponseBody()) {
          exchange.sendResponseHeaders(200, xmlVersion.getBytes(StandardCharsets.UTF_8).length);
          os.write(xmlVersion.getBytes(StandardCharsets.UTF_8));
        }
      };

      httpsServer.createContext("/sdk/vimServiceVersions.xml", handler2);

      httpsServer.setExecutor(Executors.newFixedThreadPool(10)); // Provide a thread pool

      httpsServer.start();
    } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException |
             UnrecoverableKeyException | KeyManagementException e) {
      throw new RuntimeException(e);
    }

  }
}
