package computer.matterv.host.client;


public record CertConfig(String keystorePath, String keystorePassword, String truststorePath,
                         String truststorePassword) {
}
