package computer.matter.vcenter;

import com.google.common.reflect.TypeToken;
import com.vmware.vim25.ManagedObjectReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

record ValueType(Object value, Type type) {
}

public class ReflectionUtil {
  static final Logger logger = LoggerFactory.getLogger(ReflectionUtil.class);

  static private ValueType getValueType(Object o, String prop) {
    Class<?> clazz = o.getClass();
    try {
      Field field = clazz.getField(prop);
      Object value = field.get(o);
      return new ValueType(value, field.getGenericType());
    } catch (NoSuchFieldException e) {
      try {
        var methodUppercase = prop.substring(0, 1).toUpperCase() + prop.substring(1);
        var method = clazz.getMethod("get" + methodUppercase);
        return new ValueType(method.invoke(o), method.getGenericReturnType());
      } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
        logger.error("method not found: " + prop, ex);
        throw new RuntimeException(ex);
      }
    } catch (IllegalAccessException e) {
      logger.error("Field not found: " + prop, e);

      throw new RuntimeException(e);
    }
  }

  static <T> Object handleArrayOf(TypeToken<?> typeToken, Object value) {
    if (!typeToken.isSubtypeOf(new TypeToken<List<?>>() {
    })) {
      throw new IllegalArgumentException("Value is not a List");
    }

    // Get the element type of the List
    TypeToken<?> elementTypeToken = typeToken.resolveType(List.class.getTypeParameters()[0]);
    Class<?> elementClass = elementTypeToken.getRawType();

    try {
      // Find the corresponding Array class
      String arrayClassName = "ArrayOf" + elementClass.getSimpleName();
      Class<?> arrayClass = null;
      try {
        arrayClass = Class.forName(elementClass.getPackage().getName() + "." + arrayClassName);
      } catch (ClassNotFoundException e) {
        logger.debug("Array class not found: " + arrayClassName);
        arrayClass = Class.forName("com.vmware.vim25.ArrayOfManagedObjectReference");
        elementClass = ManagedObjectReference.class;
      }
      // Create instance of the Array class
      Object arrayInstance = arrayClass.getDeclaredConstructor().newInstance();

      // Find the getter method to access the list inside the Array class
      String getterMethodName = "get" + elementClass.getSimpleName();
      Method getterMethod = arrayClass.getMethod(getterMethodName);

      // Get the list from the Array object
      List<Object> targetList = (List<Object>) getterMethod.invoke(arrayInstance);

      // Add all elements from the source list to the target list
      List<?> sourceList = (List<?>) value;
      for (Object item : sourceList) {
        targetList.add(item);
      }

      return arrayInstance;
    } catch (Exception e) {
      throw new RuntimeException("Failed to create array class for " + elementClass.getSimpleName(), e);
    }
  }

  static Object getValue(Object o, String prop) {
    var valueType = getValueType(o, prop);

    TypeToken<?> typeToken = TypeToken.of(valueType.type());
    if (typeToken.isSubtypeOf(new TypeToken<List<?>>() {
    })) {
      return handleArrayOf(typeToken, valueType.value());
    } else {
      return valueType.value();
    }
  }

  static void setValue(Object o, String prop, Object value) {
    Class<?> clazz = o.getClass();
    try {
      Field field = clazz.getField(prop);
      field.set(o, value);
    } catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  static Object invoke(Object o, String methodName, Object... args) {
    Class<?> clazz = o.getClass();
    try {
      Method targetMethod = null;
      for (Method m : clazz.getDeclaredMethods()) {
        if (m.getName().equals(methodName)) {
          targetMethod = m;
          break;
        }
      }
      return targetMethod.invoke(o, args);
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
