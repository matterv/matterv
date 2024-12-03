package computer.matter.agent.job.vmprovision;

import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.network.MacAddressGenerator;
import computer.matter.vm.VirtualCdrom;
import computer.matter.vm.VirtualDisk;
import computer.matter.vm.VirtualDiskControllerType;
import computer.matter.vm.VirtualMachineStatus;
import computer.matter.vm.VirtualNic;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class CreateVmTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(CreateVmTask.class);

  private final QemuCli qemuCli;
  private final Jdbi jdbi;
  private final JsonUtil jsonUtil;

  public CreateVmTask(QemuCli qemuCli, Jdbi jdbi, JsonUtil jsonUtil) {
    this.qemuCli = qemuCli;
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
  }

  @Override
  public void run(Job job) {
    logger.debug("Start to run CreateVmTask");
    VmProvisionJobConfig jobConfig = jsonUtil.fromJson(job.config, VmProvisionJobConfig.class);

    var virtualDisks = jobConfig.provisionedDisks.stream().map(disk -> {
      var virtualDisk = new VirtualDisk();
      virtualDisk.id = disk.id;
      virtualDisk.file = disk.path;
      virtualDisk.fileType = disk.fileType;
      virtualDisk.controllerType = VirtualDiskControllerType.IDE;
      return virtualDisk;
    }).toList();

    var nics = jobConfig.requirement.networkRequirements.stream().map(r -> {
      var nic = new VirtualNic();
      nic.id = r.id();
      nic.connected = r.connected();
      nic.backingDev = r.networkName();
      nic.macAddress = MacAddressGenerator.generateMacAddress48(true, true);
      return nic;
    }).toList();

    jobConfig.vmConfig.osId = jobConfig.requirement.osId;
    jobConfig.vmConfig.devices = new LinkedList<>();
    jobConfig.vmConfig.devices.addAll(virtualDisks);
    jobConfig.vmConfig.devices.addAll(nics);

    if (jobConfig.cdRom != null) {
      var vcdrom = new VirtualCdrom();
      vcdrom.id = jobConfig.cdRom.id;
      vcdrom.isoPath = jobConfig.cdRom.path;
      vcdrom.connected = jobConfig.cdRom.connected;
      jobConfig.vmConfig.devices.add(vcdrom);
    }

    var jobDao = jdbi.onDemand(JobDao.class);
    job.config = jsonUtil.toJson(jobConfig);
    jobDao.update(job);

    qemuCli.createVm(jobConfig.vmConfig);

    var vmDao = jdbi.onDemand(VirtualMachineDao.class);

    var vm = vmDao.findByUUID(jobConfig.vmId.toString());
    vm.status = VirtualMachineStatus.RUNNING;
    vm.config = jobConfig.vmConfig;
    vmDao.update(vm);
  }

  @Override
  public void undo(Job job) {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var jobConfig = jsonUtil.fromJson(job.config, VmProvisionJobConfig.class);
    var vm = vmDao.findByUUID(jobConfig.vmId.toString());
    vm.status = VirtualMachineStatus.FAILED;
    vmDao.update(vm);
  }


  @Override
  public int weight() {
    return 50;
  }
}
