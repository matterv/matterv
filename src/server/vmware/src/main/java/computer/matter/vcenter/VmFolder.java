package computer.matter.vcenter;


import com.vmware.vim25.ManagedObjectReference;
import computer.matter.cluster.api.VmApi;
import computer.matter.db.cluster.VirtualMachineDao;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;

import java.util.ArrayList;
import java.util.List;

public class VmFolder extends Folder implements ParentNode{
  private Jdbi jdbi;
  public final static String vmFolderId = "group-v11";
  private final JsonUtil jsonUtil;
  private final VmApi vmApi;
  public VmFolder(String name, Jdbi jdbi, JsonUtil jsonUtil, VmApi vmApi) {
    super(name, vmFolderId, new ArrayList<>());
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
    this.vmApi = vmApi;
  }

  @Override
  public ManagedObjectReference child(String name) {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var vm = vmDao.findByName(name);
    return new VirtualMachine("vm-" + vm.id, vm.uuid, vmApi, jsonUtil);
  }

  @Override
  public List<ManagedObjectReference> getChildEntity() {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    return vmDao.getAll().stream().map(vm -> (ManagedObjectReference)new VirtualMachine("vm-" + vm.id, vm.uuid, vmApi, jsonUtil)).toList();
  }
}
