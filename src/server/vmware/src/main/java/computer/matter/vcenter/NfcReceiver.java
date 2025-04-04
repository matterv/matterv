package computer.matter.vcenter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class NfcReceiver implements HttpHandler {
  final Logger logger = LoggerFactory.getLogger(NfcReceiver.class);

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    logger.debug("Received NFC data");
    var requestBody = exchange.getRequestBody();
    var outputPath = "/home/dev/vddk/" + UUID.randomUUID() + ".vmdk";
    try (var fileOutputStream = new FileOutputStream(outputPath)) {
      byte[] buffer = new byte[4 * 1024 * 1024];
      int bytesRead;

      // Read from request stream and write to file
      while ((bytesRead = requestBody.read(buffer)) != -1) {
        fileOutputStream.write(buffer, 0, bytesRead);
      }

      fileOutputStream.flush();
      logger.debug("File saved to: " + outputPath);

      exchange.sendResponseHeaders(201, -1);
      exchange.getResponseBody().close();
    }
  }
}
