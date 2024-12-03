package computer.matter.qemu.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QemuResponse<V> {
    @JsonProperty(value = "return")
    public V _return;
    @JsonProperty
    public QemuResponseError error;
}
