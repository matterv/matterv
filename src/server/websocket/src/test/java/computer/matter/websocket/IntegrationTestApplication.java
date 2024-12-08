package computer.matter.websocket;

import io.dropwizard.core.Application;
import io.dropwizard.core.Configuration;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class IntegrationTestApplication extends Application<Configuration> {
  private WebsocketBundle websocket = new WebsocketBundle();

  @Override
  public void initialize(Bootstrap<Configuration> bootstrap) {
    super.initialize(bootstrap);
    bootstrap.addBundle(websocket);
  }

  @Override
  public void run(Configuration configuration, Environment environment) throws Exception {
    websocket.addEndpoint(new EndpointInfo(ServerEndpoint.class, "/pingpong", null));
  }

}
