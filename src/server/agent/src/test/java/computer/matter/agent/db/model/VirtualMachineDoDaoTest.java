package computer.matter.agent.db.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import computer.matter.common.test.DbTestBase;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineManagedStatus;
import computer.matter.vm.VirtualMachineStatus;
import computer.matter.vm.Vnc;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class VirtualMachineDoDaoTest extends DbTestBase {

  @Test
  void getAll() throws JsonProcessingException {

    jdbi.useExtension(VirtualMachineDao.class, vmDao -> {
      var vmconfig = new VirtualMachineConfig();
      vmconfig.cpu = 1;
      vmconfig.memoryInMB = 256;

      var vm = new VirtualMachineDo();
      vm.name = "vm1";
      vm.uuid = UUID.randomUUID();
      vm.status = VirtualMachineStatus.RUNNING;
      vm.config = vmconfig;
      vm.cpu = 1;
      vm.managedStatus = VirtualMachineManagedStatus.DONE;
      vm.diskSizeInGB = 1;
      vm.osId = 2;
      vm.memoryInMB = 2;
      vm.guestOsType = "Linux";
      vm.ipAddresses = List.of(new IpAddress("192.168.1.1", IpAddressType.IPV4));
      vm.vnc = new Vnc(1);
      vm.id = vmDao.insert(vm);
      var vms = vmDao.getAll();
      assertEquals(1, vms.size());
      assertEquals(1, vms.get(0).cpu);
      assertFalse(vms.get(0).agentInstalled);
      assertEquals("Linux", vms.get(0).guestOsType);
      assertEquals("192.168.1.1", vms.get(0).ipAddresses.getFirst().ip());
      assertEquals(1, vms.get(0).vnc.port());
      assertEquals(2, vms.get(0).osId);

      vm.cpu = 2;
      vm.vnc = new Vnc(2);
      vm.osId = 1;
      vmDao.update(vm);

      var newVm = vmDao.findByUUID(vm.uuid.toString());
      assertEquals(2, newVm.cpu);
      assertEquals(2, newVm.vnc.port());
      assertEquals(1, newVm.osId);

    });
  }
}