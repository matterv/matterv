package computer.matter.agent.job.hostconfig;

import computer.matter.agent.db.model.HostDao;
import computer.matter.agent.db.model.HostDo;
import computer.matter.job.Job;
import computer.matter.job.Task;
import computer.matter.json.JsonUtil;
import computer.matter.os.NetworkUtil;
import computer.matter.os.SystemInfoUtil;
import org.jdbi.v3.core.Jdbi;

public class ConfigureHostTask implements Task {
  private final JsonUtil jsonUtil;
  private final Jdbi jdbi;
  private final SystemInfoUtil systemInfoUtil;


  public ConfigureHostTask(JsonUtil jsonUtil, Jdbi jdbi, SystemInfoUtil systemInfoUtil) {
    this.jsonUtil = jsonUtil;
    this.jdbi = jdbi;
    this.systemInfoUtil = systemInfoUtil;
  }


  @Override
  public void run(Job job) {
    var hostDao = jdbi.onDemand(HostDao.class);
    var existingHost = hostDao.get();
    var ip = NetworkUtil.getHostIpAddress();
    ip.ifPresent(i -> existingHost.ipAddress = i);
    existingHost.status = HostDo.Status.READY;

    var systemInfoOpt = systemInfoUtil.getSystemInfo();
    systemInfoOpt.ifPresent(info -> existingHost.systemInfo = info);
    hostDao.update(existingHost);
  }

  @Override
  public int weight() {
    return 20;
  }


}
