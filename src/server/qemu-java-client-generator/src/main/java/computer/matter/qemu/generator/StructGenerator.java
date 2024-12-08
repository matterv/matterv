package computer.matter.qemu.generator;

import computer.matter.qemu.parser.StructType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class StructGenerator {
  String generate(VelocityEngine ve, StructType structType) {
    Template t = ve.getTemplate("struct.vm");
    VelocityContext context = new VelocityContext();
    context.put("packageName", "computer.matter.qemu.api");
    context.put("className", structType.name());
    context.put("fields", structType.members());
    if (structType.base() != null) {
      context.put("baseClass", structType.base());
    }

    StringWriter writer = new StringWriter();
    t.merge(context, writer);
    return writer.toString();
  }
}
