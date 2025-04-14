package computer.matter.vcenter;

import com.vmware.vim25.ArrayOfManagedObjectReference;
import com.vmware.vim25.ManagedObjectReference;
import computer.matter.cluster.api.VmApi;
import computer.matter.cluster.model.VMStatus;
import computer.matter.json.JsonUtil;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualMachineConfig;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

record Disk(String key, String importKey, String path) {
}

public class VirtualMachine extends ManagedObjectReference {
  public ManagedObjectReference parent;

  private UUID vmUuid;
  private VmApi vmApi;
  private JsonUtil jsonUtil;
  public VirtualMachine(String value, UUID vmUuid, VmApi vmApi, JsonUtil jsonUtil) {
    setType(ManagedObjectType.VirtualMachine.name());
    setValue(value);
    this.vmUuid = vmUuid;
    this.vmApi = vmApi;
    this.jsonUtil = jsonUtil;
  }


  public String getName() {
    var vm = vmApi.getVm(vmUuid.toString());
    return vm.getName();
  }

  public ArrayOfManagedObjectReference getRecentTask() {
    var r = new ArrayOfManagedObjectReference();
    return r;
  }

  public VMStatus status() {
    var vm = vmApi.getVm(vmUuid.toString());
    return vm.getStatus();
  }

  public List<Disk> getDisks() {

    var vm = vmApi.getVm(vmUuid.toString());
    var config = vm.getVmConfig();
    var vmConfig = jsonUtil.fromJson(config, VirtualMachineConfig.class);

    var controllerToDisksMap = vmConfig.devices.stream()
            .filter(virtualDevice ->  virtualDevice instanceof VirtualDisk)
            .map(d -> (VirtualDisk)d)
            .sorted(Comparator.comparingLong(d -> d.id))
            .collect(Collectors.groupingBy(d -> d.controllerId, TreeMap::new, Collectors.toList()));

    var controllerId = new AtomicInteger(0);
    var rsp = new ArrayList<Disk>();
    var diskId = new AtomicInteger(0);
    controllerToDisksMap.forEach((key, disks) -> {
      var diskIdInController = new AtomicInteger(0);

      disks.forEach(disk -> {
        var d = new Disk(
                "/" + value + "/ParaVirtualSCSIController" + controllerId.get() + ":" + diskIdInController.get(),
                "/" + vm.getName() + "/ParaVirtualSCSIController" + controllerId.get() + ":" + diskIdInController.get(), vm.getName() + "-" + diskId.get() + ".vmdk");
        rsp.add(d);
        diskId.incrementAndGet();
        diskIdInController.incrementAndGet();
      });
      controllerId.incrementAndGet();
    });

    return rsp;
  }
}
