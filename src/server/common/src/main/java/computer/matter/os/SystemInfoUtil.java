package computer.matter.os;

import java.util.Optional;

public interface SystemInfoUtil {
  Optional<SystemInfo> getSystemInfo();

  record CpuInfo(int cores, String model, double mhz) {
  }

  record MemoryInfo(long totalInBytes, long freeInBytes) {
  }

  record HostInfo(String os, String kernel, String hostname, String arch) {
  }

  record SystemInfo(CpuInfo cpuInfo, MemoryInfo memoryInfo, HostInfo hostInfo, String version) {
  }
}
