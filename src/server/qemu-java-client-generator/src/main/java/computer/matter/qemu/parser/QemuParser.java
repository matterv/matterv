package computer.matter.qemu.parser;

import computer.matter.qemu.common.Resources;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class QemuParser {
  public List<Object> parse(String input) {
    CharStream inputStream = CharStreams.fromString(input);
    QAPISchemaLexer lexer = new QAPISchemaLexer(inputStream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    QAPISchemaParser parser = new QAPISchemaParser(tokens);
    ParseTree tree = parser.schema();
    var visitor = new QAPISchemaVisitorImpl();
    visitor.visit(tree);
    return visitor.getTypes();
  }

  public List<Object> parseFile(Path file) {
    try {
      return parse(Files.readString(file));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private List<Object> parseQapiJsonFileInternal(String dir, String fileName, Set<String> visitedFiles) {
    if (visitedFiles.contains(fileName)) {
      return List.of();
    }
    visitedFiles.add(fileName);

    var jsonFile = dir + "/" + fileName;
    System.out.println("parse " + jsonFile);
    var input = Resources.readFileFromResource(jsonFile);
    var result = new LinkedList<>();
    var types = parse(input);
    types.stream().filter(t -> t instanceof IncludeType).forEach(t -> {
      var includeType = (IncludeType) t;
      result.addAll(parseQapiJsonFileInternal(dir, includeType.name(), visitedFiles));
    });
    result.addAll(types);
    return result;
  }

  public void fixup(List<Object> types) {
    var map = new HashMap<String, Object>();
    types.forEach(t -> {
      switch (t) {
        case EnumType e -> map.put(e.name(), e);
        case StructType s -> map.put(s.name(), s);
        case UnionType u -> map.put(u.name, u);
        case AlternateType a -> map.put(a.name(), a);
        default -> {
        }
      }
    });

    types.stream().filter(t -> t instanceof UnionType).forEach(t -> {
      var unionType = (UnionType) t;
      if (unionType.discriminatorType != null) {
        return;
      }
      var baseType = map.get(unionType.base);
      switch (baseType) {
        case EnumType e -> unionType.discriminatorType = e.name();
        case StructType e -> {
          e.members().stream().filter(m -> m.name().equalsIgnoreCase(unionType.discriminator)).findFirst().ifPresent(m -> {
            unionType.discriminatorType = m.type().name();
          });
        }
        default -> throw new RuntimeException("invalid union type: " + unionType);
      }
    });
  }

  public List<Object> parseQapiJsonFile(String dir, String fileName) {
    var types = parseQapiJsonFileInternal(dir, fileName, new HashSet<>());
    fixup(types);
    return types;
  }
}
