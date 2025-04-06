package computer.matter.storage;

public enum StorageStatus {
  INITIAL("Initial"),

  READY("READY");

  private final String value;

  StorageStatus(String value) {
    this.value = value;
  }

  public String toString() {
    return String.valueOf(value);
  }

}
