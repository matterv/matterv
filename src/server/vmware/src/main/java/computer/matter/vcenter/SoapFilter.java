package computer.matter.vcenter;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

public class SoapFilter extends Filter {
  final Logger logger = LoggerFactory.getLogger(SoapFilter.class);

  @Override
  public void doFilter(HttpExchange exchange, Chain chain) throws IOException {
    logger.info("SoapFilter.doFilter() called");

    HttpExchange modifiedExchange = new HttpExchangeWrapper(exchange, "text/xml");


    logger.info("Request Headers done");
    chain.doFilter(modifiedExchange);
  }

  @Override
  public String description() {
    return "";
  }

  private static class HttpExchangeWrapper extends HttpExchange {
    private final HttpExchange original;
    private final Headers modifiedHeaders;

    public HttpExchangeWrapper(HttpExchange original, String contentType) {
      this.original = original;
      this.modifiedHeaders = new Headers();

      // Copy all original headers
      original.getRequestHeaders().forEach((key, values) ->
              values.forEach(value -> this.modifiedHeaders.add(key, value))
      );

      // Modify Content-Type
      this.modifiedHeaders.set("Content-Type", contentType);
    }

    @Override
    public Headers getRequestHeaders() {
      return modifiedHeaders;
    }

    // Delegate all other methods to the original exchange
    @Override
    public Headers getResponseHeaders() {
      return original.getResponseHeaders();
    }

    @Override
    public URI getRequestURI() {
      return original.getRequestURI();
    }

    @Override
    public String getRequestMethod() {
      return original.getRequestMethod();
    }

    @Override
    public HttpContext getHttpContext() {
      return original.getHttpContext();
    }

    @Override
    public void close() {
      original.close();
    }

    @Override
    public InputStream getRequestBody() {
      return original.getRequestBody();
    }

    @Override
    public OutputStream getResponseBody() {
      return original.getResponseBody();
    }

    @Override
    public void sendResponseHeaders(int rCode, long responseLength) throws IOException {
      original.sendResponseHeaders(rCode, responseLength);
    }

    @Override
    public InetSocketAddress getRemoteAddress() {
      return original.getRemoteAddress();
    }

    @Override
    public int getResponseCode() {
      return original.getResponseCode();
    }

    @Override
    public InetSocketAddress getLocalAddress() {
      return original.getLocalAddress();
    }

    @Override
    public String getProtocol() {
      return original.getProtocol();
    }

    @Override
    public Object getAttribute(String name) {
      return original.getAttribute(name);
    }

    @Override
    public void setAttribute(String name, Object value) {
      original.setAttribute(name, value);
    }

    @Override
    public void setStreams(InputStream i, OutputStream o) {
      original.setStreams(i, o);
    }

    @Override
    public HttpPrincipal getPrincipal() {
      return original.getPrincipal();
    }
  }
}
