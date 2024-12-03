package computer.matter.qemu.generator;

import computer.matter.qemu.parser.AlternateType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class AlternateGenerator {
  String generate(VelocityEngine ve, AlternateType alternateType) {
    Template t = ve.getTemplate("struct.vm");
    VelocityContext context = new VelocityContext();
    context.put("packageName", "computer.matter.qemu.api");
    context.put("className", alternateType.name());
    context.put("fields", alternateType.members());

    StringWriter writer = new StringWriter();
    t.merge(context, writer);
    return writer.toString();
  }
}
