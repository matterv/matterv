package computer.matter.qemu.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
  public static void writeString(Path path, String content) {
    try {
      Files.writeString(path, content);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
