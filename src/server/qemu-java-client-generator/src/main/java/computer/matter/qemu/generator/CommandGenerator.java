package computer.matter.qemu.generator;

import computer.matter.qemu.parser.CommandType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.List;

public class CommandGenerator {
    String generate(VelocityEngine ve, List<CommandType> commandTypes) {
        Template t = ve.getTemplate("command.vm");
        VelocityContext context = new VelocityContext();
        context.put("packageName", "computer.matter.qemu.api");
        context.put("className", "QemuCommand");
        context.put("fields", commandTypes);
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        return writer.toString();
    }
}
