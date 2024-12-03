package computer.matter.host.client;

import computer.matter.host.ApiException;
import computer.matterv.host.client.ApiClientExt;
import computer.matterv.host.client.CertConfig;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class HostClientTest {
  @Test
  public void testClient() throws ApiException, KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, KeyManagementException {

    var certConfig = new CertConfig("/opt/dev/matterv/src/server/cluster/config/certs/matterverse.jks",
            "matterversestorepass", "/opt/dev/matterv/src/server/cluster/config/certs/truststore.jks", "mattervpass");
    ApiClientExt.setCertConfig(certConfig);
    var apiClient = new ApiClientExt();
    apiClient.setBasePath("https://localhost:8443/api");
    var hostApi = new HostApi(apiClient);


    hostApi.getHostInfo();
  }
}
