package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfCreateImportSpecResult;
import com.vmware.vim25.OvfFileItem;
import com.vmware.vim25.ParaVirtualSCSIController;
import com.vmware.vim25.VAppEntityConfigInfo;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineImportSpec;
import com.vmware.vim25.VirtualSCSISharing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

record DiskInfo(Long capacityInKB, String diskId, String href) {
}

public class OvfManager extends ManagedObjectReference {

  final Logger logger = LoggerFactory.getLogger(OvfManager.class);
  private final ManagedObjectManager managedObjectManager;

  public OvfManager(String value, ManagedObjectManager managedObjectManager) {
    type = "OvfManager";
    this.value = value;
    this.managedObjectManager = managedObjectManager;
  }

  public OvfCreateImportSpecResult createImportSpec(String ovfDescriptor, ManagedObjectReference resourcePool, ManagedObjectReference datastoreMo, OvfCreateImportSpecParams cisp) {
    try {
      Map<String, Integer> instanceIdToDeviceKeyMap = new HashMap<>();
      Map<String, DiskInfo> diskInfoMap = new HashMap<>();
      AtomicInteger deviceKey = new AtomicInteger(-101);
      OvfDescriptor.Envelope ovf = JaxbHelper.unmarshal(ovfDescriptor, List.of(OvfDescriptor.Envelope.class));
      var dataStore = (DataStore) managedObjectManager.get(datastoreMo);

      var result = new OvfCreateImportSpecResult();
      var importSpec = new VirtualMachineImportSpec();
      var entityConfig = new VAppEntityConfigInfo();
      entityConfig.setTag(cisp.getEntityName());
      importSpec.setEntityConfig(entityConfig);
      var configSpec = new VirtualMachineConfigSpec();
      configSpec.setName(cisp.getEntityName());
      configSpec.setVersion(ovf.getVirtualSystem().getVirtualHardwareSection().getSystem().getVirtualSystemType());
      configSpec.setGuestId(ovf.getVirtualSystem().getOperatingSystemSection().getOsType());

      var fileInfo = new VirtualMachineFileInfo();
      var dsSummary = dataStore.getSummary();
      fileInfo.setVmPathName("[" + dsSummary.getName() + "]");
      configSpec.setFiles(fileInfo);

      ovf.getDiskSection().getDisks().forEach(disk -> {
        var ref = ovf.getReferences().getFiles().stream().filter(f -> f.getId().equalsIgnoreCase(disk.getFileRef())).findFirst().get();
        long capacityInKB;
        if (disk.getCapacityAllocationUnits().equalsIgnoreCase("byte * 2^30")) {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024 * 1024;
        } else if (disk.getCapacityAllocationUnits().equalsIgnoreCase("byte * 2^20")) {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024;
        } else {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024 * 1024 * 1024;
        }
        diskInfoMap.put(disk.getDiskId(), new DiskInfo(capacityInKB, disk.getDiskId(), ref.getHref()));
      });

      ovf.getVirtualSystem().getVirtualHardwareSection().getItems().forEach(item -> {
        if (item.getResourceType().equalsIgnoreCase("3")) {
          // cpu
          configSpec.setNumCPUs(Integer.parseInt(item.getVirtualQuantity()));
          configSpec.setNumCoresPerSocket(1);
        } else if (item.getResourceType().equalsIgnoreCase("4")) {
          configSpec.setMemoryMB(Long.parseLong(item.getVirtualQuantity()));
        } else if (item.getResourceType().equalsIgnoreCase("6")) {
          var pvScsi = new VirtualDeviceConfigSpec();
          pvScsi.setOperation(VirtualDeviceConfigSpecOperation.ADD);
          var pvScsiController = new ParaVirtualSCSIController();
          pvScsiController.setKey(deviceKey.get());
          var pvScsiConnectableInfo = new VirtualDeviceConnectInfo();
          pvScsiConnectableInfo.setConnected(true);
          pvScsiConnectableInfo.setStartConnected(true);
          pvScsiConnectableInfo.setAllowGuestControl(false);
          pvScsiController.setConnectable(pvScsiConnectableInfo);
          pvScsiController.setBusNumber(0);
          pvScsiController.setSharedBus(VirtualSCSISharing.NO_SHARING);

          pvScsi.setDevice(pvScsiController);
          configSpec.getDeviceChange().add(pvScsi);
          instanceIdToDeviceKeyMap.put(item.getInstanceID(), deviceKey.get());
          deviceKey.addAndGet(-1);
        } else if (item.getResourceType().equalsIgnoreCase("17")) {
          var disk1 = new VirtualDeviceConfigSpec();
          disk1.setOperation(VirtualDeviceConfigSpecOperation.ADD);
          disk1.setFileOperation(VirtualDeviceConfigSpecFileOperation.CREATE);
          var vdisk1 = new VirtualDisk();
          vdisk1.setKey(deviceKey.get());
          var vdisk1BackingInfo = new VirtualDiskFlatVer2BackingInfo();
          vdisk1BackingInfo.setFileName("");
          vdisk1BackingInfo.setDiskMode("persistent");
          vdisk1BackingInfo.setSplit(false);
          vdisk1BackingInfo.setWriteThrough(false);
          vdisk1BackingInfo.setThinProvisioned(true);
          vdisk1BackingInfo.setEagerlyScrub(false);
          vdisk1.setBacking(vdisk1BackingInfo);

          var vdisk1ConnectableInfo = new VirtualDeviceConnectInfo();
          vdisk1ConnectableInfo.setConnected(true);
          vdisk1ConnectableInfo.setStartConnected(true);
          vdisk1ConnectableInfo.setAllowGuestControl(false);
          vdisk1.setConnectable(vdisk1ConnectableInfo);
          vdisk1.setControllerKey(instanceIdToDeviceKeyMap.get(item.getParent()));
          vdisk1.setUnitNumber(Integer.parseInt(item.getAddressOnParent()));

          var parts = item.getHostResource().split("/");
          var diskInfo = diskInfoMap.get(parts[parts.length - 1]);
          vdisk1.setCapacityInKB(diskInfo.capacityInKB());
          disk1.setDevice(vdisk1);
          configSpec.getDeviceChange().add(disk1);

          var fileItem = new OvfFileItem();
          fileItem.setDeviceId("/" + cisp.getEntityName() + "/ParaVirtualSCSIController0:0");
          fileItem.setPath(diskInfo.href());
          fileItem.setCompressionMethod("");
          fileItem.setSize(0L);
          fileItem.setCimType(17);
          fileItem.setCreate(false);
          result.getFileItem().add(fileItem);
        }
      });

      importSpec.setConfigSpec(configSpec);

      result.setImportSpec(importSpec);

      return result;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
