package computer.matter.os;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProcessUtilTest {

  @Test
  @Disabled
  void isProcessRunning() {
    assertTrue(ProcessUtil.isProcessRunning("43447"));
  }
}