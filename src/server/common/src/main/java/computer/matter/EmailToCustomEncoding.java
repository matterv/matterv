package computer.matter;

import java.util.Base64;

public class EmailToCustomEncoding {

  public static String emailToId(String email) {
    return Base64.getEncoder().encodeToString(email.toLowerCase().getBytes());
  }

  public static String idToEmail(String id) {
    return new String(Base64.getDecoder().decode(id));
  }
}
