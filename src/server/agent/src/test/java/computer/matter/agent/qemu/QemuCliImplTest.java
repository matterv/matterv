package computer.matter.agent.qemu;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class QemuCliImplTest {

  @Test
  void powerOff() {
    var cli = new QemuCliImpl(new ObjectMapper(), null);
    var vnc = cli.queryVnc("/opt/matterv/vms/fa14e31b-c53a-4d90-b655-3f3bb6560d5a/qmp.sock");
    int i = 1;
  }
}