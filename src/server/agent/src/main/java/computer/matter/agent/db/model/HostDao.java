package computer.matter.agent.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface HostDao {
  @SqlUpdate("insert into host (id, name, cpu, memory, uuid, status, ip_address, system_info) values (:id, :name, :cpu, :memory, :uuid, :status, :ipAddress, :systemInfo)")
  @GetGeneratedKeys
  long insert(@BindFields HostDo host);

  @SqlUpdate("update host set name = :name, cpu = :cpu, memory = :memory, uuid = :uuid, status = :status, ip_address = :ipAddress, system_info = :systemInfo where id = :id")
  void update(@BindFields HostDo host);

  @SqlQuery("select * from host limit 1")
  @RegisterFieldMapper(HostDo.class)
  HostDo get();
}
