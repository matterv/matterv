package computer.matter.cluster.db.model;

import computer.matter.db.DbBase;

import java.util.UUID;

public class DataCenterDo extends DbBase {

  public long id;
  public String name;
  public UUID uuid;
}
