package computer.matter.agent.common.vm;

import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.Vnc;

import java.util.List;
import java.util.Optional;

public interface QemuCli {
  long createVm(VirtualMachineConfig config);

  void stopVm(VirtualMachineConfig config);

  void startVm(VirtualMachineConfig config);

  void resetVm(VirtualMachineConfig config);

  void editVm(VirtualMachineConfig config);

  Optional<Vnc> queryVnc(String qmpPath);

  List<VirtualMachineConfig> listVms();
}
