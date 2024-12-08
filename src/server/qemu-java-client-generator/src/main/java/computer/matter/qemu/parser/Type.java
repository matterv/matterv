package computer.matter.qemu.parser;

public record Type(String name, boolean isArrayType, boolean isVoid) {
  static Type voidType() {
    return new Type("void", false, true);
  }

  public static Type concreteType(String name) {
    return new Type(name, false, false);
  }

  public static Type arrayType(String name) {
    return new Type(name, true, false);
  }

  String toConcreteJavaType(String name) {
    var s = name.replaceAll("'", "");
    return switch (s) {
      case "int", "int64", "uint64", "size" -> "Long";
      case "str" -> "java.lang.String";
      case "number" -> "Double";
      case "int8", "int16", "int32", "uint8", "uint16", "uint32" -> "Integer";
      case "bool" -> "Boolean";
      case "any" -> "Object";
      case "null" -> "java.util.Optional";
      default -> s;
    };
  }

  public String toJavaType() {
    if (isArrayType()) {
      return "java.util.List<" + toConcreteJavaType(name) + ">";
    } else if (isVoid) {
      return "java.lang.Void";
    } else {
      return toConcreteJavaType(name);
    }
  }
}
