package computer.matter.app.api;

import computer.matter.agent.common.vm.StorageFactory;
import computer.matter.agent.db.model.StorageDao;
import computer.matter.agent.db.model.StorageDo;
import computer.matter.host.api.StorageApi;
import computer.matter.host.model.AddStorageRequest;
import computer.matter.host.model.CreateFileReq;
import computer.matter.host.model.ListFilesResponse;
import computer.matter.host.model.ModelFile;
import computer.matter.host.model.Storage;
import computer.matter.host.model.UploadFileReq;
import computer.matter.pagination.PaginationUtil;
import computer.matter.storage.StorageType;
import org.jdbi.v3.core.Jdbi;

import java.util.Base64;
import java.util.UUID;
import java.util.regex.Pattern;

public class StorageApiImpl implements StorageApi {
  private static final Pattern CONTENT_RANGE_PATTERN = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");
  private final Jdbi jdbi;
  private final StorageFactory storageFactory;

  public StorageApiImpl(Jdbi jdbi, StorageFactory storageFactory) {
    this.jdbi = jdbi;
    this.storageFactory = storageFactory;
  }

  private Storage fromStorageDo(StorageDo storageDo) {
    var ss = new Storage();
    ss.setId(storageDo.uuid.toString());
    ss.setName(storageDo.name);
    ss.setCapacityInBytes(storageDo.capacityInBytes);
    ss.setFreeInBytes(storageDo.freeInBytes);
    ss.setMountPoint(storageDo.mountedPath);
    ss.setStorageType(computer.matter.host.model.StorageType.fromString(storageDo.storageType.name()));
    return ss;
  }

  @Override
  public Storage addStorage(AddStorageRequest addStorageRequest) {
    var storageDo = new StorageDo();
    storageDo.name = addStorageRequest.getName();
    storageDo.mountedPath = addStorageRequest.getPath();
    storageDo.storageType = StorageType.valueOf(addStorageRequest.getType().name());
    storageDo.url = "file://" + addStorageRequest.getPath();
    storageDo.uuid = UUID.randomUUID();
    var storageDao = jdbi.onDemand(StorageDao.class);
    storageDao.insert(storageDo);
    return fromStorageDo(storageDo);
  }

  @Override
  public void createFile(String storageId, CreateFileReq createFileReq) {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storageDo = storageDao.findByUUID(storageId);
    if (storageDo == null) {
      throw new IllegalArgumentException("Invalid storageId: " + storageId);
    }
    var storage = storageFactory.getStorage(storageDo);

    storage.createFile(createFileReq.getPath(), createFileReq.getName(), createFileReq.getType());
  }

  @Override
  public ListFilesResponse listFiles(String storageId, Integer limit, String path, String page) {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storageDo = storageDao.findByUUID(storageId);
    if (storageDo == null) {
      throw new IllegalArgumentException("Invalid storageId: " + storageId);
    }
    var pageNumber = 0;
    if (page != null) {
      pageNumber = Integer.parseInt(page);
    }
    var storage = storageFactory.getStorage(storageDo);

    var files = storage.listFiles(path, pageNumber, limit).stream().map(f -> {
      var mf = new ModelFile();
      mf.setType(ModelFile.TypeEnum.valueOf(f.type().name().toUpperCase()));
      mf.setName(f.name());
      return mf;
    }).toList();
    var rsp = new ListFilesResponse();
    rsp.setItems(files);
    if (!files.isEmpty()) {
      rsp.setNextPage(String.valueOf(pageNumber + 1));
    }
    return rsp;
  }

  @Override
  public void uploadFile(String storageId, UploadFileReq uploadFileReq) {
    var storageDao = jdbi.onDemand(StorageDao.class);
    var storageDo = storageDao.findByUUID(storageId);
    if (storageDo == null) {
      throw new IllegalArgumentException("Invalid storageId: " + storageId);
    }
    var storage = storageFactory.getStorage(storageDo);

    var rawData = Base64.getDecoder().decode(uploadFileReq.getData());
    storage.uploadFile(uploadFileReq.getFilePath(), uploadFileReq.getOffset(), rawData);
  }
}
