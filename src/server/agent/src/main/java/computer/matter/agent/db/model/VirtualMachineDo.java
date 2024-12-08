package computer.matter.agent.db.model;

import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.Vnc;
import computer.matter.os.IpAddress;
import computer.matter.vm.VirtualMachineManagedStatus;
import computer.matter.vm.VirtualMachineStatus;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class VirtualMachineDo {
  public long id;
  public String name;
  public UUID uuid;
  public VirtualMachineStatus status;
  @ColumnName("managed_status")
  public VirtualMachineManagedStatus managedStatus;
  public long cpu;
  @ColumnName("memory_in_mb")
  public long memoryInMB;
  @ColumnName("disk_size_in_gb")
  public long diskSizeInGB;
  @ColumnName("agent_installed")
  public boolean agentInstalled;
  @ColumnName("guest_os_type")
  public String guestOsType;
  @ColumnName("ip_addresses")
  @Json
  public List<IpAddress> ipAddresses = new LinkedList<>();
  @Json
  public VirtualMachineConfig config;
  @Json
  public Vnc vnc;
  public int osId;
}
