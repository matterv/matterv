package computer.matterv.host.client;

import computer.matter.host.client.AuthApi;
import computer.matter.host.client.HostApi;
import computer.matter.host.client.JobApi;
import computer.matter.host.client.StorageApi;
import computer.matter.host.client.VmApi;

public interface ApiClientProvider {
  HostApi getHostApi(String endpoint);

  VmApi getVmApi(String endpoint);

  JobApi getJobApi(String endpoint);

  AuthApi authApi(String endpoint);

  StorageApi storageApi(String endpoint);
}
