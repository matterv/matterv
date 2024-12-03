package computer.matter.cluster.api;

import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.model.CreateVirtualMachineOnHostRequest;
import computer.matter.cluster.model.DiskRequest;
import computer.matter.host.ApiException;
import computer.matter.host.client.model.AsyncRequestStatus;
import computer.matter.host.client.model.CreateVirtualMachineResponse;
import computer.matter.host.client.model.Job;
import computer.matter.host.client.model.PaginatedVMResponse;
import computer.matter.host.client.model.PowerOffVirtualMachineResponse;
import computer.matter.host.client.model.PowerOnVirtualMachineResponse;
import computer.matter.host.client.model.VMStatus;
import computer.matter.host.client.model.VirtualMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class VmApiImplTest extends ApiTestBase {

  DataCenterInfo dataCenterInfo;

  @BeforeEach
  void setUp() throws ApiException {
    super.setup();
    dataCenterInfo = setupEnv();
  }

  private computer.matter.cluster.model.VirtualMachine createVm() throws ApiException {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);

    var host = datacenterApi.getHost(dataCenterInfo.hostId());
    var req = new CreateVirtualMachineOnHostRequest();
    req.setName(UUID.randomUUID().toString());
    req.setCpu(1L);
    req.setMemory(1L);
    req.setHostId(host.getId());

    var disk = new DiskRequest();
    disk.setSize(1L);
    disk.setStorageId(host.getVmStorages().getFirst().getId());
    req.setDisks(List.of(disk));
    var rsp = vmApi.createVm(req);

    var vm = vmApi.getVm(rsp.getVm().getId());

    assertEquals(computer.matter.cluster.model.VMStatus.CREATING, vm.getStatus());


    var rsp2 = new CreateVirtualMachineResponse();
    var rspVm = new VirtualMachine();
    rspVm.setStatus(VMStatus.RUNNING);
    rspVm.setName(vm.getName());
    rspVm.setUuid(UUID.randomUUID());
    rspVm.setCpu(1L);
    rspVm.setMemory(1L);
    rspVm.setVmConfig(vm.getVmConfig());
    var jobId = UUID.randomUUID().toString();
    rsp2.setVm(rspVm);
    rsp2.setJobId(jobId);

    Mockito.when(agentVmApi.createVm(any())).thenReturn(rsp2);
    Mockito.when(agentVmApi.getVm(any())).thenReturn(rspVm);
    var job = new Job();
    job.setStatus(AsyncRequestStatus.FINISHED);
    Mockito.when(agentJobApi.queryJob(anyString())).thenReturn(job);
    jobClient.getJobScheduler().start();

    vm = vmApi.getVm(vm.getId());
    assertEquals(computer.matter.cluster.model.VMStatus.RUNNING, vm.getStatus());
    return vm;
  }

  @Test
  void createVmTest() throws ApiException {
    createVm();
    var vms = vmApi.getVms(10, 1);
    assertEquals(1, vms.getItems().size());
    var vm = vms.getItems().getFirst();
    assertEquals(1, vm.getCpu());
    assertEquals(1, vm.getMemory());
  }

  @Test
  void powerOffVm() throws ApiException {
    var vm = createVm();

    var rspVm = new VirtualMachine();
    rspVm.setStatus(VMStatus.STOPPED);
    rspVm.setUuid(UUID.randomUUID());
    rspVm.setCpu(1L);
    rspVm.setMemory(1L);
    rspVm.setName(vm.getName());
    rspVm.setVmConfig(vm.getVmConfig());

    Mockito.when(agentVmApi.getVm(any())).thenReturn(rspVm);

    var rsp = new PowerOffVirtualMachineResponse();
    rsp.setJobId(UUID.randomUUID().toString());
    rsp.setVmId(rspVm.getUuid().toString());
    Mockito.when(agentVmApi.powerOffVm(any())).thenReturn(rsp);

    var job = new Job();
    job.setStatus(AsyncRequestStatus.FINISHED);
    Mockito.when(agentJobApi.queryJob(anyString())).thenReturn(job);

    var vm2 = vmApi.powerOffVm(vm.getId());
    assertEquals(computer.matter.cluster.model.VMStatus.STOPPING, vm2.getStatus());

    jobClient.getJobScheduler().start();
    var powerOffVm = vmApi.getVm(vm.getId());
    assertEquals(computer.matter.cluster.model.VMStatus.STOPPED, powerOffVm.getStatus());
  }

  @Test
  void powerOnVm() throws ApiException {
    powerOffVm();

    var vm = vmApi.getVms(10, 1).getItems().getFirst();

    var rspVm = new VirtualMachine();
    rspVm.setStatus(VMStatus.RUNNING);
    rspVm.setUuid(UUID.randomUUID());
    rspVm.setCpu(1L);
    rspVm.setMemory(1L);
    rspVm.setVmConfig(vm.getVmConfig());
    rspVm.setName(vm.getName());

    Mockito.when(agentVmApi.getVm(any())).thenReturn(rspVm);

    var rsp = new PowerOnVirtualMachineResponse();
    rsp.setJobId(UUID.randomUUID().toString());
    rsp.setVmId(rspVm.getUuid().toString());
    Mockito.when(agentVmApi.powerOnVm(any())).thenReturn(rsp);

    var job = new Job();
    job.setStatus(AsyncRequestStatus.FINISHED);
    Mockito.when(agentJobApi.queryJob(anyString())).thenReturn(job);

    var vm2 = vmApi.powerOnVm(vm.getId());
    assertEquals(computer.matter.cluster.model.VMStatus.STARTING, vm2.getStatus());

    jobClient.getJobScheduler().start();

    var powerOffVm = vmApi.getVm(vm.getId());
    assertEquals(computer.matter.cluster.model.VMStatus.RUNNING, powerOffVm.getStatus());
  }

  @Test
  void syncHost() throws ApiException {
    createVm();
    var willBeDeletedVm = createVm();
    var vm = vmApi.getVms(10, 1).getItems().getFirst();
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vmDo = vmDao.findByUuid(vm.getUuid());

    var rspVm = new VirtualMachine();
    rspVm.setStatus(VMStatus.STOPPED);
    rspVm.setUuid(vmDo.uuidOnHost);
    rspVm.setName(vmDo.name);
    rspVm.setCpu(1L);
    rspVm.setVmConfig(jsonUtil.toJson(vmDo.config));
    rspVm.setMemory(1L);

    var newVm = new VirtualMachine();
    newVm.setStatus(VMStatus.RUNNING);
    newVm.setUuid(UUID.randomUUID());
    newVm.setCpu(1L);
    newVm.setMemory(1L);
    newVm.setName(UUID.randomUUID().toString());
    newVm.setVmConfig(jsonUtil.toJson(vmDo.config));


    var rsp = new PaginatedVMResponse();
    rsp.setItems(List.of(rspVm, newVm));
    Mockito.when(agentVmApi.getVms(any(), any())).thenReturn(rsp);

    clock.currentTime = Instant.now().plus(Duration.ofMinutes(30));
    jobClient.getJobScheduler().start();

    var vms = vmApi.getVms(10, 1).getItems();
    assertEquals(2, vms.size());
    assertEquals(computer.matter.cluster.model.VMStatus.STOPPED, vms.getFirst().getStatus());
    assertEquals(computer.matter.cluster.model.VMStatus.RUNNING, vms.getLast().getStatus());
    var deletedVm = vmDao.findByUuid(willBeDeletedVm.getUuid());
    assertTrue(deletedVm.isDeleted);
  }
}