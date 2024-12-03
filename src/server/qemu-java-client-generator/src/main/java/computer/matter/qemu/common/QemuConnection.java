package computer.matter.qemu.common;

public interface QemuConnection {
    String read();

    void write(String input);

    void connect();

    void close();
}
