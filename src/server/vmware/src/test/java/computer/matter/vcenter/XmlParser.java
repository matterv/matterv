package computer.matter.vcenter;

import com.sun.xml.ws.model.AbstractSEIModelImpl;
import com.vmware.vim25.VirtualMachineImportSpec;
import computer.matter.cluster.api.VmApi;
import org.jdbi.v3.core.Jdbi;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.util.Iterator;

public class XmlParser {
  private final AbstractSEIModelImpl model;
  public XmlParser(Object service) {
    model = SoapModelBuilder.build("com.vmware.vim25.VimPortType", service);
  }
  public <T> T parse(String xml, Class<T> clss) {
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(new InputSource(new StringReader(xml)));

      XPath xpath = XPathFactory.newInstance().newXPath();
      xpath.setNamespaceContext(new NamespaceContext() {
        @Override
        public String getNamespaceURI(String prefix) {
          switch (prefix) {
            case "soapenv":
              return "http://schemas.xmlsoap.org/soap/envelope/";
            case "vim25":
              return "urn:internalvim25";
            default:
              return XMLConstants.NULL_NS_URI;
          }
        }

        @Override
        public String getPrefix(String namespaceURI) {
          return null;
        }

        @Override
        public Iterator<String> getPrefixes(String namespaceURI) {
          return null;
        }
      });

      String xpathExpression = "/soapenv:Envelope/soapenv:Body/*";

      var expr = xpath.compile(xpathExpression);
      var returnvalNode = (Node) expr.evaluate(doc, XPathConstants.NODE);
      return model.getJAXBContext().createUnmarshaller().unmarshal(new DOMSource(returnvalNode), clss).getValue();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
