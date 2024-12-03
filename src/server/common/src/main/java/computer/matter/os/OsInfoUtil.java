package computer.matter.os;

public class OsInfoUtil {
    public static int getOsId(String osType) {
        return switch (osType) {
            case "Windows" -> 2;
            default -> 1;
        };
    }

    public static boolean isLinux(int osId) {
        return osId == 1;
    }
}
