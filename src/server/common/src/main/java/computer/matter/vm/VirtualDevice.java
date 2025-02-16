package computer.matter.vm;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = VirtualDisk.class, name = "VirtualDisk"),
        @JsonSubTypes.Type(value = VirtualNic.class, name = "VirtualNic"),
        @JsonSubTypes.Type(value = VirtualCdrom.class, name = "VirtualCdrom"),
        @JsonSubTypes.Type(value = VirtualDiskController.class, name = "VirtualDiskController"),
})
public abstract class VirtualDevice {
  public long id;
}
