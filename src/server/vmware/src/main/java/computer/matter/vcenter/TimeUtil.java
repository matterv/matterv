package computer.matter.vcenter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class TimeUtil {
  public static XMLGregorianCalendar getCurrentTime() {
    try {
      var factory = DatatypeFactory.newInstance();
      return factory.newXMLGregorianCalendar(new GregorianCalendar());
    } catch (DatatypeConfigurationException e) {
      throw new RuntimeException(e);
    }
  }
}
