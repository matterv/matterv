package computer.matter.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class UnixDomainSocket {
  private final String path;
  private SocketChannel channel;

  public InputStream getReader() {
    return reader;
  }

  public OutputStream getWriter() {
    return writer;
  }

  private InputStream reader;
  private OutputStream writer;

  public UnixDomainSocket(String path) {
    this.path = path;
  }

  public void connect() {
    try {
      channel = SocketChannel.open(StandardProtocolFamily.UNIX);
      var addr = UnixDomainSocketAddress.of(path);
      channel.connect(addr);

      reader = Channels.newInputStream(channel);
      writer = Channels.newOutputStream(channel);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void close() {
    try {
      reader.close();
      writer.close();
      channel.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
