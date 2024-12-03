package computer.matter.agent.qemu;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualDiskFileType;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineType;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public class VmTestBase {
  ObjectMapper objectMapper;
  VirtualMachineConfig vmConfig;
  Path tempDiskFile;
  long pid;

  @BeforeEach
  void setup() throws IOException {
    objectMapper = new ObjectMapper();
    tempDiskFile = Files.createTempFile("disk", ".raw");
    vmConfig = new VirtualMachineConfig();
    vmConfig.cpu = 1;
    vmConfig.machineType = VirtualMachineType.Q35;
    vmConfig.memoryInMB = 512;
    vmConfig.name = UUID.randomUUID().toString();
    vmConfig.uuid = UUID.randomUUID();
    vmConfig.vmDirPath = "/tmp";

    var disk = new VirtualDisk();
    disk.id = 1;
    disk.fileType = VirtualDiskFileType.RAW;
    disk.file = tempDiskFile.toString();
    vmConfig.devices = List.of(disk);
  }
}
