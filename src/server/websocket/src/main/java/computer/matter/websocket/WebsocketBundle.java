package computer.matter.websocket;

import io.dropwizard.core.Configuration;
import io.dropwizard.core.ConfiguredBundle;
import io.dropwizard.core.setup.Environment;

public class WebsocketBundle implements ConfiguredBundle<Configuration> {
  private WebsocketHandler handler;

  public WebsocketBundle() {
  }

  public void addEndpoint(EndpointInfo endpoint) {
    handler.addEndpoint(endpoint);
  }

  public void run(Configuration configuration, Environment environment) {
    handler = new WebsocketHandler(environment);
    var serverFactory = configuration.getServerFactory();
    var factoryWrapper = new ServerFactoryWrapper(serverFactory, handler);
    configuration.setServerFactory(factoryWrapper);
  }

}
