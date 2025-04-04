package computer.matter.vcenter;

import com.vmware.vim25.DatastoreCapability;
import com.vmware.vim25.DatastoreHostMount;
import com.vmware.vim25.DatastoreSummary;
import com.vmware.vim25.HostMountInfo;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmfsDatastoreInfo;

import java.util.List;

public class DataStore extends ManagedObjectReference {
  public Host _host;
  public String name;
  public ManagedObjectReference parent;

  public DataStore(String name, String id, Host host) {
    this.name = name;
    this._host = host;
    setValue(id);
    setType(ManagedObjectType.Datastore.name());
  }

  public List<DatastoreHostMount> getHost() {
    var hostMount = new DatastoreHostMount();
    hostMount.setKey(_host);
    var mountInfo = new HostMountInfo();
    mountInfo.setPath("/vmfs/volumes/" + getValue());
    mountInfo.setAccessMode("readWrite");
    mountInfo.setAccessible(true);
    mountInfo.setMounted(true);
    hostMount.setMountInfo(mountInfo);
    return List.of(hostMount);
  }

  public DatastoreSummary getSummary() {
    var summary = new DatastoreSummary();
    summary.setDatastore(this);
    summary.setName(name);
    summary.setUrl("/vmfs/volumes/" + getValue());
    summary.setCapacity(3863323082752L);
    summary.setFreeSpace(698096812032L);
    summary.setUncommitted(636537744259L);
    summary.setAccessible(true);
    summary.setType("VMFS");
    return summary;
  }

  public DatastoreCapability getCapability() {
    var capability = new DatastoreCapability();
    capability.setDirectoryHierarchySupported(true);
    capability.setRawDiskMappingsSupported(true);
    capability.setPerFileThinProvisioningSupported(true);
    capability.setStorageIORMSupported(true);
    capability.setNativeSnapshotSupported(false);
    capability.setTopLevelDirectoryCreateSupported(true);
    capability.setSeSparseSupported(true);
    capability.setVmfsSparseSupported(false);
    capability.setVsanSparseSupported(false);
    capability.setUpitSupported(false);
    capability.setVmdkExpandSupported(true);
    capability.setClusteredVmdkSupported(false);
    return capability;
  }

  public VmfsDatastoreInfo getInfo() {
    var info = new VmfsDatastoreInfo();
    info.setName(name);
    info.setUrl("/vmfs/volumes/" + getValue());
    info.setFreeSpace(698096812032L);
    info.setMaxFileSize(70368744177664L);
    info.setMaxVirtualDiskCapacity(68169720922112L);
    info.setMaxMemoryFileSize(70368744177664L);
    info.setMaxPhysicalRDMFileSize(70368744177664L);
    info.setMaxVirtualRDMFileSize(68169720922112L);
    var vmfs = new HostVmfsVolume();
    vmfs.setType("VMFS");
    vmfs.setName(name);
    vmfs.setCapacity(3863323082752L);
    vmfs.setBlockSizeMb(1);
    vmfs.setBlockSize(1024);
    vmfs.setUnmapGranularity(1024);
    vmfs.setUnmapPriority("low");
    vmfs.setMaxBlocks(63963136);
    vmfs.setMajorVersion(6);
    vmfs.setVersion("6.82");
    vmfs.setUuid(getValue());

    var ext = new HostScsiDiskPartition();
    ext.setDiskName("t10.NVMe____WD_BLACK_SN850X_4000GB__________________9949B24A8B441B00");
    ext.setPartition(8);
    vmfs.getExtent().add(ext);
    vmfs.setVmfsUpgradable(false);
    vmfs.setSsd(true);
    vmfs.setLocal(true);
    info.setVmfs(vmfs);

    info.setTimestamp(TimeUtil.getCurrentTime());
    return info;
  }
}
