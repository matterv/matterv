package computer.matter.qemu.client;

import computer.matter.qemu.common.QemuConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class QemuConnectionImpl implements QemuConnection {

  private final String qmpPath;
  private SocketChannel channel;
  private BufferedReader reader;
  private OutputStreamWriter writer;
  private boolean failed = false;
  private String greeting;

  public QemuConnectionImpl(String qmpPath) {
    this.qmpPath = qmpPath;
  }

  @Override
  public void connect() {
    var addr = UnixDomainSocketAddress.of(qmpPath);
    try {
      channel = SocketChannel.open(StandardProtocolFamily.UNIX);
      channel.connect(addr);
    } catch (IOException e) {
      throw new QemuConnectionFailure("Failed to connect to " + qmpPath, e);
    }

    reader = new BufferedReader(new InputStreamReader(Channels.newInputStream(channel)));
    writer = new OutputStreamWriter(Channels.newOutputStream(channel));
    greeting = read();
  }

  @Override
  public String read() {
    try {
      return reader.readLine();
    } catch (IOException e) {
      failed = true;
      throw new QemuConnectionFailure("Failed to read", e);
    }
  }

  @Override
  public void write(String data) {
    try {
      writer.write(data);
      writer.write("\n");
      writer.flush();
    } catch (IOException e) {
      failed = true;
      throw new QemuConnectionFailure("Failed to write", e);
    }
  }

  public String getGreeting() {
    return greeting;
  }

  @Override
  public void close() {
    try {
      reader.close();
      writer.close();
      channel.close();
    } catch (IOException e) {
      throw new QemuConnectionFailure("Failed to close", e);
    }

  }
}
