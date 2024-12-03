package computer.matter.app.api.e2e;

import computer.matter.app.AppBootstrap;
import computer.matter.app.AppConfig;
import computer.matter.app.CreateFakeData;
import computer.matter.app.api.JobApiImpl;
import computer.matter.app.api.VmApiImpl;
import computer.matter.common.test.DbTestBase;
import computer.matter.host.api.JobApi;
import computer.matter.host.api.VmApi;
import computer.matter.host.model.AsyncRequestStatus;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.nio.file.Files;

public class E2eTestBase extends DbTestBase {
  AppConfig appConfig;
  VmApi vmApi;
  JobApi jobApi;

  public void waitJobTerminated(String jobId) {
    var job = jobApi.queryJob(jobId);
    var jobStatus = job.getStatus();
    while (jobStatus != AsyncRequestStatus.FINISHED && jobStatus != AsyncRequestStatus.FAILED) {
      job = jobApi.queryJob(jobId);
      jobStatus = job.getStatus();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @BeforeEach
  public void setup() {
    super.setup();
    appConfig = new AppConfig();
    try {
      appConfig.setVmMetadataRootDir(Files.createTempDirectory("E2eTestBase").toString());
      appConfig.setVmStopWaitInSeconds(5);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    var b = new AppBootstrap().bootstrap(jdbi, appConfig);

    CreateFakeData.create(jdbi);

    vmApi = new VmApiImpl(b.jobClient, jdbi, b.jsonUtil);
    jobApi = new JobApiImpl(b.jobDao);
  }
}
