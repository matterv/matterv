package computer.matter.os;

import java.util.Optional;

public class MacosSystemInfoUtil implements SystemInfoUtil {
  @Override
  public Optional<SystemInfo> getSystemInfo() {
    return Optional.of(new SystemInfo(
            new CpuInfo(256, "Arm", 1024),
            new MemoryInfo(256 * 1024 * 1024 * 1024L, 200 * 1024 * 1024 * 1024L),
            new HostInfo("MacOs", "8.10", "localhost", "Arm"),
            "0.1"
    ));
  }
}
