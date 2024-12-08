package computer.matter.qemu.parser;

import computer.matter.qemu.common.StringUtils;
import computer.matter.qemu.parser.QAPISchemaBaseVisitor;
import computer.matter.qemu.parser.QAPISchemaParser;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class QAPISchemaVisitorImpl extends QAPISchemaBaseVisitor<Void> {
  List<Object> types = new LinkedList<>();


  public List<Object> getTypes() {
    return types;
  }

  private String removeStarFromName(String name) {
    var n = name;
    if (name.startsWith("*")) {
      n = name.substring(1);
    }
    return n;
  }

  private Type getBuildinType(QAPISchemaParser.TypeContext typeContext) {
    return Type.concreteType(typeContext.STRING().getText());
  }

  private String getStringFromTypeString(QAPISchemaParser.TypeStringContext typeContext) {
    return typeContext.getText();
  }

  private TypeName getTypeFromMember(QAPISchemaParser.MemberContext memberContext) {
    if (memberContext.typeString() != null) {
      var n = removeStarFromName(memberContext.typeString().getText());
      return new TypeName(getJavaType(memberContext.typeRef()), n, n);
    } else {
      var n = removeStarFromName(memberContext.STRING().getText());
      return new TypeName(getJavaType(memberContext.typeRef()), n, n);
    }
  }

  private Type getJavaType(QAPISchemaParser.TypeRefContext typeRefContext) {
    if (typeRefContext.valueType() != null) {
      return Type.concreteType(typeRefContext.valueType().type().getText());
    } else if (typeRefContext.arrayType() != null) {
      return Type.arrayType(typeRefContext.arrayType().type().getText());
    } else {
      throw new RuntimeException("invalid type: " + typeRefContext);
    }
  }


  @Override
  public Void visitEnum(QAPISchemaParser.EnumContext ctx) {
    String className = ctx.STRING().getText();
    List<String> enumValues = ctx.enumInfo().stream()
            .filter(ev -> ev.enumValue() != null)
            .flatMap(ev -> ev.enumValue().stream())
            .map(ev -> ev.enumValueStr().getText())
            .collect(Collectors.toList());

    types.add(new EnumType(className, enumValues));
    return null;
  }

  @Override
  public Void visitStruct(QAPISchemaParser.StructContext ctx) {
    String className = ctx.STRING().getText();
    var members = new LinkedList<TypeName>();
    ctx.structInfo().stream().filter(i -> i.members() != null).findFirst().ifPresent(i -> members.addAll(
            i.members().member().stream().map(this::getTypeFromMember).toList()));

    var base = ctx.structInfo().stream().filter(i -> i.base() != null).findFirst().map(i -> i.base().STRING().getText());

    types.add(new StructType(className, members, base.orElse("")));
    return null;
  }

  @Override
  public Void visitUnion(QAPISchemaParser.UnionContext ctx) {
    var className = ctx.STRING().getText();
    var discriminator = getStringFromTypeString(ctx.unionDiscriminator().typeString());
    String baseType = null;
    if (ctx.unionBase().memberBase() != null) {
      if (ctx.unionBase().memberBase() != null) {
        var members = new LinkedList<TypeName>();
        members.addAll(
                ctx.unionBase().memberBase().members().member().stream().map(this::getTypeFromMember).toList());
        baseType = className + "Base";
        var structType = new StructType(baseType, members, null);
        types.add(structType);
      }
    } else {
      baseType = ctx.unionBase().STRING().getText();
    }

    var unionDataMembers = new LinkedList<TypeName>();
    if (!ctx.unionData().branch().isEmpty()) {
      unionDataMembers.addAll(
              ctx.unionData().branch().stream().map(m -> {
                var branchName = m.branchName().getText();
                var n = removeStarFromName(branchName);
                return new TypeName(getJavaType(m.typeRef()), n, n);
              }).toList());
    }

    types.add(new UnionType(className, unionDataMembers, baseType, discriminator));
    return null;
  }

  @Override
  public Void visitAlternate(QAPISchemaParser.AlternateContext ctx) {
    var className = ctx.STRING().getText();
    var members =
            ctx.memberBase().members().member().stream().map(this::getTypeFromMember).toList();

    types.add(new AlternateType(className, members));
    return null;
  }

  @Override
  public Void visitCommand(QAPISchemaParser.CommandContext ctx) {
    var className = ctx.STRING().getText();
    Type argumentType = Type.voidType();
    var cmdData = ctx.commandInfo().stream().filter(i -> i.commandData() != null).findFirst();
    if (cmdData.isPresent()) {
      if (cmdData.get().commandData().memberBase() != null) {
        var members = cmdData.get().commandData().memberBase().members().member().stream().map(this::getTypeFromMember).toList();
        var structType = new StructType(StringUtils.convertToCamelCase(className + "ArgumentType"), members, null);
        types.add(structType);
        argumentType = Type.concreteType(structType.name());
      } else {
        argumentType = Type.concreteType(cmdData.get().commandData().STRING().getText());
      }
    }

    Type returnType = Type.voidType();
    var returnData = ctx.commandInfo().stream().filter(i -> i.commandReturn() != null).findFirst();
    if (returnData.isPresent()) {
      returnType = getJavaType(returnData.get().commandReturn().typeRef());
    }

    types.add(new CommandType(className, argumentType, returnType));
    return null;
  }

  @Override
  public Void visitEvent(QAPISchemaParser.EventContext ctx) {
    String className = ctx.STRING().getText();

    var dataInfo = ctx.eventInfo().stream().filter(e -> e.commandData() != null).findFirst();
    Type dataType = Type.voidType();
    if (dataInfo.isPresent()) {
      var members = new LinkedList<TypeName>();
      if (dataInfo.get().commandData().memberBase() != null) {
        members.addAll(
                dataInfo.get().commandData().memberBase().members().member().stream().map(this::getTypeFromMember).toList());

        var structType = new StructType(className + "EventType", members, null);
        types.add(structType);
        dataType = Type.concreteType(structType.name());
      } else {
        dataType = Type.concreteType(dataInfo.get().commandData().STRING().getText());
      }
    }

    types.add(new EventType(className, dataType));
    return null;
  }

  @Override
  public Void visitInclude(QAPISchemaParser.IncludeContext ctx) {
    String className = ctx.STRING().getText();
    types.add(new IncludeType(className));
    return null;
  }
}
