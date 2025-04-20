package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ParaVirtualSCSIController;
import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualSCSIController;
import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.cluster.model.CreateVirtualMachineOnHostRequest;
import computer.matter.cluster.model.DiskController;
import computer.matter.cluster.model.DiskRequest;
import computer.matter.cluster.model.OsInfo;
import computer.matter.cluster.model.OsType;
import computer.matter.cluster.model.PowerStatus;
import computer.matter.db.cluster.HostDao;
import computer.matter.db.cluster.StorageDao;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

record DiskControllerInfo(int key, VirtualController controller) {
}

public class VirtualMachineManager {
  private final ManagedObjectManager managedObjectManager;
  private VmApi vmApi;
  private Jdbi jdbi;
  private final JsonUtil jsonUtil;
  private final JobApi jobApi;
  private final DatacenterApi datacenterApi;

  private Pattern dataStorePattern = Pattern.compile("\\[(.*?)\\]");

  public VirtualMachineManager(ManagedObjectManager managedObjectManager, VmApi vmApi, Jdbi jdbi, JsonUtil jsonUtil, JobApi jobApi, DatacenterApi datacenterApi) {
    this.managedObjectManager = managedObjectManager;
    this.vmApi = vmApi;
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
    this.jobApi = jobApi;
    this.datacenterApi = datacenterApi;
  }

  private String getStorageName(String vmPath) {
    var m = dataStorePattern.matcher(vmPath);
    if (m.find()) {
      return m.group(1);
    }
    throw new RuntimeException("Failed to find datastore from: " + vmPath);
  }

  public VirtualMachine createVm(VirtualMachineConfigSpec spec, ManagedObjectReference host) {
    var hostDao = jdbi.onDemand(HostDao.class);
    var hostDo = hostDao.findById(Long.parseLong(host.getValue().split("-")[1]));
    var request = new CreateVirtualMachineOnHostRequest();

    var storageName = getStorageName(spec.getFiles().getVmPathName());
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storageDo = storageDao.findByUUID(storageName);
    request.setName(spec.getName());
    request.setCpu(spec.getNumCPUs().longValue());
    request.setMemory(spec.getMemoryMB() * 1024 * 1024);
    request.setHostId(hostDo.uuid.toString());
    var guestId = spec.getGuestId();
    var osType = switch (guestId) {
      case String ignored when guestId.startsWith("windows") -> OsType.WINDOWS;
      default -> OsType.LINUX;
    };

    var osInfo = new OsInfo();
    osInfo.setOsType(osType);
    request.setOsInfo(osInfo);

    var controllerId = new AtomicInteger(0);

    var diskControllers = spec.getDeviceChange().stream()
            .filter(s -> s.getDevice() instanceof VirtualSCSIController)
            .map(s -> (VirtualController) s.getDevice())
            .collect(
                    Collectors.toMap(
                            VirtualController::getKey,
                            virtualController -> new DiskControllerInfo(controllerId.incrementAndGet(), virtualController)
                    )
            );

    var controllerReqs = diskControllers.values().stream().map(controllerInfo -> {
      var d = new DiskController();
      d.setId(controllerInfo.key());
      switch (controllerInfo.controller()) {
        case ParaVirtualSCSIController ignored -> {
          d.setModel(DiskController.ModelEnum.PVSCSI);
          d.setType(DiskController.TypeEnum.SCSI);
        }
        default -> d.setType(DiskController.TypeEnum.IDE);
      }
      return d;
    }).toList();
    request.setDiskControllers(controllerReqs);

    var disks = spec.getDeviceChange().stream()
            .filter(s -> s.getDevice() instanceof VirtualDisk)
            .map(s -> (VirtualDisk) s.getDevice())
            .sorted(Comparator.comparing(VirtualDisk::getKey))
            .toList();

    var diskId = new AtomicInteger(0);
    var diskRequests = disks.stream().map(disk -> {
      var controller = diskControllers.get(disk.getControllerKey());
      var req = new DiskRequest();
      req.setId(diskId.incrementAndGet());
      req.setSize(disk.getCapacityInKB() * 1024);
      req.setStorageId(storageDo.uuid.toString());
      req.setControllerId(controller.key());
      req.setStorageName(storageDo.name);
      return req;
    }).toList();
    request.setDisks(diskRequests);
    request.setPowerStatus(PowerStatus.POWEROFF);
    var rsp = vmApi.createVm(request);
    var vm = rsp.getVm();
    return new VirtualMachine("vm-" + vm.getId(), vmApi, jsonUtil, datacenterApi, jobApi);
  }
}
