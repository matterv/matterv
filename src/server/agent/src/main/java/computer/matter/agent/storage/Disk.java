package computer.matter.agent.storage;

import computer.matter.vm.VirtualDiskFileType;

public class Disk {
  public VirtualDiskFileType fileType;
  public String path;
  public long id;
  public boolean connected;

  public Disk() {

  }

  public Disk(VirtualDiskFileType fileType, String path, long id) {
    this.fileType = fileType;
    this.path = path;
    this.id = id;
  }
}
