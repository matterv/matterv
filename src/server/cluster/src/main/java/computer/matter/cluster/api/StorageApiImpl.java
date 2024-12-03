package computer.matter.cluster.api;

import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.HostDo;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.StorageDo;
import computer.matter.cluster.model.CreateFileReq;
import computer.matter.cluster.model.ListFilesResponse;
import computer.matter.cluster.model.ModelFile;
import computer.matter.cluster.model.PaginatedStorageResponse;
import computer.matter.cluster.model.Storage;
import computer.matter.cluster.model.StorageType;
import computer.matter.cluster.model.UploadFileReq;
import computer.matter.host.ApiException;
import computer.matter.pagination.PaginationUtil;
import computer.matterv.host.client.ApiClientProvider;
import org.jdbi.v3.core.Jdbi;

import java.security.InvalidParameterException;


public class StorageApiImpl implements StorageApi {
  private final StorageDao storageDao;
  private final ApiClientProvider apiClientProvider;
  private final Jdbi jdbi;

  public StorageApiImpl(StorageDao storageDao, ApiClientProvider apiClientProvider, Jdbi jdbi) {
    this.storageDao = storageDao;
    this.apiClientProvider = apiClientProvider;
    this.jdbi = jdbi;
  }

  private Storage from(computer.matter.cluster.db.model.StorageDo storageDo) {
    var storage = new Storage();
    storage.setStorageType(StorageType.fromString(storageDo.storageType.name()));
    storage.setName(storageDo.name);
    storage.setId(storageDo.uuid.toString());
    storage.setMountPoint(storageDo.mountedPath);
    storage.setFreeInBytes(storageDo.freeInBytes);
    storage.setCapacityInBytes(storageDo.capacityInBytes);
    storage.setHostId(storageDo.hostUuid.toString());
    return storage;
  }

  private StorageHost getHostFromStorageId(String storageId) {
    var storage = storageDao.findByUUID(storageId);
    if (storage == null) {
      throw new InvalidParameterException("Storage not found: " + storageId);
    }

    var hostDao = jdbi.onDemand(HostDao.class);


    var host = hostDao.findByUuid(storage.hostUuid);
    if (host == null) {
      throw new InvalidParameterException("Host not found: " + storage.hostUuid);
    }
    return new StorageHost(storage, host);
  }

  private computer.matter.host.client.model.CreateFileReq.TypeEnum fromType(CreateFileReq.TypeEnum type) {
    return switch (type) {
      case FILE:
        yield computer.matter.host.client.model.CreateFileReq.TypeEnum.FILE;
      case DIRECTORY:
        yield computer.matter.host.client.model.CreateFileReq.TypeEnum.DIRECTORY;
    };
  }

  @Override
  public void createFile(String storageId, CreateFileReq createFileReq) {
    var storageHost = getHostFromStorageId(storageId);
    var storageApi = apiClientProvider.storageApi(storageHost.hostDo.endpoint);
    var req = new computer.matter.host.client.model.CreateFileReq();
    req.setName(createFileReq.getName());
    req.setPath(createFileReq.getPath());
    req.setType(fromType(createFileReq.getType()));
    try {
      storageApi.createFile(storageHost.storageDo.uuidOnHost.toString(), req);
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Storage getStorage(String storageId) {
    var storage = storageDao.findByUUID(storageId);
    if (storage == null) {
      throw new InvalidParameterException("Storage not found: " + storageId);
    }

    return from(storage);
  }

  @Override
  public PaginatedStorageResponse getStorages(Integer limit, Integer page) {
    if (page == null) {
      page = 1;
    }
    var storages = storageDao.getAllInRange(page, limit);
    var response = new PaginatedStorageResponse();

    var pagedStorages = PaginationUtil.getPage(storages, page, limit).stream().map(this::from).toList();
    response.setItems(pagedStorages);
    if (!storages.isEmpty()) {
      response.setNextPage(String.valueOf(storages.getLast().id + 1));
    }
    return response;
  }

  @Override
  public ListFilesResponse listFiles(String storageId, String path, Integer limit, String page) {
    var storageHost = getHostFromStorageId(storageId);
    var storageApi = apiClientProvider.storageApi(storageHost.hostDo.endpoint);
    if (limit == null) {
      limit = 25;
    }
    try {
      var listFilesRsp = storageApi.listFiles(storageHost.storageDo.uuidOnHost.toString(), limit, path, page);
      var rsp = new ListFilesResponse();
      rsp.setItems(listFilesRsp.getItems().stream().map(this::from).toList());
      rsp.setNextPage(listFilesRsp.getNextPage());
      return rsp;
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  private computer.matter.host.client.model.UploadFileReq toReq(UploadFileReq uploadFileReq) {
    var req = new computer.matter.host.client.model.UploadFileReq();
    req.setData(uploadFileReq.getData());
    req.setOffset(uploadFileReq.getOffset());
    req.setFilePath(uploadFileReq.getFilePath());
    return req;
  }

  @Override
  public void uploadFile(String storageId, UploadFileReq uploadFileReq) {
    var storageHost = getHostFromStorageId(storageId);
    var storageApi = apiClientProvider.storageApi(storageHost.hostDo.endpoint);
    try {
      storageApi.uploadFile(storageHost.storageDo.uuidOnHost.toString(), toReq(uploadFileReq));
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  private ModelFile from(computer.matter.host.client.model.ModelFile file) {
    var modelFile = new ModelFile();
    modelFile.setName(file.getName());
    modelFile.setEncodedName(file.getEncodedName());
    modelFile.setSize(file.getSize());
    modelFile.setType(ModelFile.TypeEnum.fromString(file.getType().getValue()));
    modelFile.setModifiedAt(file.getModifiedAt());
    return modelFile;
  }

  record StorageHost(StorageDo storageDo, HostDo hostDo) {
  }
}
