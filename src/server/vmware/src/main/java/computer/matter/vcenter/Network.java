package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NetworkSummary;

public class Network extends ManagedObjectReference {
  public String name;

  public Network(String name, String value) {
    this.name = name;
    type = ManagedObjectType.Network.name();
    this.value = value;
  }

  public NetworkSummary getSummary() {
    var s = new NetworkSummary();
    s.setNetwork(this);
    s.setName(name);
    s.setAccessible(true);
    s.setIpPoolName("");

    return s;
  }
}
