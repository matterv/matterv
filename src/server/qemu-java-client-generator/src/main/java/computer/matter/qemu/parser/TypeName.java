package computer.matter.qemu.parser;

import computer.matter.qemu.common.StringUtils;

public record TypeName(Type type, String name, String origName) {
  public String toJavaName() {
    return StringUtils.toJavaName(name);
  }

  public String getOrigName() {
    return origName.replaceAll("'", "");
  }
}

