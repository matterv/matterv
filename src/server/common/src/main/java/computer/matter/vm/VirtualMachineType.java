package computer.matter.vm;

public enum VirtualMachineType {
  Q35("q35");

  private final java.lang.String value;

  VirtualMachineType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
