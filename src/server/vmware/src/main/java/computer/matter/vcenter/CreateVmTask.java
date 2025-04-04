package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TaskReasonSystem;

public class CreateVmTask extends Task {
  private final VirtualMachine vm;

  public CreateVmTask(String value, VirtualMachine vm) {
    super(value);
    this.vm = vm;
  }

  @Override
  public TaskInfo getInfo() {
    var taskInfo = new TaskInfo();
    taskInfo.setKey(value);
    var mo = new ManagedObjectReference();
    mo.setType(ManagedObjectType.Task.name());
    mo.setValue(value);
    taskInfo.setTask(mo);
    taskInfo.setName("CreateVM_Task");
    taskInfo.setDescriptionId("Folder.createVm");

    taskInfo.setEntity(vm);
    taskInfo.setEntityName(vm.name);
    taskInfo.setState(TaskInfoState.SUCCESS);
    taskInfo.setCancelable(false);
    taskInfo.setCancelled(false);
    taskInfo.setResult(vm);
    taskInfo.setProgress(100);
    var reason = new TaskReasonSystem();
    taskInfo.setReason(reason);
    taskInfo.setQueueTime(TimeUtil.getCurrentTime());
    taskInfo.setStartTime(TimeUtil.getCurrentTime());
    taskInfo.setCompleteTime(TimeUtil.getCurrentTime());
    taskInfo.setEventChainId(62808);
    return taskInfo;
  }
}
