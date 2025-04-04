package computer.matter.vcenter;

import com.vmware.vim25.UserSession;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

public class SessionManager {
  public String sessionId = "520bc232-8a83-95db-d4c0-94759433eb88";

  UserSession login(String username, String password, String locale) {
    try {
      DatatypeFactory factory = DatatypeFactory.newInstance();
      var userSession = new UserSession();
      userSession.setKey(sessionId);
      userSession.setUserName(username);
      userSession.setFullName(username);
      userSession.setLoginTime(factory.newXMLGregorianCalendar(new GregorianCalendar()));
      userSession.setLastActiveTime(factory.newXMLGregorianCalendar(new GregorianCalendar()));
      userSession.setLocale(locale);
      userSession.setMessageLocale(locale);
      userSession.setExtensionSession(false);
      userSession.setIpAddress("192.168.1.138");
      userSession.setUserAgent("VMware-client/8.0.3");
      userSession.setCallCount(0L);

      return userSession;
    } catch (DatatypeConfigurationException e) {
      throw new RuntimeException(e);
    }
  }
}
