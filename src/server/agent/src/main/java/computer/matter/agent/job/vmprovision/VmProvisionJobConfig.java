package computer.matter.agent.job.vmprovision;


import computer.matter.agent.storage.Disk;
import computer.matter.vm.VirtualMachineConfig;

import java.util.List;
import java.util.UUID;

public class VmProvisionJobConfig {
  public UUID vmId;
  public VmProvisionRequirement requirement;
  public List<Disk> provisionedDisks;
  public Disk cdRom;
  public VirtualMachineConfig vmConfig;
}
