package computer.matter.vcenter;

import com.sun.istack.NotNull;
import com.sun.xml.ws.api.BindingID;
import com.sun.xml.ws.api.WSBinding;
import com.sun.xml.ws.api.databinding.DatabindingConfig;
import com.sun.xml.ws.api.databinding.DatabindingFactory;
import com.sun.xml.ws.api.model.wsdl.WSDLPort;
import com.sun.xml.ws.api.server.SDDocumentSource;
import com.sun.xml.ws.binding.BindingImpl;
import com.sun.xml.ws.model.AbstractSEIModelImpl;

import javax.xml.namespace.QName;

public class SoapModelBuilder {
  public static AbstractSEIModelImpl build(String interfaceName, Object serviceImpl) {
    var bindingId = BindingID.parse(serviceImpl.getClass());
    var binding = BindingImpl.create(bindingId);
    return createSEIModel(null, serviceImpl.getClass(), new QName("urn:internalvim25", "EsxiVimServerService"), new QName("urn:internalvim25", "VimPortTypePort"), binding, null);
  }

  private static AbstractSEIModelImpl createSEIModel(WSDLPort wsdlPort,
                                             Class<?> implType, @NotNull QName serviceName, @NotNull QName portName, WSBinding binding,
                                             SDDocumentSource primaryWsdl) {
    DatabindingFactory fac = DatabindingFactory.newInstance();
    DatabindingConfig config = new DatabindingConfig();
    config.setEndpointClass(implType);
    config.getMappingInfo().setServiceName(serviceName);
    config.setWsdlPort(wsdlPort);
    config.setClassLoader(implType.getClassLoader());
    config.getMappingInfo().setPortName(portName);
    if (primaryWsdl != null) config.setWsdlURL(primaryWsdl.getSystemId());

    com.sun.xml.ws.db.DatabindingImpl rt = (com.sun.xml.ws.db.DatabindingImpl) fac.createRuntime(config);
    return (AbstractSEIModelImpl) rt.getModel();
  }
}
