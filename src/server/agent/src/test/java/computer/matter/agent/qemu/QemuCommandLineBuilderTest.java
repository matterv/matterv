package computer.matter.agent.qemu;

import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualDiskFileType;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineType;
import computer.matter.vm.VirtualNic;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;

class QemuCommandLineBuilderTest {

  @Test
  void build() throws IOException {
    var vmConfig = new VirtualMachineConfig();
    vmConfig.cpu = 8;
    vmConfig.vmDirPath = Files.createTempDirectory("test").toAbsolutePath().toString();
    vmConfig.memoryInMB = 512;
    vmConfig.machineType = VirtualMachineType.Q35;
    vmConfig.name = "vm1";
    vmConfig.uuid = UUID.randomUUID();
    var disk = new VirtualDisk();
    disk.fileType = VirtualDiskFileType.QCOW2;
    disk.file = "foo.qcow2";
    disk.id = 1;

    vmConfig.devices = List.of(disk);

    var builder = new QemuCommandLineBuilder();
    var s = builder.build(vmConfig);
    int i = 1;
  }
}