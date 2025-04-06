package computer.matter.vcenter;


import computer.matter.db.cluster.HostDao;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class ClusterComputeResource extends ComputeResource {
  public ClusterComputeResource(Jdbi jdbi, HostDao hostDao, String name, String value, ResourcePool resourcePool, EnvironmentBrowser environmentBrowser) {
    super(jdbi, hostDao, name, value, resourcePool, environmentBrowser);
    type = ManagedObjectType.ClusterComputeResource.name();
    this.resourcePool.parent = this;
  }
}
