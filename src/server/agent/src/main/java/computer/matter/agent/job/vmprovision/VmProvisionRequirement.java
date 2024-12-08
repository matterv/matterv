package computer.matter.agent.job.vmprovision;

import computer.matter.host.model.CreateVirtualMachineRequestCdrom;

import java.util.List;
import java.util.UUID;

public class VmProvisionRequirement {
  public String name;
  public long cpu;
  public long memoryInMB;
  public int osId;
  public List<DiskRequirement> diskRequirements;
  public List<NetworkRequirement> networkRequirements;
  public CreateVirtualMachineRequestCdrom cdrom;

  public static class DiskRequirement {
    public long id;
    public long sizeInGB;
    public UUID storageId;
  }

  public record NetworkRequirement(long id, String networkName, boolean connected) {
  }
}
