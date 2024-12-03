package computer.matter.agent.db.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.UUID;

public class DiskDo {
  public long id;
  public UUID uuid;
  public String path;

  @ColumnName("storage_id")
  public long storageId;

  @ColumnName("vm_id")
  public UUID vmId;
}
