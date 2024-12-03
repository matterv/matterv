package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface UserDao {
  @SqlUpdate("insert into user (id, name, password, uuid) values (:id, :name, :password, :uuid)")
  @GetGeneratedKeys
  long insert(@BindFields UserDo user);

  @SqlUpdate("update user set password = :password where id = :id")
  void update(@BindFields UserDo cc);

  @SqlQuery("select * from user")
  @RegisterFieldMapper(UserDo.class)
  List<UserDo> getAll();

  @SqlQuery("select * from user where name = :name")
  @RegisterFieldMapper(UserDo.class)
  UserDo findByName(@Bind("name") String name);
}
