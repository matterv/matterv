package computer.matter.agent.common.vm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.vm.VirtualDevice;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualDiskControllerType;
import computer.matter.vm.VirtualDiskFileType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualDiskTest {
  @Test
  void testJson() throws JsonProcessingException {
    var om = new ObjectMapper();
    var disk = new VirtualDisk();
    disk.id = 1;
    disk.file = "foo";
    disk.fileType = VirtualDiskFileType.QCOW2;
    disk.controllerType = VirtualDiskControllerType.IDE;
    var js = om.writeValueAsString(disk);
    var d = om.readValue(js, VirtualDevice.class);
    assertEquals(1, d.id);
  }
}