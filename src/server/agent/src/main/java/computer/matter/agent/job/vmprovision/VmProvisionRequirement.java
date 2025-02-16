package computer.matter.agent.job.vmprovision;

import computer.matter.host.model.CreateVirtualMachineRequestCdrom;
import computer.matter.host.model.DiskController;

import java.util.List;
import java.util.UUID;

public class VmProvisionRequirement {
  public String name;
  public long cpu;
  public long memoryInMB;
  public int osId;
  public List<DiskController> diskControllers;
  public List<DiskRequirement> diskRequirements;
  public List<NetworkRequirement> networkRequirements;
  public CreateVirtualMachineRequestCdrom cdrom;

  public static class DiskRequirement {
    public long id;
    public long sizeInGB;
    public UUID storageId;
    public long controllerId;
  }

  public record NetworkRequirement(long id, String networkName, boolean connected) {
  }
}
