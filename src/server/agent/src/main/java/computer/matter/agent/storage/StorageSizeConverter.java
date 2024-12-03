package computer.matter.agent.storage;

public class StorageSizeConverter {
  public static long convertToBytes(String sizeString) {
    if (sizeString == null || sizeString.isEmpty()) {
      throw new IllegalArgumentException("Size string cannot be null or empty");
    }

    String[] parts = sizeString.split("(?<=\\d)(?=\\D)"); // Split between number and unit
    if (parts.length != 2) {
      throw new IllegalArgumentException("Invalid size format: " + sizeString);
    }

    long size;
    try {
      size = Long.parseLong(parts[0]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Invalid number format: " + parts[0]);
    }

    String unit = parts[1].toUpperCase();
    return switch (unit) {
      case "K" -> size * 1024;
      case "M" -> size * 1024 * 1024;
      case "G" -> size * 1024 * 1024 * 1024;
      case "T" -> size * 1024 * 1024 * 1024 * 1024L;
      default -> throw new IllegalArgumentException("Unsupported unit: " + unit);
    };
  }
}