package computer.matter.qemu.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.qemu.api.QemuCommand;
import computer.matter.qemu.api.qmp_capabilitiesArgumentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class QemuConnectionTest {

  @Test
  @Disabled
  void read() throws JsonProcessingException {
    var mapper = new ObjectMapper();
    var channel = new QemuConnectionImpl("/home/edison/boot/qmp-sock");
    channel.connect();
    var g = mapper.readValue(channel.getGreeting(), Greeting.class);
    Assertions.assertEquals(8, g.QMP.version.QEMU.MAJOR);
    channel.close();
  }

  @Disabled
  @Test
  void write() {
    var a = new qmp_capabilitiesArgumentType();
    var mapper = new ObjectMapper();

    var channel = new QemuConnectionImpl("/home/edison/boot/qmp-sock");
    channel.connect();

    var qm = new QemuCommand(mapper, channel);
    var r = qm.QMP_CAPABILITIES(a);
    Assertions.assertEquals(null, r._return);
    channel.close();
  }
}