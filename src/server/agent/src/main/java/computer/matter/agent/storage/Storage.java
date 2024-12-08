package computer.matter.agent.storage;


import computer.matter.host.model.CreateFileReq;

import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface Storage {
  Disk createDisk(long sizeInGB, UUID vmId, long diskId);

  List<File> listFiles(String path, long page, int pageSize);

  String createFile(String parentDir, String fileName, CreateFileReq.TypeEnum fileType);

  boolean exists(String filePath);

  Path fullPath(String filePath);

  void uploadFile(String path, long offset, byte[] data);
}
