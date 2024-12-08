package computer.matter.cluster.api;

import computer.matter.host.ApiException;
import computer.matter.host.client.model.LoginResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class StorageApiImplTest extends ApiTestBase {
  DataCenterInfo dataCenterInfo;

  @BeforeEach
  void setUp() throws ApiException {
    super.setup();
  }

  @Test
  void listFiles() throws ApiException {
    var storages = storageApi.getStorages(1, 10);
    var storage = storages.getItems().getFirst();

    var sessionRsp = new LoginResponse();
    sessionRsp.setSessionId(UUID.randomUUID().toString());
    Mockito.when(authApi.getSessionId()).thenReturn(sessionRsp);
  }
}