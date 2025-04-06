package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;


public class Datacenter extends ManagedObjectReference implements ParentNode {
  public String name;
  public Folder hostFolder;
  public ManagedObjectReference parent;
  public Folder datastoreFolder;
  public Folder vmFolder;
  public Datacenter(String name, String value, Folder hostFolder, Folder datastoreFolder, Folder vmFolder) {
    this.name = name;
    this.hostFolder = hostFolder;
    this.datastoreFolder = datastoreFolder;
    this.vmFolder = vmFolder;
    hostFolder.parent = this;
    children.put(hostFolder.name, hostFolder);
    children.put(vmFolder.name, vmFolder);
    setValue(value);
    setType(ManagedObjectType.Datacenter.name());
  }
}
