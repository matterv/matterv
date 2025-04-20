package computer.matter.vcenter;

import com.vmware.vim25.ArrayOfManagedObjectReference;
import com.vmware.vim25.ManagedObjectReference;
import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.cluster.model.Host;
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

  private VmApi vmApi;
  private JsonUtil jsonUtil;
  private final DatacenterApi datacenterApi;
  private final long vmId;
  private final JobApi jobApi;
  public VirtualMachine(String value, VmApi vmApi, JsonUtil jsonUtil, DatacenterApi datacenterApi, JobApi jobApi) {
    this.datacenterApi = datacenterApi;
    setType(ManagedObjectType.VirtualMachine.name());
    setValue(value);
    vmId = Long.parseLong(value.split("-")[1]);
    this.vmApi = vmApi;
    this.jsonUtil = jsonUtil;
    this.jobApi = jobApi;
  }


  public String getName() {
    var vm = vmApi.getVmById(vmId);
    return vm.getName();
  }

  public ArrayOfManagedObjectReference getRecentTask() {
    var r = new ArrayOfManagedObjectReference();
    var vm = vmApi.getVmById(vmId);

    var jobs = jobApi.listJobsForObject(1, 100, vm.getUuid().toString());
    var tasks = jobs.getItems().stream().map(job -> switch (job.getType()) {
      case "CreateVm" -> new CreateVmTask("createvm-" + job.getId(), this);
      default -> throw new RuntimeException("Unsupported job type: " + job.getType());
    });
    tasks.forEach(task -> r.getManagedObjectReference().add(task));
    return r;
  }

  public VMStatus status() {
    var vm = vmApi.getVmById(vmId);
    return vm.getStatus();
  }

  public Host host() {
    var vm = vmApi.getVmById(vmId);
    return datacenterApi.getHost(vm.getHostId());
  }

  public List<Disk> getDisks() {

    var vm = vmApi.getVmById(vmId);
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
                "/" + vm.getName() + "/ParaVirtualSCSIController" + controllerId.get() + ":" + diskIdInController.get(), vm.getHostId() + "-" + diskId.get() + ".vmdk");
        rsp.add(d);
        diskId.incrementAndGet();
        diskIdInController.incrementAndGet();
      });
      controllerId.incrementAndGet();
    });

    return rsp;
  }
}
