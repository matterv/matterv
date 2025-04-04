package computer.matter.vcenter;

import com.vmware.vim25.HttpNfcLeaseDatastoreLeaseInfo;
import com.vmware.vim25.HttpNfcLeaseDeviceUrl;
import com.vmware.vim25.HttpNfcLeaseHostInfo;
import com.vmware.vim25.HttpNfcLeaseInfo;
import com.vmware.vim25.HttpNfcLeaseState;
import com.vmware.vim25.ManagedObjectReference;

public class HttpNfcLease extends ManagedObjectReference {
  public HttpNfcLeaseState state = HttpNfcLeaseState.READY;
  public HttpNfcLeaseInfo info;
  private VirtualMachine vm;

  public HttpNfcLease(String value, VirtualMachine vm) {
    type = ManagedObjectType.HttpNfcLease.name();
    this.value = value;

    info = new HttpNfcLeaseInfo();
    info.setLease(this);

    info.setEntity(vm);
    vm.getDisks().forEach(disk -> {
      var deviceUrl = new HttpNfcLeaseDeviceUrl();
      deviceUrl.setKey(disk.key());
      deviceUrl.setImportKey(disk.importKey());
      deviceUrl.setUrl("https://127.0.0.1:8545/ha-nfc/5276b11e-4ba2-7ba4-4855-bbb3dce3ae3e/" + disk.path());
      deviceUrl.setSslThumbprint("1E:A4:89:6A:98:38:0A:99:3E:6F:13:44:EA:8F:21:52:4A:27:B4:07");
      deviceUrl.setDisk(true);
      deviceUrl.setTargetId(disk.path());
      deviceUrl.setDatastoreKey("ha");

      info.getDeviceUrl().add(deviceUrl);
    });


    info.setTotalDiskCapacityInKB(20971520);
    info.setLeaseTimeout(300);

    var leaseInfo = new HttpNfcLeaseDatastoreLeaseInfo();
    leaseInfo.setDatastoreKey("ha");

    var hostLeaseInfo = new HttpNfcLeaseHostInfo();
    hostLeaseInfo.setUrl("https://127.0.0.1:8545/ha-nfc/5276b11e-4ba2-7ba4-4855-bbb3dce3ae3e/");
    hostLeaseInfo.setSslThumbprint("1E:A4:89:6A:98:38:0A:99:3E:6F:13:44:EA:8F:21:52:4A:27:B4:07");
    leaseInfo.getHosts().add(hostLeaseInfo);
    info.getHostMap().add(leaseInfo);
  }
}
