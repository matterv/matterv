package computer.matter.app.api;

import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.HostDo;
import computer.matter.agent.db.model.NetworkDao;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.agent.job.hostconfig.HostConfigJobConfig;
import computer.matter.agent.job.hostconfig.HostConfigJobRunner;
import computer.matter.agent.job.hostrefresh.HosRefreshJobRunner;
import computer.matter.agent.job.hostrefresh.HostRefreshJobConfig;
import computer.matter.host.api.HostApi;
import computer.matter.host.model.CpuInfo;
import computer.matter.host.model.Host;
import computer.matter.host.model.HostInfo;
import computer.matter.host.model.HostRefreshResponse;
import computer.matter.host.model.HostStatus;
import computer.matter.host.model.HostSummary;
import computer.matter.host.model.IpAddress;
import computer.matter.host.model.IpAddressType;
import computer.matter.host.model.Network;
import computer.matter.host.model.NetworkType;
import computer.matter.host.model.PhysicalHost;
import computer.matter.host.model.PhysicalNetwork;
import computer.matter.host.model.PhysicalNetworkType;
import computer.matter.host.model.Storage;
import computer.matter.host.model.StorageType;
import computer.matter.host.model.UpdateHostRequest;
import computer.matter.host.model.UpdateHostResponse;
import computer.matter.job.JobClient;
import computer.matter.json.JsonUtil;
import computer.matter.os.LinuxSystemInfo;
import computer.matter.os.PhysicalNetworkProvider;
import org.jdbi.v3.core.Jdbi;

import java.math.BigDecimal;
import java.util.List;

public class HostApiImpl implements HostApi {
  private final Jdbi jdbi;
  private final PhysicalNetworkProvider physicalNetworkProvider;
  private final LocalStorageProvider localStorageProvider;
  private final JsonUtil jsonUtil;
  private JobClient jobClient;


  public HostApiImpl(Jdbi jdbi, PhysicalNetworkProvider physicalNetworkProvider,
                     LocalStorageProvider localStorageProvider, JobClient jobClient, JsonUtil jsonUtil) {
    this.jdbi = jdbi;
    this.physicalNetworkProvider = physicalNetworkProvider;
    this.localStorageProvider = localStorageProvider;
    this.jobClient = jobClient;
    this.jsonUtil = jsonUtil;
  }

  private Storage fromStorageDo(StorageDo storageDo) {
    var ss = new Storage();
    ss.setId(storageDo.uuid.toString());
    ss.setName(storageDo.name);
    ss.setCapacityInBytes(storageDo.capacityInBytes);
    ss.setFreeInBytes(storageDo.freeInBytes);
    ss.setMountPoint(storageDo.mountedPath);
    ss.setStorageType(StorageType.fromString(storageDo.storageType.name()));
    return ss;
  }

  @Override
  public Host getHostInfo() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var storageDao = jdbi.onDemand(StorageDao.class);
    var networkDao = jdbi.onDemand(NetworkDao.class);
    var vmStorages = storageDao.getAllVmStorages();
    var networks = networkDao.getAll();

    var hostDo = hostDao.get();
    var host = new Host();
    host.setId(hostDo.uuid.toString());
    host.name(hostDo.name);
    host.cpu(hostDo.cpu);
    host.memory(hostDo.memory);
    host.setStatus(HostStatus.fromString(hostDo.status.name()));


    host.setVmStorages(vmStorages.stream().map(this::fromStorageDo).toList());

    var physicalNetworks = networks.stream().map(vmNetwork -> {
      var network = new Network();
      network.setId(vmNetwork.uuid.toString());
      network.setName(vmNetwork.name);
      network.setType(NetworkType.fromString(vmNetwork.networkType.name()));
      return network;
    }).toList();
    host.setPhysicalNetworks(physicalNetworks);

    var localStorages = storageDao.getAllPhysicalStorages().stream().map(this::fromStorageDo).toList();
    host.setLocalStorages(localStorages);

    return host;
  }

  private CpuInfo fromHost(LinuxSystemInfo.CpuInfo cpuInfo) {
    var rst = new CpuInfo();
    rst.setCores(cpuInfo.cores());
    rst.setMhz(BigDecimal.valueOf(cpuInfo.mhz()));
    rst.setModel(cpuInfo.model());
    return rst;
  }

  private HostInfo fromHost(LinuxSystemInfo.HostInfo hostInfo) {
    var rst = new HostInfo();
    rst.setArch(hostInfo.arch());
    rst.setHostname(hostInfo.hostname());
    rst.setKernel(hostInfo.kernel());
    rst.setOs(hostInfo.os());
    return rst;
  }

  @Override
  public HostSummary getHostSummary() {
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.get();
    var summary = new HostSummary();
    summary.setVms(10L);
    summary.setRunningVms(5L);
    summary.setHostInfo(fromHost(host.systemInfo.hostInfo()));
    summary.setVersion(host.systemInfo.version());
    return summary;
  }

  private PhysicalNetwork fromNetwork(PhysicalNetworkProvider.NetworkInterface n) {
    var network = new PhysicalNetwork();
    network.setName(n.name());
    network.setType(PhysicalNetworkType.fromString(n.type()));
    var ipAddress = new IpAddress();
    ipAddress.setIp(n.ipAddress());
    ipAddress.setType(IpAddressType.IPV4);
    network.setIpAddresses(List.of(ipAddress));
    return network;
  }

  @Override
  public PhysicalHost getPhysicalHostInfo() {
    var networks = physicalNetworkProvider.listNetworks();
    var pnetworks = networks.stream().map(this::fromNetwork).toList();

    var localStorages = localStorageProvider.discoverStorages();
    var host = new PhysicalHost();
    host.setNetwork(pnetworks);
    host.setStorage(localStorages);
    return host;
  }

  @Override
  public HostRefreshResponse refreshHost() {
    var config = new HostRefreshJobConfig();
    var hostDao = jdbi.onDemand(HostDao.class);
    var host = hostDao.get();
    config.hostId = host.uuid.toString();

    var configStr = jsonUtil.toJson(config);

    var job = jobClient.schedule(configStr, HosRefreshJobRunner.jobType, host.uuid.toString(), null);
    var rsp = new HostRefreshResponse();
    rsp.setJobId(job.uuid.toString());
    return rsp;
  }

  private computer.matter.os.IpAddress fromIpAddress(IpAddress ip) {
    return new computer.matter.os.IpAddress(
            ip.getIp(),
            computer.matter.os.IpAddressType.valueOf(ip.getType().name()));
  }

  private IpAddress toIpAddress(computer.matter.os.IpAddress ip) {
    var addr = new IpAddress();
    addr.setIp(ip.ip());
    addr.setType(IpAddressType.fromString(ip.type().name()));
    return addr;
  }

  @Override
  public Host updateHost(UpdateHostRequest updateHostRequest) {
    var hostDao = jdbi.onDemand(HostDao.class);
    var existingHost = hostDao.get();

    existingHost.name = updateHostRequest.getHostName();
    hostDao.update(existingHost);
    return getHostInfo();
  }
}
