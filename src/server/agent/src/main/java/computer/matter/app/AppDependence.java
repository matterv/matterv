package computer.matter.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.job.JobClient;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.Clock;
import computer.matter.os.PhysicalNetworkProvider;

public class AppDependence {
  public JobClient jobClient;
  public ObjectMapper objectMapper;
  public JsonUtil jsonUtil;
  public JobDao jobDao;
  public VirtualMachineDao virtualMachineDao;
  public PhysicalNetworkProvider physicalNetworkProvider;
  public LocalStorageProvider localStorageProvider;
  public StorageFactory storageFactory;
  public Clock clock;
}
