package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import computer.matter.db.cluster.HostDao;
import computer.matter.db.cluster.StorageDao;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class Host extends ManagedObjectReference {
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

  public List<DataStore> getDatastores() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.findById(hostId);
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storages = storageDao.getAllByHostUuid(host.uuid, true);
    return storages.stream().map(storageDo -> new DataStore("storage-" + storageDo.id, jdbi)).toList();
  }

  public List<Network> getNetworks() {
    return List.of(new Network("VM Network", "network-1"));
  }

  public static ManagedObjectReference create(long dbId) {
    var hostMo = new ManagedObjectReference();
    hostMo.setType(ManagedObjectType.HostSystem.name());
    hostMo.setValue("host-" + dbId);
    return hostMo;
  }
}
