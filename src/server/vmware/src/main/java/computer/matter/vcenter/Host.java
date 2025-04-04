package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.LinkedList;
import java.util.List;

public class Host extends ManagedObjectReference {
  public String name;
  public List<DataStore> datastores = new LinkedList<>();
  public List<Network> networks = new LinkedList<>();

  public Host(String name, String value) {
    this.name = name;
    setType(ManagedObjectType.HostSystem.name());
    setValue(value);
  }
}
