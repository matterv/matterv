package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import computer.matter.db.cluster.HostDao;
import org.jdbi.v3.core.Jdbi;

import java.util.LinkedList;
import java.util.List;

public class Host extends ManagedObjectReference {
  public List<DataStore> datastores = new LinkedList<>();
  public List<Network> networks = new LinkedList<>();
  private long hostId;
  private Jdbi jdbi;

  public Host(String value, Jdbi jdbi) {
    setType(ManagedObjectType.HostSystem.name());
    setValue(value);
    this.hostId = Long.parseLong(value.split("-")[1]);
    this.jdbi = jdbi;
  }

  public String getName() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.findById(hostId);
    return host.ipAddress.ip();
  }

  public static ManagedObjectReference create(long dbId) {
    var hostMo = new ManagedObjectReference();
    hostMo.setType(ManagedObjectType.HostSystem.name());
    hostMo.setValue("host-" + dbId);
    return hostMo;
  }
}
