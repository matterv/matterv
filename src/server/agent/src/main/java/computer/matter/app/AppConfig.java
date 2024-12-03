package computer.matter.app;

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
  private String vmMetadataRootDir;
  @Valid
  @NotNull
  private String webRootDir;
  @Valid
  @NotNull
  private int vmStopWaitInSeconds;

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


  public @Valid @NotNull String getVmMetadataRootDir() {
    return vmMetadataRootDir;
  }

  public void setVmMetadataRootDir(@Valid @NotNull String vmMetadataRootDir) {
    this.vmMetadataRootDir = vmMetadataRootDir;
  }

  @Valid
  @NotNull
  public int getVmStopWaitInSeconds() {
    return vmStopWaitInSeconds;
  }

  public void setVmStopWaitInSeconds(@Valid @NotNull int vmStopWaitInSeconds) {
    this.vmStopWaitInSeconds = vmStopWaitInSeconds;
  }
}
