package computer.matter.vcenter;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceContent;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.db.cluster.HostDao;
import computer.matter.db.cluster.StorageDao;
import computer.matter.json.JsonUtil;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServiceContentManager {
  final Logger logger = LoggerFactory.getLogger(ServiceContentManager.class);

  SessionManager sessionManager = new SessionManager();

  Folder rootFolder;
  ManagedObjectManager moManager;
  private Jdbi jdbi;
  private final JsonUtil jsonUtil;
  private HostDao hostDao;
  private StorageDao storageDao;
  private Map<String, Class<?>> moTypeToClass = new HashMap<>();
  private VmApi vmApi;
  private final JobApi jobApi;
  public ServiceContentManager(Jdbi jdbi, JsonUtil jsonUtil, VmApi vmApi, JobApi jobApi) {
    this.jdbi = jdbi;
    this.jsonUtil = jsonUtil;
    this.vmApi = vmApi;
    this.hostDao = jdbi.onDemand(HostDao.class);
    this.storageDao = jdbi.onDemand(StorageDao.class);
    this.jobApi = jobApi;
    buildHierarchy();
  }

  SessionManager getSessionManager() {
    return sessionManager;
  }


  public void buildHierarchy() {
    var taskFactory = new TaskFactory(jobApi, vmApi, jsonUtil);
    var moFactory = new ManagedObjectFactory(jsonUtil, vmApi, jdbi, jobApi, taskFactory);
    moManager = new ManagedObjectManager(moFactory);
    var vmManager = new VirtualMachineManager(moManager, vmApi, jdbi, jsonUtil, jobApi);
    var leaseManager = new HttpNfcLeaseManager(moManager);
    var resourcePool = new ResourcePool("Resources", "resgroup-9", leaseManager, vmManager);
    var network = new Network("VM Network", "HaNetwork-VM Network");

    var discoveredVmFolder = new VmFolder("Discovered virtual machine",  jdbi, jsonUtil, vmApi, jobApi);
    var vmFolder = new RootVmFolder("vm", "folder-vm", List.of(discoveredVmFolder));
    var env = new EnvironmentBrowser("env1", "ha-env-browser-vmx-19", moManager);

    var clusterComputeResource = new ClusterComputeResource(jdbi, hostDao, "Cluster1", "domain-c8", resourcePool, env);
    var hostFolder = new Folder("host", "group-h5", List.of(clusterComputeResource));
    var dataStoreFolder = new DataStoreFolder("datastore", "folder-datastore", storageDao);
    var datacenter = new Datacenter("Datacenter", "datacenter-3", hostFolder, dataStoreFolder, vmFolder);
    rootFolder = new Folder("group-d1", "group-d1", List.of(datacenter));

    var ovfManager = new OvfManager("OvfManager", moManager);
    var propertyCollector = new PropertyCollector("PropertyCollector", moManager);

    moManager.add(resourcePool);
    moManager.add(network);
    moManager.add(vmFolder);
    moManager.add(env);
    moManager.add(dataStoreFolder);
    moManager.add(datacenter);
    moManager.add(rootFolder);
    moManager.add(ovfManager);
    moManager.add(propertyCollector);
    moManager.add(hostFolder);
    moManager.add(clusterComputeResource);
    moManager.add(discoveredVmFolder);
  }


  Object fetch(ManagedObjectReference mo, String prop) {
    if (mo.getType().equalsIgnoreCase("ServiceInstance")) {
      return getServiceContent();
    }

    var m = moManager.get(mo);
    if (m == null) {

        logger.error("Mo not found: " + mo);
        throw new RuntimeException("Mo not found: " + mo);

    }
    var o = ReflectionUtil.getValue(m, prop);
    return o;
  }

  XMLGregorianCalendar getCurrentTime() {
    try {
      DatatypeFactory factory = DatatypeFactory.newInstance();
      return factory.newXMLGregorianCalendar(new GregorianCalendar());
    } catch (DatatypeConfigurationException e) {
      throw new RuntimeException(e);
    }
  }

  ServiceContent getServiceContent() {
    var serviceContent = new ServiceContent();
    ManagedObjectReference rootFolder = new ManagedObjectReference();
    rootFolder.setValue("group-d1");
    rootFolder.setType("Folder");
    serviceContent.setRootFolder(rootFolder);

    // Set property collector
    ManagedObjectReference propertyCollector = new ManagedObjectReference();
    propertyCollector.setType("PropertyCollector");
    propertyCollector.setValue("PropertyCollector");
    serviceContent.setPropertyCollector(propertyCollector);

    // Set view manager
    ManagedObjectReference viewManager = new ManagedObjectReference();
    viewManager.setValue("ViewManager");
    viewManager.setType("ViewManager");
    serviceContent.setViewManager(viewManager);

    // Set about (assuming About class is already defined)
    AboutInfo about = new AboutInfo();
    about.setName("VMware vCenter Server");
    about.setFullName("VMware vCenter Server 7.0.3 build-20051473");
    about.setVendor("VMware, Inc.");
    about.setVersion("7.0.3");
    about.setPatchLevel("00700");
    about.setBuild("20051473");
    about.setLocaleVersion("INTL");
    about.setLocaleBuild("000");
    about.setOsType("linux-x64");
    about.setProductLineId("vpx");
    about.setApiType("VirtualCenter");
    about.setInstanceUuid("1ddce5c4-e8ec-41f5-b44e-03dca8925027");
    about.setApiVersion("7.0.3.0");
    about.setLicenseProductName("VMware VirtualCenter Server");
    about.setLicenseProductVersion("7.0");
    serviceContent.setAbout(about);

    // Set option manager
    ManagedObjectReference setting = new ManagedObjectReference();
    setting.setValue("VpxSettings");
    setting.setType("OptionManager");
    serviceContent.setSetting(setting);

    // Set user directory
    ManagedObjectReference userDirectory = new ManagedObjectReference();
    userDirectory.setValue("UserDirectory");
    userDirectory.setType("UserDirectory");
    serviceContent.setUserDirectory(userDirectory);

    // Set session manager
    ManagedObjectReference sessionManager = new ManagedObjectReference();
    sessionManager.setValue("SessionManager");
    sessionManager.setType("SessionManager");
    serviceContent.setSessionManager(sessionManager);

    // Set authorization manager
    ManagedObjectReference authorizationManager = new ManagedObjectReference();
    authorizationManager.setValue("AuthorizationManager");
    authorizationManager.setType("AuthorizationManager");
    serviceContent.setAuthorizationManager(authorizationManager);

    // Set service manager
    ManagedObjectReference serviceManager = new ManagedObjectReference();
    serviceManager.setValue("ServiceMgr");
    serviceManager.setType("ServiceManager");
    serviceContent.setServiceManager(serviceManager);

    // Set performance manager
    ManagedObjectReference perfManager = new ManagedObjectReference();
    perfManager.setValue("PerfMgr");
    perfManager.setType("PerformanceManager");
    serviceContent.setPerfManager(perfManager);

    ManagedObjectReference scheduledTaskManager = new ManagedObjectReference();
    scheduledTaskManager.setValue("ScheduledTaskManager");
    scheduledTaskManager.setType("ScheduledTaskManager");
    serviceContent.setScheduledTaskManager(scheduledTaskManager);

    ManagedObjectReference alarmManager = new ManagedObjectReference();
    alarmManager.setValue("AlarmManager");
    alarmManager.setType("AlarmManager");
    serviceContent.setAlarmManager(alarmManager);
    // Set event manager
    ManagedObjectReference eventManager = new ManagedObjectReference();
    eventManager.setValue("EventManager");
    eventManager.setType("EventManager");
    serviceContent.setEventManager(eventManager);

    // Set task manager
    ManagedObjectReference taskManager = new ManagedObjectReference();
    taskManager.setValue("TaskManager");
    taskManager.setType("TaskManager");
    serviceContent.setTaskManager(taskManager);

    // Set account manager
    ManagedObjectReference accountManager = new ManagedObjectReference();
    accountManager.setValue("ha-localacctmgr");
    accountManager.setType("HostLocalAccountManager");
    serviceContent.setAccountManager(accountManager);

    ManagedObjectReference customizationMgr = new ManagedObjectReference();
    customizationMgr.setValue("CustomizationSpecManager");
    customizationMgr.setType("CustomizationSpecManager");
    serviceContent.setCustomizationSpecManager(customizationMgr);

    ManagedObjectReference exentionMgr = new ManagedObjectReference();
    exentionMgr.setValue("ExtensionManager");
    exentionMgr.setType("ExtensionManager");
    serviceContent.setExtensionManager(exentionMgr);

    ManagedObjectReference guestMgr = new ManagedObjectReference();
    guestMgr.setValue("GuestCustomizationManager");
    guestMgr.setType("VirtualMachineGuestCustomizationManager");
    serviceContent.setGuestCustomizationManager(guestMgr);

    ManagedObjectReference customFieldMgr = new ManagedObjectReference();
    customFieldMgr.setValue("CustomFieldsManager");
    customFieldMgr.setType("CustomFieldsManager");
    serviceContent.setCustomFieldsManager(customFieldMgr);

    // Set diagnostic manager
    ManagedObjectReference diagnosticManager = new ManagedObjectReference();
    diagnosticManager.setValue("DiagMgr");
    diagnosticManager.setType("DiagnosticManager");
    serviceContent.setDiagnosticManager(diagnosticManager);

    // Set license manager
    ManagedObjectReference licenseManager = new ManagedObjectReference();
    licenseManager.setValue("LicenseManager");
    licenseManager.setType("LicenseManager");
    serviceContent.setLicenseManager(licenseManager);

    // Set search index
    ManagedObjectReference searchIndex = new ManagedObjectReference();
    searchIndex.setValue("SearchIndex");
    searchIndex.setType("SearchIndex");
    serviceContent.setSearchIndex(searchIndex);

    // Set file manager
    ManagedObjectReference fileManager = new ManagedObjectReference();
    fileManager.setValue("FileManager");
    fileManager.setType("FileManager");
    serviceContent.setFileManager(fileManager);

    // Set datastore namespace manager
    ManagedObjectReference datastoreNamespaceManager = new ManagedObjectReference();
    datastoreNamespaceManager.setValue("DatastoreNamespaceManager");
    datastoreNamespaceManager.setType("DatastoreNamespaceManager");
    serviceContent.setDatastoreNamespaceManager(datastoreNamespaceManager);

    // Set virtual disk manager
    ManagedObjectReference virtualDiskManager = new ManagedObjectReference();
    virtualDiskManager.setValue("VirtualDiskManager");
    virtualDiskManager.setType("VirtualDiskManager");
    serviceContent.setVirtualDiskManager(virtualDiskManager);

    ManagedObjectReference snmpMgr = new ManagedObjectReference();
    snmpMgr.setValue("SnmpSystem");
    snmpMgr.setType("HostSnmpSystem");
    serviceContent.setSnmpSystem(snmpMgr);

    ManagedObjectReference vmProvisionChecker = new ManagedObjectReference();
    vmProvisionChecker.setValue("ProvChecker");
    vmProvisionChecker.setType("VirtualMachineProvisioningChecker");
    serviceContent.setVmProvisioningChecker(vmProvisionChecker);

    ManagedObjectReference vmCompChecker = new ManagedObjectReference();
    vmCompChecker.setValue("CompatChecker");
    vmCompChecker.setType("VirtualMachineCompatibilityChecker");
    serviceContent.setVmCompatibilityChecker(vmCompChecker);

    // Set ovf manager
    ManagedObjectReference ovfManager = new ManagedObjectReference();
    ovfManager.setValue("OvfManager");
    ovfManager.setType("OvfManager");
    serviceContent.setOvfManager(ovfManager);

    ManagedObjectReference ippoolMgr = new ManagedObjectReference();
    ippoolMgr.setValue("IpPoolManager");
    ippoolMgr.setType("IpPoolManager");
    serviceContent.setIpPoolManager(ippoolMgr);

    ManagedObjectReference dvsMgr = new ManagedObjectReference();
    dvsMgr.setValue("DVSManager");
    dvsMgr.setType("DistributedVirtualSwitchManager");
    serviceContent.setDvSwitchManager(dvsMgr);

    ManagedObjectReference hostProfileMgr = new ManagedObjectReference();
    hostProfileMgr.setValue("HostProfileManager");
    hostProfileMgr.setType("HostProfileManager");
    serviceContent.setHostProfileManager(hostProfileMgr);

    ManagedObjectReference clusterProfileMgr = new ManagedObjectReference();
    clusterProfileMgr.setValue("ClusterProfileManager");
    clusterProfileMgr.setType("ClusterProfileManager");
    serviceContent.setClusterProfileManager(clusterProfileMgr);

    ManagedObjectReference complainceMgr = new ManagedObjectReference();
    complainceMgr.setValue("MoComplianceManager");
    complainceMgr.setType("ProfileComplianceManager");
    serviceContent.setComplianceManager(complainceMgr);
    // Set localization manager
    ManagedObjectReference localizationManager = new ManagedObjectReference();
    localizationManager.setValue("LocalizationManager");
    localizationManager.setType("LocalizationManager");
    serviceContent.setLocalizationManager(localizationManager);

    // Set storage resource manager
    ManagedObjectReference storageResourceManager = new ManagedObjectReference();
    storageResourceManager.setValue("StorageResourceManager");
    storageResourceManager.setType("StorageResourceManager");
    serviceContent.setStorageResourceManager(storageResourceManager);

    // Set guest operations manager
    ManagedObjectReference guestOperationsManager = new ManagedObjectReference();
    guestOperationsManager.setValue("GuestOperationsManager");
    guestOperationsManager.setType("GuestOperationsManager");
    serviceContent.setGuestOperationsManager(guestOperationsManager);

    ManagedObjectReference overheadMemoryMgr = new ManagedObjectReference();
    overheadMemoryMgr.setValue("OverheadMemoryManager");
    overheadMemoryMgr.setType("OverheadMemoryManager");
    serviceContent.setOverheadMemoryManager(overheadMemoryMgr);

    ManagedObjectReference certificateMgr = new ManagedObjectReference();
    certificateMgr.setValue("CertificateManager");
    certificateMgr.setType("CertificateManager");
    serviceContent.setCertificateManager(certificateMgr);

    ManagedObjectReference iofilterMgr = new ManagedObjectReference();
    iofilterMgr.setValue("IoFilterManager");
    iofilterMgr.setType("IoFilterManager");
    serviceContent.setIoFilterManager(iofilterMgr);

    // Set vstorage object manager
    ManagedObjectReference vStorageObjectManager = new ManagedObjectReference();
    vStorageObjectManager.setValue("VStorageObjectManager");
    vStorageObjectManager.setType("VcenterVStorageObjectManager");
    serviceContent.setVStorageObjectManager(vStorageObjectManager);

    ManagedObjectReference hostspecMgr = new ManagedObjectReference();
    hostspecMgr.setValue("HostSpecificationManager");
    hostspecMgr.setType("HostSpecificationManager");
    serviceContent.setHostSpecManager(hostspecMgr);

    // Set crypto manager
    ManagedObjectReference cryptoManager = new ManagedObjectReference();
    cryptoManager.setValue("CryptoManager");
    cryptoManager.setType("CryptoManagerKmip");
    serviceContent.setCryptoManager(cryptoManager);

    ManagedObjectReference healthUpdateMgr = new ManagedObjectReference();
    healthUpdateMgr.setValue("HealthUpdateManager");
    healthUpdateMgr.setType("HealthUpdateManager");
    serviceContent.setHealthUpdateManager(healthUpdateMgr);

    ManagedObjectReference failoverMgr = new ManagedObjectReference();
    failoverMgr.setValue("FailoverClusterConfigurator");
    failoverMgr.setType("FailoverClusterConfigurator");
    serviceContent.setFailoverClusterConfigurator(failoverMgr);

    ManagedObjectReference failoverClusterMgr = new ManagedObjectReference();
    failoverClusterMgr.setValue("FailoverClusterManager");
    failoverClusterMgr.setType("FailoverClusterManager");
    serviceContent.setFailoverClusterManager(failoverClusterMgr);

    ManagedObjectReference tenantMgr = new ManagedObjectReference();
    tenantMgr.setValue("TenantManager-20051473");
    tenantMgr.setType("TenantTenantManager");
    serviceContent.setTenantManager(tenantMgr);

    ManagedObjectReference siteInfoMgr = new ManagedObjectReference();
    siteInfoMgr.setValue("SiteInfoManager");
    siteInfoMgr.setType("SiteInfoManager");
    serviceContent.setSiteInfoManager(siteInfoMgr);

    ManagedObjectReference storageQueryMgr = new ManagedObjectReference();
    storageQueryMgr.setValue("StorageQueryManager");
    storageQueryMgr.setType("StorageQueryManager");
    serviceContent.setStorageQueryManager(storageQueryMgr);
    return serviceContent;
  }

  public ManagedObjectReference findByInventoryPath(String inventoryPath) {
    var paths = inventoryPath.split("/");
    int i = 1;
    ParentNode r = rootFolder;
    while (i < paths.length) {
      r = (ParentNode) r.child(paths[i]);
      i += 1;
    }
    return (ManagedObjectReference) r;
  }

  public Object invoke(ManagedObjectReference mo, String method, Object... args) {
    var m = moManager.get(mo);
    if (m == null) {
      logger.error("Failed to find {}", mo.getValue());
      throw new RuntimeException("Failed to find " + mo.getValue());
    }
    return ReflectionUtil.invoke(m, method, args);
  }
}
