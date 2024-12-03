package computer.matter.qemu.generator;

import computer.matter.qemu.common.FileUtils;
import computer.matter.qemu.common.Pair;
import computer.matter.qemu.parser.*;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class CodeGenerator {
  VelocityEngine ve;

  public CodeGenerator() {
    ve = new VelocityEngine();
    ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
    ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
    ve.init();
  }

  public static void main(String[] args) throws IOException {
    var outputPath = args[0];
    var outputDir = Paths.get(outputPath);
    if (!Files.exists(outputDir)) {
      Files.createDirectories(outputDir);
    }

    var types = new QemuParser().parseQapiJsonFile("qapi", "qapi-schema.json");
    var codeGenerator = new CodeGenerator();

    types.forEach(t -> {
      try {
        var s = codeGenerator.generate(t);
        FileUtils.writeString(Paths.get(outputDir.toString(), s.left() + ".java"), s.right());
      } catch (Exception e) {
      }
    });

    var commands = types.stream().filter(t -> t instanceof CommandType).map(t -> (CommandType)t).toList();
    var commandStr = codeGenerator.generateCmd(commands);
    FileUtils.writeString(Paths.get(outputDir.toString(), "QemuCommand.java"), commandStr);
  }

  Pair<String, String> generate(Object type) {
    return switch (type) {
      case EnumType e -> new Pair<>(e.name(), generate(e));
      case StructType e -> new Pair<>(e.name(), generate(e));
      case UnionType e -> new Pair<>(e.name, generate(e));
      case AlternateType a -> new Pair<>(a.name(), generate(a));
      default -> throw new RuntimeException("invalid type" + type);
    };
  }

  String generate(EnumType enumType) {
    var enumGenerator = new EnumGenerator();
    return enumGenerator.generate(ve, enumType);
  }

  String generate(StructType structType) {
    var structGenerator = new StructGenerator();
    return structGenerator.generate(ve, structType);
  }

  String generate(UnionType unionType) {
    var generator = new UnionGenerator();
    return generator.generate(ve, unionType);
  }

  String generate(AlternateType alternateType) {
    var generator = new AlternateGenerator();
    return generator.generate(ve, alternateType);
  }

  String generateCmd(List<CommandType> commandTypeList) {
    var generator = new CommandGenerator();
    return generator.generate(ve, commandTypeList);
  }
}
