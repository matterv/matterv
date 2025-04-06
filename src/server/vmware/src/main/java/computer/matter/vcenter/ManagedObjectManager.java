package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import org.jdbi.v3.core.Jdbi;

import java.util.HashMap;
import java.util.Map;

public class ManagedObjectManager {
  private Map<String, Class<?>> moTypeToClass = new HashMap<>();

  private Map<String, ManagedObjectReference> managedObjects = new HashMap<>();
  private Jdbi jdbi;

  public ManagedObjectManager(Jdbi jdbi) {
    moTypeToClass.put(ManagedObjectType.Datastore.name(), DataStore.class);
    moTypeToClass.put(ManagedObjectType.VirtualMachine.name(), VirtualMachine.class);
    moTypeToClass.put(ManagedObjectType.HostSystem.name(), Host.class);
    this.jdbi = jdbi;
  }

  public ManagedObjectReference get(ManagedObjectReference mor) {

    var mo = managedObjects.get(mor.getValue());
    if (mo != null) {
      return mo;
    }

    var moType = mor.getType();
    if (mor.getType().equals("ManagedEntity")) {
      var type = mor.getValue().split("-")[0];
      moType =
              switch (type) {
                case "host" -> ManagedObjectType.HostSystem.name();
                default -> "";
              };
    }

    try {
      mo = (ManagedObjectReference) moTypeToClass.get(moType).getConstructor(String.class, Jdbi.class).newInstance(mor.getValue(), jdbi);
      return mo;
    } catch (Exception e) {
      throw new RuntimeException("Failed to find mo: " + mor, e);
    }
  }

  public void add(ManagedObjectReference mor) {
    managedObjects.put(mor.getValue(), mor);
  }
}
