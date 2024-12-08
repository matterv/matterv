package computer.matter.agent.storage;

import computer.matter.vm.VirtualDiskFileType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileSystemBasedStorageDoTest {

  @Test
  void createDisk() {
    var s = new FileSystemBasedStorage("/tmp");
    var d = s.createDisk(1, UUID.randomUUID(), 1);
    assertEquals(VirtualDiskFileType.QCOW2, d.fileType);
  }
}