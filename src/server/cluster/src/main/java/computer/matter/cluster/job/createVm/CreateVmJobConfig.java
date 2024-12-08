package computer.matter.cluster.job.createVm;

import computer.matter.cluster.model.CreateVirtualMachineOnHostRequest;
import computer.matter.vm.VirtualMachineConfig;

import java.util.UUID;

public class CreateVmJobConfig {
  public UUID vmId;
  public UUID hostId;
  public CreateVirtualMachineOnHostRequest request;
  public VirtualMachineConfig vmConfig;
}
