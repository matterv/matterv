package computer.matter.qemu.client;

public class QemuConnectionFailure extends RuntimeException {
  public QemuConnectionFailure(String message, Exception e) {
    super(message, e);
  }
}
