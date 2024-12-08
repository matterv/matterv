package computer.matter.websocket;

import jakarta.websocket.ClientEndpointConfig;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.DeploymentException;
import jakarta.websocket.WebSocketContainer;

import java.io.IOException;
import java.net.URI;

public class ClientEndpointFactory {
  public ClientEndpoint createClientEndpoint(URI uri) {
    WebSocketContainer container = ContainerProvider.getWebSocketContainer();
    var endpointConfig = ClientEndpointConfig.Builder.create().build();
    var endpoint = new ClientEndpoint();
    try {
      container.connectToServer(endpoint, endpointConfig, uri);
    } catch (DeploymentException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return endpoint;
  }
}
