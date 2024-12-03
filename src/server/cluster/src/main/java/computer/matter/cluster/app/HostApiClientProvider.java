package computer.matter.cluster.app;

import computer.matter.host.client.AuthApi;
import computer.matter.host.client.HostApi;
import computer.matter.host.client.JobApi;
import computer.matter.host.client.StorageApi;
import computer.matter.host.client.VmApi;
import computer.matterv.host.client.ApiClientExt;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.CertConfig;

public class HostApiClientProvider implements ApiClientProvider {

  public HostApiClientProvider(CertConfig certConfig) {
    ApiClientExt.setCertConfig(certConfig);
  }

  @Override
  public HostApi getHostApi(String endpoint) {
    var apiClient = new ApiClientExt();
    apiClient.setBasePath(endpoint);
    return new HostApi(apiClient);
  }

  @Override
  public VmApi getVmApi(String endpoint) {
    var apiClient = new ApiClientExt();
    apiClient.setBasePath(endpoint);
    return new VmApi(apiClient);
  }

  @Override
  public JobApi getJobApi(String endpoint) {
    var apiClient = new ApiClientExt();
    apiClient.setBasePath(endpoint);
    return new JobApi(apiClient);
  }

  @Override
  public AuthApi authApi(String endpoint) {
    var apiClient = new ApiClientExt();
    apiClient.setBasePath(endpoint);
    return new AuthApi(apiClient);
  }

  @Override
  public StorageApi storageApi(String endpoint) {
    var apiClient = new ApiClientExt();
    apiClient.setBasePath(endpoint);
    return new StorageApi(apiClient);
  }
}
