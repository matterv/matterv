package computer.matter.vcenter;

import com.vmware.vim25.VirtualMachineConfigSpec;

import java.util.concurrent.atomic.AtomicLong;

public class VirtualMachineManager {
  public Folder vmFolder;
  private final AtomicLong vmCounter = new AtomicLong(10);
  private final ManagedObjectManager managedObjectManager;

  public VirtualMachineManager(ManagedObjectManager managedObjectManager) {
    this.managedObjectManager = managedObjectManager;
  }

  public VirtualMachine createVm(VirtualMachineConfigSpec name) {
    var vm = new VirtualMachine(name, String.valueOf(vmCounter.incrementAndGet()));

    managedObjectManager.add(vm);
    var task = new CreateVmTask("haTask-ha-folder-vm-vim.Folder.createVm-62808", vm);
    vm.recentTasks.add(task);
    managedObjectManager.add(task);
    vmFolder.childEntity.add(vm);
    return vm;
  }
}
