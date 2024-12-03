package computer.matter.cluster.job.hostrefresh;

import computer.matter.cluster.common.vm.VirtualMachines;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.HostDo;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.NetworkDo;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.db.model.VirtualMachineDo;
import computer.matter.host.ApiException;
import computer.matter.host.client.VmApi;
import computer.matter.host.client.model.VirtualMachine;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.network.NetworkType;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.JobUtils;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class HostRefreshTask implements Task {
  private final Logger logger = LoggerFactory.getLogger(HostRefreshTask.class);

  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;
  private final ApiClientProvider apiClientProvider;

  public HostRefreshTask(JsonUtil jsonUtil, Jdbi jdbi, ApiClientProvider apiClientProvider) {
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
    this.apiClientProvider = apiClientProvider;
  }

  private void iterateVms(VmApi vmApi, Consumer<List<VirtualMachine>> consumer) {
    var pageLimit = 10;
    var currentPage = 1;
    var hasMorePages = true;

    while (hasMorePages) {
      try {
        var response = vmApi.getVms(currentPage, pageLimit);
        if (response == null || response.getItems().isEmpty()) {
          break;
        }

        consumer.accept(response.getItems());
        hasMorePages = response.getNextPage() != null;
        if (response.getNextPage() != null) {
          currentPage = Integer.parseInt(response.getNextPage());
        }
      } catch (ApiException e) {
        logger.error("Failed to get VMs from API for page {}", currentPage, e);
        break;
      }
    }
  }

  private void updateVm(VirtualMachineDo existingVm, VirtualMachine vm) {
    VirtualMachines.updateVm(jsonUtil, jdbi, existingVm, vm);
  }

  private void createVm(VirtualMachine vm) {
    VirtualMachines.createVm(jsonUtil, jdbi, vm);
  }

  private void deleteVms(Map<UUID, VirtualMachineDo> existingVmMap, Set<UUID> hostVmIdSet) {
    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var exstingVmIdSet = existingVmMap.keySet();
    exstingVmIdSet.removeAll(hostVmIdSet);
    exstingVmIdSet.forEach(vmHostId -> {
      var vm = existingVmMap.get(vmHostId);
      vm.isDeleted = true;
      vm.updatedAt = Instant.now();
      vmDao.update(vm);
    });
  }

  private void syncVms(VmApi vmApi, List<VirtualMachineDo> existingVms) {
    var existingVmMap = existingVms.stream().collect(Collectors.toMap(vm -> vm.uuidOnHost, vm -> vm));
    var hostVmIdSet = new HashSet<UUID>();
    iterateVms(vmApi, vms -> {
              for (var vm : vms) {
                hostVmIdSet.add(vm.getUuid());
                if (existingVmMap.containsKey(vm.getUuid())) {
                  var existingVm = existingVmMap.get(vm.getUuid());
                  updateVm(existingVm, vm);
                } else {
                  createVm(vm);
                }
              }
            }
    );

    deleteVms(existingVmMap, hostVmIdSet);
  }

  private void syncNetworks(HostDo host) {
    var hostApi = apiClientProvider.getHostApi(host.endpoint);
    var networkDao = jdbi.onDemand(NetworkDao.class);
    var networkUuids = networkDao.getAll().stream().collect(Collectors.toMap(n -> n.uuidOnHost.toString(), n ->n));
      try {
          var hostInfo = hostApi.getHostInfo();
          if (hostInfo.getPhysicalNetworks() != null) {
              hostInfo.getPhysicalNetworks().forEach(n -> {
                if (!networkUuids.containsKey(n.getId())) {
                  var networkDo = new NetworkDo();
                  networkDo.networkType = NetworkType.BRIDGE;
                  networkDo.name = n.getName();
                  networkDo.uuid = UUID.randomUUID();
                  networkDo.uuidOnHost = UUID.fromString(n.getId());
                  networkDo.hostUuid = host.uuid;
                  networkDo.assigned = false;
                  networkDao.insert(networkDo);
                } else {
                  var existingNetwork = networkUuids.get(n.getId());
                  existingNetwork.networkType = NetworkType.valueOf(n.getType().name());
                  networkDao.update(existingNetwork);
                }
              });
          }
      } catch (ApiException e) {
          throw new RuntimeException(e);
      }
  }

  private void syncVms(HostDo host) {
    var vmApi = apiClientProvider.getVmApi(host.endpoint);

    var vmDao = jdbi.onDemand(VirtualMachineDao.class);
    var existingVms = vmDao.getAll();
    if (existingVms == null) {
      logger.error("No virtual machine found for host: {}", host.uuid);
      return;
    }

    syncVms(vmApi, existingVms);
  }

  private void syncDataFromHost(HostDo host) {
    syncVms(host);
    syncNetworks(host);
  }

  @Override
  public void run(Job job) {
    var config = jsonUtil.fromJson(job.config, HostRefreshJobConfig.class);
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.findByUuid(config.hostUuid);
    if (host == null) {
      logger.error("Host does not exist: {}", config.hostUuid);
      return;
    }

    if (host.status != HostDo.Status.READY) {
      logger.error("Host status is not READY: {}", host.status);
      return;
    }

    logger.debug("Starting host refresh task");

    var hostApi = apiClientProvider.getHostApi(host.endpoint);

      try {
        var rsp = hostApi.refreshHost();
        var jobApi = apiClientProvider.getJobApi(host.endpoint);
        var result = JobUtils.waitForJob(jobApi, rsp.getJobId());
        if (result.isPresent()) {
          syncDataFromHost(host);
        }
      } catch (ApiException e) {
          throw new RuntimeException(e);
      }
  }

  @Override
  public int weight() {
    return 100;
  }
}
