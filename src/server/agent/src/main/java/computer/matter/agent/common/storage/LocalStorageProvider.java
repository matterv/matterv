package computer.matter.agent.common.storage;

import computer.matter.host.model.Storage;

import java.util.List;

public interface LocalStorageProvider {
  List<Storage> discoverStorages();
}
