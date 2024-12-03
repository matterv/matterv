package computer.matter.qemu.common;

public class QemuCommandExecutionFailed extends RuntimeException {
    public QemuCommandExecutionFailed(Exception e) {
        super(e);
    }

    public QemuCommandExecutionFailed(String e) {
        super(e);
    }
}
