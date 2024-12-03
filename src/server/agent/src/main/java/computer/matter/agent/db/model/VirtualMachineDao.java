package computer.matter.agent.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface VirtualMachineDao {
  @SqlUpdate("insert into virtual_machine (name, uuid, status, managed_status, cpu, memory_in_mb, disk_size_in_gb, agent_installed, guest_os_type, ip_addresses, config, vnc, os_id) values (:name, :uuid, :status, :managedStatus, :cpu, :memoryInMB, :diskSizeInGB, :agentInstalled, :guestOsType, :ipAddresses, :config, :vnc, :osId)")
  @GetGeneratedKeys
  int insert(@BindFields VirtualMachineDo virtualMachineDo);

  @SqlUpdate("update virtual_machine set name = :name, uuid = :uuid, status = :status, managed_status = :managedStatus, cpu = :cpu, memory_in_mb = :memoryInMB, disk_size_in_gb = :diskSizeInGB, agent_installed = :agentInstalled, guest_os_type = :guestOsType, ip_addresses = :ipAddresses, config = :config, vnc = :vnc, os_id = :osId where id = :id")
  void update(@BindFields VirtualMachineDo virtualMachineDo);


  @SqlQuery("select * from virtual_machine")
  @RegisterFieldMapper(VirtualMachineDo.class)
  List<VirtualMachineDo> getAll();

  @SqlQuery("select * from virtual_machine where uuid = :uuid")
  @RegisterFieldMapper(VirtualMachineDo.class)
  VirtualMachineDo findByUUID(@Bind("uuid") String uuid);
}
