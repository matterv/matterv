package computer.matter.cluster.common.vm;

import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.db.model.VirtualMachineDo;
import computer.matter.host.client.model.VirtualMachine;
import computer.matter.json.JsonUtil;
import computer.matter.os.IpAddress;
import computer.matter.os.IpAddressType;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.VirtualMachineStatus;
import org.jdbi.v3.core.Jdbi;

import java.time.Instant;
import java.util.UUID;

public class VirtualMachines {

  private static void updateVm(JsonUtil jsonUtil, VirtualMachineDo vm, VirtualMachine hostVm) {
    vm.status = VirtualMachineStatus.valueOf(hostVm.getStatus().name());
    vm.cpu = hostVm.getCpu();
    vm.name = hostVm.getName();
    vm.updatedAt = Instant.now();
    vm.uuidOnHost = hostVm.getUuid();
    vm.memoryInBytes = hostVm.getMemory();
    if (hostVm.getVmConfig() != null) {
      vm.config = jsonUtil.fromJson(hostVm.getVmConfig(), VirtualMachineConfig.class);
    }

    if (hostVm.getIpAddresses() != null) {
      vm.ipAddresses = hostVm.getIpAddresses().stream()
          .map(ipAddress -> new IpAddress(ipAddress.getIp(), IpAddressType.valueOf(ipAddress.getType().name())))
          .toList();
    }
  }

  public static void updateVm(JsonUtil jsonUtil, Jdbi jdbi, VirtualMachineDo vm, VirtualMachine hostVm) {
    updateVm(jsonUtil, vm, hostVm);
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    vmDao.update(vm);
  }

  public static void createVm(JsonUtil jsonUtil, Jdbi jdbi, VirtualMachine hostVm) {
    var vm = new VirtualMachineDo();
    vm.uuid = UUID.randomUUID();
    vm.hostUuid = hostVm.getUuid();
    updateVm(jsonUtil, vm, hostVm);
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    vmDao.insert(vm);
  }
}
