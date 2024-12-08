package computer.matter.websocket;

import jakarta.websocket.server.ServerEndpointConfig;

public record EndpointInfo(Class<?> endpoint, String path,
                           ServerEndpointConfig.Configurator configurator) {
}
