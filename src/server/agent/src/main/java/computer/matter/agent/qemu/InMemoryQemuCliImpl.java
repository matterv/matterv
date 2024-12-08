package computer.matter.agent.qemu;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.vm.VirtualMachineConfig;
import computer.matter.vm.Vnc;

import java.util.List;
import java.util.Optional;

public class InMemoryQemuCliImpl implements QemuCli {
  @Override
  public long createVm(VirtualMachineConfig config) {
    return 0;
  }

  @Override
  public void stopVm(VirtualMachineConfig config) {

  }

  @Override
  public void startVm(VirtualMachineConfig config) {

  }

  @Override
  public void resetVm(VirtualMachineConfig config) {

  }

  @Override
  public void editVm(VirtualMachineConfig config) {

  }

  @Override
  public Optional<Vnc> queryVnc(String qmpPath) {
    return Optional.empty();
  }


  @Override
  public List<VirtualMachineConfig> listVms() {
    return List.of();
  }
}
