package computer.matter.qemu.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class QemuClientTest {

  @Test
  void stop() {
    var ob = new ObjectMapper();
    var client = new QemuClient("/home/edison/boot/qmp-sock", ob);
  }
}