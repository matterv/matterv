package computer.matter.cluster.db.model;

import computer.matter.db.DbBase;
import computer.matter.network.NetworkType;
import computer.matter.os.IpAddress;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.util.List;
import java.util.UUID;

public class NetworkDo extends DbBase {
  public long id;
  public String name;
  public UUID uuid;
  @ColumnName("uuid_on_host")
  public UUID uuidOnHost; // network's uuid on the host
  @ColumnName("host_uuid")
  public UUID hostUuid; // host uuid on which the network resides.
  @ColumnName("ip_addresses")
  @Json
  public List<IpAddress> ipAddresses;
  @ColumnName("network_type")
  public NetworkType networkType;
  public boolean assigned;
}
