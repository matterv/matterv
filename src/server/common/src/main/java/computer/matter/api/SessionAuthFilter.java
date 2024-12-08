package computer.matter.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

import java.security.cert.X509Certificate;

@Provider
public class SessionAuthFilter implements ContainerRequestFilter {

  @Context
  private HttpServletRequest request;

  @Override
  public void filter(ContainerRequestContext requestContext) {
    if (isPublicEndpoint(requestContext.getUriInfo().getPath())) {
      return;
    }
    var certs = (X509Certificate[]) request.getAttribute("jakarta.servlet.request.X509Certificate");

    if (certs != null && certs.length > 0) {
      // Client authenticated via mTLS
      String clientDN = certs[0].getSubjectX500Principal().getName();
      requestContext.setProperty("authenticatedUser", clientDN);
      return; // Allow the request to proceed
    }
    var session = request.getSession(false);
    if (session == null || session.getAttribute("username") == null) {
      requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
    }
  }

  private boolean isPublicEndpoint(String path) {
    // Define your public endpoints here
    return path.equals("v1/login") || path.startsWith("/assets");
  }
}

