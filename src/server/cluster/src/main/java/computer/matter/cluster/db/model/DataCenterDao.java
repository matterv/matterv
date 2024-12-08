package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface DataCenterDao {
  @SqlUpdate("insert into data_center (id, name, uuid, updated_at) values (:id, :name, :uuid, :updatedAt)")
  @GetGeneratedKeys
  long insert(@BindFields DataCenterDo cc);

  @SqlUpdate("update data_center set name = :name, is_deleted = :isDeleted, is_gced = :isGCed, updated_at = :updatedAt where id = :id")
  void update(@BindFields DataCenterDo cc);

  @SqlQuery("select * from data_center")
  @RegisterFieldMapper(DataCenterDo.class)
  List<DataCenterDo> getAll();

  @SqlQuery("select * from data_center where name = :name")
  @RegisterFieldMapper(DataCenterDo.class)
  DataCenterDo findByName(@Bind("name") String name);
}
