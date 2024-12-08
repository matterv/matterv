package computer.matter.api;

import org.eclipse.jetty.server.session.SessionHandler;

public class HttpsSessionHandler {
  public static final int SESSION_MAX_INACTIVE_INTERVAL_IN_SEC = 12 * 60 * 60; // 12 hours in seconds

  public static SessionHandler getSessionHandler() {
    var sessionHandler = new SessionHandler();
    sessionHandler.setUsingCookies(true);
    sessionHandler.setCheckingRemoteSessionIdEncoding(true);
    sessionHandler.setSessionIdPathParameterName("X-Session-ID");

    var sessionCookieConfig = sessionHandler.getSessionCookieConfig();
    sessionCookieConfig.setHttpOnly(true);
    sessionCookieConfig.setSecure(true); // For HTTPS
    sessionCookieConfig.setMaxAge(SESSION_MAX_INACTIVE_INTERVAL_IN_SEC);

    sessionHandler.setMaxInactiveInterval(30 * 60); // 30 minutes
    return sessionHandler;
  }
}
