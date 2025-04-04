package computer.matter.vcenter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpsServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

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
  private static final String KEYSTORE_PATH = "/root/mykeystore.p12"; // Convert server.crt/key to JKS
  private static final String KEYSTORE_PASSWORD = "changeit"; // Set your password

  private static void configureLogger(LoggerContext context, String loggerName,
                                      Level level, ConsoleAppender<ILoggingEvent> appender) {
    ch.qos.logback.classic.Logger logger = context.getLogger(loggerName);
    logger.setLevel(level);
    logger.setAdditive(false);
    logger.addAppender(appender);
  }

  public static void configureLogback() {

    // Remove existing handlers attached to JUL root logger
    SLF4JBridgeHandler.removeHandlersForRootLogger();
    // Install the bridge handler
    SLF4JBridgeHandler.install();
//    java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger("");
//    julLogger.setLevel(java.util.logging.Level.FINEST);
    // 1. Get the LoggerContext
    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

    // 2. Clear any existing configuration
    loggerContext.reset();

    // 3. Create a ConsoleAppender
    ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
    consoleAppender.setContext(loggerContext);
    consoleAppender.setName("Console");

    // 4. Create a PatternLayoutEncoder
    PatternLayoutEncoder encoder = new PatternLayoutEncoder();
    encoder.setContext(loggerContext);
    encoder.setPattern("%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n");  // Your logging pattern
    encoder.start();

    // 5. Set the encoder on the appender
    consoleAppender.setEncoder(encoder);
    consoleAppender.start();
    loggerContext.start();

    configureLogger(loggerContext, Logger.ROOT_LOGGER_NAME, Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.api", Level.DEBUG, consoleAppender);

    configureLogger(loggerContext, "com.sun.xml.ws.transport", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.runtime", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.util", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.policy", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.server", Level.DEBUG, consoleAppender);
    configureLogger(loggerContext, "com.sun.xml.ws.client", Level.DEBUG, consoleAppender);

    System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpThreshold", "999999");
    // 7. Start the LoggerContext
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

  public static void main(String[] args) {
    configureLogback();

    // Load the KeyStore with the server's certificate and private key
    KeyStore keyStore = null; // or "PKCS12"
    try {
      keyStore = KeyStore.getInstance("PKCS12");

      try (FileInputStream keyStoreStream = new FileInputStream(KEYSTORE_PATH)) {
        keyStore.load(keyStoreStream, KEYSTORE_PASSWORD.toCharArray());
      }

      // Initialize KeyManagerFactory
      KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      kmf.init(keyStore, KEYSTORE_PASSWORD.toCharArray());

      // Initialize SSLContext
      SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(kmf.getKeyManagers(), null, null);

      var httpsServer = HttpsServer.create(new InetSocketAddress("0.0.0.0", 443), 0);
      httpsServer.setHttpsConfigurator(new HttpsConfigurator(sslContext) {
        public void configure(HttpsParameters params) {
          params.setNeedClientAuth(false); // Set to true if you require client certificates
          params.setSSLParameters(sslContext.getDefaultSSLParameters());
        }
      });

      var scManager = new ServiceContentManager();
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
