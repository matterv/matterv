package computer.matter.vcenter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.xml.ws.api.message.Message;
import com.sun.xml.ws.api.streaming.XMLStreamWriterFactory;
import com.sun.xml.ws.message.jaxb.JAXBMessage;
import com.sun.xml.ws.model.AbstractSEIModelImpl;
import com.sun.xml.ws.model.JavaMethodImpl;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.MimeHeaders;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.dom.DOMSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class SoapHandler implements HttpHandler {
  final Logger logger = LoggerFactory.getLogger(SoapHandler.class);
  private final Map<String, MethodInfo> operationMethods = new HashMap<>();
  private final String interfaceName;
  private final Object serviceImpl;
  private final AbstractSEIModelImpl model;

  public SoapHandler(String interfaceName, Object serviceImpl) {
    this.interfaceName = interfaceName;
    this.serviceImpl = serviceImpl;
    try {
      initializeMethodMap();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    model = SoapModelBuilder.build(interfaceName, serviceImpl);
  }

  private void initializeMethodMap() throws ClassNotFoundException {
    Class<?> serviceClass = Class.forName(interfaceName);

    for (Method method : serviceClass.getMethods()) {
      WebMethod webMethod = method.getAnnotation(WebMethod.class);
      RequestWrapper requestWrapper = method.getAnnotation(RequestWrapper.class);
      ResponseWrapper responseWrapper = method.getAnnotation(ResponseWrapper.class);

      if (webMethod != null && requestWrapper != null && responseWrapper != null) {
        String operationName = webMethod.operationName().isEmpty() ?
                method.getName() : webMethod.operationName();

        // Create MethodInfo object with all necessary details
        MethodInfo methodInfo = new MethodInfo();
        methodInfo.method = method;
        methodInfo.operationName = operationName;
        methodInfo.requestClassName = requestWrapper.className();
        methodInfo.responseClassName = responseWrapper.className();
        methodInfo.requestLocalName = requestWrapper.localName();
        methodInfo.responseLocalName = responseWrapper.localName();
        methodInfo.targetNamespace = requestWrapper.targetNamespace();

        // Get WebResult info
        WebResult webResult = method.getAnnotation(WebResult.class);
        if (webResult != null) {
          methodInfo.resultName = webResult.name();
        }

        // Get WebParam annotations to map request class fields to method parameters
        methodInfo.paramMapping = new HashMap<>();
        Annotation[][] paramAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < paramAnnotations.length; i++) {
          for (Annotation annotation : paramAnnotations[i]) {
            if (annotation instanceof WebParam webParam) {
              methodInfo.paramMapping.put(webParam.name(), i);
              break;
            }
          }
        }

        operationMethods.put(operationName, methodInfo);
      }
    }
  }

  public Message handle(byte[] message) throws Exception {
    // Parse the SOAP message
    MessageFactory messageFactory = MessageFactory.newInstance();
    SOAPMessage soapMessage = messageFactory.createMessage(
            new MimeHeaders(),
            new ByteArrayInputStream(message)
    );

    logger.debug("request: {} ", new String(message));
    // Process the SOAP message and generate response
    return handleSoapMessage(soapMessage);
  }

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    try {
      // Only handle POST requests for SOAP
      if (!"POST".equals(exchange.getRequestMethod())) {

        if (!exchange.getRequestMethod().equalsIgnoreCase("GET")) {
          exchange.sendResponseHeaders(405, 0);
          exchange.getResponseBody().close();
          return;
        }

        var request = exchange.getRequestURI().getPath();
        if (request.equalsIgnoreCase("/sdk/service")) {
          var rsp = """
                  <?xml version="1.0" encoding="UTF-8"?><service><instanceId>527ff238-cc91-f470-b2af-bd86f6191beb</instanceId></service>
                  """;
          exchange.getResponseHeaders().add("Content-Type", "text/xml; charset=utf-8");
          exchange.sendResponseHeaders(200, rsp.length());
          try (OutputStream os = exchange.getResponseBody()) {
            os.write(rsp.getBytes());
          }
          return;
        } else if (request.equalsIgnoreCase("/sdk/vimServiceVersions.xml")) {
          var rsp = """
                  <?xml version="1.0" encoding="UTF-8" ?><namespaces version="1.0"><namespace><name>urn:vim25</name><version>7.0.3.0</version><priorVersions><version>7.0.2.1</version><version>7.0.2.0</version><version>7.0.1.1</version><version>7.0.1.0</version><version>7.0.0.2</version><version>7.0.0.0</version><version>6.9.1</version><version>6.8.7</version><version>6.7.3</version><version>6.7.2</version><version>6.7.1</version><version>6.7</version><version>6.5</version><version>6.0</version><version>5.5</version><version>5.1</version><version>5.0</version><version>4.1</version><version>4.0</version></priorVersions></namespace></namespaces>
                  """;

          exchange.getResponseHeaders().add("Content-Type", "text/xml; charset=utf-8");
          exchange.sendResponseHeaders(200, rsp.length());
          try (OutputStream os = exchange.getResponseBody()) {
            os.write(rsp.getBytes());
          }
          return;
        }
        logger.debug("unknown request: {}", request);
      }

      // Read the request body
      byte[] requestBodyBytes = exchange.getRequestBody().readAllBytes();


      var responseMessage = handle(requestBodyBytes);
      var buffer = new ByteArrayOutputStream();
      var xmlWriter = XMLStreamWriterFactory.create(buffer, "UTF-8");
      responseMessage.writeTo(xmlWriter);
      xmlWriter.flush();
      logger.debug("response: {} ", buffer);
      // Set response headers
      exchange.getResponseHeaders().add("Content-Type", "text/xml; charset=utf-8");
      exchange.sendResponseHeaders(200, buffer.size());

      // Write response
      try (OutputStream os = exchange.getResponseBody()) {
        os.write(buffer.toByteArray());
      }
    } catch (Exception e) {
      e.printStackTrace();
      String errorMessage = "Error processing SOAP request: " + e.getMessage();
      exchange.sendResponseHeaders(500, errorMessage.length());
      try (OutputStream os = exchange.getResponseBody()) {
        os.write(errorMessage.getBytes(StandardCharsets.UTF_8));
      }
    }
  }

  private Message handleSoapMessage(SOAPMessage soapMessage) throws Exception {
    SOAPBody soapBody = soapMessage.getSOAPBody();
    // Find which operation is being called by examining the first child element of the SOAP body
    NodeList bodyChildren = soapBody.getChildNodes();
    for (int i = 0; i < bodyChildren.getLength(); i++) {
      Node node = bodyChildren.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        SOAPElement operationElement = (SOAPElement) node;
        String operationName = operationElement.getLocalName();
        var m = model.getJavaMethod(operationElement.getElementQName());

        // Look up the method info
        MethodInfo methodInfo = operationMethods.get(operationName);
        if (methodInfo != null) {
          methodInfo.javaMethod = m;
          return processOperation(operationElement, methodInfo);
        } else {
          System.out.println("Unknown operation: " + operationName);
        }
      }
    }

    throw new SOAPException("Unsupported operation or missing parameters");
  }

  private Message processOperation(Element operationElement, MethodInfo methodInfo) throws Exception {
    JAXBContext jaxbContext = model.getJAXBContext();
    if (jaxbContext == null) {
      throw new SOAPException("No JAXB context found for " + methodInfo.requestClassName);
    }

    // Unmarshal the operation element to the request object
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    Object requestObj = unmarshaller.unmarshal(new DOMSource(operationElement), Class.forName(methodInfo.requestClassName));

    // Extract the actual request object from the JAXBElement if needed
    if (requestObj instanceof JAXBElement) {
      requestObj = ((JAXBElement<?>) requestObj).getValue();
    }

    // Map the request object fields to method parameters
    Object[] methodParams = new Object[methodInfo.paramMapping.size()];
    for (Map.Entry<String, Integer> entry : methodInfo.paramMapping.entrySet()) {
      String fieldName = entry.getKey();
      int paramIndex = entry.getValue();

      // Find the field in the request class
      try {
        Field field = requestObj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        methodParams[paramIndex] = field.get(requestObj);
      } catch (NoSuchFieldException e) {
        // Try with getter method convention
        String getterName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        try {
          Method getter = requestObj.getClass().getMethod(getterName);
          methodParams[paramIndex] = getter.invoke(requestObj);
        } catch (Exception ex) {
          System.err.println("Error extracting parameter " + fieldName + ": " + ex.getMessage());
          methodParams[paramIndex] = null;
        }
      }
    }

    // Invoke the service method
    Object result = methodInfo.method.invoke(serviceImpl, methodParams);
    if (result == null) {
      logger.debug("Method {} returned null", methodInfo.method.getName());
    }
    // Create the response SOAP message
    return createSoapResponse(result, methodInfo);
  }


  private Message createSoapResponse(Object result, MethodInfo methodInfo) throws Exception {

    // Create the response wrapper object using reflection
    Class<?> responseClass = Class.forName(methodInfo.responseClassName);
    Object responseObject = responseClass.getDeclaredConstructor().newInstance();

    // Set the result to the wrapper's returnval field
    if (result != null) {
      try {
        // Try using a setter method first
        String setterName = "set" + methodInfo.resultName.substring(0, 1).toUpperCase() + methodInfo.resultName.substring(1);
        Method setter = responseClass.getMethod(setterName, result.getClass());
        setter.invoke(responseObject, result);
      } catch (Exception e) {
        // Fall back to direct field access
        try {
          Field field = responseClass.getDeclaredField(methodInfo.resultName);
          field.setAccessible(true);
          field.set(responseObject, result);
        } catch (Exception ex) {
          System.err.println("Failed to set result on response object: " + ex.getMessage());
          throw ex;
        }
      }
    }

    // Get the JAXB context for the response class
//    var callInfo = new JavaCallInfo();
//    callInfo.setMethod(methodInfo.javaMethod.getMethod());
//    callInfo.setReturnValue(responseObject);
//    var r = (Packet)model.getDatabinding().serializeResponse(callInfo);
//    ByteArrayBuffer buf = new ByteArrayBuffer();
//    var codec = r.getCodec();
//    r.getCodec().encode(r, buf);
//    System.out.println("buf: " + buf.toString());
    // Create a DOM document to hold the marshalled XML
    var xmlBridge = methodInfo.javaMethod.getResponseParameters().get(0).getXMLBridge();

    return JAXBMessage.create(xmlBridge, responseObject, model.getWSBinding().getSOAPVersion());
  }

  private void serializeResultToSoap(Object result, SOAPElement element) throws Exception {
    if (result == null) {
      return;
    }

    Class<?> resultType = result.getClass();

    if (resultType == String.class || resultType.isPrimitive() ||
            Number.class.isAssignableFrom(resultType) || resultType == Boolean.class) {
      // Simple types
      element.addTextNode(result.toString());
    } else {
      try {
        // For ManagedObjectReference
        if (resultType.getName().endsWith("ManagedObjectReference")) {
          String type = (String) resultType.getMethod("getType").invoke(result);
          String value = (String) resultType.getMethod("getValue").invoke(result);

          element.setAttribute("type", type);
          element.addTextNode(value);
        }
        // For other complex types, you'd need more detailed serialization
        // If using JAXB, you could marshal the result object to XML
      } catch (Exception e) {
        e.printStackTrace();
        element.addTextNode(result.toString());
      }
    }
  }

  private static class MethodInfo {
    Method method;
    String operationName;
    String requestClassName;
    String responseClassName;
    String requestLocalName;
    String responseLocalName;
    String targetNamespace;
    String resultName;
    JavaMethodImpl javaMethod;
    Map<String, Integer> paramMapping; // Maps parameter names to method parameter indices
  }

}
