package computer.matter.vcenter;


public class HttpNfcLeaseManager {
  private final ManagedObjectManager managedObjectManager;

  public HttpNfcLeaseManager(ManagedObjectManager managedObjectManager) {
    this.managedObjectManager = managedObjectManager;
  }

  public HttpNfcLease create(VirtualMachine vm) {
    var lease = new HttpNfcLease("session[520bc232-8a83-95db-d4c0-94759433eb88]5292f88f-a62f-9ed5-72bb-cae121fe939c", vm);
    managedObjectManager.add(lease);
    return lease;
  }
}
