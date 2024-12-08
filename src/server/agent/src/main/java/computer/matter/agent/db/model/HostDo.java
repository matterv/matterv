package computer.matter.agent.db.model;

import computer.matter.os.IpAddress;
import computer.matter.os.LinuxSystemInfo;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.util.UUID;

public class HostDo {

  public long id;
  public String name;
  public long cpu;
  public long memory;
  public UUID uuid;
  public Status status;
  @ColumnName("ip_address")
  @Json
  public IpAddress ipAddress;
  @ColumnName("system_info")
  @Json
  public LinuxSystemInfo.SystemInfo systemInfo;

  public static HostDo creatInitHost() {
    var host = new HostDo();
    host.status = Status.READY;
    host.uuid = UUID.randomUUID();
    return host;
  }

  public enum Status {
    READY,
    UNINITIALIZED,
    MAINTENANCE
  }
}
