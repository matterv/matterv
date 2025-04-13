package computer.matter.vcenter;


public class HttpNfcLeaseManager {
  private final ManagedObjectManager managedObjectManager;

  public HttpNfcLeaseManager(ManagedObjectManager managedObjectManager) {
    this.managedObjectManager = managedObjectManager;
  }

  public HttpNfcLease create(VirtualMachine vm) {
    var lease = new HttpNfcLease(vm);
    managedObjectManager.add(lease);
    return lease;
  }
}
