package computer.matter.vm;

public final class VirtualDisk extends VirtualDevice {
  public String file;
  public VirtualDiskControllerType controllerType;
  public VirtualDiskFileType fileType;
  public long sizeInGB;
}
