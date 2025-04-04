package computer.matter.vcenter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class JaxbHelper {

  public static <T> T unmarshal(String xml, List<Class<?>> clazz) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(clazz.toArray(Class[]::new));
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringReader reader = new StringReader(xml);
    return (T) unmarshaller.unmarshal(reader);
  }

  public static String marshal(Object obj, Class<?> clazz) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
    Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    StringWriter writer = new StringWriter();
    marshaller.marshal(obj, writer);
    return writer.toString();
  }
}
