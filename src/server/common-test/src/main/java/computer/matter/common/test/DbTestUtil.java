package computer.matter.common.test;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.jackson2.Jackson2Plugin;
import org.jdbi.v3.sqlite3.SQLitePlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTestUtil {

  public static Jdbi setupDB(String migrationFile) {
    try {
      Files.deleteIfExists(new File("/tmp/data1.db").toPath());
      var connection = DriverManager.getConnection("jdbc:sqlite:/tmp/data1.db");
      var database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection));

      var liquibase = new liquibase.Liquibase(migrationFile, new ClassLoaderResourceAccessor(), database);

      liquibase.update(new Contexts(), new LabelExpression());
      return Jdbi.create("jdbc:sqlite:/tmp/data1.db").installPlugin(new SQLitePlugin())
              .installPlugin(new SqlObjectPlugin()).installPlugin(new Jackson2Plugin());
    } catch (LiquibaseException | SQLException | IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void cleanDB() {
    try {
      Files.deleteIfExists(new File("/tmp/data1.db").toPath());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
