package computer.matter.cluster.db.model;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface NodeDao {
  @SqlUpdate("insert into node (uuid, type) values (:uuid, :type)")
  void insert(@BindFields NodeDo node);

  @SqlQuery("select * from node")
  @RegisterFieldMapper(NodeDo.class)
  List<NodeDo> getAll();


}
