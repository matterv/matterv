package computer.matter.qemu.parser;

import java.util.List;

public record StructType(String name, List<TypeName> members, String base) {
}

