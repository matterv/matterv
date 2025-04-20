package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

public class ManagedObjectFactory {
  private final JsonUtil jsonUtil;
  private final VmApi vmApi;
  private final Jdbi jdbi;
  private final JobApi jobApi;
  private final TaskFactory taskFactory;
  private final DatacenterApi datacenterApi;

  public ManagedObjectFactory(JsonUtil jsonUtil, VmApi vmApi, Jdbi jdbi, JobApi jobApi, TaskFactory taskFactory, DatacenterApi datacenterApi) {
    this.jsonUtil = jsonUtil;
    this.vmApi = vmApi;
    this.jdbi = jdbi;
    this.jobApi = jobApi;
    this.taskFactory = taskFactory;
    this.datacenterApi = datacenterApi;
  }

  public ManagedObjectReference create(ManagedObjectReference mor) {
    ManagedObjectType moType = ManagedObjectType.valueOf(mor.getType());
    if (moType == ManagedObjectType.ManagedEntity) {
      var type = mor.getValue().split("-")[0];

      moType =
              switch (type) {
                case "host" -> ManagedObjectType.HostSystem;
                case VmFolder.vmFolderId -> ManagedObjectType.VmFolder;
                case "vm" -> ManagedObjectType.VirtualMachine;
                default -> throw new RuntimeException("Unsupported type: " + type);
              };
    }

    return switch (moType) {
      case ManagedObjectType.VirtualMachine -> new VirtualMachine(mor.getValue(), vmApi, jsonUtil,datacenterApi, jobApi);
      case ManagedObjectType.HostSystem -> new Host(mor.getValue(), jdbi);
      case ManagedObjectType.VmFolder -> new VmFolder(mor.getValue(), jdbi, jsonUtil, vmApi, jobApi, datacenterApi);
      case ManagedObjectType.Datastore -> new DataStore(mor.getValue(), jdbi);
      case ManagedObjectType.Task -> taskFactory.createTask(mor.getValue());
      default -> throw new RuntimeException("Unsupported type: " + moType);
    };
  }
}
