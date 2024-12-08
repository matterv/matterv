package computer.matter.qemu.generator;

import computer.matter.qemu.common.StringUtils;
import computer.matter.qemu.parser.EnumType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.List;


public class EnumGenerator {

  List<EnumValue> processEnumValue(List<String> values) {
    return values.stream().map(v -> {
      var vv = v.replaceAll("'", "");
      var vvv = StringUtils.convertIfStartsWithNumber(vv);
      vvv = vvv.toUpperCase().replaceAll("-", "_");
      return new EnumValue(vvv, vv);
    }).toList();
  }

  public String generate(VelocityEngine ve, EnumType enumType) {
    Template t = ve.getTemplate("enum.vm");
    VelocityContext context = new VelocityContext();
    context.put("packageName", "computer.matter.qemu.api");
    context.put("className", enumType.name());
    context.put("values", processEnumValue(enumType.values()));


    StringWriter writer = new StringWriter();
    t.merge(context, writer);
    return writer.toString();
  }
}
