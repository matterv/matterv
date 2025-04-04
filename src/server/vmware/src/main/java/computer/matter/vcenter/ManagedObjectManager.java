package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.HashMap;
import java.util.Map;

public class ManagedObjectManager {
  Map<String, ManagedObjectReference> managedObjects = new HashMap<>();

  public ManagedObjectReference get(ManagedObjectReference mor) {
    return managedObjects.get(mor.getValue());
  }

  public void add(ManagedObjectReference mor) {
    managedObjects.put(mor.getValue(), mor);
  }
}
