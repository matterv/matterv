package computer.matter;

import org.junit.jupiter.api.Test;

class EmailToCustomEncodingTest {

  @Test
  void emailToId() {
    var id = EmailToCustomEncoding.emailToId("abigail47@rezult.org");
    var email = EmailToCustomEncoding.idToEmail(id);
    int i = 1;
  }
}