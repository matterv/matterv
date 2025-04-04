package computer.matter.vcenter;

import com.vmware.vim25.HttpNfcLeaseState;
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
  public PropertyCollector(String value) {
    type = ManagedObjectType.PropertyCollector.name();
    this.value = value;
  }

  public ManagedObjectReference createFilter(PropertyFilterSpec spec, boolean partialUpdates) {
    return new PropertyFilter("session[520bc232-8a83-95db-d4c0-94759433eb88]528d2c07-a8de-1b25-e68a-77e93e54bba8");
  }

  public UpdateSet waitForUpdatesEx(String version, WaitOptions options) {
    var updateSet = new UpdateSet();
    updateSet.setVersion("4");
    var filterUpdate = new PropertyFilterUpdate();
    var filter = new PropertyFilter("session[520bc232-8a83-95db-d4c0-94759433eb88]528d2c07-a8de-1b25-e68a-77e93e54bba8");
    filterUpdate.setFilter(filter);
    var objectUpdate = new ObjectUpdate();
    objectUpdate.setKind(ObjectUpdateKind.MODIFY);

    var lease = new ManagedObjectReference();
    lease.setType(ManagedObjectType.HttpNfcLease.name());
    lease.setValue("session[520bc232-8a83-95db-d4c0-94759433eb88]528d2c07-a8de-1b25-e68a-77e93e54bba8");
    objectUpdate.setObj(lease);

    var propertyChange = new PropertyChange();
    propertyChange.setName("state");
    propertyChange.setOp(PropertyChangeOp.ASSIGN);
    propertyChange.setVal(HttpNfcLeaseState.READY);
    objectUpdate.getChangeSet().add(propertyChange);
    filterUpdate.getObjectSet().add(objectUpdate);
    updateSet.getFilterSet().add(filterUpdate);
    return updateSet;
  }
}
