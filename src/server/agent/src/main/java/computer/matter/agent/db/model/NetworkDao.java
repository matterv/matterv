package computer.matter.agent.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface NetworkDao {
  @SqlUpdate("insert into network (name, network_type, ip_addresses, uuid) values (:name, :networkType, :ipAddresses, :uuid)")
  @GetGeneratedKeys
  long insert(@BindFields NetworkDo network);

  @SqlQuery("select * from network")
  @RegisterFieldMapper(NetworkDo.class)
  List<NetworkDo> getAll();

  @SqlUpdate("delete from network")
  void deleteAll();
}
