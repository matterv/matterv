package computer.matter.vcenter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.server.Request;

import java.io.IOException;

public class VcenterServlet extends HttpServlet {
  static final String xmlVersion = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><namespaces version=\"1.0\"><namespace><name>urn:vim25</name><version>8.0.3.0</version><priorVersions><version>7.0.2.1</version><version>7.0.2.0</version><version>7.0.1.1</version><version>7.0.1.0</version><version>7.0.0.2</version><version>7.0.0.0</version><version>6.9.1</version><version>6.8.7</version><version>6.7.3</version><version>6.7.2</version><version>6.7.1</version><version>6.7</version><version>6.5</version><version>6.0</version><version>5.5</version><version>5.1</version><version>5.0</version><version>4.1</version><version>4.0</version></priorVersions></namespace></namespaces>";

  static final String serviceXml = """
                                   <?xml version="1.0" encoding="UTF-8"?><service><instanceId>527ff238-cc91-f470-b2af-bd86f6191beb</instanceId></service>
                  """;
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String path = ((Request)req).getPathInContext();
    if (path.equals("/sdk/vimServiceVersions.xml")) {
      resp.setHeader(HttpHeader.CONTENT_TYPE.lowerCaseName(), "application/xml");
      resp.setContentLength(xmlVersion.length());
      var writer = resp.getWriter();
      writer.write(xmlVersion);
      writer.flush();
      writer.close();
    } else if (path.equals("/sdk/service")) {
      resp.setHeader(HttpHeader.CONTENT_TYPE.lowerCaseName(), "text/xml; charset=utf-8");
      resp.setContentLength(serviceXml.length());
      var writer = resp.getWriter();
      writer.write(serviceXml);
      writer.flush();
      writer.close();
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("doPost");
  }
}
