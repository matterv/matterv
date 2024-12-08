package computer.matter.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class CommandExecutor {
  private static final Logger logger = LoggerFactory.getLogger(CommandExecutor.class);

  public static CommandResult executeCommand(String command) {
    return executeCommand(command, 0);
  }

  public static CommandResult executeCommand(String command, long timeout) {
    var processBuilder = new ProcessBuilder();
    processBuilder.command("bash", "-c", command);
    processBuilder.redirectErrorStream(true); // Redirect error stream to output stream

    try {
      var process = processBuilder.start();

      var output = new StringBuilder();
      var reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

      String line;
      while ((line = reader.readLine()) != null) {
        output.append(line).append("\n");
      }

      boolean finished;

      if (timeout > 0) {
        finished = process.waitFor(timeout, TimeUnit.SECONDS);
      } else {
        process.waitFor();
        finished = true;
      }
      int exitCode = finished ? process.exitValue() : -1;

      return new CommandResult(exitCode, output.toString().trim());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return new CommandResult(-2, "failed to execute cmd, as it's interrupted");
    } catch (IOException e) {
      logger.error("failed to execute cmd {}", command, e);
      return new CommandResult(-1, "failed to execute cmd");
    }
  }

  public record CommandResult(int exitCode, String output) {
  }
}
