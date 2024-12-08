package computer.matter.cluster.db.model;

import computer.matter.cluster.common.ClusterDbTestBase;
import computer.matter.cluster.model.Vnc;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineStatus;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


class VirtualMachineDaoTest extends ClusterDbTestBase {

  @Test
  void insert() {
    var vm = new VirtualMachineDo();
    vm.uuid = UUID.randomUUID();
    vm.hostUuid = UUID.randomUUID();
    vm.memoryInBytes = 1;
    vm.cpu = 2;
    vm.osId = 1;
    vm.status = VirtualMachineStatus.RUNNING;
    vm.uuidOnHost = UUID.randomUUID();
    vm.name = UUID.randomUUID().toString();
    var config = new VirtualMachineConfig();
    config.memoryInMB = 2;
    vm.config = config;
    var vnc = new Vnc();
    vnc.setHost("192.168.1.1");
    vm.vnc = vnc;
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    vm.id = vmDao.insert(vm);
    var vm2 = vmDao.findByUuid(vm.uuid);
    assertThat(vm).usingRecursiveComparison().isEqualTo(vm2);

    vm.name = UUID.randomUUID().toString();
    vm.uuidOnHost = UUID.randomUUID();
    vm.uuid = UUID.randomUUID();
    vm.hostUuid = UUID.randomUUID();
    vm.cpu = 3;
    vm.osId = 2;
    vm.status = VirtualMachineStatus.STOPPED;
    config.cpu = 1;
    vm.config = config;
    vnc.setHost("192.168.1.2");
    vm.vnc = vnc;
    vm.isDeleted = true;
    vm.isGCed = true;
    vmDao.update(vm);
    var vm3 = vmDao.findByUuid(vm.uuid);
    assertThat(vm).usingRecursiveComparison().isEqualTo(vm3);
  }
}