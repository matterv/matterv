package computer.matter.agent.storage;

import computer.matter.host.model.CreateFileReq;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileSystemBasedStorageTest {

  @Test
  void listFiles() {
    var s = new FileSystemBasedStorage("/");
    var files = s.listFiles("/home", 1, 10);
    int i = 1;
  }

  @Test
  @Disabled
  void createFile() {
    var s = new FileSystemBasedStorage("/home");
    var fileName = UUID.randomUUID().toString();
    var p = s.createFile("/", fileName, CreateFileReq.TypeEnum.FILE);
    var files = s.listFiles("/", 1, 10);
    assertEquals("/home" + fileName, "/home/" + files.getFirst().name());
  }
}