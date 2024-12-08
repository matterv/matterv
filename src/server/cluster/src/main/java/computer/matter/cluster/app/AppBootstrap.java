package computer.matter.cluster.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import computer.matter.cluster.api.AuthApiImpl;
import computer.matter.cluster.db.model.ComputeClusterDao;
import computer.matter.cluster.db.model.DataCenterDao;
import computer.matter.cluster.db.model.DiskDao;
import computer.matter.cluster.db.model.HostDao;
import computer.matter.cluster.db.model.NetworkDao;
import computer.matter.cluster.db.model.NodeDao;
import computer.matter.cluster.db.model.NodeHierarchyDao;
import computer.matter.cluster.db.model.NodeRelationshipDao;
import computer.matter.cluster.db.model.StorageDao;
import computer.matter.cluster.db.model.UserDao;
import computer.matter.cluster.db.model.UserDo;
import computer.matter.cluster.db.model.VirtualMachineDao;
import computer.matter.cluster.job.JobClientFactory;
import computer.matter.job.DefaultJobSchedulerFactory;
import computer.matter.job.JobClient;
import computer.matter.job.JobSchedulerFactory;
import computer.matter.job.model.JobDao;
import computer.matter.json.JsonUtil;
import computer.matter.os.Clock;
import computer.matter.os.SystemClock;
import computer.matterv.host.client.ApiClientProvider;
import computer.matterv.host.client.CertConfig;
import io.dropwizard.core.server.DefaultServerFactory;
import io.dropwizard.jetty.HttpsConnectorFactory;
import org.jdbi.v3.core.Jdbi;
import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;


public class AppBootstrap {
  private final Logger logger = LoggerFactory.getLogger(AppBootstrap.class);

  private void initRootUser(UserDao userDao) {
    if (userDao.findByName(AuthApiImpl.DEFAULT_ROOT_USER_NAME) == null) {
      logger.debug("Default root user is not initialized, create default root user");
      var user = new UserDo();
      user.name = AuthApiImpl.DEFAULT_ROOT_USER_NAME;
      user.password = BCrypt.hashpw(AuthApiImpl.DEFAULT_ROOT_USER_PASSWORD, BCrypt.gensalt());
      user.uuid = UUID.randomUUID();
      userDao.insert(user);
    }
  }

  public AppDependence bootstrap(Jdbi jdbi, AppConfig appConfig) {
    var d = new AppDependence();
    d.userDao = jdbi.onDemand(UserDao.class);
    d.virtualMachineDao = jdbi.onDemand(VirtualMachineDao.class);
    d.dataCenterDao = jdbi.onDemand(DataCenterDao.class);
    d.computeClusterDao = jdbi.onDemand(ComputeClusterDao.class);
    d.hostDao = jdbi.onDemand(HostDao.class);
    d.storageDao = jdbi.onDemand(StorageDao.class);
    d.networkDao = jdbi.onDemand(NetworkDao.class);
    d.jobDao = jdbi.onDemand(JobDao.class);
    d.nodeDao = jdbi.onDemand(NodeDao.class);
    d.diskDao = jdbi.onDemand(DiskDao.class);
    d.nodeRelationshipDao = jdbi.onDemand(NodeRelationshipDao.class);
    d.nodeDescendentsDao = jdbi.onDemand(NodeHierarchyDao.class);
    d.jobSchedulerFactory = new DefaultJobSchedulerFactory();
    d.clock = new SystemClock();

    var ob = new ObjectMapper();
    d.jsonUtil = new JsonUtil(ob);
    initRootUser(d.userDao);

    var serverConfig = (DefaultServerFactory) appConfig.getServerFactory();
    var httpsConnector = (HttpsConnectorFactory) serverConfig.getApplicationConnectors().getFirst();
    var certConfig = new CertConfig(httpsConnector.getKeyStorePath(), httpsConnector.getKeyStorePassword(),
            httpsConnector.getTrustStorePath(), httpsConnector.getTrustStorePassword());
    d.apiClientProvider = new HostApiClientProvider(certConfig);


    d.jobClient = new JobClientFactory(d.jobDao, jdbi, d.jsonUtil, d.apiClientProvider,
            d.jobSchedulerFactory, d.clock).getJobClient();
    d.jobClient.getJobScheduler().start();
    return d;
  }

  public static class AppDependence {
    UserDao userDao;
    VirtualMachineDao virtualMachineDao;
    DataCenterDao dataCenterDao;
    ComputeClusterDao computeClusterDao;
    HostDao hostDao;
    StorageDao storageDao;
    NetworkDao networkDao;
    JobDao jobDao;
    NodeDao nodeDao;
    DiskDao diskDao;
    NodeRelationshipDao nodeRelationshipDao;
    NodeHierarchyDao nodeDescendentsDao;
    JobClient jobClient;
    JsonUtil jsonUtil;
    ApiClientProvider apiClientProvider;
    JobSchedulerFactory jobSchedulerFactory;
    Clock clock;
  }
}
