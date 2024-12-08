package computer.matter.qemu.generator;

import computer.matter.qemu.parser.UnionType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class UnionGenerator {
  String generate(VelocityEngine ve, UnionType unionType) {
    Template t = ve.getTemplate("union.vm");
    VelocityContext context = new VelocityContext();
    context.put("packageName", "computer.matter.qemu.api");
    context.put("className", unionType.name);
    context.put("baseClass", unionType.base);
    context.put("fields", unionType.members);
    context.put("discriminator", unionType.getJavaNameForDiscriminator());
    context.put("discriminatorType", unionType.discriminatorType);

    StringWriter writer = new StringWriter();
    t.merge(context, writer);
    return writer.toString();
  }
}
