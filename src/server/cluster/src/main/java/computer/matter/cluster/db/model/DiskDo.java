package computer.matter.cluster.db.model;

import computer.matter.db.DbBase;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class DiskDo extends DbBase {
  public long id;
  @ColumnName("disk_order")
  public int diskOrder;
  public UUID uuid;
  @ColumnName("size_in_bytes")
  public long sizeInBytes;
  @ColumnName("storage_id")
  public UUID storageId;
  @ColumnName("vm_id")
  public UUID vmId;
  public String path;
}
