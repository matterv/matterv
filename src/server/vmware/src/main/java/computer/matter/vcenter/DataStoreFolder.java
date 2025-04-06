package computer.matter.vcenter;


import com.vmware.vim25.ManagedObjectReference;
import computer.matter.db.cluster.StorageDao;

import java.util.ArrayList;
import java.util.List;

public class DataStoreFolder extends Folder{
  private final StorageDao storageDao;
  public DataStoreFolder(String name, String value, StorageDao storageDao) {
    super(name, value, new ArrayList<>());
    this.storageDao = storageDao;
  }

  @Override
  public List<ManagedObjectReference> getChildEntity() {
    return storageDao.getAll().stream().map(storage -> {
      var mo = new ManagedObjectReference();
      mo.setValue("storage-" + storage.id);
      mo.setType(ManagedObjectType.Datastore.name());
      return mo;
    }).toList();
  }
}
