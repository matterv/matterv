package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.List;

public class Folder extends ManagedObjectReference implements ParentNode {
  public String name;
  private List<ManagedObjectReference> _childEntity;
  public ManagedObjectReference parent;

  public Folder(String name, String value, List<ManagedObjectReference> childEntity) {
    this.name = name;
    this._childEntity = childEntity;
    for (ManagedObjectReference mor : childEntity) {
      var n = (String) ReflectionUtil.getValue(mor, "name");
      children.put(n, mor);

      ReflectionUtil.setValue(mor, "parent", this);
    }
    setType(ManagedObjectType.Folder.name());
    setValue(value);
  }

  public List<ManagedObjectReference> getChildEntity() {
    return _childEntity;
  }

  public void setChildEntity(ManagedObjectReference childEntity) {
    this._childEntity.add(childEntity);
  }
}
