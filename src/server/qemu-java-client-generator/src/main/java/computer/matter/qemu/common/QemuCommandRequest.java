package computer.matter.qemu.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QemuCommandRequest<V> {
    @JsonProperty(value = "execute")
    public String name;

    public V arguments;
}
