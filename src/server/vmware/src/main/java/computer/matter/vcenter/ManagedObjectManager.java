package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import org.jdbi.v3.core.Jdbi;

import java.util.HashMap;
import java.util.Map;

public class ManagedObjectManager {

  private final Map<String, ManagedObjectReference> managedObjects = new HashMap<>();
  private final ManagedObjectFactory factory;

  public ManagedObjectManager(ManagedObjectFactory factory) {
    this.factory = factory;
  }

  public ManagedObjectReference get(ManagedObjectReference mor) {

    var mo = managedObjects.get(mor.getValue());
    if (mo != null) {
      return mo;
    }

    return factory.create(mor);
  }

  public void add(ManagedObjectReference mor) {
    managedObjects.put(mor.getValue(), mor);
  }
}
