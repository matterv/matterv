package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectUpdate;
import com.vmware.vim25.ObjectUpdateKind;
import com.vmware.vim25.PropertyChange;
import com.vmware.vim25.PropertyChangeOp;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertyFilterUpdate;
import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.WaitOptions;

public class PropertyCollector extends ManagedObjectReference {
  private ManagedObjectManager managedObjectManager;
  private ManagedObjectReference propObject;
  public PropertyCollector(String value, ManagedObjectManager managedObjectManager) {
    type = ManagedObjectType.PropertyCollector.name();
    this.value = value;
    this.managedObjectManager = managedObjectManager;
  }

  public ManagedObjectReference createFilter(PropertyFilterSpec spec, boolean partialUpdates) {
    var propSet = spec.getPropSet();
    if (propSet.getFirst().getType().equalsIgnoreCase(ManagedObjectType.HttpNfcLease.name())) {
      var obj = spec.getObjectSet().getFirst().getObj();
      propObject = obj;
      return new PropertyFilter(obj.getValue());
    }

    throw new RuntimeException("Unknown filter spec: " + spec);
  }

  public UpdateSet waitForUpdatesEx(String version, WaitOptions options) {
    var updateSet = new UpdateSet();
    updateSet.setVersion("4");
    var filterUpdate = new PropertyFilterUpdate();
    var filter = new PropertyFilter(propObject.getValue());
    filterUpdate.setFilter(filter);
    var objectUpdate = new ObjectUpdate();
    objectUpdate.setKind(ObjectUpdateKind.MODIFY);

    var lease = new ManagedObjectReference();
    lease.setType(propObject.getType());
    lease.setValue(propObject.getValue());
    objectUpdate.setObj(lease);

    var leaseObj = (HttpNfcLease)managedObjectManager.get(propObject);
    var propertyChange = new PropertyChange();
    propertyChange.setName("state");
    propertyChange.setOp(PropertyChangeOp.ASSIGN);
    propertyChange.setVal(leaseObj.getState());
    objectUpdate.getChangeSet().add(propertyChange);
    filterUpdate.getObjectSet().add(objectUpdate);
    updateSet.getFilterSet().add(filterUpdate);
    return updateSet;
  }
}
