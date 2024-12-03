package computer.matter.cluster.job.vmops;

import java.util.UUID;

public class VmOpsJobConfig {
  public UUID vmId;
  public VmOpsType vmOpsType;

  public enum VmOpsType {
    PowerOn,
    PowerOff,
    Reset,
    Edit
  }
}
