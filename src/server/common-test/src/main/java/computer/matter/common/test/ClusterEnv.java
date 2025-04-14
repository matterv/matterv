package computer.matter.common.test;

import computer.matter.db.cluster.HostDo;
import computer.matter.db.cluster.StorageDo;
import computer.matter.json.JsonUtil;

import java.util.List;

public record ClusterEnv(HostDo host, List<StorageDo> storages, JsonUtil jsonUtil) {
}
