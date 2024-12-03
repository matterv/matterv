package computer.matter.os;

public class OsUtil {
  public static boolean isMacOs() {
    String osName = System.getProperty("os.name").toLowerCase();

    return osName.contains("mac") || osName.contains("darwin");
  }
}
