package computer.matter.vm;

public enum VirtualDiskFileType {
  RAW("raw"),
  QCOW2("qcow2"),
  ISO("iso");

  private final String value;

  VirtualDiskFileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
