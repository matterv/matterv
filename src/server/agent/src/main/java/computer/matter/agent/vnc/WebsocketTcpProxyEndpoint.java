package computer.matter.agent.vnc;

import computer.matter.agent.db.model.VirtualMachineDao;
import computer.matter.network.UnixDomainSocket;
import jakarta.websocket.CloseReason;
import jakarta.websocket.Endpoint;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.MessageHandler;
import jakarta.websocket.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

public class WebsocketTcpProxyEndpoint extends Endpoint implements MessageHandler.Whole<ByteBuffer> {
  private final Logger logger = LoggerFactory.getLogger(WebsocketTcpProxyEndpoint.class);
  private final VirtualMachineDao virtualMachineDao;
  private Session session;
  private UnixDomainSocket socket;

  public WebsocketTcpProxyEndpoint(VirtualMachineDao virtualMachineDao) {
    this.virtualMachineDao = virtualMachineDao;
  }


  record HostInfo(String vncPath) {
  }

  private HostInfo getHostInfo(URI reqUri) {
    var query = reqUri.getQuery();
    if (query == null) {
      throw new IllegalArgumentException("Missing query");
    }

    String vmId = null;

    var params = query.split("&");
    for (String param : params) {
      var kv = param.split("=");
      if (kv.length != 2) {
        throw new IllegalArgumentException("Invalid query parameter: " + param);
      }

      if (kv[0].equals("vmId")) {
        vmId = kv[1];
      }
    }

    if (vmId == null) {
      throw new IllegalArgumentException("Missing host and vmId parameters");
    }

    var vm = virtualMachineDao.findByUUID(vmId);
    if (vm == null) {
      throw new IllegalArgumentException("Invalid vm id " + vmId);
    }

    return new HostInfo(vm.config.vnc());
  }

  private void startTcpReader(URI reqUri) {
    var hostInfo = getHostInfo(reqUri);
    logger.info("open vnc socket: {}", hostInfo);
    socket = new UnixDomainSocket(hostInfo.vncPath);
    socket.connect();
    startTcpReaderThread();
  }

  @Override
  public void onOpen(Session session, EndpointConfig config) {
    logger.info("WebsocketTcpProxyEndpoint onOpen");
    this.session = session;
    session.addMessageHandler(this);
    startTcpReader(session.getRequestURI());
  }

  @Override
  public void onMessage(ByteBuffer message) {
    try {
      byte[] bytes = new byte[message.remaining()];
      message.get(bytes);
      socket.getWriter().write(bytes);
      socket.getWriter().flush();
    } catch (IOException e) {
      close();
    }
  }

  @Override
  public void onClose(final Session session, CloseReason closeReason) {
    logger.error("Close session, reason: {}", closeReason);
    close();
  }

  @Override
  public void onError(Session session, Throwable thr) {
    logger.error("Close session, error", thr);
    close();
  }

  private void startTcpReaderThread() {
    Thread readerThread = new Thread(() -> {
      try {
        byte[] buffer = new byte[4096];
        int read;
        while ((read = socket.getReader().read(buffer)) != -1) {
          if (session.isOpen()) {
            session.getBasicRemote().sendBinary(
                ByteBuffer.wrap(buffer, 0, read)
            );
          } else {
            break;
          }
        }
      } catch (IOException e) {
        close();
      }
    });
    readerThread.setDaemon(true);
    readerThread.start();
  }

  private void close() {
    try {
      if (socket != null) {
        socket.close();
      }
      if (session != null && session.isOpen()) {
        session.close();
      }
    } catch (IOException e) {
      logger.error("Close session error", e);
    }
  }
}
