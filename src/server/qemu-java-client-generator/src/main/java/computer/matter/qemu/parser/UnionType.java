package computer.matter.qemu.parser;

import computer.matter.qemu.common.StringUtils;

import java.util.List;

public class UnionType {
  public String name;
  public List<TypeName> members;
  public String base;
  public String discriminator;
  public String discriminatorType;

  public UnionType(String name, List<TypeName> members, String base, String discriminator) {
    this.name = name;
    this.members = members;
    this.base = base;
    this.discriminator = discriminator;
  }

  public String getJavaNameForDiscriminator() {
    return StringUtils.toJavaName(discriminator);
  }
}
