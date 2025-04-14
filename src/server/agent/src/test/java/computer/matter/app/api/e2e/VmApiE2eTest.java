package computer.matter.app.api.e2e;

import computer.matter.agent.db.model.StorageDao;
import computer.matter.host.model.CreateVirtualMachineRequest;
import computer.matter.host.model.DiskController;
import computer.matter.host.model.DiskRequest;
import computer.matter.host.model.OsInfo;
import computer.matter.host.model.OsType;
import computer.matter.host.model.PowerStatus;
import computer.matter.host.model.VMStatus;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VmApiE2eTest extends E2eTestBase {
  @Test
  void createVm() {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storage = storageDao.getAll().getFirst();
    var req = new CreateVirtualMachineRequest();
    req.setCpu(1L);
    req.setMemory(512L);
    req.setName(UUID.randomUUID().toString());
    var osInfo = new OsInfo();
    osInfo.setOsType(OsType.WINDOWS);
    req.setOsInfo(osInfo);

    var controllerReq = new DiskController();
    controllerReq.setId(1);
    controllerReq.setType(DiskController.TypeEnum.SCSI);
    controllerReq.setModel(DiskController.ModelEnum.PVSCSI);
    req.setDiskControllers(List.of(controllerReq));
    var diskReq = new DiskRequest();
    diskReq.setSize(1L);
    diskReq.setControllerId(1);
    diskReq.setStorageId(storage.uuid.toString());
    req.setDisks(List.of(diskReq));
    var rsp = vmApi.createVm(req);
    waitJobTerminated(rsp.getJobId());
    var vmInfo = vmApi.getVm(rsp.getVm().getId());
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());

    var powerOffRsp = vmApi.powerOffVm(vmInfo.getId());
    waitJobTerminated(powerOffRsp.getJobId());
    vmInfo = vmApi.getVm(vmInfo.getId());
    assertEquals(VMStatus.STOPPED, vmInfo.getStatus());

    var powerOnRsp = vmApi.powerOnVm(vmInfo.getId());
    waitJobTerminated(powerOnRsp.getJobId());
    vmInfo = vmApi.getVm(vmInfo.getId());
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());

    var resetRsp = vmApi.resetVm(vmInfo.getId());
    waitJobTerminated(resetRsp.getJobId());
    vmInfo = vmApi.getVm(vmInfo.getId());
    assertEquals(VMStatus.RUNNING, vmInfo.getStatus());
  }

  @Test
  void createPowerOffVM() {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storage = storageDao.getAll().getFirst();
    var req = new CreateVirtualMachineRequest();
    req.setCpu(1L);
    req.setMemory(512L);
    req.setName(UUID.randomUUID().toString());
    req.setPowerStatus(PowerStatus.POWEROFF);
    var osInfo = new OsInfo();
    osInfo.setOsType(OsType.WINDOWS);
    req.setOsInfo(osInfo);

    var controllerReq = new DiskController();
    controllerReq.setId(1);
    controllerReq.setType(DiskController.TypeEnum.SCSI);
    controllerReq.setModel(DiskController.ModelEnum.PVSCSI);
    req.setDiskControllers(List.of(controllerReq));
    var diskReq = new DiskRequest();
    diskReq.setSize(1L);
    diskReq.setControllerId(1);
    diskReq.setStorageId(storage.uuid.toString());
    req.setDisks(List.of(diskReq));
    var rsp = vmApi.createVm(req);
    waitJobTerminated(rsp.getJobId());
    var vmInfo = vmApi.getVm(rsp.getVm().getId());
    assertEquals(VMStatus.STOPPED, vmInfo.getStatus());
  }
}
