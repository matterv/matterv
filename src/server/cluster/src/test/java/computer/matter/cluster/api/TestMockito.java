package computer.matter.cluster.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

interface Foo {
  void a();
}
@ExtendWith(MockitoExtension.class)
public class TestMockito {
  @Mock
  Foo foo;

  @Test
  void foo() {

  }
}
