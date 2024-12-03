package computer.matter.cluster.db.model;

import computer.matter.cluster.model.Vnc;
import computer.matter.db.DbBase;
import computer.matter.os.IpAddress;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineStatus;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class VirtualMachineDo extends DbBase {
  public long id;
  public String name;
  public UUID uuid; // vm's uuid on cluster
  @ColumnName("uuid_on_host")
  public UUID uuidOnHost; // Vm's uuid on the host
  @ColumnName("host_uuid")
  public UUID hostUuid; // host uuid on which vm resides.
  public VirtualMachineStatus status;
  public long cpu;
  @ColumnName("memory_in_bytes")
  public long memoryInBytes;
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
