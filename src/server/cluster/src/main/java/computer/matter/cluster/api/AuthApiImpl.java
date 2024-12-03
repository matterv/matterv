package computer.matter.cluster.api;

import computer.matter.cluster.db.model.UserDao;
import computer.matter.cluster.model.LoginRequest;
import computer.matter.cluster.model.LoginResponse;
import computer.matter.cluster.model.User;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import org.mindrot.jbcrypt.BCrypt;

@Singleton
public class AuthApiImpl implements AuthApi {
  public static final String DEFAULT_ROOT_USER_NAME = "admin";
  public static final String DEFAULT_ROOT_USER_PASSWORD = "password";
  private final UserDao userDao;
  @Context
  private HttpServletRequest request;

  @Inject
  public AuthApiImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public User getUser() {
    var u = new User();
    u.setName(DEFAULT_ROOT_USER_NAME);
    return u;
  }

  @Override
  public LoginResponse login(LoginRequest loginRequest) {
    var user = userDao.findByName(loginRequest.getUsername());
    if (user == null) {
      throw new WebApplicationException(
              Response.status(Response.Status.UNAUTHORIZED)
                      .entity(new computer.matter.host.model.LoginResponse().errorMessage(
                              "Invalid username or password"))
                      .build()
      );
    }

    if (!BCrypt.checkpw(loginRequest.getPassword(), user.password)) {
      throw new WebApplicationException(
              Response.status(Response.Status.UNAUTHORIZED)
                      .entity(new computer.matter.host.model.LoginResponse().errorMessage(
                              "Invalid username or password"))
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
  public void logout() {
    var session = request.getSession(true);
    session.invalidate();
  }
}
