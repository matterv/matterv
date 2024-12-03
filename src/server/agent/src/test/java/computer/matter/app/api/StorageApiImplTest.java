package computer.matter.app.api;

import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.agent.storage.StorageFactoryImpl;
import computer.matter.common.test.DbTestBase;
import computer.matter.host.api.StorageApi;
import computer.matter.host.model.UploadFileReq;
import computer.matter.storage.StorageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StorageApiImplTest extends DbTestBase {
  StorageApi storageApi;
  UUID storageId;

  @BeforeEach
  public void setup() {
    super.setup();

    var storageDao = jdbi.onDemand(StorageDao.class);
    var so = new StorageDo();
    so.storageType = StorageType.NFS;
    so.mountedPath = "/home";
    so.name = "nfs";
    so.url = "nfs://mnt";
    so.uuid = UUID.randomUUID();
    so.id = storageDao.insert(so);

    storageApi = new StorageApiImpl(jdbi, new StorageFactoryImpl());
    storageId = so.uuid;
  }

  @Test
  void listFiles() {

    var rsp = storageApi.listFiles(storageId.toString(), 10, "/data", null);
    assertEquals("f543be51-c06f-4e80-b0f7-0f18298fc0b2", rsp.getItems().getFirst().getName());
  }

  @Test
  void uploadFile() {
    var input = new ByteArrayInputStream("hello".getBytes());
    var req = new UploadFileReq();
    req.setData(UUID.randomUUID().toString());
    req.setFilePath("/" + UUID.randomUUID().toString());
    req.setOffset(0L);
    storageApi.uploadFile(storageId.toString(), req);
  }
}