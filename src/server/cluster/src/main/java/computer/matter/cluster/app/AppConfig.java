package computer.matter.cluster.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class AppConfig extends Configuration {
  @Valid
  @NotNull
  private DataSourceFactory database = new DataSourceFactory();
  @Valid
  @NotNull
  private String webRootDir;

  @Valid
  private int vcenterPort = 8545;

  public int getVcenterPort() {
    return vcenterPort;
  }

  public void setVcenterPort(int vcenterPort) {
    this.vcenterPort = vcenterPort;
  }

  public @Valid @NotNull String getWebRootDir() {
    return webRootDir;
  }

  public void setWebRootDir(@Valid @NotNull String webRootDir) {
    this.webRootDir = webRootDir;
  }

  @JsonProperty("database")
  public DataSourceFactory getDataSourceFactory() {
    return database;
  }

  @JsonProperty("database")
  public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
    this.database = dataSourceFactory;
  }
}
