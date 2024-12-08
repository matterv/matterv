package computer.matter.qemu.common;

public class StringUtils {
  static String[] words = {
          "zero", "one", "two", "three", "four",
          "five", "six", "seven", "eight", "nine"
  };


  public static String convertIfStartsWithNumber(String input) {
    // Regular expression to find if the string starts with one or more digits
    if (Character.isDigit(input.charAt(0))) {
      return words[Character.getNumericValue(input.charAt(0))] + input.substring(1);
    } else {
      return input;
    }
  }

  public static String convertToCamelCase(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    StringBuilder builder = new StringBuilder(input.length());
    boolean nextUpperCase = false;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == '-') {
        nextUpperCase = true;  // Next character should be uppercase
      } else if (nextUpperCase) {
        builder.append(Character.toUpperCase(c));
        nextUpperCase = false;  // Reset flag
      } else {
        builder.append(c);
      }
    }

    return builder.toString();
  }

  public static String toJavaName(String name) {
    return name.replaceAll("'", "").replaceAll("-", "_").toUpperCase();
  }

}
