package computer.matter.qemu.parser;

import computer.matter.qemu.common.StringUtils;

public record CommandType(String command, Type argumentType, Type returnType) {
    public String toJavaName() {
        return StringUtils.toJavaName(command);
    }

    public String arguments() {
        if (argumentType.isVoid()) {
            return "";
        }
        return argumentType.toJavaType() + " input";
    }
}
