package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeResource extends ManagedObjectReference {
  public String name;
  public ResourcePool resourcePool;
  public ManagedObjectReference parent;
  public Map<String, ManagedObjectReference> nameMap = new HashMap<>();
  public List<Host> host;
  public EnvironmentBrowser environmentBrowser;

  public ComputeResource(String name, String value, ResourcePool resourcePool, List<Host> host, EnvironmentBrowser environmentBrowser) {
    this.name = name;
    this.host = host;
    this.resourcePool = resourcePool;
    this.environmentBrowser = environmentBrowser;
    resourcePool.owner = this;
    nameMap.put(resourcePool.name, resourcePool);
    setType(ManagedObjectType.ComputeResource.name());
    setValue(value);
  }
}
