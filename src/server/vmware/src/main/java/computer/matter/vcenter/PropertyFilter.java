package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

public class PropertyFilter extends ManagedObjectReference {
  public PropertyFilter(String value) {
    type = ManagedObjectType.PropertyFilter.name();
    this.value = value;
  }
}
