package computer.matter.network;

import java.security.SecureRandom;
import java.util.Random;

public class MacAddressGenerator {
    private static final Random random = new SecureRandom();
    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

    /**
     * Generates a random EUI-48 MAC address (commonly used format)
     * Format: XX:XX:XX:XX:XX:XX where X is a hex digit
     * @param localAdmin if true, sets the locally administered bit
     * @param unicast if true, generates unicast address, if false generates multicast
     * @return formatted MAC address string
     */
    public static String generateMacAddress48(boolean localAdmin, boolean unicast) {
        byte[] macBytes = new byte[6];
        random.nextBytes(macBytes);

        // Set the locally administered bit (bit 1) and unicast/multicast bit (bit 0)
        // in the first byte
        if (localAdmin) {
            macBytes[0] |= 0x02;  // Set bit 1
        } else {
            macBytes[0] &= 0xFD;  // Clear bit 1
        }

        if (unicast) {
            macBytes[0] &= 0xFE;  // Clear bit 0 for unicast
        } else {
            macBytes[0] |= 0x01;  // Set bit 0 for multicast
        }

        return formatMacAddress(macBytes, ":");
    }

    /**
     * Generates a random EUI-64 MAC address
     * Format: XX:XX:XX:XX:XX:XX:XX:XX where X is a hex digit
     * @param localAdmin if true, sets the locally administered bit
     * @param unicast if true, generates unicast address, if false generates multicast
     * @return formatted MAC address string
     */
    public static String generateMacAddress64(boolean localAdmin, boolean unicast) {
        byte[] macBytes = new byte[8];
        random.nextBytes(macBytes);

        // Set the locally administered bit and unicast/multicast bit
        if (localAdmin) {
            macBytes[0] |= 0x02;
        } else {
            macBytes[0] &= 0xFD;
        }

        if (unicast) {
            macBytes[0] &= 0xFE;
        } else {
            macBytes[0] |= 0x01;
        }

        return formatMacAddress(macBytes, ":");
    }

    /**
     * Generates a random MAC address in the specified format
     * @param separator the separator to use between octets (e.g., ":" or "-")
     * @param isEUI64 if true, generates EUI-64 format, otherwise EUI-48
     * @return formatted MAC address string
     */
    public static String generateMacAddress(String separator, boolean isEUI64) {
        return isEUI64 ?
                generateMacAddress64(false, true).replace(":", separator) :
                generateMacAddress48(false, true).replace(":", separator);
    }

    /**
     * Formats byte array into MAC address string
     * @param bytes byte array to format
     * @param separator separator to use between octets
     * @return formatted MAC address string
     */
    private static String formatMacAddress(byte[] bytes, String separator) {
        StringBuilder sb = new StringBuilder(bytes.length * 3 - 1);
        for (int i = 0; i < bytes.length; i++) {
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(HEX_CHARS[(bytes[i] & 0xF0) >>> 4]);
            sb.append(HEX_CHARS[bytes[i] & 0x0F]);
        }
        return sb.toString();
    }

    /**
     * Validates if a given string is a valid MAC address
     * @param macAddress MAC address string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidMacAddress(String macAddress) {
        if (macAddress == null) {
            return false;
        }

        // Support both formats: XX:XX:XX:XX:XX:XX and XX-XX-XX-XX-XX-XX
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

        // For EUI-64 format
        String regex64 = "^([0-9A-Fa-f]{2}[:-]){7}([0-9A-Fa-f]{2})$";

        return macAddress.matches(regex) || macAddress.matches(regex64);
    }
}
