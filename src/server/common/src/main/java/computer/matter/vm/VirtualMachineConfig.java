package computer.matter.vm;

import java.util.List;
import java.util.UUID;

public class VirtualMachineConfig {
  public long cpu;
  public long memoryInMB;
  public VirtualMachineType machineType;
  public List<VirtualDevice> devices;
  public String name;
  public UUID uuid;
  public int osId = 2;
  public String vmDirPath;

  public String qmp() {
    return vmDirPath + "/" + "qmp.sock";
  }

  public String qmpEvent() {
    return vmDirPath + "/" + "qmeventd.sock";
  }

  public String vnc() {
    return vmDirPath + "/" + "vnc.sock";
  }

  public String pidFile() {
    return vmDirPath + "/" + "pid.file";
  }

  public String uefiFile() {
    return vmDirPath + "/" + "OVMF_VARS.fd";
  }
}
