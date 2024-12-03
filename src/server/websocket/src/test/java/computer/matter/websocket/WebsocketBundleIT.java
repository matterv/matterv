package computer.matter.websocket;

import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.URI;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@ExtendWith(DropwizardExtensionsSupport.class)
public class WebsocketBundleIT {

  @Test
  public void canSendAndReceiveMessageThroughWebsockets() throws Exception {
    var uri = URI.create("ws://127.0.0.1:8442/vnc?host=127.0.0.1&port=5901");

    var client = new ClientEndpointFactory().createClientEndpoint(uri);
    final var countDownLatch = new CountDownLatch(1);
    final AtomicReference<String> message = new AtomicReference<>();
    client.addRecvHandler((String m) -> {
      message.set(m);
      countDownLatch.countDown();
    });
    client.sendMessage("hello");
    countDownLatch.await();
    Assertions.assertEquals("hello", message.get());
  }
}
