package computer.matter.agent.job.hostconfig;

import computer.matter.host.model.PhysicalNetwork;
import computer.matter.host.model.Storage;

import java.util.List;

public class HostConfigJobConfig {
  public String hostId;
  public PhysicalNetwork vmNetwork;
  public List<Storage> storages;
}
