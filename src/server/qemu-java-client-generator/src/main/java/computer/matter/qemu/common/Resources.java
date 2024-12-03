package computer.matter.qemu.common;

import java.io.IOException;

public class Resources {
  public static String readFileFromResource(String path) {
    ClassLoader classLoader = Resources.class.getClassLoader();
    try (var inputStream = classLoader.getResourceAsStream(path)) {
      return new String(inputStream.readAllBytes());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}