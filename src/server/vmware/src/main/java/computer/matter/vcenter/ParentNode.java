package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.HashMap;
import java.util.Map;

public interface ParentNode {
  Map<String, ManagedObjectReference> children = new HashMap<>();

  default ManagedObjectReference child(String name) {
    return children.get(name);
  }
}
