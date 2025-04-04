package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskInfo;

public abstract class Task extends ManagedObjectReference {
  public Task(String value) {
    type = ManagedObjectType.Task.name();
    this.value = value;
  }

  public abstract TaskInfo getInfo();
}
