package computer.matter.api;

import io.dropwizard.servlets.assets.AssetServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileBasedAssets extends AssetServlet {
  private final String baseDirectory;

  public FileBasedAssets(String baseDirectory) {
    super("file://opt/", "/", "index.html", StandardCharsets.UTF_8);
    this.baseDirectory = baseDirectory;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String path = ((Request)req).getPathInContext();

    if (path.equals("/") || path.equals("/vnc")) {
      path = "index.html";
    }
    File file = new File(baseDirectory, path);

    if (!file.exists() || !file.isFile()) {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
      return;
    }

    String mimeType = getServletContext().getMimeType(file.getName());
    if (mimeType == null) {
      mimeType = "application/octet-stream";
    }

    resp.setContentType(mimeType);
    resp.setContentLength((int) file.length());

    Files.copy(file.toPath(), resp.getOutputStream());
  }
}