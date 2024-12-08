package computer.matter.agent.common.vm;

import computer.matter.agent.db.model.StorageDo;
import computer.matter.agent.storage.Storage;

public interface StorageFactory {
  Storage getStorage(StorageDo storageDo);
}
