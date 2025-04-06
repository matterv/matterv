package computer.matter.vcenter;

import com.vmware.vim25.ConfigTarget;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineDatastoreInfo;
import com.vmware.vim25.VirtualMachineNetworkInfo;
import com.vmware.vim25.VirtualMachinePrecisionClockInfo;
import com.vmware.vim25.VirtualMachineSgxTargetInfo;

public class EnvironmentBrowser extends ManagedObjectReference {
  public String name;
  private final ManagedObjectManager managedObjectManager;

  public EnvironmentBrowser(String name, String value, ManagedObjectManager managedObjectManager) {
    this.name = name;
    this.managedObjectManager = managedObjectManager;
    setType(ManagedObjectType.EnvironmentBrowser.name());
    setValue(value);
  }

  public ConfigTarget queryConfigTarget(ManagedObjectReference host) {
    var h = (Host) managedObjectManager.get(host);
    var configTarget = new ConfigTarget();
    configTarget.setNumCpus(32);
    configTarget.setNumCpuCores(16);
    configTarget.setNumNumaNodes(1);
    configTarget.setMaxCpusPerHost(32);
    configTarget.setSmcPresent(false);
    configTarget.setMaxMemMBOptimalPerf(130940);
    configTarget.setSupportedMaxMemMB(25149440);
    var sgxInfo = new VirtualMachineSgxTargetInfo();
    sgxInfo.setName("");
    sgxInfo.setMaxEpcSize(0);
    sgxInfo.getFlcModes().add("off");
    configTarget.setSgxTargetInfo(sgxInfo);
    var clockInfo = new VirtualMachinePrecisionClockInfo();
    clockInfo.setName("");
    configTarget.getPrecisionClockInfo().add(clockInfo);
    h.datastores.forEach(hh -> {
      var summary = hh.getSummary();
      var datastoreInfo = new VirtualMachineDatastoreInfo();
      datastoreInfo.setName(summary.getName());
      datastoreInfo.setDatastore(hh.getSummary());
      datastoreInfo.setCapability(hh.getCapability());
      datastoreInfo.setMaxFileSize(70368744177664L);
      datastoreInfo.setMaxVirtualDiskCapacity(68169720922112L);
      datastoreInfo.setMode("readWrite");
      datastoreInfo.setVStorageSupport("vStorageUnsupported");

      configTarget.getDatastore().add(datastoreInfo);
    });

    h.networks.forEach(network -> {
      var networkInfo = new VirtualMachineNetworkInfo();
      networkInfo.setNetwork(network.getSummary());
      networkInfo.setVswitch("vSwitch0");
      networkInfo.setName(network.name);
      configTarget.getNetwork().add(networkInfo);
    });

    return configTarget;
  }
}
