package computer.matter.vcenter;

import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineImportSpec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ResourcePool extends ManagedObjectReference {
  public ManagedObjectReference parent;
  public String name;
  public ComputeResource owner;
  public List<ResourcePool> resourcePool = new ArrayList<>();
  public List<VirtualMachine> vm = new LinkedList<>();
  public HttpNfcLeaseManager leaseManager;
  private final VirtualMachineManager virtualMachineManager;

  public ResourcePool(String name, String value, HttpNfcLeaseManager leaseManager, VirtualMachineManager virtualMachineManager) {
    this.name = name;
    setType(ManagedObjectType.ResourcePool.name());
    setValue(value);
    this.leaseManager = leaseManager;
    this.virtualMachineManager = virtualMachineManager;
  }

  public ManagedObjectReference importVApp(ImportSpec spec, ManagedObjectReference folder, ManagedObjectReference host) {
    var newVm = virtualMachineManager.createVm(((VirtualMachineImportSpec) spec).getConfigSpec());
    vm.add(newVm);
    return leaseManager.create(newVm);
  }
}
