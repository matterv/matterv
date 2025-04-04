package computer.matter.vcenter;


import java.util.List;

public class ClusterComputeResource extends ComputeResource {
  public ClusterComputeResource(String name, String value, ResourcePool resourcePool, List<Host> host, EnvironmentBrowser environmentBrowser) {
    super(name, value, resourcePool, host, environmentBrowser);
    type = ManagedObjectType.ClusterComputeResource.name();
    this.resourcePool.parent = this;
  }
}
