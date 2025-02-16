package computer.matter.vm;

public final class VirtualDisk extends VirtualDevice {
  public String file;
  public VirtualDiskFileType fileType;
  public long sizeInGB;
  public long controllerId;
}
