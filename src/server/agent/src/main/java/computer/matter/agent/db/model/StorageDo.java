package computer.matter.agent.db.model;

import computer.matter.storage.StorageType;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class StorageDo {
  public long id;
  public UUID uuid;
  public String name;
  @ColumnName("capacity_in_bytes")
  public long capacityInBytes;
  @ColumnName("free_in_bytes")
  public long freeInBytes;
  public @ColumnName("storage_type") StorageType storageType;
  public String url;
  public @ColumnName("mounted_path") String mountedPath;
  public boolean assigned;
}
