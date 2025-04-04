package computer.matter.vcenter;

import com.vmware.vim25.ArrayOfManagedObjectReference;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualMachineConfigSpec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

record Disk(String key, String importKey, String path) {
}

public class VirtualMachine extends ManagedObjectReference {
  public String name;
  public ManagedObjectReference parent;
  List<Task> recentTasks = new ArrayList<>();
  private final VirtualMachineConfigSpec config;


  public VirtualMachine(VirtualMachineConfigSpec config, String value) {
    this.name = config.getName();
    this.config = config;
    setType(ManagedObjectType.VirtualMachine.name());
    setValue(value);
  }

  public ArrayOfManagedObjectReference getRecentTask() {
    var r = new ArrayOfManagedObjectReference();
    for (var t : recentTasks) {
      r.getManagedObjectReference().add(t);
    }
    return r;
  }

  public List<Disk> getDisks() {
    var controllerToDisksMap = config.getDeviceChange().stream()
            .filter(virtualDeviceConfigSpec -> virtualDeviceConfigSpec.getDevice() instanceof VirtualDisk)
            .map(d -> (VirtualDisk) d.getDevice())
            .sorted(Comparator.comparing(VirtualDisk::getKey))
            .collect(Collectors.groupingBy(VirtualDisk::getControllerKey, TreeMap::new, Collectors.toList()));

    var controllerId = new AtomicInteger(0);
    var rsp = new ArrayList<Disk>();
    var diskId = new AtomicInteger(0);
    controllerToDisksMap.forEach((key, disks) -> {
      var diskIdInController = new AtomicInteger(0);

      disks.stream().forEach(disk -> {
        var d = new Disk(
                "/" + value + "/ParaVirtualSCSIController" + controllerId.get() + ":" + diskIdInController.get(),
                "/" + name + "/ParaVirtualSCSIController" + controllerId.get() + ":" + diskIdInController.get(), name + "-" + diskId.get() + ".vmdk");
        rsp.add(d);
        diskId.incrementAndGet();
        diskIdInController.incrementAndGet();
      });
      controllerId.incrementAndGet();
    });

    return rsp;
  }
}
