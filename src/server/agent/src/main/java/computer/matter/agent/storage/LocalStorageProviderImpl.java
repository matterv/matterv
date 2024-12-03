package computer.matter.agent.storage;

import computer.matter.agent.common.storage.LocalStorageProvider;
import computer.matter.host.model.Storage;
import computer.matter.host.model.StorageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LocalStorageProviderImpl implements LocalStorageProvider {
  private final Logger logger = LoggerFactory.getLogger(LocalStorageProviderImpl.class);

  public List<Storage> discoverStorages() {
    var storages = new ArrayList<Storage>();
    ProcessBuilder pb = new ProcessBuilder("bash", "-c",
            "findmnt -t xfs,ext4,ext3,brtfs -O rw -n -l -o TARGET | xargs df -h --output=target,size,avail | tail -n +2 | tr -s ' ' ','");
    try {
      var process = pb.start();
      try (var reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
        String line;
        while ((line = reader.readLine()) != null) {
          String[] parts = line.split(",");
          if (parts.length == 3) {
            var storage = new Storage();
            storage.setId(UUID.randomUUID().toString());
            storage.setName(parts[0]);
            storage.setMountPoint(parts[0]);
            storage.setCapacityInBytes(StorageSizeConverter.convertToBytes(parts[1]));
            storage.setFreeInBytes(StorageSizeConverter.convertToBytes(parts[2]));
            storage.setStorageType(StorageType.LOCAL);
            storages.add(storage);
          }
        }
      }
      var exitCode = process.waitFor();
      if (exitCode != 0) {
        logger.error("Failed to list mnts: {}", exitCode);
      }
    } catch (IOException | InterruptedException e) {
      logger.error("Failed to list mnts", e);
    }

    return storages;
  }
}
