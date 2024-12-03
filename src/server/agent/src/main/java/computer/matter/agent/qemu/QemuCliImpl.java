package computer.matter.agent.qemu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import computer.matter.agent.common.vm.QemuCli;
import computer.matter.app.AppConfig;
import computer.matter.os.CommandExecutor;
import computer.matter.os.ProcessUtil;
import computer.matter.qemu.api.QemuCommand;
import computer.matter.qemu.client.QemuClient;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.Vnc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

public class QemuCliImpl implements QemuCli {
  private static final Logger logger = LoggerFactory.getLogger(QemuCliImpl.class);

  private final String qemuBinaryPath = "/opt/matterv/host/qemu-kvm/qemu-kvm";
  private final ObjectMapper objectMapper;
  private final AppConfig appConfig;

  public QemuCliImpl(ObjectMapper objectMapper, AppConfig appConfig) {
    this.objectMapper = objectMapper;
    this.appConfig = appConfig;
  }

  @Override
  public long createVm(VirtualMachineConfig config) {
    var arguments = new QemuCommandLineBuilder().build(config);
    var command = List.of(qemuBinaryPath);
    List<String> cmds = ImmutableList.<String>builder().addAll(command).addAll(arguments).build();
    var cmd = String.join(" ", cmds);
    var result = CommandExecutor.executeCommand(cmd, 5);
    if (result.exitCode() > 0) {
      logger.error("Failed to start vm: {}, result: {}", cmd, result.output());
      throw new RuntimeException("Failed to create vm");
    }
    return 0;
  }

  @Override
  public void stopVm(VirtualMachineConfig config) {
    var client = new QemuClient(config.qmp(), objectMapper);
    client.runCommand(QemuCommand::SYSTEM_POWERDOWN);

    if (!ProcessUtil.waitForProcessExit(config.pidFile(), Duration.ofSeconds(1), appConfig.getVmStopWaitInSeconds())) {
      logger.error("Process does not exit, force quit");
      client.runCommand(QemuCommand::QUIT);
    }
  }

  @Override
  public void startVm(VirtualMachineConfig config) {
    createVm(config);
  }

  @Override
  public void resetVm(VirtualMachineConfig config) {
    var client = new QemuClient(config.qmp(), objectMapper);
    client.runCommand(QemuCommand::SYSTEM_RESET);
  }

  @Override
  public void editVm(VirtualMachineConfig config) {

  }

  @Override
  public Optional<Vnc> queryVnc(String qmpPath) {
    try {
      var client = new QemuClient(qmpPath, objectMapper);
      var vncServers = client.runCommand(QemuCommand::QUERY_VNC_SERVERS);
      var port = vncServers
          .stream()
          .flatMap(v -> v.SERVER.stream())
          .map(vncServer -> Integer.parseInt(vncServer.SERVICE))
          .findFirst();
      return port.map(Vnc::new);
    } catch (Exception e) {
      logger.error("Failed to query vnc");
      return Optional.empty();
    }
  }

  @Override
  public List<VirtualMachineConfig> listVms() {
    return List.of();
  }
}
