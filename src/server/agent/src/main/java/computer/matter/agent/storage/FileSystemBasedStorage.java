package computer.matter.agent.storage;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;
import computer.matter.host.model.CreateFileReq;
import computer.matter.os.CommandExecutor;
import computer.matter.os.OsUtil;
import computer.matter.vm.VirtualDiskFileType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.List;
import java.util.UUID;

public class FileSystemBasedStorage implements Storage {
  private final Logger logger = LoggerFactory.getLogger(FileSystemBasedStorage.class);

  private final FileSystem fileSystem;
  private final String rootDir;

  FileSystemBasedStorage(String rootDir) {
    this.rootDir = rootDir;
    if (OsUtil.isMacOs()) {
      fileSystem = Jimfs.newFileSystem(Configuration.unix().toBuilder().setAttributeViews("basic", "posix").build());
      var p = fileSystem.getPath(rootDir);
      try {
        Files.createDirectories(p);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    } else {
      fileSystem = FileSystems.getDefault();
    }
  }

  @Override
  public Disk createDisk(long sizeInGB, UUID vmID, long diskId) {

    var path = fileSystem.getPath(rootDir, vmID.toString(), "disk_" + diskId + ".qcow2");

    try {
      var parent = path.getParent();
      Files.createDirectories(parent);
      var cmd = "qemu-img create -f qcow2 " + path + " " + sizeInGB;
      var result = CommandExecutor.executeCommand(cmd);
      if (result.exitCode() != 0) {
        logger.error("Failed to execute command: {}, error message: {}", cmd, result.output());
        throw new RuntimeException("Failed to create disk");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

      return new Disk(VirtualDiskFileType.QCOW2, path.toString(), diskId);
  }

  @Override
  public List<File> listFiles(String path, long page, int pageSize) {

    try {
      try (var paths = Files
              .list(fileSystem.getPath(rootDir, path))) {
        return
                paths.sorted(Path::compareTo).skip(page * pageSize).limit(pageSize).map(p -> new File(p.getFileName().toString(),
                                Files.isDirectory(p) ? CreateFileReq.TypeEnum.DIRECTORY : CreateFileReq.TypeEnum.FILE))
                        .toList();
      }
    } catch (IOException e) {
      logger.error("Failed to list files", e);
      return List.of();
    }
  }

  @Override
  public String createFile(String parentDir, String fileName, CreateFileReq.TypeEnum fileType) {
    var p = fileSystem.getPath(rootDir, parentDir, fileName);
    try {
      if (fileType == CreateFileReq.TypeEnum.FILE) {
        Files.createFile(p, PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwxrwx---")));
      } else {
        Files.createDirectories(p);
      }
    } catch (FileAlreadyExistsException ignored) {
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return parentDir + "/" + fileName;
  }

  @Override
  public boolean exists(String filePath) {
    var p = fileSystem.getPath(rootDir, filePath);
    return p.toFile().exists();
  }

  @Override
  public Path fullPath(String filePath) {
    return fileSystem.getPath(rootDir, filePath);
  }

  @Override
  public void uploadFile(String filePath, long offset, byte[] data) {
    var path = fileSystem.getPath(rootDir, filePath);
    if (OsUtil.isMacOs()) {
      return;
    }

    try {
      try (var raf = new RandomAccessFile(path.toFile(), "rw");
           var inputStream = new ByteArrayInputStream(data)
      ) {

        raf.seek(offset);

        byte[] buffer = new byte[8192];
        int bytesRead;
        long totalBytesWritten = 0;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
          raf.write(buffer, 0, bytesRead);
          totalBytesWritten += bytesRead;
        }

        // Verify that we wrote the expected number of bytes
        if (totalBytesWritten != (data.length)) {
          throw new IllegalStateException("bytes written does not match");

        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
