package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;

import java.util.HashMap;
import java.util.Map;

public class Datacenter extends ManagedObjectReference {
  public String name;
  public Folder hostFolder;
  public ManagedObjectReference parent;
  public Folder datastoreFolder;
  public Folder vmFolder;
  public Map<String, ManagedObjectReference> nameMap = new HashMap<String, ManagedObjectReference>();

  public Datacenter(String name, String value, Folder hostFolder, Folder datastoreFolder, Folder vmFolder) {
    this.name = name;
    this.hostFolder = hostFolder;
    this.datastoreFolder = datastoreFolder;
    this.vmFolder = vmFolder;
    hostFolder.parent = this;
    nameMap.put(hostFolder.name, hostFolder);
    setValue(value);
    setType(ManagedObjectType.Datacenter.name());
  }
}
