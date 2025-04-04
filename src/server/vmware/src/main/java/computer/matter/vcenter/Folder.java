package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Folder extends ManagedObjectReference {
  public String name;
  public List<ManagedObjectReference> childEntity;
  public Map<String, ManagedObjectReference> nameMap = new HashMap<>();
  public ManagedObjectReference parent;

  public Folder(String name, String value, List<ManagedObjectReference> childEntity) {
    this.name = name;
    this.childEntity = childEntity;
    for (ManagedObjectReference mor : childEntity) {
      var n = (String) ReflectionUtil.getValue(mor, "name");
      nameMap.put(n, mor);

      ReflectionUtil.setValue(mor, "parent", this);
    }
    setType(ManagedObjectType.Folder.name());
    setValue(value);
  }
}
