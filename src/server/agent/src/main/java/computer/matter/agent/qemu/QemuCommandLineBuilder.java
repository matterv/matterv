package computer.matter.agent.qemu;

import computer.matter.agent.common.storage.UefiUtils;
import computer.matter.os.OsInfoUtil;
import computer.matter.vm.VirtualCdrom;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualDiskController;
import computer.matter.vm.VirtualDiskControllerType;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineType;
import computer.matter.vm.VirtualNic;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class QemuCommandLineBuilder {
  List<String> build(VirtualMachineConfig config) {
    return Stream.of(
            List.of("-daemonize"),
            buildBios(config),
            buildMachine(config.machineType),
            buildCpu(config.cpu),
            buildMemory(config.memoryInMB),
            buildKvm(),
            buildDisplay(config),
            buildName(config.name, config.uuid),
            buildDevices(config),
            buildQmp(config),
            buildPidfile(config.pidFile()),
            enableVmci()
    ).flatMap(List::stream).toList();
  }


  List<String> buildPidfile(String pidFilePath) {
    return List.of("-pidfile", pidFilePath);
  }

  List<String> buildCdrom(VirtualCdrom cdrom) {
    if (cdrom.connected) {
      return List.of("-drive", "file=" + cdrom.isoPath + ",if=none,id=drive-ide2,media=cdrom", "-device", "ide-cd,bus=ide.1,unit=0,drive=drive-ide2,id=ide2,bootindex=100");
    }
    return List.of();
  }

  List<String> buildMachine(VirtualMachineType machineType) {
    return List.of("-machine", machineType.getValue());
  }

  List<String> buildMemory(long memory) {
    return List.of("-m", String.valueOf(memory));
  }

  List<String> buildCpu(long cpu) {
    return List.of("-cpu", "max", "-smp", String.valueOf(cpu));
  }

  List<String> buildKvm() {
    return List.of("-accel", "kvm");
  }

  List<String> buildDisplay(VirtualMachineConfig vmConfig) {
    return List.of("-display", "none", "-vnc", "unix:" + vmConfig.vnc());
  }

  List<String> buildName(String name, UUID uuid) {
    return List.of("-name", name, "-uuid", uuid.toString());
  }

  List<String> buildQmp(VirtualMachineConfig vmConfig) {
    return List.of("-chardev", "socket,id=qmp,path=" + vmConfig.qmp() + ",server=on,wait=off",
            "-mon", "chardev=qmp,mode=control", "-chardev",
            "socket,id=qmp-event,path=" + vmConfig.qmpEvent() + ",reconnect=5",
            "-mon", "chardev=qmp-event,mode=control");
  }


  List<String> buildDevices(VirtualMachineConfig config) {
    return config.devices.stream().flatMap(d -> switch (d) {
      case VirtualDisk disk -> buildDisk(disk).stream();
      case VirtualNic nic -> buildNic(nic, config).stream();
      case VirtualCdrom cdrom -> buildCdrom(cdrom).stream();
      case VirtualDiskController controller -> buildDiskController(controller).stream();
      default -> Stream.of();
    }).toList();
  }

  List<String> buildDiskController(VirtualDiskController controller) {
    if (controller.type == VirtualDiskControllerType.SCSI) {
      var model = switch (controller.model) {
        case LSI -> "mptsas1068";
        case PVSCSI -> "pvscsi";
      };
      return List.of("-device", String.format("%s,id=scsihw%d", model, controller.id));
    } else {
      throw new RuntimeException(controller.type + " is not supported");
    }
  }

  List<String> buildBios(VirtualMachineConfig config) {
    var uefi = List.of(
            "-drive", "if=pflash,unit=0,format=raw,readonly=on,file=" + UefiUtils.OVMF_CODE_PATH,
            "-drive", "if=pflash,unit=1,format=raw,file=" + config.uefiFile());
    var smbios = List.of("-smbios", "type=1,uuid=" + config.uuid);
    return Stream.concat(smbios.stream(), uefi.stream()).toList();
  }

  List<String> buildDisk(VirtualDisk disk) {
    var fileNodeName = "disk" + disk.id + "_file";
    var diskNodeName = "disk" + disk.id;
    var fileBlockDev = List.of("-blockdev",
            "driver=file,node-name=" + fileNodeName + ",filename=" + disk.file);
    var driverMode = List.of("-blockdev",
            "driver=" + disk.fileType.getValue() + ",node-name=" + diskNodeName + ",file=" + fileNodeName);
    var controller = String.format("scsihw%d.0", disk.controllerId);
    var device = List.of(
            "-device",
            "scsi-hd,bus=" + controller + ",scsi-id=" + disk.id + ",drive=" + diskNodeName + ",bootindex=" + (disk.id + 1)
    );
    return Stream.of(fileBlockDev, driverMode, device).flatMap(List::stream).toList();
  }

  List<String> buildNic(VirtualNic n, VirtualMachineConfig config) {
    List<String> nic;
    if (!OsInfoUtil.isLinux(config.osId)) {
      nic = List.of("-net", "nic,model=igb,macaddr=" + n.macAddress);
    } else {
      nic = List.of("-net", "nic,model=virtio,macaddr=" + n.macAddress);
    }
    var backing = List.<String>of();
    if (n.connected) {
      backing = List.of("-net", "bridge,br=" + n.backingDev);
    }
    return Stream.concat(nic.stream(), backing.stream()).toList();
  }

  List<String> enableVmci() {
    return List.of("-device", "vmci");
  }
}
