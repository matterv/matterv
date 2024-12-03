package computer.matter.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Optional;

public class LinuxSystemInfo implements SystemInfoUtil {
  private final Logger logger = LoggerFactory.getLogger(LinuxSystemInfo.class);

  private static HostInfo getHostInfo() {
    var result = CommandExecutor.executeCommand("hostnamectl");
    if (result.exitCode() != 0) {
      throw new RuntimeException("Failed to execute hostnamectl " + result);
    }
    var infoMap = new HashMap<String, String>();

    for (String line : result.output().split("\n")) {
      String[] parts = line.split(":", 2);
      if (parts.length == 2) {
        String key = parts[0].trim();
        String value = parts[1].trim();
        infoMap.put(key, value);
      }
    }

    String operatingSystem = infoMap.get("Operating System");
    String kernel = infoMap.get("Kernel");
    String hostName = infoMap.get("Transient hostname");
    String arch = infoMap.get("Architecture");
    if (operatingSystem == null || kernel == null || hostName == null || arch == null) {
      throw new RuntimeException("can not get all info from " + infoMap);
    }

    return new HostInfo(operatingSystem, kernel, hostName, arch);
  }

  private CpuInfo getCpuInfo() {
    var result = CommandExecutor.executeCommand("lscpu");
    if (result.exitCode() != 0) {
      throw new RuntimeException("failed execute lscpu: " + result);
    }

    var cpuInfo = new HashMap<String, String>();
    for (var line : result.output().split("\n")) {
      var parts = line.split(":", 2);
      if (parts.length == 2) {
        cpuInfo.put(parts[0].trim(), parts[1].trim());
      }
    }

    int cores = Integer.parseInt(cpuInfo.getOrDefault("CPU(s)", "1"));
    String modelName = cpuInfo.getOrDefault("Model name", "Unknown");
    double mhz = Double.parseDouble(cpuInfo.getOrDefault("CPU MHz", "0").replaceAll("[^\\d.]", ""));

    return new CpuInfo(cores, modelName, mhz);
  }

  private MemoryInfo getMemoryInfo() {
    var result = CommandExecutor.executeCommand("free -k");
    if (result.exitCode() != 0) {
      throw new RuntimeException("Failed to execute free -k: " + result);
    }

    var lines = result.output().split("\n");
    if (lines.length < 2) {
      throw new RuntimeException("Failed to parse: " + lines);
    }
    String[] memInfo = lines[1].split("\\s+");
    if (memInfo.length < 4) {
      throw new RuntimeException("Failed to parse memInfo " + memInfo);
    }

    long total = Long.parseLong(memInfo[1]);
    long free = Long.parseLong(memInfo[3]);

    return new MemoryInfo(total * 1024, free * 1024);
  }

  @Override
  public Optional<SystemInfo> getSystemInfo() {
    try {
      var cpuInfo = getCpuInfo();
      var memInfo = getMemoryInfo();
      var hostInfo = getHostInfo();
      return Optional.of(new SystemInfo(cpuInfo, memInfo, hostInfo, "0.1"));
    } catch (RuntimeException e) {
      logger.error("Failed to get system info", e);
      return Optional.empty();
    }
  }


}
