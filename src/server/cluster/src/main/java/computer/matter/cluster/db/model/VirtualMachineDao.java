package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.UUID;

public interface VirtualMachineDao {
  @SqlUpdate("insert into virtual_machine (name, uuid, status, cpu, memory_in_bytes, agent_installed, guest_os_type, ip_addresses, config, vnc, host_uuid, updated_at, uuid_on_host, os_id) values (:name, :uuid, :status, :cpu, :memoryInBytes, :agentInstalled, :guestOsType, :ipAddresses, :config, :vnc, :hostUuid, :updatedAt, :uuidOnHost, :osId)")
  @GetGeneratedKeys
  int insert(@BindFields VirtualMachineDo virtualMachineDo);

  @SqlUpdate("update virtual_machine set name = :name, uuid = :uuid, status = :status, cpu = :cpu, memory_in_bytes = :memoryInBytes, agent_installed = :agentInstalled, guest_os_type = :guestOsType, ip_addresses = :ipAddresses, config = :config, vnc = :vnc, host_uuid = :hostUuid, is_deleted = :isDeleted, is_gced = :isGCed, updated_at = :updatedAt, uuid_on_host = :uuidOnHost, os_id = :osId where id = :id")
  void update(@BindFields VirtualMachineDo virtualMachineDo);

  @SqlQuery("select * from virtual_machine where is_deleted = false and id >= :page order by id limit :limit")
  @RegisterFieldMapper(VirtualMachineDo.class)
  List<VirtualMachineDo> getAll(@Bind("page") long page, @Bind("limit") int limit);

  @SqlQuery("select * from virtual_machine where is_deleted = false")
  @RegisterFieldMapper(VirtualMachineDo.class)
  List<VirtualMachineDo> getAll();

  @SqlQuery("select * from virtual_machine where uuid = :uuid")
  @RegisterFieldMapper(VirtualMachineDo.class)
  VirtualMachineDo findByUuid(@Bind("uuid") UUID uuid);

  @SqlQuery("select * from virtual_machine where host_uuid = :hostUuid and is_deleted = false and id >= :page order by id limit :limit")
  @RegisterFieldMapper(VirtualMachineDo.class)
  List<VirtualMachineDo> getInRangeByHostUuid(@Bind("hostUuid") UUID hostUuid, @Bind("page") long page,
                                              @Bind("limit") int limit);
}
