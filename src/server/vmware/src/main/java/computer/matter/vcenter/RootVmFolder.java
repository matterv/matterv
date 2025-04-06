package computer.matter.vcenter;


import com.vmware.vim25.ManagedObjectReference;

import java.util.List;

public class RootVmFolder extends Folder{
  public RootVmFolder(String name, String value, List<ManagedObjectReference> vmFolders) {
    super(name, value, vmFolders);
  }
}
