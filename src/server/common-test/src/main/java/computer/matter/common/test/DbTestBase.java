package computer.matter.common.test;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DbTestBase {
  public Jdbi jdbi;

  public String migrationFile() {
    return "host-migration.xml";
  }

  @BeforeEach
  public void setup() {
    jdbi = DbTestUtil.setupDB(migrationFile());
  }

  @AfterEach
  public void tearDown() {
    DbTestUtil.cleanDB();
  }
}
