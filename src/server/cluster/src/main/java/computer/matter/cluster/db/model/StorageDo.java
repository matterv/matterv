package computer.matter.cluster.db.model;

import computer.matter.cluster.model.StorageStatus;
import computer.matter.db.DbBase;
import computer.matter.storage.StorageType;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class StorageDo extends DbBase {
  public long id;
  public UUID uuid;
  @ColumnName("uuid_on_host")
  public UUID uuidOnHost; // storage's uuid on the host
  @ColumnName("host_uuid")
  public UUID hostUuid; // host uuid on which the storage resides.
  public String name;
  @ColumnName("capacity_in_bytes")
  public long capacityInBytes;
  @ColumnName("free_in_bytes")
  public long freeInBytes;
  public @ColumnName("storage_type") StorageType storageType;
  public String url;
  public @ColumnName("mounted_path") String mountedPath;
  public boolean assigned;
  public StorageStatus status;
}
