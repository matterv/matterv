package computer.matter.agent.db.model;

import computer.matter.network.NetworkType;
import computer.matter.os.IpAddress;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.util.List;
import java.util.UUID;

public class NetworkDo {
  public long id;
  public String name;
  public UUID uuid;
  @ColumnName("ip_addresses")
  @Json
  public List<IpAddress> ipAddresses;
  @ColumnName("network_type")
  public NetworkType networkType;
}
