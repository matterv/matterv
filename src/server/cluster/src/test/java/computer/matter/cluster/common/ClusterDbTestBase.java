package computer.matter.cluster.common;

import computer.matter.common.test.DbTestBase;

public class ClusterDbTestBase extends DbTestBase {
  @Override
  public String migrationFile() {
    return "cluster-migration.xml";
  }
}
