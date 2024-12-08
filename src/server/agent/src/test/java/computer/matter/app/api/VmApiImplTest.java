package computer.matter.app.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.agent.common.vm.QemuCli;
import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.agent.job.vmprovision.VmProvisionJobRunner;
import computer.matter.agent.storage.Storage;
import computer.matter.app.AppConfig;
import computer.matter.common.test.DbTestBase;
import computer.matter.host.model.AsyncRequestStatus;
import computer.matter.host.model.CreateVirtualMachineRequest;
import computer.matter.host.model.DiskRequest;
import computer.matter.job.JobClientImpl;
import computer.matter.job.JobRunner;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.TestClock;
import computer.matter.storage.StorageType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class VmApiImplTest extends DbTestBase {
  @Mock
  QemuCli qemuCli;
  @Mock
  Storage storage;
  @Mock
  StorageFactory storageFactory;
  @Mock
  AppConfig appConfig;

  @Test
  void createVm() throws IOException {
    var ob = new ObjectMapper();
    var jsonUtil = new JsonUtil(ob);

    JobRunner provisionJob = new VmProvisionJobRunner(jsonUtil, qemuCli, jdbi, storageFactory, appConfig);
    var jobScheduler = new SimpleJobScheduler(Map.of(VmProvisionJobRunner.jobType, provisionJob), jdbi,
            new TestClock());

    var jobClient = new JobClientImpl(new TestClock(), jobScheduler, jdbi);
    var storage = new StorageDo();
    storage.mountedPath = UUID.randomUUID().toString();
    storage.name = UUID.randomUUID().toString();
    storage.capacityInBytes = 1;
    storage.uuid = UUID.randomUUID();
    storage.freeInBytes = 1;
    storage.url = "foo";
    storage.storageType = StorageType.NFS;

    jdbi.useExtension(StorageDao.class, storageDao -> storage.id = storageDao.insert(storage));

    var vmImpl = new VmApiImpl(jobClient, jdbi, jsonUtil);

    var req = new CreateVirtualMachineRequest();
    req.setCpu(1L);
    req.setMemory(1L);
    req.setName(UUID.randomUUID().toString());

    var diskReq = new DiskRequest();
    diskReq.setSize(1L);
    diskReq.setStorageId(storage.uuid.toString());

    req.setDisks(List.of(diskReq));
    var vmRsp = vmImpl.createVm(req);

    var jobApi = new JobApiImpl(jdbi.onDemand(JobDao.class));

    var job = jobApi.queryJob(vmRsp.getJobId());
    assertEquals(AsyncRequestStatus.QUEUED, job.getStatus());
  }
}