package computer.matter.app.api;

import computer.matter.host.api.AuthApi;
import computer.matter.host.model.LoginRequest;
import computer.matter.host.model.LoginResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;


public class AuthApiImpl implements AuthApi {
  public static final String DEFAULT_ROOT_USER_NAME = "admin";
  public static final String DEFAULT_ROOT_USER_PASSWORD = "password";
  @Context
  private HttpServletRequest request;

  @Override
  public LoginResponse getSessionId() {
    var session = request.getSession(true);
    var rsp = new LoginResponse();
    rsp.sessionId(session.getId());
    return rsp;
  }

  @Override
  public LoginResponse login(LoginRequest loginRequest) {
    if (!loginRequest.getUsername().equalsIgnoreCase(DEFAULT_ROOT_USER_NAME) || !loginRequest.getPassword()
            .equalsIgnoreCase(DEFAULT_ROOT_USER_PASSWORD)) {
      throw new WebApplicationException(
              Response.status(Response.Status.UNAUTHORIZED)
                      .entity(new LoginResponse().errorMessage("Invalid credentials"))
                      .build()
      );
    }
    var session = request.getSession(true);
    session.setAttribute("username", loginRequest.getUsername());

    var rsp = new LoginResponse();
    rsp.sessionId(session.getId());
    return rsp;
  }

  @Override
  public LoginResponse logout() {
    return null;
  }

  @Override
  public void ping() {

  }
}
