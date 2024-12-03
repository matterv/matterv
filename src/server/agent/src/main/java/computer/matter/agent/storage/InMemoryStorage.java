package computer.matter.agent.storage;

import computer.matter.host.model.CreateFileReq;
import computer.matter.vm.VirtualDiskFileType;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class InMemoryStorage implements Storage {
  private final String rootDir;
  private final Map<String, List<File>> dirToFilesMap = new HashMap<>();

  public InMemoryStorage(String rootDir) {
    this.rootDir = rootDir;
    dirToFilesMap.put("/", new ArrayList<>());
  }

  @Override
  public Disk createDisk(long sizeInGB, UUID vmId, long diskId) {
    var disk = new Disk();
    disk.id = diskId;
    disk.path = UUID.randomUUID().toString();
    disk.fileType = VirtualDiskFileType.QCOW2;
    return disk;
  }

  @Override
  public List<File> listFiles(String path, long page, int limit) {
    return dirToFilesMap.get(path).stream().toList();
  }

  @Override
  public String createFile(String parentDir, String fileName, CreateFileReq.TypeEnum fileType) {
    dirToFilesMap.get(parentDir).add(new File(fileName, fileType));
    if (fileType == CreateFileReq.TypeEnum.DIRECTORY) {
      dirToFilesMap.put(parentDir + fileName, new ArrayList<>());
    }
    return parentDir + fileName;
  }

  @Override
  public boolean exists(String filePath) {
    return false;
  }

  @Override
  public Path fullPath(String filePath) {
    return null;
  }

  @Override
  public void uploadFile(String path, long offset, byte[] data) {

  }
}
