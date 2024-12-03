package computer.matter.agent.vnc;

import computer.matter.agent.db.model.VirtualMachineDao;
import jakarta.websocket.server.ServerEndpointConfig;

public class EndpointConfigurator extends ServerEndpointConfig.Configurator {
  private final VirtualMachineDao virtualMachineDao;

  public EndpointConfigurator(VirtualMachineDao virtualMachineDao) {
    this.virtualMachineDao = virtualMachineDao;
  }

  @Override
  public <T> T getEndpointInstance(Class<T> endpointClass) throws InstantiationException {
    try {
      return endpointClass.getConstructor(VirtualMachineDao.class).newInstance(virtualMachineDao);
    } catch (Exception e) {
      String errorMsg = String.format("%s: %s", e.getClass().getName(), e.getMessage());
      InstantiationException instantiationException = new InstantiationException(errorMsg);
      instantiationException.initCause(e);
      throw instantiationException;
    }
  }
}
