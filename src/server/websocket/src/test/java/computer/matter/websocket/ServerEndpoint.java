package computer.matter.websocket;

import jakarta.websocket.CloseReason;
import jakarta.websocket.Endpoint;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.MessageHandler;
import jakarta.websocket.RemoteEndpoint;
import jakarta.websocket.Session;

public class ServerEndpoint extends Endpoint implements MessageHandler.Whole<String> {
  private Session session;
  private RemoteEndpoint.Async remote;

  @Override
  public void onOpen(final Session session, EndpointConfig endpointConfig) {
    this.session = session;
    remote = session.getAsyncRemote();
    session.addMessageHandler(this);
  }

  @Override
  public void onClose(final Session session, CloseReason closeReason) {
    int i = 0;
  }

  @Override
  public void onError(final Session session, final Throwable throwable) {
    int b = 0;
  }

  @Override
  public void onMessage(String message) {
    remote.sendText(message);
  }
}