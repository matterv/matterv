package computer.matter.esxi;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import computer.matter.host.api.VmApi;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualMachineConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.regex.Pattern;

public class NfcReceiver implements HttpHandler {
  final Logger logger = LoggerFactory.getLogger(NfcReceiver.class);

  private final VmApi vmApi;
  private final JsonUtil jsonUtil;
  private Pattern vmdkNameRegex = Pattern.compile("(.+)-(\\d+)\\.vmdk");

  public NfcReceiver(VmApi vmApi, JsonUtil jsonUtil) {
    this.vmApi = vmApi;
    this.jsonUtil = jsonUtil;
  }

  record VmInfo(String uuid, int diskId){}

  private VmInfo getVmInfo(String vmdkName) {
    var matcher = vmdkNameRegex.matcher(vmdkName);
    if (matcher.matches()) {
      var uuid = matcher.group(1);
      var diskId = Integer.parseInt(matcher.group(2));
      return new VmInfo(uuid, diskId);
    }
    throw new RuntimeException("Invalid vm info: " + vmdkName);
  }

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    try {
      var reqUri = exchange.getRequestURI();
      logger.debug("Received NFC data: {}", reqUri);

      var paths = reqUri.getPath().split("/");
      var vmdkName = paths[paths.length - 1];
      var vmInfo = getVmInfo(vmdkName);

      var vm = vmApi.getVm(vmInfo.uuid);
      var vmConfig = jsonUtil.fromJson(vm.getVmConfig(), VirtualMachineConfig.class);
      var disk = (VirtualDisk)vmConfig.devices.stream().filter(virtualDevice -> virtualDevice instanceof VirtualDisk &&  virtualDevice.id == vmInfo.diskId).findFirst().get();

      var requestBody = exchange.getRequestBody();
      var outputPath = disk.file;

      logger.debug("Write to disk: {}", outputPath);
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
    } catch (Exception e) {
      logger.error("Error processing NFC data", e);
    }
  }
}
