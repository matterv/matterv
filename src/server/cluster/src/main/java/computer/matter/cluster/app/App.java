package computer.matter.cluster.app;

import computer.matter.api.FileBasedAssets;
import computer.matter.api.HttpsSessionHandler;
import computer.matter.api.SessionAuthFilter;
import computer.matter.cluster.api.AuthApiImpl;
import computer.matter.cluster.api.DataCenterApiImpl;
import computer.matter.cluster.api.StorageApiImpl;
import computer.matter.cluster.api.VmApiImpl;
import computer.matter.cluster.db.model.UserDao;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.migrations.MigrationsBundle;
import jakarta.servlet.DispatcherType;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.jackson2.Jackson2Plugin;
import org.jdbi.v3.sqlite3.SQLitePlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import java.util.EnumSet;

public class App extends Application<AppConfig> {
  public static void main(String[] args) throws Exception {
    new App().run(args);
  }

  @Override
  public void initialize(Bootstrap<AppConfig> bootstrap) {
    bootstrap.addBundle(new MultiPartBundle());

    bootstrap.addBundle(new MigrationsBundle<>() {
      @Override
      public PooledDataSourceFactory getDataSourceFactory(AppConfig configuration) {
        return configuration.getDataSourceFactory();
      }

      @Override
      public String getMigrationsFileName() {
        return "cluster-migration.xml";
      }
    });
  }

  private void configureCors(Environment environment) {
    var cors = environment.servlets().addFilter("CORS", CrossOriginFilter.class);

    // Configure CORS parameters
    cors.setInitParameter(CrossOriginFilter.ALLOWED_ORIGINS_PARAM, "*");
    cors.setInitParameter(CrossOriginFilter.ALLOWED_HEADERS_PARAM,
            "X-Requested-With,Content-Type,Accept,Origin,Authorization");
    cors.setInitParameter(CrossOriginFilter.ALLOWED_METHODS_PARAM, "OPTIONS,GET,PUT,POST,DELETE,HEAD");
    cors.setInitParameter(CrossOriginFilter.ALLOW_CREDENTIALS_PARAM, "true");

    // Add URL mapping
    cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
  }

  @Override
  public void run(AppConfig configuration, Environment environment) {
    configureCors(environment);

    var factory = new JdbiFactory();
    var jdbi = factory
            .build(environment, configuration.getDataSourceFactory(), "sqlite")
            .installPlugin(new SQLitePlugin())
            .installPlugin(new SqlObjectPlugin())
            .installPlugin(new Jackson2Plugin());
    environment.jersey().setUrlPattern("/api/*");
    var deps = new AppBootstrap().bootstrap(jdbi, configuration);

    environment.jersey().register(
            new DataCenterApiImpl(
                    deps.dataCenterDao,
                    deps.computeClusterDao,
                    deps.hostDao,
                    deps.virtualMachineDao,
                    deps.storageDao,
                    deps.networkDao,
                    deps.nodeDescendentsDao,
                    jdbi,
                    deps.jobClient,
                    deps.jsonUtil,
                    deps.clock,
                    deps.apiClientProvider
            ));
    environment.jersey()
            .register(new VmApiImpl(deps.virtualMachineDao, deps.diskDao, jdbi, deps.jobClient, deps.jsonUtil));
    environment.jersey().register(new StorageApiImpl(deps.storageDao, deps.apiClientProvider, jdbi));

    environment.servlets().setSessionHandler(HttpsSessionHandler.getSessionHandler());

    environment.jersey().register(new AbstractBinder() {
      @Override
      protected void configure() {
        bind(deps.userDao).to(UserDao.class);
        bind(jdbi).to(Jdbi.class);
      }
    });
    environment.jersey().register(AuthApiImpl.class);
    environment.jersey().register(SessionAuthFilter.class);

    environment.servlets()
            .addServlet("assets", new FileBasedAssets(configuration.getWebRootDir()))
            .addMapping("/index.html", "/assets/*", "/");
  }
}
