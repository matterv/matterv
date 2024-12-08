package computer.matter.os;

public class BinaryUnits {
    public static final long KiB = 1024L;
    public static final long MiB = KiB * 1024L;
    public static final long GiB = MiB * 1024L;
    public static final long TiB = GiB * 1024L;

    public static long toKiB(long bytes) {
        return bytes / KiB;
    }

    public static long toMiB(long bytes) {
        return bytes / MiB;
    }

    public static long toGiB(long bytes) {
        return bytes / GiB;
    }

    // Example usage
    public static void main(String[] args) {
        long fileSize = 1572864L; // bytes
        System.out.println(toMiB(fileSize) + " MiB");
        System.out.println(toKiB(fileSize) + " KiB");
    }
}
