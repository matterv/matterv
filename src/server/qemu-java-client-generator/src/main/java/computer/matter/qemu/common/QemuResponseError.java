package computer.matter.qemu.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QemuResponseError {
    @JsonProperty("class")
    public String _class;
    @JsonProperty
    public String desc;
    @JsonProperty
    public Object data;
}
