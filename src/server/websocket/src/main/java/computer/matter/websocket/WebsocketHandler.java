package computer.matter.websocket;

import io.dropwizard.core.setup.Environment;
import jakarta.servlet.ServletContext;
import jakarta.websocket.DeploymentException;
import jakarta.websocket.server.ServerContainer;
import jakarta.websocket.server.ServerEndpointConfig;
import org.eclipse.jetty.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer;

import java.time.Duration;

public class WebsocketHandler implements JakartaWebSocketServletContainerInitializer.Configurator {
  private final Environment environment;
  private EndpointInfo endpoint;

  public WebsocketHandler(Environment environment) {
    this.environment = environment;
  }

  public void addEndpoint(EndpointInfo endpoint) {
    this.endpoint = endpoint;
  }

  public void initialize() {
    JakartaWebSocketServletContainerInitializer.configure(environment.getApplicationContext(), this);
  }

  @Override
  public void accept(ServletContext servletContext, ServerContainer serverContainer) {
    serverContainer.setDefaultMaxSessionIdleTimeout(Duration.ofMinutes(1).toMillis());
    var serverEndpointConfig = ServerEndpointConfig.Builder.create(endpoint.endpoint(), endpoint.path()).configurator(endpoint.configurator())
        .build();
    try {
      serverContainer.addEndpoint(serverEndpointConfig);
    } catch (DeploymentException e) {
      throw new RuntimeException(e);
    }
  }


}