package computer.matter.app.api.e2e;

import computer.matter.host.model.CreateVirtualMachineRequest;
import computer.matter.host.model.DiskRequest;
import computer.matter.host.model.VMStatus;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VmApiE2eTest extends E2eTestBase {
  @Test
  void createVm() {
    var req = new CreateVirtualMachineRequest();
    req.setCpu(1L);
    req.setMemory(512L);
    req.setName(UUID.randomUUID().toString());
    var diskReq = new DiskRequest();
    diskReq.setSize(1L);
    diskReq.setStorageId(UUID.randomUUID().toString());
    req.setDisks(List.of(diskReq));
    var rsp = vmApi.createVm(req);
    waitJobTerminated(rsp.getJobId());
    var vmInfo = rsp.getVm();
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());

    var powerOffRsp = vmApi.powerOffVm(vmInfo.getId());
    waitJobTerminated(powerOffRsp.getJobId());
    vmInfo = rsp.getVm();
    assertEquals(VMStatus.STOPPED, vmInfo.getStatus());

    var powerOnRsp = vmApi.powerOnVm(vmInfo.getId());
    waitJobTerminated(powerOnRsp.getJobId());
    vmInfo = rsp.getVm();
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());

    var resetRsp = vmApi.resetVm(vmInfo.getId());
    waitJobTerminated(resetRsp.getJobId());
    vmInfo = rsp.getVm();
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());
  }
}
