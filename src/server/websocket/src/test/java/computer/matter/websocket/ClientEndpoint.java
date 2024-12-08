package computer.matter.websocket;

import jakarta.websocket.CloseReason;
import jakarta.websocket.Endpoint;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.MessageHandler;
import jakarta.websocket.Session;

import java.io.IOException;
import java.util.function.Consumer;


public class ClientEndpoint extends Endpoint implements MessageHandler.Whole<String> {
  Session session = null;
  Consumer<String> f = null;

  @Override
  public void onClose(Session session, CloseReason closeReason) {
    int i = 0;
  }

  @Override
  public void onError(Session session, Throwable cause) {
    int i = 0;
  }

  @Override
  public void onOpen(Session session, EndpointConfig config) {
    session.addMessageHandler(this);
    this.session = session;
  }

  @Override
  public void onMessage(String message) {
    f.accept(message);
  }

  public void addRecvHandler(Consumer<String> f) {
    this.f = f;
  }

  public void sendMessage(String message) {
    try {
      this.session.getBasicRemote().sendText(message);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}