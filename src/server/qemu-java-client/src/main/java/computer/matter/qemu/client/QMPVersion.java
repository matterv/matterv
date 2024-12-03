package computer.matter.qemu.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import computer.matter.qemu.api.VersionInfo;

import java.util.List;

public class QMPVersion {
  @JsonProperty
  public VersionInfo version;
  @JsonProperty
  public List<Object> capabilities;
}
