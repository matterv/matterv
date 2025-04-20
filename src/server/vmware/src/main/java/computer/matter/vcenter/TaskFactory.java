package computer.matter.vcenter;

import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.json.JsonUtil;

public class TaskFactory {
  private final JobApi jobApi;
  private final VmApi vmApi;
  private final JsonUtil jsonUtil;
  private final DatacenterApi datacenterApi;

  public TaskFactory(JobApi jobApi, VmApi vmApi, JsonUtil jsonUtil, DatacenterApi datacenterApi) {
    this.jobApi = jobApi;
    this.vmApi = vmApi;
    this.jsonUtil = jsonUtil;
    this.datacenterApi = datacenterApi;
  }

  public Task createTask(String value) {
    var jobId = Long.parseLong(value.split("-")[1]);
    var job = jobApi.queryJob(jobId);
    return switch (value) {
      case String ignored when value.startsWith("createvm-") -> {
        var vmId = job.getObjectId();
        var vm = vmApi.getVm(vmId);
        var vmMo = new VirtualMachine("vm-" + vm.getId(), vmApi, jsonUtil,datacenterApi, jobApi);
        yield new CreateVmTask(value, vmMo);
      }
      default -> throw new RuntimeException("Task value " + value + " is not supported");
    };
  }
}
