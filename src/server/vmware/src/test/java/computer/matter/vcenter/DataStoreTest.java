package computer.matter.vcenter;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class DataStoreTest {

  @Test
  void getInfo() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    var d = DataStore.class.getConstructor(String.class, Jdbi.class).newInstance("a", null);
    Assertions.assertEquals(d.getValue(), "a");
  }
}