package computer.matter.db;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.time.Instant;

public class DbBase {
  @ColumnName("is_deleted")
  public boolean isDeleted;
  @ColumnName("is_gced")
  public boolean isGCed;
  @ColumnName("updated_at")
  public Instant updatedAt;
}
