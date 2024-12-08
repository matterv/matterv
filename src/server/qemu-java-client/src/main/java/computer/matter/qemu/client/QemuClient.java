package computer.matter.qemu.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.qemu.api.QemuCommand;
import computer.matter.qemu.api.qmp_capabilitiesArgumentType;
import computer.matter.qemu.common.QemuCommandExecutionFailed;
import computer.matter.qemu.common.QemuConnection;
import computer.matter.qemu.common.QemuResponse;

import java.util.function.Function;

record QemuInfo(QemuConnection qemuConnection, QemuCommand qemuCommand) {
}

public class QemuClient {
  private final String qmpPath;
  private final ObjectMapper objectMapper;

  public QemuClient(String qmpPath, ObjectMapper objectMapper) {
    this.qmpPath = qmpPath;
    this.objectMapper = objectMapper;
  }

  private QemuInfo connect() {
    var qemuConnection = new QemuConnectionImpl(qmpPath);
    var qemuCommand = new QemuCommand(objectMapper, qemuConnection);
    qemuConnection.connect();
    qemuCommand.QMP_CAPABILITIES(new qmp_capabilitiesArgumentType());
    return new QemuInfo(qemuConnection, qemuCommand);
  }

  public <T> T runCommand(Function<QemuCommand, QemuResponse<T>> s) {
    var p = connect();
    try {
      var rsp = s.apply(p.qemuCommand());
      if (rsp.error != null) {
        throw new QemuCommandExecutionFailed(rsp.error.desc);
      }
      return rsp._return;
    } finally {
      p.qemuConnection().close();
    }
  }
}
