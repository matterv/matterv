package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import computer.matter.db.cluster.HostDao;
import org.jdbi.v3.core.Jdbi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeResource extends ManagedObjectReference {
  public String name;
  public ResourcePool resourcePool;
  public ManagedObjectReference parent;
  public Map<String, ManagedObjectReference> nameMap = new HashMap<>();
  public EnvironmentBrowser environmentBrowser;
  private HostDao hostDao;
  private Jdbi jdbi;

  public ComputeResource(Jdbi jdbi, HostDao hostDao, String name, String value, ResourcePool resourcePool, EnvironmentBrowser environmentBrowser) {
    this.hostDao = hostDao;
    this.name = name;
    this.resourcePool = resourcePool;
    this.environmentBrowser = environmentBrowser;
    resourcePool.owner = this;
    nameMap.put(resourcePool.name, resourcePool);
    setType(ManagedObjectType.ComputeResource.name());
    setValue(value);
  }

  public List<Host> getHost() {
    return hostDao.getAll().stream().map(host -> new Host("host-" + host.id, jdbi)).toList();
  }
}
