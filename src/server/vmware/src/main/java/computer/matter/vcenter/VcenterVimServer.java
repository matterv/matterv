package computer.matter.vcenter;

import com.vmware.vim25.ActiveDirectoryFaultFaultMsg;
import com.vmware.vim25.AlarmFilterSpec;
import com.vmware.vim25.AlarmSpec;
import com.vmware.vim25.AlarmState;
import com.vmware.vim25.AlreadyExistsFaultMsg;
import com.vmware.vim25.AlreadyUpgradedFaultMsg;
import com.vmware.vim25.AnswerFile;
import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.AnswerFileStatusResult;
import com.vmware.vim25.AnswerFileUpdateFailedFaultMsg;
import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.AuthMinimumAdminPermissionFaultMsg;
import com.vmware.vim25.BackupBlobWriteFailureFaultMsg;
import com.vmware.vim25.CannotAccessFileFaultMsg;
import com.vmware.vim25.CannotAccessLocalSourceFaultMsg;
import com.vmware.vim25.CannotCreateFileFaultMsg;
import com.vmware.vim25.ClusterComputeResourceCryptoModePolicy;
import com.vmware.vim25.ClusterComputeResourceHCIConfigSpec;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ClusterComputeResourceMaintenanceInfo;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import com.vmware.vim25.ClusterConfigSpec;
import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.ClusterDasAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterEnterMaintenanceResult;
import com.vmware.vim25.ClusterHostRecommendation;
import com.vmware.vim25.ClusterIoFilterInfo;
import com.vmware.vim25.ClusterProfileConfigSpec;
import com.vmware.vim25.ClusterResourceUsageSummary;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ComplianceResult;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.ConcurrentAccessFaultMsg;
import com.vmware.vim25.ConfigTarget;
import com.vmware.vim25.ConflictingConfigurationFaultMsg;
import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.CryptoKeyResult;
import com.vmware.vim25.CryptoManagerHostKeyStatus;
import com.vmware.vim25.CryptoManagerKmipCertSignRequest;
import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatus;
import com.vmware.vim25.CryptoManagerKmipCustomAttributeSpec;
import com.vmware.vim25.CryptoManagerKmipServerCertInfo;
import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.CustomFieldDef;
import com.vmware.vim25.CustomizationFaultFaultMsg;
import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.CustomizationSpecItem;
import com.vmware.vim25.DVPortConfigSpec;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.DVSCapability;
import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.DVSCreateSpec;
import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.DVSManagerDvsConfigTarget;
import com.vmware.vim25.DVSManagerPhysicalNicsList;
import com.vmware.vim25.DVSNetworkResourcePoolConfigSpec;
import com.vmware.vim25.DasConfigFaultFaultMsg;
import com.vmware.vim25.DatabaseSizeEstimate;
import com.vmware.vim25.DatabaseSizeParam;
import com.vmware.vim25.DatacenterBasicConnectInfo;
import com.vmware.vim25.DatacenterConfigSpec;
import com.vmware.vim25.DatacenterMismatchFaultMsg;
import com.vmware.vim25.DatastoreMountPathDatastorePair;
import com.vmware.vim25.DatastoreNamespaceManagerDirectoryInfo;
import com.vmware.vim25.DatastoreNotWritableOnHostFaultMsg;
import com.vmware.vim25.DatastoreVVolContainerFailoverPair;
import com.vmware.vim25.DeviceUnsupportedForVmVersionFaultMsg;
import com.vmware.vim25.DiagnosticManagerAuditRecordResult;
import com.vmware.vim25.DiagnosticManagerLogDescriptor;
import com.vmware.vim25.DiagnosticManagerLogHeader;
import com.vmware.vim25.DisallowedMigrationDeviceAttachedFaultMsg;
import com.vmware.vim25.DiskChangeInfo;
import com.vmware.vim25.DiskCryptoSpec;
import com.vmware.vim25.DistributedVirtualPort;
import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerCompatibilityResult;
import com.vmware.vim25.DistributedVirtualSwitchManagerDvsProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainer;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.DistributedVirtualSwitchNetworkOffloadSpec;
import com.vmware.vim25.DistributedVirtualSwitchPortCriteria;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DuplicateNameFaultMsg;
import com.vmware.vim25.DvsFaultFaultMsg;
import com.vmware.vim25.DvsNotAuthorizedFaultMsg;
import com.vmware.vim25.DvsVmVnicResourcePoolConfigSpec;
import com.vmware.vim25.EVCConfigFaultFaultMsg;
import com.vmware.vim25.EntityBackupConfig;
import com.vmware.vim25.EntityPrivilege;
import com.vmware.vim25.EnvironmentBrowserConfigOptionQuerySpec;
import com.vmware.vim25.Event;
import com.vmware.vim25.EventArgDesc;
import com.vmware.vim25.EventFilterSpec;
import com.vmware.vim25.Extension;
import com.vmware.vim25.ExtensionManagerIpAllocationUsage;
import com.vmware.vim25.FaultToleranceConfigSpec;
import com.vmware.vim25.FcoeConfigFcoeSpecification;
import com.vmware.vim25.FcoeFaultPnicHasNoPortSetFaultMsg;
import com.vmware.vim25.FileAlreadyExistsFaultMsg;
import com.vmware.vim25.FileFaultFaultMsg;
import com.vmware.vim25.FileLockInfoResult;
import com.vmware.vim25.FileNotFoundFaultMsg;
import com.vmware.vim25.FileTransferInformation;
import com.vmware.vim25.FilterInUseFaultMsg;
import com.vmware.vim25.FolderNewHostSpec;
import com.vmware.vim25.GuestAliases;
import com.vmware.vim25.GuestAuthAliasInfo;
import com.vmware.vim25.GuestAuthSubject;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestListFileInfo;
import com.vmware.vim25.GuestMappedAliases;
import com.vmware.vim25.GuestOperationsFaultFaultMsg;
import com.vmware.vim25.GuestPermissionDeniedFaultMsg;
import com.vmware.vim25.GuestProcessInfo;
import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.GuestRegKeyRecordSpec;
import com.vmware.vim25.GuestRegValueNameSpec;
import com.vmware.vim25.GuestRegValueSpec;
import com.vmware.vim25.HealthUpdate;
import com.vmware.vim25.HealthUpdateInfo;
import com.vmware.vim25.HostAccessControlEntry;
import com.vmware.vim25.HostAccessMode;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.HostAutoStartManagerConfig;
import com.vmware.vim25.HostBootDeviceInfo;
import com.vmware.vim25.HostCacheConfigurationSpec;
import com.vmware.vim25.HostCapability;
import com.vmware.vim25.HostCertificateManagerCertificateInfo;
import com.vmware.vim25.HostCertificateManagerCertificateSpec;
import com.vmware.vim25.HostConfigFailedFaultMsg;
import com.vmware.vim25.HostConfigFaultFaultMsg;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.HostConnectFaultFaultMsg;
import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.HostDatastoreBrowserSearchSpec;
import com.vmware.vim25.HostDatastoreSystemVvolDatastoreSpec;
import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.HostDateTimeSystemServiceTestResult;
import com.vmware.vim25.HostDateTimeSystemTimeZone;
import com.vmware.vim25.HostDiagnosticPartition;
import com.vmware.vim25.HostDiagnosticPartitionCreateDescription;
import com.vmware.vim25.HostDiagnosticPartitionCreateOption;
import com.vmware.vim25.HostDiagnosticPartitionCreateSpec;
import com.vmware.vim25.HostDiskDimensionsChs;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.HostDiskPartitionInfo;
import com.vmware.vim25.HostDiskPartitionLayout;
import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostEsxAgentHostManagerConfigInfo;
import com.vmware.vim25.HostFeatureMask;
import com.vmware.vim25.HostFirewallDefaultPolicy;
import com.vmware.vim25.HostFirewallRulesetRulesetSpec;
import com.vmware.vim25.HostFlagInfo;
import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.HostHbaCreateSpec;
import com.vmware.vim25.HostImageProfileSummary;
import com.vmware.vim25.HostIncompatibleForRecordReplayFaultMsg;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties;
import com.vmware.vim25.HostInternetScsiHbaIPProperties;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaSendTarget;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteTableConfig;
import com.vmware.vim25.HostIpmiInfo;
import com.vmware.vim25.HostLockdownMode;
import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.HostMultipathInfoHppLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import com.vmware.vim25.HostNasVolumeSpec;
import com.vmware.vim25.HostNasVolumeUserInfo;
import com.vmware.vim25.HostNetworkConfig;
import com.vmware.vim25.HostNetworkConfigResult;
import com.vmware.vim25.HostNvmeConnectSpec;
import com.vmware.vim25.HostNvmeDisconnectSpec;
import com.vmware.vim25.HostNvmeDiscoverSpec;
import com.vmware.vim25.HostNvmeDiscoveryLog;
import com.vmware.vim25.HostPatchManagerLocator;
import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.HostPathSelectionPolicyOption;
import com.vmware.vim25.HostPciPassthruConfig;
import com.vmware.vim25.HostPortGroupSpec;
import com.vmware.vim25.HostPowerOpFailedFaultMsg;
import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.HostProfileManagerConfigTaskList;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostServiceTicket;
import com.vmware.vim25.HostSnmpConfigSpec;
import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.HostSpecificationOperationFailedFaultMsg;
import com.vmware.vim25.HostStorageArrayTypePolicyOption;
import com.vmware.vim25.HostSubSpecification;
import com.vmware.vim25.HostSystemReconnectSpec;
import com.vmware.vim25.HostSystemResourceInfo;
import com.vmware.vim25.HostSystemSwapConfiguration;
import com.vmware.vim25.HostTpmAttestationReport;
import com.vmware.vim25.HostUnresolvedVmfsResignatureSpec;
import com.vmware.vim25.HostUnresolvedVmfsResolutionResult;
import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import com.vmware.vim25.HostUnresolvedVmfsVolume;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigSpec;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigSpec;
import com.vmware.vim25.HostVMotionCompatibility;
import com.vmware.vim25.HostVffsSpec;
import com.vmware.vim25.HostVffsVolume;
import com.vmware.vim25.HostVirtualNicSpec;
import com.vmware.vim25.HostVirtualSwitchSpec;
import com.vmware.vim25.HostVmfsSpec;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.HostVsanInternalSystemCmmdsQuery;
import com.vmware.vim25.HostVsanInternalSystemDeleteVsanObjectsResult;
import com.vmware.vim25.HostVsanInternalSystemVsanObjectOperationResult;
import com.vmware.vim25.HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import com.vmware.vim25.HttpFaultFaultMsg;
import com.vmware.vim25.HttpNfcLeaseManifestEntry;
import com.vmware.vim25.HttpNfcLeaseProbeResult;
import com.vmware.vim25.HttpNfcLeaseSourceFile;
import com.vmware.vim25.ID;
import com.vmware.vim25.IORMNotSupportedHostOnDatastoreFaultMsg;
import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.InaccessibleDatastoreFaultMsg;
import com.vmware.vim25.InaccessibleVFlashSourceFaultMsg;
import com.vmware.vim25.InsufficientResourcesFaultFaultMsg;
import com.vmware.vim25.InvalidArgumentFaultMsg;
import com.vmware.vim25.InvalidBundleFaultMsg;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import com.vmware.vim25.InvalidControllerFaultMsg;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import com.vmware.vim25.InvalidDatastorePathFaultMsg;
import com.vmware.vim25.InvalidDiskFormatFaultMsg;
import com.vmware.vim25.InvalidEventFaultMsg;
import com.vmware.vim25.InvalidFolderFaultMsg;
import com.vmware.vim25.InvalidGuestLoginFaultMsg;
import com.vmware.vim25.InvalidHostStateFaultMsg;
import com.vmware.vim25.InvalidIpmiLoginInfoFaultMsg;
import com.vmware.vim25.InvalidIpmiMacAddressFaultMsg;
import com.vmware.vim25.InvalidLicenseFaultMsg;
import com.vmware.vim25.InvalidLocaleFaultMsg;
import com.vmware.vim25.InvalidLoginFaultMsg;
import com.vmware.vim25.InvalidNameFaultMsg;
import com.vmware.vim25.InvalidPowerStateFaultMsg;
import com.vmware.vim25.InvalidPrivilegeFaultMsg;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.InvalidRequestFaultMsg;
import com.vmware.vim25.InvalidStateFaultMsg;
import com.vmware.vim25.InvalidTypeFaultMsg;
import com.vmware.vim25.IoFilterManagerSslTrust;
import com.vmware.vim25.IoFilterQueryIssueResult;
import com.vmware.vim25.IpPool;
import com.vmware.vim25.IpPoolManagerIpAllocation;
import com.vmware.vim25.IscsiFaultFaultMsg;
import com.vmware.vim25.IscsiFaultInvalidVnicFaultMsg;
import com.vmware.vim25.IscsiFaultVnicAlreadyBoundFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasActivePathsFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasMultipleUplinksFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasNoUplinksFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasWrongUplinkFaultMsg;
import com.vmware.vim25.IscsiFaultVnicIsLastPathFaultMsg;
import com.vmware.vim25.IscsiFaultVnicNotBoundFaultMsg;
import com.vmware.vim25.IscsiFaultVnicNotFoundFaultMsg;
import com.vmware.vim25.IscsiMigrationDependency;
import com.vmware.vim25.IscsiPortInfo;
import com.vmware.vim25.IscsiStatus;
import com.vmware.vim25.KernelModuleInfo;
import com.vmware.vim25.KeyNotFoundFaultMsg;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.KmipClusterInfo;
import com.vmware.vim25.KmipServerInfo;
import com.vmware.vim25.KmipServerSpec;
import com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment;
import com.vmware.vim25.LicenseAvailabilityInfo;
import com.vmware.vim25.LicenseEntityNotFoundFaultMsg;
import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import com.vmware.vim25.LicenseServerUnavailableFaultMsg;
import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.LicenseUsageInfo;
import com.vmware.vim25.LimitExceededFaultMsg;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.LogBundlingFailedFaultMsg;
import com.vmware.vim25.ManagedObjectNotFoundFaultMsg;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFaultFaultMsg;
import com.vmware.vim25.MismatchedBundleFaultMsg;
import com.vmware.vim25.MissingControllerFaultMsg;
import com.vmware.vim25.NoClientCertificateFaultMsg;
import com.vmware.vim25.NoDiskFoundFaultMsg;
import com.vmware.vim25.NoDiskSpaceFaultMsg;
import com.vmware.vim25.NoSubjectNameFaultMsg;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.NotFoundFaultMsg;
import com.vmware.vim25.NotSupportedFaultMsg;
import com.vmware.vim25.NvdimmNamespaceCreateSpec;
import com.vmware.vim25.NvdimmNamespaceDeleteSpec;
import com.vmware.vim25.NvdimmPMemNamespaceCreateSpec;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.OutOfBoundsFaultMsg;
import com.vmware.vim25.OvfCreateDescriptorParams;
import com.vmware.vim25.OvfCreateDescriptorResult;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfCreateImportSpecResult;
import com.vmware.vim25.OvfParseDescriptorParams;
import com.vmware.vim25.OvfParseDescriptorResult;
import com.vmware.vim25.OvfValidateHostParams;
import com.vmware.vim25.OvfValidateHostResult;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import com.vmware.vim25.PatchBinariesNotFoundFaultMsg;
import com.vmware.vim25.PatchInstallFailedFaultMsg;
import com.vmware.vim25.PatchMetadataInvalidFaultMsg;
import com.vmware.vim25.PatchNotApplicableFaultMsg;
import com.vmware.vim25.PerfCompositeMetric;
import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfInterval;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfProviderSummary;
import com.vmware.vim25.PerfQuerySpec;
import com.vmware.vim25.PerformanceManagerCounterLevelMapping;
import com.vmware.vim25.Permission;
import com.vmware.vim25.PhysicalNicHintInfo;
import com.vmware.vim25.PhysicalNicLinkInfo;
import com.vmware.vim25.PlacementResult;
import com.vmware.vim25.PlacementSpec;
import com.vmware.vim25.PlatformConfigFaultFaultMsg;
import com.vmware.vim25.PrivilegePolicyDef;
import com.vmware.vim25.ProductComponentInfo;
import com.vmware.vim25.ProfileCreateSpec;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import com.vmware.vim25.ProfileDescription;
import com.vmware.vim25.ProfileExecuteResult;
import com.vmware.vim25.ProfileExpressionMetadata;
import com.vmware.vim25.ProfileMetadata;
import com.vmware.vim25.ProfilePolicyMetadata;
import com.vmware.vim25.ProfileProfileStructure;
import com.vmware.vim25.ProfileUpdateFailedFaultMsg;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.RebootRequiredFaultMsg;
import com.vmware.vim25.RecordReplayDisabledFaultMsg;
import com.vmware.vim25.RemoveFailedFaultMsg;
import com.vmware.vim25.RequestCanceledFaultMsg;
import com.vmware.vim25.ResourceConfigOption;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.ResourceInUseFaultMsg;
import com.vmware.vim25.ResourceNotAvailableFaultMsg;
import com.vmware.vim25.RetrieveOptions;
import com.vmware.vim25.RetrieveResult;
import com.vmware.vim25.RetrieveVStorageObjSpec;
import com.vmware.vim25.RollbackFailureFaultMsg;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.SDDCBase;
import com.vmware.vim25.SSLVerifyFaultFaultMsg;
import com.vmware.vim25.SSPIChallengeFaultMsg;
import com.vmware.vim25.ScheduledTaskSpec;
import com.vmware.vim25.SelectionSet;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.ServiceManagerServiceInfo;
import com.vmware.vim25.SessionManagerGenericServiceTicket;
import com.vmware.vim25.SessionManagerLocalTicket;
import com.vmware.vim25.SessionManagerServiceRequestSpec;
import com.vmware.vim25.SiteInfo;
import com.vmware.vim25.SnapshotFaultFaultMsg;
import com.vmware.vim25.SnapshotSelectionSpec;
import com.vmware.vim25.SoftwarePackage;
import com.vmware.vim25.SourceNodeSpec;
import com.vmware.vim25.StorageDrsConfigSpec;
import com.vmware.vim25.StorageIORMConfigOption;
import com.vmware.vim25.StorageIORMConfigSpec;
import com.vmware.vim25.StoragePerformanceSummary;
import com.vmware.vim25.StoragePlacementResult;
import com.vmware.vim25.StoragePlacementSpec;
import com.vmware.vim25.StructuredCustomizations;
import com.vmware.vim25.SystemErrorFaultMsg;
import com.vmware.vim25.SystemEventInfo;
import com.vmware.vim25.TaskFilterSpec;
import com.vmware.vim25.TaskInProgressFaultMsg;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoFilterSpec;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TimedoutFaultMsg;
import com.vmware.vim25.TooManyHostsFaultMsg;
import com.vmware.vim25.ToolsUnavailableFaultMsg;
import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.UsbScanCodeSpec;
import com.vmware.vim25.UserNotFoundFaultMsg;
import com.vmware.vim25.UserPrivilegeResult;
import com.vmware.vim25.UserSearchResult;
import com.vmware.vim25.UserSession;
import com.vmware.vim25.VAppCloneSpec;
import com.vmware.vim25.VAppConfigFaultFaultMsg;
import com.vmware.vim25.VAppConfigSpec;
import com.vmware.vim25.VMwareDvsLacpGroupSpec;
import com.vmware.vim25.VStorageObject;
import com.vmware.vim25.VStorageObjectAssociations;
import com.vmware.vim25.VStorageObjectSnapshotDetails;
import com.vmware.vim25.VStorageObjectSnapshotInfo;
import com.vmware.vim25.VStorageObjectStateInfo;
import com.vmware.vim25.VchaClusterConfigInfo;
import com.vmware.vim25.VchaClusterConfigSpec;
import com.vmware.vim25.VchaClusterDeploymentSpec;
import com.vmware.vim25.VchaClusterHealth;
import com.vmware.vim25.VchaClusterNetworkSpec;
import com.vmware.vim25.VimFaultFaultMsg;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VirtualAppLinkInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskId;
import com.vmware.vim25.VirtualDiskSpec;
import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfo;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineConfigOption;
import com.vmware.vim25.VirtualMachineConfigOptionDescriptor;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineConnection;
import com.vmware.vim25.VirtualMachineDisplayTopology;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineGuestQuiesceSpec;
import com.vmware.vim25.VirtualMachineInstantCloneSpec;
import com.vmware.vim25.VirtualMachineMemoryReservationSpec;
import com.vmware.vim25.VirtualMachineMksTicket;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.VirtualMachineTicket;
import com.vmware.vim25.VirtualMachineVendorDeviceGroupInfo;
import com.vmware.vim25.VirtualMachineVgpuDeviceInfo;
import com.vmware.vim25.VirtualMachineVgpuProfileInfo;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import com.vmware.vim25.VmConfigFaultFaultMsg;
import com.vmware.vim25.VmFaultToleranceIssueFaultMsg;
import com.vmware.vim25.VmToolsUpgradeFaultFaultMsg;
import com.vmware.vim25.VmfsAmbiguousMountFaultMsg;
import com.vmware.vim25.VmfsConfigOption;
import com.vmware.vim25.VmfsDatastoreCreateSpec;
import com.vmware.vim25.VmfsDatastoreExpandSpec;
import com.vmware.vim25.VmfsDatastoreExtendSpec;
import com.vmware.vim25.VmfsDatastoreOption;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import com.vmware.vim25.VsanFaultFaultMsg;
import com.vmware.vim25.VsanHostClusterStatus;
import com.vmware.vim25.VsanHostConfigInfo;
import com.vmware.vim25.VsanHostDiskMapping;
import com.vmware.vim25.VsanHostDiskResult;
import com.vmware.vim25.VsanNewPolicyBatch;
import com.vmware.vim25.VsanPolicyChangeBatch;
import com.vmware.vim25.VsanPolicySatisfiability;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckResult;
import com.vmware.vim25.VsanUpgradeSystemUpgradeStatus;
import com.vmware.vim25.VslmCloneSpec;
import com.vmware.vim25.VslmCreateSpec;
import com.vmware.vim25.VslmInfrastructureObjectPolicy;
import com.vmware.vim25.VslmInfrastructureObjectPolicySpec;
import com.vmware.vim25.VslmRelocateSpec;
import com.vmware.vim25.VslmTagEntry;
import com.vmware.vim25.VslmVClockInfo;
import com.vmware.vim25.WaitOptions;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.soap.SOAPBinding;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@WebService(targetNamespace = "urn:internalvim25", name = "VimPortType", endpointInterface = "com.vmware.vim25.VimPortType")
@BindingType(value = SOAPBinding.SOAP11HTTP_BINDING)
public class VcenterVimServer implements VimPortType {

  private final ServiceContentManager scManager;

  public VcenterVimServer(ServiceContentManager scManager) {
    this.scManager = scManager;
  }

  @Override
  public int addAuthorizationRole(ManagedObjectReference _this, String name, List<String> privIds) throws AlreadyExistsFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public void removeAuthorizationRole(ManagedObjectReference _this, int roleId, boolean failIfUsed) throws NotFoundFaultMsg, RemoveFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateAuthorizationRole(ManagedObjectReference _this, int roleId, String newName, List<String> privIds) throws AlreadyExistsFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void mergePermissions(ManagedObjectReference _this, int srcRoleId, int dstRoleId) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<Permission> retrieveRolePermissions(ManagedObjectReference _this, int roleId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<Permission> retrieveEntityPermissions(ManagedObjectReference _this, ManagedObjectReference entity, boolean inherited) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<Permission> retrieveAllPermissions(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void setEntityPermissions(ManagedObjectReference _this, ManagedObjectReference entity, List<Permission> permission) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void resetEntityPermissions(ManagedObjectReference _this, ManagedObjectReference entity, List<Permission> permission) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void removeEntityPermission(ManagedObjectReference _this, ManagedObjectReference entity, String user, boolean isGroup) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<Boolean> hasPrivilegeOnEntity(ManagedObjectReference _this, ManagedObjectReference entity, String sessionId, List<String> privId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<EntityPrivilege> hasPrivilegeOnEntities(ManagedObjectReference _this, List<ManagedObjectReference> entity, String sessionId, List<String> privId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<EntityPrivilege> hasUserPrivilegeOnEntities(ManagedObjectReference _this, List<ManagedObjectReference> entities, String userName, List<String> privId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<UserPrivilegeResult> fetchUserPrivilegeOnEntities(ManagedObjectReference _this, List<ManagedObjectReference> entities, String userName) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference certMgrRefreshCACertificatesAndCRLsTask(ManagedObjectReference _this, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference certMgrRefreshCertificatesTask(ManagedObjectReference _this, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference certMgrRevokeCertificatesTask(ManagedObjectReference _this, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference configureHCITask(ManagedObjectReference _this, ClusterComputeResourceHCIConfigSpec clusterSpec, List<ClusterComputeResourceHostConfigurationInput> hostInputs) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference extendHCITask(ManagedObjectReference _this, List<ClusterComputeResourceHostConfigurationInput> hostInputs, SDDCBase vSanConfigSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void abandonHciWorkflow(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ClusterComputeResourceValidationResultBase> validateHCIConfiguration(ManagedObjectReference _this, ClusterComputeResourceHCIConfigSpec hciConfigSpec, List<ManagedObjectReference> hosts) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reconfigureClusterTask(ManagedObjectReference _this, ClusterConfigSpec spec, boolean modify) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void applyRecommendation(ManagedObjectReference _this, String key) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void cancelRecommendation(ManagedObjectReference _this, String key) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<ClusterHostRecommendation> recommendHostsForVm(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference pool) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference addHostTask(ManagedObjectReference _this, HostConnectSpec spec, boolean asConnected, ManagedObjectReference resourcePool, String license) throws DuplicateNameFaultMsg, HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference moveIntoTask(ManagedObjectReference _this, List<ManagedObjectReference> host) throws DuplicateNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TooManyHostsFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference moveHostIntoTask(ManagedObjectReference _this, ManagedObjectReference host, ManagedObjectReference resourcePool) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TooManyHostsFaultMsg {
    return null;
  }

  @Override
  public void refreshRecommendation(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference evcManager(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ClusterDasAdvancedRuntimeInfo retrieveDasAdvancedRuntimeInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ClusterEnterMaintenanceResult clusterEnterMaintenanceMode(ManagedObjectReference _this, List<ManagedObjectReference> host, List<OptionValue> option, ClusterComputeResourceMaintenanceInfo info) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public PlacementResult placeVm(ManagedObjectReference _this, PlacementSpec placementSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ClusterRuleInfo> findRulesForVm(ManagedObjectReference _this, ManagedObjectReference vm) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference stampAllRulesWithUuidTask(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ClusterResourceUsageSummary getResourceUsage(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setCryptoMode(ManagedObjectReference _this, String cryptoMode, ClusterComputeResourceCryptoModePolicy policy) throws InvalidArgumentFaultMsg, InvalidRequestFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ManagedObjectReference> getSystemVMsRestrictedDatastores(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reconfigureComputeResourceTask(ManagedObjectReference _this, ComputeResourceConfigSpec spec, boolean modify) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public CustomFieldDef addCustomFieldDef(ManagedObjectReference _this, String name, String moType, PrivilegePolicyDef fieldDefPolicy, PrivilegePolicyDef fieldPolicy) throws DuplicateNameFaultMsg, InvalidPrivilegeFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void removeCustomFieldDef(ManagedObjectReference _this, int key) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void renameCustomFieldDef(ManagedObjectReference _this, int key, String name) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setField(ManagedObjectReference _this, ManagedObjectReference entity, int key, String value) throws RuntimeFaultFaultMsg {

  }

  @Override
  public boolean doesCustomizationSpecExist(ManagedObjectReference _this, String name) throws RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public CustomizationSpecItem getCustomizationSpec(ManagedObjectReference _this, String name) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void createCustomizationSpec(ManagedObjectReference _this, CustomizationSpecItem item) throws AlreadyExistsFaultMsg, CustomizationFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void overwriteCustomizationSpec(ManagedObjectReference _this, CustomizationSpecItem item) throws ConcurrentAccessFaultMsg, CustomizationFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void deleteCustomizationSpec(ManagedObjectReference _this, String name) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void duplicateCustomizationSpec(ManagedObjectReference _this, String name, String newName) throws AlreadyExistsFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void renameCustomizationSpec(ManagedObjectReference _this, String name, String newName) throws AlreadyExistsFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String customizationSpecItemToXml(ManagedObjectReference _this, CustomizationSpecItem item) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public CustomizationSpecItem xmlToCustomizationSpecItem(ManagedObjectReference _this, String specItemXml) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void checkCustomizationResources(ManagedObjectReference _this, String guestOs) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<DatacenterBasicConnectInfo> batchQueryConnectInfo(ManagedObjectReference _this, List<HostConnectSpec> hostSpecs) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public HostConnectInfo queryConnectionInfo(ManagedObjectReference _this, String hostname, int port, String username, String password, String sslThumbprint) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public HostConnectInfo queryConnectionInfoViaSpec(ManagedObjectReference _this, HostConnectSpec spec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerOnMultiVMTask(ManagedObjectReference _this, List<ManagedObjectReference> vm, List<OptionValue> option) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VirtualMachineConfigOptionDescriptor> queryDatacenterConfigOptionDescriptor(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reconfigureDatacenterTask(ManagedObjectReference _this, DatacenterConfigSpec spec, boolean modify) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void refreshDatastore(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshDatastoreStorageInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference updateVirtualMachineFilesTask(ManagedObjectReference _this, List<DatastoreMountPathDatastorePair> mountPathDatastoreMapping) throws InvalidDatastoreFaultMsg, PlatformConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void renameDatastore(ManagedObjectReference _this, String newName) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyDatastore(ManagedObjectReference _this) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public StoragePlacementResult datastoreEnterMaintenanceMode(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference datastoreExitMaintenanceModeTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public boolean isClusteredVmdkEnabled(ManagedObjectReference _this) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public ManagedObjectReference updateVVolVirtualMachineFilesTask(ManagedObjectReference _this, List<DatastoreVVolContainerFailoverPair> failoverPair) throws InvalidDatastoreFaultMsg, NotSupportedFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public String createDirectory(ManagedObjectReference _this, ManagedObjectReference datastore, String displayName, String policy, Long size) throws CannotCreateFileFaultMsg, FileAlreadyExistsFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void deleteDirectory(ManagedObjectReference _this, ManagedObjectReference datacenter, String datastorePath) throws FileFaultFaultMsg, FileNotFoundFaultMsg, InvalidDatastoreFaultMsg, InvalidDatastorePathFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String convertNamespacePathToUuidPath(ManagedObjectReference _this, ManagedObjectReference datacenter, String namespaceUrl) throws InvalidDatastoreFaultMsg, InvalidDatastorePathFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void increaseDirectorySize(ManagedObjectReference _this, ManagedObjectReference datacenter, String stableName, long size) throws FileFaultFaultMsg, FileNotFoundFaultMsg, InvalidArgumentFaultMsg, InvalidDatastoreFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public DatastoreNamespaceManagerDirectoryInfo queryDirectoryInfo(ManagedObjectReference _this, ManagedObjectReference datacenter, String stableName) throws FileFaultFaultMsg, FileNotFoundFaultMsg, InvalidDatastoreFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<DiagnosticManagerLogDescriptor> queryDescriptions(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public DiagnosticManagerLogHeader browseDiagnosticLog(ManagedObjectReference _this, ManagedObjectReference host, String key, Integer start, Integer lines) throws CannotAccessFileFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference generateLogBundlesTask(ManagedObjectReference _this, boolean includeDefault, List<ManagedObjectReference> host) throws LogBundlingFailedFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public DiagnosticManagerAuditRecordResult fetchAuditRecords(ManagedObjectReference _this, String token) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, SystemErrorFaultMsg {
    return null;
  }

  @Override
  public void emitSyslogMark(ManagedObjectReference _this, String message) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<String> fetchDVPortKeys(ManagedObjectReference _this, DistributedVirtualSwitchPortCriteria criteria) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<DistributedVirtualPort> fetchDVPorts(ManagedObjectReference _this, DistributedVirtualSwitchPortCriteria criteria) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<Integer> queryUsedVlanIdInDvs(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reconfigureDvsTask(ManagedObjectReference _this, DVSConfigSpec spec) throws AlreadyExistsFaultMsg, ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, DvsFaultFaultMsg, DvsNotAuthorizedFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, LimitExceededFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, ResourceNotAvailableFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference performDvsProductSpecOperationTask(ManagedObjectReference _this, String operation, DistributedVirtualSwitchProductSpec productSpec) throws DvsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference mergeDvsTask(ManagedObjectReference _this, ManagedObjectReference dvs) throws DvsFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference addDVPortgroupTask(ManagedObjectReference _this, List<DVPortgroupConfigSpec> spec) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference moveDVPortTask(ManagedObjectReference _this, List<String> portKey, String destinationPortgroupKey) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateDvsCapability(ManagedObjectReference _this, DVSCapability capability) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference reconfigureDVPortTask(ManagedObjectReference _this, List<DVPortConfigSpec> port) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void refreshDVPortState(ManagedObjectReference _this, List<String> portKeys) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference rectifyDvsHostTask(ManagedObjectReference _this, List<ManagedObjectReference> hosts) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateNetworkResourcePool(ManagedObjectReference _this, List<DVSNetworkResourcePoolConfigSpec> configSpec) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void addNetworkResourcePool(ManagedObjectReference _this, List<DVSNetworkResourcePoolConfigSpec> configSpec) throws DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeNetworkResourcePool(ManagedObjectReference _this, List<String> key) throws DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference dvsReconfigureVmVnicNetworkResourcePoolTask(ManagedObjectReference _this, List<DvsVmVnicResourcePoolConfigSpec> configSpec) throws ConcurrentAccessFaultMsg, ConflictingConfigurationFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void enableNetworkResourceManagement(ManagedObjectReference _this, boolean enable) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference dvsRollbackTask(ManagedObjectReference _this, EntityBackupConfig entityBackup) throws DvsFaultFaultMsg, RollbackFailureFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createDVPortgroupTask(ManagedObjectReference _this, DVPortgroupConfigSpec spec) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateDVSHealthCheckConfigTask(ManagedObjectReference _this, List<DVSHealthCheckConfig> healthCheckConfig) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference lookupDvPortGroup(ManagedObjectReference _this, String portgroupKey) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VirtualMachineConfigOptionDescriptor> queryConfigOptionDescriptor(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public VirtualMachineConfigOption queryConfigOption(ManagedObjectReference _this, String key, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VirtualMachineConfigOption queryConfigOptionEx(ManagedObjectReference _this, EnvironmentBrowserConfigOptionQuerySpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ConfigTarget queryConfigTarget(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return (ConfigTarget) scManager.invoke(_this, "queryConfigTarget", host);
  }

  @Override
  public HostCapability queryTargetCapabilities(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setCustomValue(ManagedObjectReference _this, String key, String value) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void unregisterExtension(ManagedObjectReference _this, String extensionKey) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public Extension findExtension(ManagedObjectReference _this, String extensionKey) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void registerExtension(ManagedObjectReference _this, Extension extension) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateExtension(ManagedObjectReference _this, Extension extension) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String getPublicKey(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void setPublicKey(ManagedObjectReference _this, String extensionKey, String publicKey) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void setExtensionCertificate(ManagedObjectReference _this, String extensionKey, String certificatePem) throws NoClientCertificateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setServiceAccount(ManagedObjectReference _this, String extensionKey, String serviceAccount) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ManagedObjectReference> queryManagedBy(ManagedObjectReference _this, String extensionKey) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ExtensionManagerIpAllocationUsage> queryExtensionIpAllocationUsage(ManagedObjectReference _this, List<String> extensionKeys) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference moveDatastoreFileTask(ManagedObjectReference _this, String sourceName, ManagedObjectReference sourceDatacenter, String destinationName, ManagedObjectReference destinationDatacenter, Boolean force) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference copyDatastoreFileTask(ManagedObjectReference _this, String sourceName, ManagedObjectReference sourceDatacenter, String destinationName, ManagedObjectReference destinationDatacenter, Boolean force) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteDatastoreFileTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void makeDirectory(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, Boolean createParentDirectories) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void changeOwner(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, String owner) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public FileLockInfoResult queryFileLockInfo(ManagedObjectReference _this, String path, ManagedObjectReference host) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createFolder(ManagedObjectReference _this, String name) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference moveIntoFolderTask(ManagedObjectReference _this, List<ManagedObjectReference> list) throws DuplicateNameFaultMsg, InvalidFolderFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createVMTask(ManagedObjectReference _this, VirtualMachineConfigSpec config, ManagedObjectReference pool, ManagedObjectReference host) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference registerVMTask(ManagedObjectReference _this, String path, String name, boolean asTemplate, ManagedObjectReference pool, ManagedObjectReference host) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createCluster(ManagedObjectReference _this, String name, ClusterConfigSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createClusterEx(ManagedObjectReference _this, String name, ClusterConfigSpecEx spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference addStandaloneHostTask(ManagedObjectReference _this, HostConnectSpec spec, ComputeResourceConfigSpec compResSpec, boolean addConnected, String license) throws DuplicateNameFaultMsg, HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createDatacenter(ManagedObjectReference _this, String name) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference unregisterAndDestroyTask(ManagedObjectReference _this) throws ConcurrentAccessFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createDVSTask(ManagedObjectReference _this, DVSCreateSpec spec) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, DvsNotAuthorizedFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createStoragePod(ManagedObjectReference _this, String name) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference batchAddStandaloneHostsTask(ManagedObjectReference _this, List<FolderNewHostSpec> newHosts, ComputeResourceConfigSpec compResSpec, boolean addConnected) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference batchAddHostsToClusterTask(ManagedObjectReference _this, ManagedObjectReference cluster, List<FolderNewHostSpec> newHosts, List<ManagedObjectReference> existingHosts, ComputeResourceConfigSpec compResSpec, String desiredState) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String registerHealthUpdateProvider(ManagedObjectReference _this, String name, List<HealthUpdateInfo> healthUpdateInfo) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void unregisterHealthUpdateProvider(ManagedObjectReference _this, String providerId) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<String> queryProviderList(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public boolean hasProvider(ManagedObjectReference _this, String id) throws RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public String queryProviderName(ManagedObjectReference _this, String id) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public List<HealthUpdateInfo> queryHealthUpdateInfos(ManagedObjectReference _this, String providerId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void addMonitoredEntities(ManagedObjectReference _this, String providerId, List<ManagedObjectReference> entities) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeMonitoredEntities(ManagedObjectReference _this, String providerId, List<ManagedObjectReference> entities) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ManagedObjectReference> queryMonitoredEntities(ManagedObjectReference _this, String providerId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public boolean hasMonitoredEntity(ManagedObjectReference _this, String providerId, ManagedObjectReference entity) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public List<ManagedObjectReference> queryUnmonitoredHosts(ManagedObjectReference _this, String providerId, ManagedObjectReference cluster) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void postHealthUpdates(ManagedObjectReference _this, String providerId, List<HealthUpdate> updates) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HealthUpdate> queryHealthUpdates(ManagedObjectReference _this, String providerId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String addFilter(ManagedObjectReference _this, String providerId, String filterName, List<String> infoIds) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public List<String> queryFilterList(ManagedObjectReference _this, String providerId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String queryFilterName(ManagedObjectReference _this, String filterId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public List<String> queryFilterInfoIds(ManagedObjectReference _this, String filterId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> queryFilterEntities(ManagedObjectReference _this, String filterId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void addFilterEntities(ManagedObjectReference _this, String filterId, List<ManagedObjectReference> entities) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeFilterEntities(ManagedObjectReference _this, String filterId, List<ManagedObjectReference> entities) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeFilter(ManagedObjectReference _this, String filterId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setCollectorPageSize(ManagedObjectReference _this, int maxCount) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void rewindCollector(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void resetCollector(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyCollector(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public HostTpmAttestationReport queryTpmAttestationReport(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public HostConnectInfo queryHostConnectionInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateSystemResources(ManagedObjectReference _this, HostSystemResourceInfo resourceInfo) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateSystemSwapConfiguration(ManagedObjectReference _this, HostSystemSwapConfiguration sysSwapConfig) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference reconnectHostTask(ManagedObjectReference _this, HostConnectSpec cnxSpec, HostSystemReconnectSpec reconnectSpec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference disconnectHostTask(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference enterMaintenanceModeTask(ManagedObjectReference _this, int timeout, Boolean evacuatePoweredOffVms, HostMaintenanceSpec maintenanceSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference exitMaintenanceModeTask(ManagedObjectReference _this, int timeout) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference rebootHostTask(ManagedObjectReference _this, boolean force) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference shutdownHostTask(ManagedObjectReference _this, boolean force) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerDownHostToStandByTask(ManagedObjectReference _this, int timeoutSec, Boolean evacuatePoweredOffVms) throws HostPowerOpFailedFaultMsg, InvalidStateFaultMsg, NotSupportedFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerUpHostFromStandByTask(ManagedObjectReference _this, int timeoutSec) throws HostPowerOpFailedFaultMsg, InvalidStateFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {
    return null;
  }

  @Override
  public long queryMemoryOverhead(ManagedObjectReference _this, long memorySize, Integer videoRamSize, int numVcpus) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public long queryMemoryOverheadEx(ManagedObjectReference _this, VirtualMachineConfigInfo vmConfigInfo) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public ManagedObjectReference reconfigureHostForDASTask(ManagedObjectReference _this) throws DasConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateFlags(ManagedObjectReference _this, HostFlagInfo flagInfo) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void enterLockdownMode(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void exitLockdownMode(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostServiceTicket acquireCimServicesTicket(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateIpmi(ManagedObjectReference _this, HostIpmiInfo ipmiInfo) throws InvalidIpmiLoginInfoFaultMsg, InvalidIpmiMacAddressFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public long retrieveHardwareUptime(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public void prepareCrypto(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void enableCrypto(ManagedObjectReference _this, CryptoKeyPlain keyPlain) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void configureCryptoKey(ManagedObjectReference _this, CryptoKeyId keyId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public String queryProductLockerLocation(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference updateProductLockerLocationTask(ManagedObjectReference _this, String path) throws FileNotFoundFaultMsg, HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public long retrieveFreeEpcMemory(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public List<HttpNfcLeaseManifestEntry> httpNfcLeaseGetManifest(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {
    return List.of();
  }

  @Override
  public void httpNfcLeaseSetManifestChecksumType(ManagedObjectReference _this, List<KeyValue> deviceUrlsToChecksumTypes) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void httpNfcLeaseComplete(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {

  }

  @Override
  public void httpNfcLeaseAbort(ManagedObjectReference _this, LocalizedMethodFault fault) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg {

  }

  @Override
  public void httpNfcLeaseProgress(ManagedObjectReference _this, int percent) throws RuntimeFaultFaultMsg, TimedoutFaultMsg {

  }

  @Override
  public ManagedObjectReference httpNfcLeasePullFromUrlsTask(ManagedObjectReference _this, List<HttpNfcLeaseSourceFile> files) throws HttpFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SSLVerifyFaultFaultMsg {
    return null;
  }

  @Override
  public List<HttpNfcLeaseProbeResult> httpNfcLeaseProbeUrls(ManagedObjectReference _this, List<HttpNfcLeaseSourceFile> files, Integer timeout) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference installIoFilterTask(ManagedObjectReference _this, String vibUrl, ManagedObjectReference compRes, IoFilterManagerSslTrust vibSslTrust) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference uninstallIoFilterTask(ManagedObjectReference _this, String filterId, ManagedObjectReference compRes) throws FilterInUseFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference upgradeIoFilterTask(ManagedObjectReference _this, String filterId, ManagedObjectReference compRes, String vibUrl, IoFilterManagerSslTrust vibSslTrust) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public IoFilterQueryIssueResult queryIoFilterIssues(ManagedObjectReference _this, String filterId, ManagedObjectReference compRes) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ClusterIoFilterInfo> queryIoFilterInfo(ManagedObjectReference _this, ManagedObjectReference compRes) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference resolveInstallationErrorsOnHostTask(ManagedObjectReference _this, String filterId, ManagedObjectReference host) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference resolveInstallationErrorsOnClusterTask(ManagedObjectReference _this, String filterId, ManagedObjectReference cluster) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VirtualDiskId> queryDisksUsingFilter(ManagedObjectReference _this, String filterId, ManagedObjectReference compRes) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<IpPool> queryIpPools(ManagedObjectReference _this, ManagedObjectReference dc) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public int createIpPool(ManagedObjectReference _this, ManagedObjectReference dc, IpPool pool) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public void updateIpPool(ManagedObjectReference _this, ManagedObjectReference dc, IpPool pool) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyIpPool(ManagedObjectReference _this, ManagedObjectReference dc, int id, boolean force) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String allocateIpv4Address(ManagedObjectReference _this, ManagedObjectReference dc, int poolId, String allocationId) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String allocateIpv6Address(ManagedObjectReference _this, ManagedObjectReference dc, int poolId, String allocationId) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void releaseIpAllocation(ManagedObjectReference _this, ManagedObjectReference dc, int poolId, String allocationId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<IpPoolManagerIpAllocation> queryIPAllocations(ManagedObjectReference _this, ManagedObjectReference dc, int poolId, String extensionKey) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public LicenseManagerLicenseInfo updateAssignedLicense(ManagedObjectReference _this, String entity, String licenseKey, String entityDisplayName) throws LicenseEntityNotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void removeAssignedLicense(ManagedObjectReference _this, String entityId) throws LicenseEntityNotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<LicenseAssignmentManagerLicenseAssignment> queryAssignedLicenses(ManagedObjectReference _this, String entityId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<LicenseFeatureInfo> querySupportedFeatures(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<LicenseAvailabilityInfo> queryLicenseSourceAvailability(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public LicenseUsageInfo queryLicenseUsage(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setLicenseEdition(ManagedObjectReference _this, ManagedObjectReference host, String featureKey) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public boolean checkLicenseFeature(ManagedObjectReference _this, ManagedObjectReference host, String featureKey) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public boolean enableFeature(ManagedObjectReference _this, ManagedObjectReference host, String featureKey) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public boolean disableFeature(ManagedObjectReference _this, ManagedObjectReference host, String featureKey) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public void configureLicenseSource(ManagedObjectReference _this, ManagedObjectReference host, LicenseSource licenseSource) throws CannotAccessLocalSourceFaultMsg, InvalidLicenseFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public LicenseManagerLicenseInfo updateLicense(ManagedObjectReference _this, String licenseKey, List<KeyValue> labels) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public LicenseManagerLicenseInfo addLicense(ManagedObjectReference _this, String licenseKey, List<KeyValue> labels) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void removeLicense(ManagedObjectReference _this, String licenseKey) throws RuntimeFaultFaultMsg {

  }

  @Override
  public LicenseManagerLicenseInfo decodeLicense(ManagedObjectReference _this, String licenseKey) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateLicenseLabel(ManagedObjectReference _this, String licenseKey, String labelKey, String labelValue) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void removeLicenseLabel(ManagedObjectReference _this, String licenseKey, String labelKey) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void reload(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference renameTask(ManagedObjectReference _this, String newName) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference destroyTask(ManagedObjectReference _this) throws RuntimeFaultFaultMsg, VimFaultFaultMsg {
    return null;
  }

  @Override
  public void destroyNetwork(ManagedObjectReference _this) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public long lookupVmOverheadMemory(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference host) throws InvalidArgumentFaultMsg, InvalidTypeFaultMsg, ManagedObjectNotFoundFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public OvfValidateHostResult validateHost(ManagedObjectReference _this, String ovfDescriptor, ManagedObjectReference host, OvfValidateHostParams vhp) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public OvfParseDescriptorResult parseDescriptor(ManagedObjectReference _this, String ovfDescriptor, OvfParseDescriptorParams pdp) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public OvfCreateImportSpecResult createImportSpec(ManagedObjectReference _this, String ovfDescriptor, ManagedObjectReference resourcePool, ManagedObjectReference datastore, OvfCreateImportSpecParams cisp) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return (OvfCreateImportSpecResult) scManager.invoke(_this, "createImportSpec", ovfDescriptor, resourcePool, datastore, cisp);
  }

  @Override
  public OvfCreateDescriptorResult createDescriptor(ManagedObjectReference _this, ManagedObjectReference obj, OvfCreateDescriptorParams cdp) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public PerfProviderSummary queryPerfProviderSummary(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<PerfMetricId> queryAvailablePerfMetric(ManagedObjectReference _this, ManagedObjectReference entity, XMLGregorianCalendar beginTime, XMLGregorianCalendar endTime, Integer intervalId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<PerfCounterInfo> queryPerfCounter(ManagedObjectReference _this, List<Integer> counterId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<PerfCounterInfo> queryPerfCounterByLevel(ManagedObjectReference _this, int level) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<PerfEntityMetricBase> queryPerf(ManagedObjectReference _this, List<PerfQuerySpec> querySpec) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public PerfCompositeMetric queryPerfComposite(ManagedObjectReference _this, PerfQuerySpec querySpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void createPerfInterval(ManagedObjectReference _this, PerfInterval intervalId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void removePerfInterval(ManagedObjectReference _this, int samplePeriod) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updatePerfInterval(ManagedObjectReference _this, PerfInterval interval) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateCounterLevelMapping(ManagedObjectReference _this, List<PerformanceManagerCounterLevelMapping> counterLevelMap) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void resetCounterLevelMapping(ManagedObjectReference _this, List<Integer> counters) throws RuntimeFaultFaultMsg {

  }

  @Override
  public DatabaseSizeEstimate estimateDatabaseSize(ManagedObjectReference _this, DatabaseSizeParam dbSizeParam) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateConfig(ManagedObjectReference _this, String name, ResourceConfigSpec config) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void moveIntoResourcePool(ManagedObjectReference _this, List<ManagedObjectReference> list) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateChildResourceConfiguration(ManagedObjectReference _this, List<ResourceConfigSpec> spec) throws InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createResourcePool(ManagedObjectReference _this, String name, ResourceConfigSpec spec) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void destroyChildren(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createVApp(ManagedObjectReference _this, String name, ResourceConfigSpec resSpec, VAppConfigSpec configSpec, ManagedObjectReference vmFolder) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createChildVMTask(ManagedObjectReference _this, VirtualMachineConfigSpec config, ManagedObjectReference host) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference registerChildVMTask(ManagedObjectReference _this, String path, String name, ManagedObjectReference host) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference importVApp(ManagedObjectReference _this, ImportSpec spec, ManagedObjectReference folder, ManagedObjectReference host) throws DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return (ManagedObjectReference) scManager.invoke(_this, "importVApp", spec, folder, host);
  }

  @Override
  public ResourceConfigOption queryResourceConfigOption(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void refreshRuntime(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference findByUuid(ManagedObjectReference _this, ManagedObjectReference datacenter, String uuid, boolean vmSearch, Boolean instanceUuid) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference findByDatastorePath(ManagedObjectReference _this, ManagedObjectReference datacenter, String path) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference findByDnsName(ManagedObjectReference _this, ManagedObjectReference datacenter, String dnsName, boolean vmSearch) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference findByIp(ManagedObjectReference _this, ManagedObjectReference datacenter, String ip, boolean vmSearch) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference findByInventoryPath(ManagedObjectReference _this, String inventoryPath) throws RuntimeFaultFaultMsg {
    return scManager.findByInventoryPath(inventoryPath);
  }

  @Override
  public ManagedObjectReference findChild(ManagedObjectReference _this, ManagedObjectReference entity, String name) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> findAllByUuid(ManagedObjectReference _this, ManagedObjectReference datacenter, String uuid, boolean vmSearch, Boolean instanceUuid) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> findAllByDnsName(ManagedObjectReference _this, ManagedObjectReference datacenter, String dnsName, boolean vmSearch) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> findAllByIp(ManagedObjectReference _this, ManagedObjectReference datacenter, String ip, boolean vmSearch) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public XMLGregorianCalendar currentTime(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return scManager.getCurrentTime();
  }

  @Override
  public ServiceContent retrieveServiceContent(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<Event> validateMigration(ManagedObjectReference _this, List<ManagedObjectReference> vm, VirtualMachinePowerState state, List<String> testType, ManagedObjectReference pool, ManagedObjectReference host) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostVMotionCompatibility> queryVMotionCompatibility(ManagedObjectReference _this, ManagedObjectReference vm, List<ManagedObjectReference> host, List<String> compatibility) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ProductComponentInfo> retrieveProductComponents(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ServiceManagerServiceInfo> queryServiceList(ManagedObjectReference _this, String serviceName, List<String> location) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateServiceMessage(ManagedObjectReference _this, String message) throws RuntimeFaultFaultMsg {

  }

  @Override
  public UserSession loginByToken(ManagedObjectReference _this, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public UserSession login(ManagedObjectReference _this, String userName, String password, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return scManager.getSessionManager().login(userName, password, locale);
  }

  @Override
  public UserSession loginBySSPI(ManagedObjectReference _this, String base64Token, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg, SSPIChallengeFaultMsg {
    return null;
  }

  @Override
  public void logout(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public SessionManagerLocalTicket acquireLocalTicket(ManagedObjectReference _this, String userName) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public SessionManagerGenericServiceTicket acquireGenericServiceTicket(ManagedObjectReference _this, SessionManagerServiceRequestSpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void terminateSession(ManagedObjectReference _this, List<String> sessionId) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setLocale(ManagedObjectReference _this, String locale) throws InvalidLocaleFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public UserSession loginExtensionBySubjectName(ManagedObjectReference _this, String extensionKey, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, NoClientCertificateFaultMsg, NoSubjectNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public UserSession loginExtensionByCertificate(ManagedObjectReference _this, String extensionKey, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, NoClientCertificateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public UserSession impersonateUser(ManagedObjectReference _this, String userName, String locale) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public boolean sessionIsActive(ManagedObjectReference _this, String sessionID, String userName) throws RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public String acquireCloneTicket(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public UserSession cloneSession(ManagedObjectReference _this, String cloneTicket) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String executeSimpleCommand(ManagedObjectReference _this, List<String> arguments) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public SiteInfo getSiteInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> queryHostsWithAttachedLun(ManagedObjectReference _this, String lunUuid) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference configureDatastoreIORMTask(ManagedObjectReference _this, ManagedObjectReference datastore, StorageIORMConfigSpec spec) throws IORMNotSupportedHostOnDatastoreFaultMsg, InaccessibleDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public StorageIORMConfigOption queryIORMConfigOption(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<StoragePerformanceSummary> queryDatastorePerformanceSummary(ManagedObjectReference _this, ManagedObjectReference datastore) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference applyStorageDrsRecommendationToPodTask(ManagedObjectReference _this, ManagedObjectReference pod, String key) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference applyStorageDrsRecommendationTask(ManagedObjectReference _this, List<String> key) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void cancelStorageDrsRecommendation(ManagedObjectReference _this, List<String> key) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshStorageDrsRecommendation(ManagedObjectReference _this, ManagedObjectReference pod) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference refreshStorageDrsRecommendationsForPodTask(ManagedObjectReference _this, ManagedObjectReference pod) throws InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference configureStorageDrsForPodTask(ManagedObjectReference _this, ManagedObjectReference pod, StorageDrsConfigSpec spec, boolean modify) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public LocalizedMethodFault validateStoragePodConfig(ManagedObjectReference _this, ManagedObjectReference pod, StorageDrsConfigSpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public StoragePlacementResult recommendDatastores(ManagedObjectReference _this, StoragePlacementSpec storageSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void cancelTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateProgress(ManagedObjectReference _this, int percentDone) throws InvalidStateFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setTaskState(ManagedObjectReference _this, TaskInfoState state, Object result, LocalizedMethodFault fault) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setTaskDescription(ManagedObjectReference _this, LocalizableMessage description) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<TaskInfo> readNextTasks(ManagedObjectReference _this, int maxCount) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<TaskInfo> readPreviousTasks(ManagedObjectReference _this, int maxCount) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference createCollectorForTasks(ManagedObjectReference _this, TaskFilterSpec filter) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createCollectorWithInfoFilterForTasks(ManagedObjectReference _this, TaskFilterSpec filter, TaskInfoFilterSpec infoFilter) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public TaskInfo createTask(ManagedObjectReference _this, ManagedObjectReference obj, String taskTypeId, String initiatedBy, boolean cancelable, String parentTaskKey, String activationId) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<UserSearchResult> retrieveUserGroups(ManagedObjectReference _this, String domain, String searchStr, String belongsToGroup, String belongsToUser, boolean exactMatch, boolean findUsers, boolean findGroups) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateVAppConfig(ManagedObjectReference _this, VAppConfigSpec spec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {

  }

  @Override
  public void updateLinkedChildren(ManagedObjectReference _this, List<VirtualAppLinkInfo> addChangeSet, List<ManagedObjectReference> removeSet) throws ConcurrentAccessFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference cloneVAppTask(ManagedObjectReference _this, String name, ManagedObjectReference target, VAppCloneSpec spec) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference exportVApp(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerOnVAppTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerOffVAppTask(ManagedObjectReference _this, boolean force) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference suspendVAppTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference unregisterVAppTask(ManagedObjectReference _this) throws ConcurrentAccessFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, VirtualDiskSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference moveVirtualDiskTask(ManagedObjectReference _this, String sourceName, ManagedObjectReference sourceDatacenter, String destName, ManagedObjectReference destDatacenter, Boolean force, List<VirtualMachineProfileSpec> profile) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference copyVirtualDiskTask(ManagedObjectReference _this, String sourceName, ManagedObjectReference sourceDatacenter, String destName, ManagedObjectReference destDatacenter, VirtualDiskSpec destSpec, Boolean force) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidDiskFormatFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference extendVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, long newCapacityKb, Boolean eagerZero) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public int queryVirtualDiskFragmentation(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public ManagedObjectReference defragmentVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference shrinkVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, Boolean copy) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference inflateVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference eagerZeroVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference zeroFillVirtualDiskTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setVirtualDiskUuid(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, String uuid) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String queryVirtualDiskUuid(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public HostDiskDimensionsChs queryVirtualDiskGeometry(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void importUnmanagedSnapshot(ManagedObjectReference _this, String vdisk, ManagedObjectReference datacenter, String vvolId) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void releaseManagedSnapshot(ManagedObjectReference _this, String vdisk, ManagedObjectReference datacenter) throws FileNotFoundFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public Object fetch(ManagedObjectReference _this, String prop) {
    return scManager.fetch(_this, prop);
  }

  @Override
  public void refreshStorageInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createSnapshotTask(ManagedObjectReference _this, String name, String description, boolean memory, boolean quiesce) throws FileFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createSnapshotExTask(ManagedObjectReference _this, String name, String description, boolean memory, VirtualMachineGuestQuiesceSpec quiesceSpec) throws FileFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference revertToCurrentSnapshotTask(ManagedObjectReference _this, ManagedObjectReference host, Boolean suppressPowerOn) throws InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference removeAllSnapshotsTask(ManagedObjectReference _this, Boolean consolidate, SnapshotSelectionSpec spec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference consolidateVMDisksTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference estimateStorageForConsolidateSnapshotsTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference reconfigVMTask(ManagedObjectReference _this, VirtualMachineConfigSpec spec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference upgradeVMTask(ManagedObjectReference _this, String version) throws AlreadyUpgradedFaultMsg, InvalidStateFaultMsg, NoDiskFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public String extractOvfEnvironment(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference powerOnVMTask(ManagedObjectReference _this, ManagedObjectReference host) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference powerOffVMTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference suspendVMTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference resetVMTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void shutdownGuest(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg {

  }

  @Override
  public void rebootGuest(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg {

  }

  @Override
  public void standbyGuest(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg {

  }

  @Override
  public void answerVM(ManagedObjectReference _this, String questionId, String answerChoice) throws ConcurrentAccessFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference customizeVMTask(ManagedObjectReference _this, CustomizationSpec spec) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void checkCustomizationSpec(ManagedObjectReference _this, CustomizationSpec spec) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference migrateVMTask(ManagedObjectReference _this, ManagedObjectReference pool, ManagedObjectReference host, VirtualMachineMovePriority priority, VirtualMachinePowerState state) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference relocateVMTask(ManagedObjectReference _this, VirtualMachineRelocateSpec spec, VirtualMachineMovePriority priority) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference cloneVMTask(ManagedObjectReference _this, ManagedObjectReference folder, String name, VirtualMachineCloneSpec spec) throws CustomizationFaultFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference instantCloneTask(ManagedObjectReference _this, VirtualMachineInstantCloneSpec spec) throws DisallowedMigrationDeviceAttachedFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference exportVm(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void markAsTemplate(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {

  }

  @Override
  public void markAsVirtualMachine(ManagedObjectReference _this, ManagedObjectReference pool, ManagedObjectReference host) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {

  }

  @Override
  public void unregisterVM(ManagedObjectReference _this) throws InvalidPowerStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void resetGuestInformation(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void mountToolsInstaller(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg, VmToolsUpgradeFaultFaultMsg {

  }

  @Override
  public void unmountToolsInstaller(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference upgradeToolsTask(ManagedObjectReference _this, String installerOptions) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg, VmConfigFaultFaultMsg, VmToolsUpgradeFaultFaultMsg {
    return null;
  }

  @Override
  public VirtualMachineMksTicket acquireMksTicket(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VirtualMachineConnection> queryConnections(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VmConfigFaultFaultMsg {
    return List.of();
  }

  @Override
  public boolean dropConnections(ManagedObjectReference _this, List<VirtualMachineConnection> listOfConnections) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public VirtualMachineTicket acquireTicket(ManagedObjectReference _this, String ticketType) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setScreenResolution(ManagedObjectReference _this, int width, int height) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, ToolsUnavailableFaultMsg {

  }

  @Override
  public void defragmentAllDisks(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public ManagedObjectReference createSecondaryVMTask(ManagedObjectReference _this, ManagedObjectReference host) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createSecondaryVMExTask(ManagedObjectReference _this, ManagedObjectReference host, FaultToleranceConfigSpec spec) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference turnOffFaultToleranceForVMTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference makePrimaryVMTask(ManagedObjectReference _this, ManagedObjectReference vm) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference terminateFaultTolerantVMTask(ManagedObjectReference _this, ManagedObjectReference vm) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference disableSecondaryVMTask(ManagedObjectReference _this, ManagedObjectReference vm) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference enableSecondaryVMTask(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference host) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg {
    return null;
  }

  @Override
  public void setDisplayTopology(ManagedObjectReference _this, List<VirtualMachineDisplayTopology> displays) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, ToolsUnavailableFaultMsg {

  }

  @Override
  public ManagedObjectReference startRecordingTask(ManagedObjectReference _this, String name, String description) throws FileFaultFaultMsg, HostIncompatibleForRecordReplayFaultMsg, InvalidNameFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RecordReplayDisabledFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference stopRecordingTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference startReplayingTask(ManagedObjectReference _this, ManagedObjectReference replaySnapshot) throws FileFaultFaultMsg, HostIncompatibleForRecordReplayFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RecordReplayDisabledFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference stopReplayingTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference promoteDisksTask(ManagedObjectReference _this, boolean unlink, List<VirtualDisk> disks) throws InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createScreenshotTask(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public int putUsbScanCodes(ManagedObjectReference _this, UsbScanCodeSpec spec) throws RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public DiskChangeInfo queryChangedDiskAreas(ManagedObjectReference _this, ManagedObjectReference snapshot, int deviceKey, long startOffset, String changeId) throws FileFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<String> queryUnownedFiles(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reloadVirtualMachineFromPathTask(ManagedObjectReference _this, String configurationPath) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public List<LocalizedMethodFault> queryFaultToleranceCompatibility(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<LocalizedMethodFault> queryFaultToleranceCompatibilityEx(ManagedObjectReference _this, Boolean forLegacyFt) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return List.of();
  }

  @Override
  public void terminateVM(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void sendNMI(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference attachDiskTask(ManagedObjectReference _this, ID diskId, ManagedObjectReference datastore, Integer controllerKey, Integer unitNumber) throws DeviceUnsupportedForVmVersionFaultMsg, FileFaultFaultMsg, InvalidControllerFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MissingControllerFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference detachDiskTask(ManagedObjectReference _this, ID diskId) throws FileFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference applyEvcModeVMTask(ManagedObjectReference _this, List<HostFeatureMask> mask, Boolean completeMasks) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference cryptoUnlockTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VsanUpgradeSystemPreflightCheckResult performVsanUpgradePreflightCheck(ManagedObjectReference _this, ManagedObjectReference cluster, Boolean downgradeFormat) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public VsanUpgradeSystemUpgradeStatus queryVsanUpgradeStatus(ManagedObjectReference _this, ManagedObjectReference cluster) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference performVsanUpgradeTask(ManagedObjectReference _this, ManagedObjectReference cluster, Boolean performObjectUpgrade, Boolean downgradeFormat, Boolean allowReducedRedundancy, List<ManagedObjectReference> excludeHosts) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public void removeAlarm(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureAlarm(ManagedObjectReference _this, AlarmSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createAlarm(ManagedObjectReference _this, ManagedObjectReference entity, AlarmSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> getAlarm(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public boolean areAlarmActionsEnabled(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public void enableAlarmActions(ManagedObjectReference _this, ManagedObjectReference entity, boolean enabled) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<AlarmState> getAlarmState(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void acknowledgeAlarm(ManagedObjectReference _this, ManagedObjectReference alarm, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void clearTriggeredAlarms(ManagedObjectReference _this, AlarmFilterSpec filter) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void disableAlarm(ManagedObjectReference _this, ManagedObjectReference alarm, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void enableAlarm(ManagedObjectReference _this, ManagedObjectReference alarm, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference configureEvcModeTask(ManagedObjectReference _this, String evcModeKey, String evcGraphicsModeKey) throws EVCConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference disableEvcModeTask(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkConfigureEvcModeTask(ManagedObjectReference _this, String evcModeKey, String evcGraphicsModeKey) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkAddHostEvcTask(ManagedObjectReference _this, HostConnectSpec cnxSpec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference reconfigureDVPortgroupTask(ManagedObjectReference _this, DVPortgroupConfigSpec spec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference dvPortgroupRollbackTask(ManagedObjectReference _this, EntityBackupConfig entityBackup) throws DvsFaultFaultMsg, RollbackFailureFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<DistributedVirtualSwitchProductSpec> queryAvailableDvsSpec(ManagedObjectReference _this, Boolean recommended) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<DistributedVirtualSwitchNetworkOffloadSpec> querySupportedNetworkOffloadSpec(ManagedObjectReference _this, DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<DVSManagerPhysicalNicsList> queryCompatibleVmnicsFromHosts(ManagedObjectReference _this, List<ManagedObjectReference> hosts, ManagedObjectReference dvs) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> queryCompatibleHostForNewDvs(ManagedObjectReference _this, ManagedObjectReference container, boolean recursive, DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> queryCompatibleHostForExistingDvs(ManagedObjectReference _this, ManagedObjectReference container, boolean recursive, ManagedObjectReference dvs) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<DistributedVirtualSwitchHostProductSpec> queryDvsCompatibleHostSpec(ManagedObjectReference _this, DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public DVSFeatureCapability queryDvsFeatureCapability(ManagedObjectReference _this, DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference queryDvsByUuid(ManagedObjectReference _this, String uuid) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public DVSManagerDvsConfigTarget queryDvsConfigTarget(ManagedObjectReference _this, ManagedObjectReference host, ManagedObjectReference dvs) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<DistributedVirtualSwitchManagerCompatibilityResult> queryDvsCheckCompatibility(ManagedObjectReference _this, DistributedVirtualSwitchManagerHostContainer hostContainer, DistributedVirtualSwitchManagerDvsProductSpec dvsProductSpec, List<DistributedVirtualSwitchManagerHostDvsFilterSpec> hostFilterSpec) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference rectifyDvsOnHostTask(ManagedObjectReference _this, List<ManagedObjectReference> hosts) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference dvsManagerExportEntityTask(ManagedObjectReference _this, List<SelectionSet> selectionSet) throws BackupBlobWriteFailureFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference dvsManagerImportEntityTask(ManagedObjectReference _this, List<EntityBackupConfig> entityBackup, String importType) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference dvsManagerLookupDvPortGroup(ManagedObjectReference _this, String switchUuid, String portgroupKey) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateDVSLacpGroupConfigTask(ManagedObjectReference _this, List<VMwareDvsLacpGroupSpec> lacpGroupSpec) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void addKey(ManagedObjectReference _this, CryptoKeyPlain key) throws AlreadyExistsFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<CryptoKeyResult> addKeys(ManagedObjectReference _this, List<CryptoKeyPlain> keys) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void removeKey(ManagedObjectReference _this, CryptoKeyId key, boolean force) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<CryptoKeyResult> removeKeys(ManagedObjectReference _this, List<CryptoKeyId> keys, boolean force) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<CryptoKeyId> listKeys(ManagedObjectReference _this, Integer limit) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void cryptoManagerHostPrepare(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void cryptoManagerHostEnable(ManagedObjectReference _this, CryptoKeyPlain initialKey) throws AlreadyExistsFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference changeKeyTask(ManagedObjectReference _this, CryptoKeyPlain newKey) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void cryptoManagerHostDisable(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<CryptoManagerHostKeyStatus> getCryptoKeyStatus(ManagedObjectReference _this, List<CryptoKeyId> keys) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void registerKmipServer(ManagedObjectReference _this, KmipServerSpec server) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void markDefault(ManagedObjectReference _this, KeyProviderId clusterId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateKmipServer(ManagedObjectReference _this, KmipServerSpec server) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void removeKmipServer(ManagedObjectReference _this, KeyProviderId clusterId, String serverName) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<KmipClusterInfo> listKmipServers(ManagedObjectReference _this, Integer limit) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference retrieveKmipServersStatusTask(ManagedObjectReference _this, List<KmipClusterInfo> clusters) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public CryptoKeyResult generateKey(ManagedObjectReference _this, KeyProviderId keyProvider, CryptoManagerKmipCustomAttributeSpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public CryptoManagerKmipServerCertInfo retrieveKmipServerCert(ManagedObjectReference _this, KeyProviderId keyProvider, KmipServerInfo server) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void uploadKmipServerCert(ManagedObjectReference _this, KeyProviderId cluster, String certificate) throws RuntimeFaultFaultMsg {

  }

  @Override
  public String generateSelfSignedClientCert(ManagedObjectReference _this, KeyProviderId cluster, CryptoManagerKmipCertSignRequest request) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String generateClientCsr(ManagedObjectReference _this, KeyProviderId cluster, CryptoManagerKmipCertSignRequest request) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String retrieveSelfSignedClientCert(ManagedObjectReference _this, KeyProviderId cluster) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String retrieveClientCsr(ManagedObjectReference _this, KeyProviderId cluster) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String retrieveClientCert(ManagedObjectReference _this, KeyProviderId cluster) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void updateSelfSignedClientCert(ManagedObjectReference _this, KeyProviderId cluster, String certificate) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateKmsSignedCsrClientCert(ManagedObjectReference _this, KeyProviderId cluster, String certificate) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void uploadClientCert(ManagedObjectReference _this, KeyProviderId cluster, String certificate, String privateKey) throws RuntimeFaultFaultMsg {

  }

  @Override
  public boolean isKmsClusterActive(ManagedObjectReference _this, KeyProviderId cluster) throws InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public void setDefaultKmsCluster(ManagedObjectReference _this, ManagedObjectReference entity, KeyProviderId clusterId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public KeyProviderId getDefaultKmsCluster(ManagedObjectReference _this, ManagedObjectReference entity, Boolean defaultsToParent) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<CryptoManagerKmipCryptoKeyStatus> queryCryptoKeyStatus(ManagedObjectReference _this, List<CryptoKeyId> keyIds, int checkKeyBitMap) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void registerKmsCluster(ManagedObjectReference _this, KeyProviderId clusterId, String managementType) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void unregisterKmsCluster(ManagedObjectReference _this, KeyProviderId clusterId) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<KmipClusterInfo> listKmsClusters(ManagedObjectReference _this, Boolean includeKmsServers, Integer managementTypeFilter, Integer statusFilter) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public CryptoKeyResult setKeyCustomAttributes(ManagedObjectReference _this, CryptoKeyId keyId, CryptoManagerKmipCustomAttributeSpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<Event> readNextEvents(ManagedObjectReference _this, int maxCount) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<Event> readPreviousEvents(ManagedObjectReference _this, int maxCount) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<EventArgDesc> retrieveArgumentDescription(ManagedObjectReference _this, String eventTypeId) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference createCollectorForEvents(ManagedObjectReference _this, EventFilterSpec filter) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void logUserEvent(ManagedObjectReference _this, ManagedObjectReference entity, String msg) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<Event> queryEvents(ManagedObjectReference _this, EventFilterSpec filter) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void postEvent(ManagedObjectReference _this, Event eventToPost, TaskInfo taskInfo) throws InvalidEventFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference joinDomainTask(ManagedObjectReference _this, String domainName, String userName, String password) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, InvalidLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference joinDomainWithCAMTask(ManagedObjectReference _this, String domainName, String camServer) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference importCertificateForCAMTask(ManagedObjectReference _this, String certPath, String camServer) throws ActiveDirectoryFaultFaultMsg, FileNotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference leaveCurrentDomainTask(ManagedObjectReference _this, boolean force) throws ActiveDirectoryFaultFaultMsg, AuthMinimumAdminPermissionFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void enableSmartCardAuthentication(ManagedObjectReference _this) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void installSmartCardTrustAnchor(ManagedObjectReference _this, String cert) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void replaceSmartCardTrustAnchors(ManagedObjectReference _this, List<String> certs) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void removeSmartCardTrustAnchor(ManagedObjectReference _this, String issuer, String serial) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeSmartCardTrustAnchorByFingerprint(ManagedObjectReference _this, String fingerprint, String digest) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<String> listSmartCardTrustAnchors(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void disableSmartCardAuthentication(ManagedObjectReference _this) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public byte[] downloadDescriptionTree(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return new byte[0];
  }

  @Override
  public List<VirtualMachineDynamicPassthroughInfo> retrieveDynamicPassthroughInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VirtualMachineVendorDeviceGroupInfo> retrieveVendorDeviceGroupInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateAssignableHardwareConfig(ManagedObjectReference _this, HostAssignableHardwareConfig config) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureAutostart(ManagedObjectReference _this, HostAutoStartManagerConfig spec) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void autoStartPowerOn(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void autoStartPowerOff(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public HostBootDeviceInfo queryBootDevices(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateBootDevice(ManagedObjectReference _this, String key) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference configureHostCacheTask(ManagedObjectReference _this, HostCacheConfigurationSpec spec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<HostCertificateManagerCertificateInfo> retrieveCertificateInfoList(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String generateCertificateSigningRequest(ManagedObjectReference _this, boolean useIpAddressAsCommonName, HostCertificateManagerCertificateSpec spec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String generateCertificateSigningRequestByDn(ManagedObjectReference _this, String distinguishedName, HostCertificateManagerCertificateSpec spec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void provisionServerPrivateKey(ManagedObjectReference _this, String key) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void installServerCertificate(ManagedObjectReference _this, String cert) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void replaceCACertificatesAndCRLs(ManagedObjectReference _this, List<String> caCert, List<String> caCrl) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void notifyAffectedServices(ManagedObjectReference _this, List<String> services) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<String> listCACertificates(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<String> listCACertificateRevocationLists(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void enableHyperThreading(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void disableHyperThreading(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference searchDatastoreTask(ManagedObjectReference _this, String datastorePath, HostDatastoreBrowserSearchSpec searchSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference searchDatastoreSubFoldersTask(ManagedObjectReference _this, String datastorePath, HostDatastoreBrowserSearchSpec searchSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void deleteFile(ManagedObjectReference _this, String datastorePath) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateLocalSwapDatastore(ManagedObjectReference _this, ManagedObjectReference datastore) throws DatastoreNotWritableOnHostFaultMsg, InaccessibleDatastoreFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostScsiDisk> queryAvailableDisksForVmfs(ManagedObjectReference _this, ManagedObjectReference datastore) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VmfsDatastoreOption> queryVmfsDatastoreCreateOptions(ManagedObjectReference _this, String devicePath, Integer vmfsMajorVersion) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference createVmfsDatastore(ManagedObjectReference _this, VmfsDatastoreCreateSpec spec) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VmfsDatastoreOption> queryVmfsDatastoreExtendOptions(ManagedObjectReference _this, ManagedObjectReference datastore, String devicePath, Boolean suppressExpandCandidates) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VmfsDatastoreOption> queryVmfsDatastoreExpandOptions(ManagedObjectReference _this, ManagedObjectReference datastore) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference extendVmfsDatastore(ManagedObjectReference _this, ManagedObjectReference datastore, VmfsDatastoreExtendSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void enableClusteredVmdkSupport(ManagedObjectReference _this, ManagedObjectReference datastore) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void disableClusteredVmdkSupport(ManagedObjectReference _this, ManagedObjectReference datastore) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference expandVmfsDatastore(ManagedObjectReference _this, ManagedObjectReference datastore, VmfsDatastoreExpandSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createNasDatastore(ManagedObjectReference _this, HostNasVolumeSpec spec) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createLocalDatastore(ManagedObjectReference _this, String name, String path) throws DuplicateNameFaultMsg, FileNotFoundFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createVvolDatastore(ManagedObjectReference _this, HostDatastoreSystemVvolDatastoreSpec spec) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void removeDatastore(ManagedObjectReference _this, ManagedObjectReference datastore) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setMaxQueueDepth(ManagedObjectReference _this, ManagedObjectReference datastore, long maxQdepth) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public long queryMaxQueueDepth(ManagedObjectReference _this, ManagedObjectReference datastore) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return 0;
  }

  @Override
  public ManagedObjectReference removeDatastoreExTask(ManagedObjectReference _this, List<ManagedObjectReference> datastore) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void configureDatastorePrincipal(ManagedObjectReference _this, String userName, String password) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolumes(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference resignatureUnresolvedVmfsVolumeTask(ManagedObjectReference _this, HostUnresolvedVmfsResignatureSpec resolutionSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg, VmfsAmbiguousMountFaultMsg {
    return null;
  }

  @Override
  public void updateDateTimeConfig(ManagedObjectReference _this, HostDateTimeConfig config) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostDateTimeSystemTimeZone> queryAvailableTimeZones(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public XMLGregorianCalendar queryDateTime(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateDateTime(ManagedObjectReference _this, XMLGregorianCalendar dateTime) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshDateTimeSystem(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public HostDateTimeSystemServiceTestResult testTimeService(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<HostDiagnosticPartition> queryAvailablePartition(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void selectActivePartition(ManagedObjectReference _this, HostScsiDiskPartition partition) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostDiagnosticPartitionCreateOption> queryPartitionCreateOptions(ManagedObjectReference _this, String storageType, String diagnosticType) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public HostDiagnosticPartitionCreateDescription queryPartitionCreateDesc(ManagedObjectReference _this, String diskUuid, String diagnosticType) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void createDiagnosticPartition(ManagedObjectReference _this, HostDiagnosticPartitionCreateSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void esxAgentHostManagerUpdateConfig(ManagedObjectReference _this, HostEsxAgentHostManagerConfigInfo configInfo) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateDefaultPolicy(ManagedObjectReference _this, HostFirewallDefaultPolicy defaultPolicy) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void enableRuleset(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void disableRuleset(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateRuleset(ManagedObjectReference _this, String id, HostFirewallRulesetRulesetSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshFirewall(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void resetFirmwareToFactoryDefaults(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String backupFirmwareConfiguration(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String queryFirmwareConfigUploadURL(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void restoreFirmwareConfiguration(ManagedObjectReference _this, boolean force) throws FileFaultFaultMsg, InvalidBundleFaultMsg, InvalidStateFaultMsg, MismatchedBundleFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<VirtualMachineVgpuDeviceInfo> retrieveVgpuDeviceInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VirtualMachineVgpuProfileInfo> retrieveVgpuProfileInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void refreshGraphicsManager(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public boolean isSharedGraphicsActive(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return false;
  }

  @Override
  public void updateGraphicsConfig(ManagedObjectReference _this, HostGraphicsConfig config) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshHealthStatusSystem(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void resetSystemHealthInfo(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void clearSystemEventLog(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<SystemEventInfo> fetchSystemEventLog(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostAccessControlEntry> retrieveHostAccessControlEntries(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void changeAccessMode(ManagedObjectReference _this, String principal, boolean isGroup, HostAccessMode accessMode) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public List<String> querySystemUsers(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateSystemUsers(ManagedObjectReference _this, List<String> users) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public List<String> queryLockdownExceptions(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateLockdownExceptions(ManagedObjectReference _this, List<String> users) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void changeLockdownMode(ManagedObjectReference _this, HostLockdownMode mode) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String hostImageConfigGetAcceptance(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public HostImageProfileSummary hostImageConfigGetProfile(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateHostImageAcceptanceLevel(ManagedObjectReference _this, String newAcceptanceLevel) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<SoftwarePackage> fetchSoftwarePackages(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public XMLGregorianCalendar installDate(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public IscsiStatus queryVnicStatus(ManagedObjectReference _this, String vnicDevice) throws IscsiFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public IscsiStatus queryPnicStatus(ManagedObjectReference _this, String pnicDevice) throws IscsiFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<IscsiPortInfo> queryBoundVnics(ManagedObjectReference _this, String iScsiHbaName) throws IscsiFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<IscsiPortInfo> queryCandidateNics(ManagedObjectReference _this, String iScsiHbaName) throws IscsiFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void bindVnic(ManagedObjectReference _this, String iScsiHbaName, String vnicDevice) throws IscsiFaultFaultMsg, IscsiFaultInvalidVnicFaultMsg, IscsiFaultVnicAlreadyBoundFaultMsg, IscsiFaultVnicHasMultipleUplinksFaultMsg, IscsiFaultVnicHasNoUplinksFaultMsg, IscsiFaultVnicHasWrongUplinkFaultMsg, IscsiFaultVnicNotFoundFaultMsg, NotFoundFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void unbindVnic(ManagedObjectReference _this, String iScsiHbaName, String vnicDevice, boolean force) throws IscsiFaultFaultMsg, IscsiFaultVnicHasActivePathsFaultMsg, IscsiFaultVnicIsLastPathFaultMsg, IscsiFaultVnicNotBoundFaultMsg, NotFoundFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public IscsiMigrationDependency queryMigrationDependencies(ManagedObjectReference _this, List<String> pnicDevice) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<KernelModuleInfo> queryModules(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateModuleOptionString(ManagedObjectReference _this, String name, String options) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String queryConfiguredModuleOptionString(ManagedObjectReference _this, String name) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void createUser(ManagedObjectReference _this, HostAccountSpec user) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateUser(ManagedObjectReference _this, HostAccountSpec user) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void createGroup(ManagedObjectReference _this, HostAccountSpec group) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeUser(ManagedObjectReference _this, String userName) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void removeGroup(ManagedObjectReference _this, String groupName) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void assignUserToGroup(ManagedObjectReference _this, String user, String group) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void unassignUserFromGroup(ManagedObjectReference _this, String user, String group) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg {

  }

  @Override
  public void changePassword(ManagedObjectReference _this, String user, String oldPassword, String newPassword) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureServiceConsoleReservation(ManagedObjectReference _this, long cfgBytes) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureVirtualMachineReservation(ManagedObjectReference _this, VirtualMachineMemoryReservationSpec spec) throws RuntimeFaultFaultMsg {

  }

  @Override
  public HostNetworkConfigResult updateNetworkConfig(ManagedObjectReference _this, HostNetworkConfig config, String changeMode) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateDnsConfig(ManagedObjectReference _this, HostDnsConfig config) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateIpRouteConfig(ManagedObjectReference _this, HostIpRouteConfig config) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateConsoleIpRouteConfig(ManagedObjectReference _this, HostIpRouteConfig config) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateIpRouteTableConfig(ManagedObjectReference _this, HostIpRouteTableConfig config) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void addVirtualSwitch(ManagedObjectReference _this, String vswitchName, HostVirtualSwitchSpec spec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeVirtualSwitch(ManagedObjectReference _this, String vswitchName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateVirtualSwitch(ManagedObjectReference _this, String vswitchName, HostVirtualSwitchSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void addPortGroup(ManagedObjectReference _this, HostPortGroupSpec portgrp) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removePortGroup(ManagedObjectReference _this, String pgName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updatePortGroup(ManagedObjectReference _this, String pgName, HostPortGroupSpec portgrp) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updatePhysicalNicLinkSpeed(ManagedObjectReference _this, String device, PhysicalNicLinkInfo linkSpeed) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<PhysicalNicHintInfo> queryNetworkHint(ManagedObjectReference _this, List<String> device) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String addVirtualNic(ManagedObjectReference _this, String portgroup, HostVirtualNicSpec nic) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void removeVirtualNic(ManagedObjectReference _this, String device) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateVirtualNic(ManagedObjectReference _this, String device, HostVirtualNicSpec nic) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String addServiceConsoleVirtualNic(ManagedObjectReference _this, String portgroup, HostVirtualNicSpec nic) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void removeServiceConsoleVirtualNic(ManagedObjectReference _this, String device) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateServiceConsoleVirtualNic(ManagedObjectReference _this, String device, HostVirtualNicSpec nic) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void restartServiceConsoleVirtualNic(ManagedObjectReference _this, String device) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshNetworkSystem(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void startDpuFailover(ManagedObjectReference _this, String dvsName, String targetDpuAlias) throws InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createNvdimmNamespaceTask(ManagedObjectReference _this, NvdimmNamespaceCreateSpec createSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createNvdimmPMemNamespaceTask(ManagedObjectReference _this, NvdimmPMemNamespaceCreateSpec createSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteNvdimmNamespaceTask(ManagedObjectReference _this, NvdimmNamespaceDeleteSpec deleteSpec) throws HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteNvdimmBlockNamespacesTask(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkHostPatchTask(ManagedObjectReference _this, List<String> metaUrls, List<String> bundleUrls, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference scanHostPatchTask(ManagedObjectReference _this, HostPatchManagerLocator repository, List<String> updateID) throws PatchMetadataInvalidFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference scanHostPatchV2Task(ManagedObjectReference _this, List<String> metaUrls, List<String> bundleUrls, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference stageHostPatchTask(ManagedObjectReference _this, List<String> metaUrls, List<String> bundleUrls, List<String> vibUrls, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference installHostPatchTask(ManagedObjectReference _this, HostPatchManagerLocator repository, String updateID, Boolean force) throws InvalidStateFaultMsg, NoDiskSpaceFaultMsg, PatchBinariesNotFoundFaultMsg, PatchInstallFailedFaultMsg, PatchMetadataInvalidFaultMsg, PatchNotApplicableFaultMsg, RebootRequiredFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference installHostPatchV2Task(ManagedObjectReference _this, List<String> metaUrls, List<String> bundleUrls, List<String> vibUrls, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference uninstallHostPatchTask(ManagedObjectReference _this, List<String> bulletinIds, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference queryHostPatchTask(ManagedObjectReference _this, HostPatchManagerPatchManagerOperationSpec spec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void refresh(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updatePassthruConfig(ManagedObjectReference _this, List<HostPciPassthruConfig> config) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void configurePowerPolicy(ManagedObjectReference _this, int key) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateServicePolicy(ManagedObjectReference _this, String id, String policy) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void startService(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void stopService(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void restartService(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void uninstallService(ManagedObjectReference _this, String id) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void refreshServices(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureSnmpAgent(ManagedObjectReference _this, HostSnmpConfigSpec spec) throws InsufficientResourcesFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void sendTestNotification(ManagedObjectReference _this) throws InsufficientResourcesFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostDiskPartitionInfo> retrieveDiskPartitionInfo(ManagedObjectReference _this, List<String> devicePath) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public HostDiskPartitionInfo computeDiskPartitionInfo(ManagedObjectReference _this, String devicePath, HostDiskPartitionLayout layout, String partitionFormat) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public HostDiskPartitionInfo computeDiskPartitionInfoForResize(ManagedObjectReference _this, HostScsiDiskPartition partition, HostDiskPartitionBlockRange blockRange, String partitionFormat) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateDiskPartitions(ManagedObjectReference _this, String devicePath, HostDiskPartitionSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostVmfsVolume formatVmfs(ManagedObjectReference _this, HostVmfsSpec createSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void mountVmfsVolume(ManagedObjectReference _this, String vmfsUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void unmountVmfsVolume(ManagedObjectReference _this, String vmfsUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference unmountVmfsVolumeExTask(ManagedObjectReference _this, List<String> vmfsUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference mountVmfsVolumeExTask(ManagedObjectReference _this, List<String> vmfsUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference unmapVmfsVolumeExTask(ManagedObjectReference _this, List<String> vmfsUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void deleteVmfsVolumeState(ManagedObjectReference _this, String vmfsUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void rescanVmfs(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void attachVmfsExtent(ManagedObjectReference _this, String vmfsPath, HostScsiDiskPartition extent) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void expandVmfsExtent(ManagedObjectReference _this, String vmfsPath, HostScsiDiskPartition extent) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void upgradeVmfs(ManagedObjectReference _this, String vmfsPath) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void upgradeVmLayout(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolume(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostUnresolvedVmfsResolutionResult> resolveMultipleUnresolvedVmfsVolumes(ManagedObjectReference _this, List<HostUnresolvedVmfsResolutionSpec> resolutionSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference resolveMultipleUnresolvedVmfsVolumesExTask(ManagedObjectReference _this, List<HostUnresolvedVmfsResolutionSpec> resolutionSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void unmountForceMountedVmfsVolume(ManagedObjectReference _this, String vmfsUuid) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void rescanHba(ManagedObjectReference _this, String hbaDevice) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void rescanAllHba(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateSoftwareInternetScsiEnabled(ManagedObjectReference _this, boolean enabled) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiDiscoveryProperties(ManagedObjectReference _this, String iScsiHbaDevice, HostInternetScsiHbaDiscoveryProperties discoveryProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiAuthenticationProperties(ManagedObjectReference _this, String iScsiHbaDevice, HostInternetScsiHbaAuthenticationProperties authenticationProperties, HostInternetScsiHbaTargetSet targetSet) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiDigestProperties(ManagedObjectReference _this, String iScsiHbaDevice, HostInternetScsiHbaTargetSet targetSet, HostInternetScsiHbaDigestProperties digestProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiAdvancedOptions(ManagedObjectReference _this, String iScsiHbaDevice, HostInternetScsiHbaTargetSet targetSet, List<HostInternetScsiHbaParamValue> options) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiIPProperties(ManagedObjectReference _this, String iScsiHbaDevice, HostInternetScsiHbaIPProperties ipProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiName(ManagedObjectReference _this, String iScsiHbaDevice, String iScsiName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateInternetScsiAlias(ManagedObjectReference _this, String iScsiHbaDevice, String iScsiAlias) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void addInternetScsiSendTargets(ManagedObjectReference _this, String iScsiHbaDevice, List<HostInternetScsiHbaSendTarget> targets) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeInternetScsiSendTargets(ManagedObjectReference _this, String iScsiHbaDevice, List<HostInternetScsiHbaSendTarget> targets, Boolean force) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void addInternetScsiStaticTargets(ManagedObjectReference _this, String iScsiHbaDevice, List<HostInternetScsiHbaStaticTarget> targets) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeInternetScsiStaticTargets(ManagedObjectReference _this, String iScsiHbaDevice, List<HostInternetScsiHbaStaticTarget> targets) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void enableMultipathPath(ManagedObjectReference _this, String pathName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void disableMultipathPath(ManagedObjectReference _this, String pathName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void setMultipathLunPolicy(ManagedObjectReference _this, String lunId, HostMultipathInfoLogicalUnitPolicy policy) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateHppMultipathLunPolicy(ManagedObjectReference _this, String lunId, HostMultipathInfoHppLogicalUnitPolicy policy) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostPathSelectionPolicyOption> queryPathSelectionPolicyOptions(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostStorageArrayTypePolicyOption> queryStorageArrayTypePolicyOptions(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateScsiLunDisplayName(ManagedObjectReference _this, String lunUuid, String displayName) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void detachScsiLun(ManagedObjectReference _this, String lunUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference detachScsiLunExTask(ManagedObjectReference _this, List<String> lunUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void deleteScsiLunState(ManagedObjectReference _this, String lunCanonicalName) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void attachScsiLun(ManagedObjectReference _this, String lunUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference attachScsiLunExTask(ManagedObjectReference _this, List<String> lunUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void refreshStorageSystem(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void discoverFcoeHbas(ManagedObjectReference _this, FcoeConfigFcoeSpecification fcoeSpec) throws FcoeFaultPnicHasNoPortSetFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void markForRemoval(ManagedObjectReference _this, String hbaName, boolean remove) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostVffsVolume formatVffs(ManagedObjectReference _this, HostVffsSpec createSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void extendVffs(ManagedObjectReference _this, String vffsPath, String devicePath, HostDiskPartitionSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyVffs(ManagedObjectReference _this, String vffsPath) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void mountVffsVolume(ManagedObjectReference _this, String vffsUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void unmountVffsVolume(ManagedObjectReference _this, String vffsUuid) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void deleteVffsVolumeState(ManagedObjectReference _this, String vffsUuid) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void rescanVffs(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<HostScsiDisk> queryAvailableSsds(ManagedObjectReference _this, String vffsPath) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void setNFSUser(ManagedObjectReference _this, String user, String password) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void changeNFSUserPassword(ManagedObjectReference _this, String password) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostNasVolumeUserInfo queryNFSUser(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void clearNFSUser(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference turnDiskLocatorLedOnTask(ManagedObjectReference _this, List<String> scsiDiskUuids) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference turnDiskLocatorLedOffTask(ManagedObjectReference _this, List<String> scsiDiskUuids) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference markAsSsdTask(ManagedObjectReference _this, String scsiDiskUuid) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference markAsNonSsdTask(ManagedObjectReference _this, String scsiDiskUuid) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference markAsLocalTask(ManagedObjectReference _this, String scsiDiskUuid) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference markAsNonLocalTask(ManagedObjectReference _this, String scsiDiskUuid) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateVmfsUnmapPriority(ManagedObjectReference _this, String vmfsUuid, String unmapPriority) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateVmfsUnmapBandwidth(ManagedObjectReference _this, String vmfsUuid, VmfsUnmapBandwidthSpec unmapBandwidthSpec) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<VmfsConfigOption> queryVmfsConfigOption(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void markPerenniallyReserved(ManagedObjectReference _this, String lunUuid, boolean state) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference markPerenniallyReservedExTask(ManagedObjectReference _this, List<String> lunUuid, boolean state) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void createNvmeOverRdmaAdapter(ManagedObjectReference _this, String rdmaDeviceName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeNvmeOverRdmaAdapter(ManagedObjectReference _this, String hbaDeviceName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void createSoftwareAdapter(ManagedObjectReference _this, HostHbaCreateSpec spec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void removeSoftwareAdapter(ManagedObjectReference _this, String hbaDeviceName) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostNvmeDiscoveryLog discoverNvmeControllers(ManagedObjectReference _this, HostNvmeDiscoverSpec discoverSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void connectNvmeController(ManagedObjectReference _this, HostNvmeConnectSpec connectSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void disconnectNvmeController(ManagedObjectReference _this, HostNvmeDisconnectSpec disconnectSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference connectNvmeControllerExTask(ManagedObjectReference _this, List<HostNvmeConnectSpec> connectSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference disconnectNvmeControllerExTask(ManagedObjectReference _this, List<HostNvmeDisconnectSpec> disconnectSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference configureVFlashResourceExTask(ManagedObjectReference _this, List<String> devicePath) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void hostConfigureVFlashResource(ManagedObjectReference _this, HostVFlashManagerVFlashResourceConfigSpec spec) throws HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void hostRemoveVFlashResource(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void hostConfigVFlashCache(ManagedObjectReference _this, HostVFlashManagerVFlashCacheConfigSpec spec) throws HostConfigFaultFaultMsg, InaccessibleVFlashSourceFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public VirtualDiskVFlashCacheConfigInfo hostGetVFlashModuleDefaultConfig(ManagedObjectReference _this, String vFlashModule) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateIpConfig(ManagedObjectReference _this, HostIpConfig ipConfig) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void selectVnic(ManagedObjectReference _this, String device) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void deselectVnic(ManagedObjectReference _this) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public VirtualNicManagerNetConfig queryNetConfig(ManagedObjectReference _this, String nicType) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void selectVnicForNicType(ManagedObjectReference _this, String nicType, String device) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void deselectVnicForNicType(ManagedObjectReference _this, String nicType, String device) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public String queryCmmds(ManagedObjectReference _this, List<HostVsanInternalSystemCmmdsQuery> queries) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String queryPhysicalVsanDisks(ManagedObjectReference _this, List<String> props) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String queryVsanObjects(ManagedObjectReference _this, List<String> uuids) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public String queryObjectsOnPhysicalVsanDisk(ManagedObjectReference _this, List<String> disks) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public List<String> abdicateDomOwnership(ManagedObjectReference _this, List<String> uuids) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String queryVsanStatistics(ManagedObjectReference _this, List<String> labels) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public void reconfigureDomObject(ManagedObjectReference _this, String uuid, String policy) throws RuntimeFaultFaultMsg {

  }

  @Override
  public String querySyncingVsanObjects(ManagedObjectReference _this, List<String> uuids) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> runVsanPhysicalDiskDiagnostics(ManagedObjectReference _this, List<String> disks) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String getVsanObjExtAttrs(ManagedObjectReference _this, List<String> uuids) throws RuntimeFaultFaultMsg, VimFaultFaultMsg {
    return "";
  }

  @Override
  public List<VsanPolicySatisfiability> reconfigurationSatisfiable(ManagedObjectReference _this, List<VsanPolicyChangeBatch> pcbs, Boolean ignoreSatisfiability) throws RuntimeFaultFaultMsg, VimFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VsanPolicySatisfiability> canProvisionObjects(ManagedObjectReference _this, List<VsanNewPolicyBatch> npbs, Boolean ignoreSatisfiability) throws RuntimeFaultFaultMsg, VimFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostVsanInternalSystemDeleteVsanObjectsResult> deleteVsanObjects(ManagedObjectReference _this, List<String> uuids, Boolean force) throws RuntimeFaultFaultMsg, VimFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<HostVsanInternalSystemVsanObjectOperationResult> upgradeVsanObjects(ManagedObjectReference _this, List<String> uuids, int newVersion) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<String> queryVsanObjectUuidsByFilter(ManagedObjectReference _this, List<String> uuids, Integer limit, Integer version) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VsanHostDiskResult> queryDisksForVsan(ManagedObjectReference _this, List<String> canonicalName) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference addDisksTask(ManagedObjectReference _this, List<HostScsiDisk> disk) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference initializeDisksTask(ManagedObjectReference _this, List<VsanHostDiskMapping> mapping) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference removeDiskTask(ManagedObjectReference _this, List<HostScsiDisk> disk, HostMaintenanceSpec maintenanceSpec, Integer timeout) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference removeDiskMappingTask(ManagedObjectReference _this, List<VsanHostDiskMapping> mapping, HostMaintenanceSpec maintenanceSpec, Integer timeout) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference unmountDiskMappingTask(ManagedObjectReference _this, List<VsanHostDiskMapping> mapping) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateVsanTask(ManagedObjectReference _this, VsanHostConfigInfo config) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VsanHostClusterStatus queryHostStatus(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference evacuateVsanNodeTask(ManagedObjectReference _this, HostMaintenanceSpec maintenanceSpec, int timeout) throws InvalidStateFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference recommissionVsanNodeTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VsanFaultFaultMsg {
    return null;
  }

  @Override
  public List<OptionValue> queryOptions(ManagedObjectReference _this, String name) throws InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateOptions(ManagedObjectReference _this, List<OptionValue> changedValue) throws InvalidNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference checkComplianceTask(ManagedObjectReference _this, List<ManagedObjectReference> profile, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ComplianceResult> queryComplianceStatus(ManagedObjectReference _this, List<ManagedObjectReference> profile, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void clearComplianceStatus(ManagedObjectReference _this, List<ManagedObjectReference> profile, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public List<ProfileExpressionMetadata> queryExpressionMetadata(ManagedObjectReference _this, List<String> expressionName, ManagedObjectReference profile) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ProfileDescription retrieveDescription(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void destroyProfile(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void associateProfile(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void dissociateProfile(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference checkProfileComplianceTask(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String exportProfile(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference createProfile(ManagedObjectReference _this, ProfileCreateSpec createSpec) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ProfilePolicyMetadata> queryPolicyMetadata(ManagedObjectReference _this, List<String> policyName, ManagedObjectReference profile) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> findAssociatedProfile(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void updateClusterProfile(ManagedObjectReference _this, ClusterProfileConfigSpec config) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void hostProfileResetValidationState(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateReferenceHost(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void updateHostProfile(ManagedObjectReference _this, HostProfileConfigSpec config) throws DuplicateNameFaultMsg, ProfileUpdateFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ProfileExecuteResult executeHostProfile(ManagedObjectReference _this, ManagedObjectReference host, List<ProfileDeferredPolicyOptionParameter> deferredParam) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void updateHostSpecification(ManagedObjectReference _this, ManagedObjectReference host, HostSpecification hostSpec) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void updateHostSubSpecification(ManagedObjectReference _this, ManagedObjectReference host, HostSubSpecification hostSubSpec) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public HostSpecification retrieveHostSpecification(ManagedObjectReference _this, ManagedObjectReference host, boolean fromHost) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void deleteHostSubSpecification(ManagedObjectReference _this, ManagedObjectReference host, String subSpecName) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void deleteHostSpecification(ManagedObjectReference _this, ManagedObjectReference host) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ManagedObjectReference> hostSpecGetUpdatedHosts(ManagedObjectReference _this, String startChangeID, String endChangeID) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference applyHostConfigTask(ManagedObjectReference _this, ManagedObjectReference host, HostConfigSpec configSpec, List<ProfileDeferredPolicyOptionParameter> userInput) throws HostConfigFailedFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public HostProfileManagerConfigTaskList generateConfigTaskList(ManagedObjectReference _this, HostConfigSpec configSpec, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference generateHostProfileTaskListTask(ManagedObjectReference _this, HostConfigSpec configSpec, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ProfileMetadata> queryHostProfileMetadata(ManagedObjectReference _this, List<String> profileName, ManagedObjectReference profile) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ProfileProfileStructure queryProfileStructure(ManagedObjectReference _this, ManagedObjectReference profile) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ApplyProfile createDefaultProfile(ManagedObjectReference _this, String profileType, String profileTypeName, ManagedObjectReference profile) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateAnswerFileTask(ManagedObjectReference _this, ManagedObjectReference host, AnswerFileCreateSpec configSpec) throws AnswerFileUpdateFailedFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public AnswerFile retrieveAnswerFile(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public AnswerFile retrieveAnswerFileForProfile(ManagedObjectReference _this, ManagedObjectReference host, HostApplyProfile applyProfile) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference exportAnswerFileTask(ManagedObjectReference _this, ManagedObjectReference host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkAnswerFileStatusTask(ManagedObjectReference _this, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<AnswerFileStatusResult> queryAnswerFileStatus(ManagedObjectReference _this, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<StructuredCustomizations> retrieveHostCustomizations(ManagedObjectReference _this, List<ManagedObjectReference> hosts) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<StructuredCustomizations> retrieveHostCustomizationsForProfile(ManagedObjectReference _this, List<ManagedObjectReference> hosts, HostApplyProfile applyProfile) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference generateHostConfigTaskSpecTask(ManagedObjectReference _this, List<StructuredCustomizations> hostsInfo) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference applyEntitiesConfigTask(ManagedObjectReference _this, List<ApplyHostProfileConfigurationSpec> applyConfigSpecs) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference validateHostProfileCompositionTask(ManagedObjectReference _this, ManagedObjectReference source, List<ManagedObjectReference> targets, HostApplyProfile toBeMerged, HostApplyProfile toReplaceWith, HostApplyProfile toBeDeleted, HostApplyProfile enableStatusToBeCopied, Boolean errorOnly) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference compositeHostProfileTask(ManagedObjectReference _this, ManagedObjectReference source, List<ManagedObjectReference> targets, HostApplyProfile toBeMerged, HostApplyProfile toBeReplacedWith, HostApplyProfile toBeDeleted, HostApplyProfile enableStatusToBeCopied) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void removeScheduledTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void reconfigureScheduledTask(ManagedObjectReference _this, ScheduledTaskSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void runScheduledTask(ManagedObjectReference _this) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createScheduledTask(ManagedObjectReference _this, ManagedObjectReference entity, ScheduledTaskSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> retrieveEntityScheduledTask(ManagedObjectReference _this, ManagedObjectReference entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference createObjectScheduledTask(ManagedObjectReference _this, ManagedObjectReference obj, ScheduledTaskSpec spec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> retrieveObjectScheduledTask(ManagedObjectReference _this, ManagedObjectReference obj) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void markServiceProviderEntities(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws AuthMinimumAdminPermissionFaultMsg, ManagedObjectNotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void unmarkServiceProviderEntities(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws ManagedObjectNotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ManagedObjectReference> retrieveServiceProviderEntities(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference prepareVchaTask(ManagedObjectReference _this, VchaClusterNetworkSpec networkSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deployVchaTask(ManagedObjectReference _this, VchaClusterDeploymentSpec deploymentSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference configureVchaTask(ManagedObjectReference _this, VchaClusterConfigSpec configSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createPassiveNodeTask(ManagedObjectReference _this, PassiveNodeDeploymentSpec passiveDeploymentSpec, SourceNodeSpec sourceVcSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createWitnessNodeTask(ManagedObjectReference _this, NodeDeploymentSpec witnessDeploymentSpec, SourceNodeSpec sourceVcSpec) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VchaClusterConfigInfo getVchaConfig(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference destroyVchaTask(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference setClusterModeTask(ManagedObjectReference _this, String mode) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String getClusterMode(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public VchaClusterHealth getVchaClusterHealth(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference initiateFailoverTask(ManagedObjectReference _this, boolean planned) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ManagedObjectReference> openInventoryViewFolder(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> closeInventoryViewFolder(ManagedObjectReference _this, List<ManagedObjectReference> entity) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> modifyListView(ManagedObjectReference _this, List<ManagedObjectReference> add, List<ManagedObjectReference> remove) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ManagedObjectReference> resetListView(ManagedObjectReference _this, List<ManagedObjectReference> obj) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public void resetListViewFromView(ManagedObjectReference _this, ManagedObjectReference view) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyView(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createInventoryView(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createContainerView(ManagedObjectReference _this, ManagedObjectReference container, List<String> type, boolean recursive) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createListView(ManagedObjectReference _this, List<ManagedObjectReference> obj) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createListViewFromView(ManagedObjectReference _this, ManagedObjectReference view) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference customizeGuestTask(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, CustomizationSpec spec, List<OptionValue> configParams) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference startGuestNetworkTask(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference abortCustomizationTask(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference revertToSnapshotTask(ManagedObjectReference _this, ManagedObjectReference host, Boolean suppressPowerOn) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference removeSnapshotTask(ManagedObjectReference _this, boolean removeChildren, Boolean consolidate) throws RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void renameSnapshot(ManagedObjectReference _this, String name, String description) throws InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public ManagedObjectReference exportSnapshot(ManagedObjectReference _this) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkCompatibilityTask(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference host, ManagedObjectReference pool, List<String> testType) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkVmConfigTask(ManagedObjectReference _this, VirtualMachineConfigSpec spec, ManagedObjectReference vm, ManagedObjectReference host, ManagedObjectReference pool, List<String> testType) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkPowerOnTask(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference host, ManagedObjectReference pool, List<String> testType) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference queryVMotionCompatibilityExTask(ManagedObjectReference _this, List<ManagedObjectReference> vm, List<ManagedObjectReference> host) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkMigrateTask(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference host, ManagedObjectReference pool, VirtualMachinePowerState state, List<String> testType) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkRelocateTask(ManagedObjectReference _this, ManagedObjectReference vm, VirtualMachineRelocateSpec spec, List<String> testType) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkCloneTask(ManagedObjectReference _this, ManagedObjectReference vm, ManagedObjectReference folder, String name, VirtualMachineCloneSpec spec, List<String> testType) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference checkInstantCloneTask(ManagedObjectReference _this, ManagedObjectReference vm, VirtualMachineInstantCloneSpec spec, List<String> testType) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void addGuestAlias(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String username, boolean mapCert, String base64Cert, GuestAuthAliasInfo aliasInfo) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void removeGuestAlias(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String username, String base64Cert, GuestAuthSubject subject) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void removeGuestAliasByCert(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String username, String base64Cert) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public List<GuestAliases> listGuestAliases(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String username) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public List<GuestMappedAliases> listGuestMappedAliases(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public void validateCredentialsInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public GuestAuthentication acquireCredentialsInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication requestedAuth, Long sessionID) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void releaseCredentialsInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void makeDirectoryInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String directoryPath, boolean createParentDirectories) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void deleteFileInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String filePath) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void deleteDirectoryInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String directoryPath, boolean recursive) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void moveDirectoryInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String srcDirectoryPath, String dstDirectoryPath) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void moveFileInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String srcFilePath, String dstFilePath, boolean overwrite) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public String createTemporaryFileInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String prefix, String suffix, String directoryPath) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return "";
  }

  @Override
  public String createTemporaryDirectoryInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String prefix, String suffix, String directoryPath) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return "";
  }

  @Override
  public GuestListFileInfo listFilesInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String filePath, Integer index, Integer maxResults, String matchPattern) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void changeFileAttributesInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String guestFilePath, GuestFileAttributes fileAttributes) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public FileTransferInformation initiateFileTransferFromGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String guestFilePath) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public String initiateFileTransferToGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, String guestFilePath, GuestFileAttributes fileAttributes, long fileSize, boolean overwrite) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return "";
  }

  @Override
  public long startProgramInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestProgramSpec spec) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return 0;
  }

  @Override
  public List<GuestProcessInfo> listProcessesInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, List<Long> pids) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public void terminateProcessInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, long pid) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public List<String> readEnvironmentVariableInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, List<String> names) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public void createRegistryKeyInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegKeyNameSpec keyName, boolean isVolatile, String classType) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public List<GuestRegKeyRecordSpec> listRegistryKeysInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegKeyNameSpec keyName, boolean recursive, String matchPattern) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public void deleteRegistryKeyInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegKeyNameSpec keyName, boolean recursive) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public void setRegistryValueInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegValueSpec value) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public List<GuestRegValueSpec> listRegistryValuesInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegKeyNameSpec keyName, boolean expandStrings, String matchPattern) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return List.of();
  }

  @Override
  public void deleteRegistryValueInGuest(ManagedObjectReference _this, ManagedObjectReference vm, GuestAuthentication auth, GuestRegValueNameSpec valueName) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {

  }

  @Override
  public ManagedObjectReference vStorageObjectExtendDiskExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, long newCapacityInMB) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public VslmVClockInfo renameVStorageObjectEx(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String name) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference vStorageObjectCreateSnapshotExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String description) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference vStorageObjectDeleteSnapshotExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference revertVStorageObjectExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostCreateDiskTask(ManagedObjectReference _this, VslmCreateSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObject hostRegisterDisk(ManagedObjectReference _this, String path, String name, Boolean modifyControlFlags) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostExtendDiskTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, long newCapacityInMB) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostInflateDiskTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void hostRenameVStorageObject(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String name) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<VslmInfrastructureObjectPolicy> hostRetrieveVStorageInfrastructureObjectPolicy(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference hostDeleteVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public VStorageObject hostRetrieveVStorageObject(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> diskInfoFlags) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObjectStateInfo hostRetrieveVStorageObjectState(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<ID> hostListVStorageObject(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference hostCloneVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, VslmCloneSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostRelocateVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, VslmRelocateSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void hostSetVStorageObjectControlFlags(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> controlFlags) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void hostClearVStorageObjectControlFlags(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> controlFlags) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference hostReconcileDatastoreInventoryTask(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void hostScheduleReconcileDatastoreInventory(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference hostVStorageObjectCreateSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String description) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostVStorageObjectDeleteSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObjectSnapshotInfo hostVStorageObjectRetrieveSnapshotInfo(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostVStorageObjectCreateDiskFromSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId, String name, List<VirtualMachineProfileSpec> profile, CryptoSpec crypto, String path, String provisioningType) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostVStorageObjectRevertTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostUpdateVStorageObjectMetadataTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<KeyValue> metadata, List<String> deleteKeys) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<KeyValue> hostRetrieveVStorageObjectMetadata(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId, String prefix) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public String hostRetrieveVStorageObjectMetadataValue(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId, String key) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, KeyNotFoundFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference hostDeleteVStorageObjectExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostUpdateVStorageObjectMetadataExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<KeyValue> metadata, List<String> deleteKeys) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference hostSetVirtualDiskUuidTask(ManagedObjectReference _this, String name, String uuid) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String hostQueryVirtualDiskUuid(ManagedObjectReference _this, String name) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference createDiskTask(ManagedObjectReference _this, VslmCreateSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObject registerDisk(ManagedObjectReference _this, String path, String name) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference extendDiskTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, long newCapacityInMB) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference inflateDiskTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public void renameVStorageObject(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String name) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference updateVStorageObjectPolicyTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<VirtualMachineProfileSpec> profile) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateVStorageObjectCryptoTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<VirtualMachineProfileSpec> profile, DiskCryptoSpec disksCrypto) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference updateVStorageInfrastructureObjectPolicyTask(ManagedObjectReference _this, VslmInfrastructureObjectPolicySpec spec) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public List<VslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference deleteVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public VStorageObject retrieveVStorageObject(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> diskInfoFlags) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObjectStateInfo retrieveVStorageObjectState(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public List<VStorageObjectAssociations> retrieveVStorageObjectAssociations(ManagedObjectReference _this, List<RetrieveVStorageObjSpec> ids) throws RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<ID> listVStorageObject(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference cloneVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, VslmCloneSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference relocateVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, VslmRelocateSpec spec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void setVStorageObjectControlFlags(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> controlFlags) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void clearVStorageObjectControlFlags(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<String> controlFlags) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void attachTagToVStorageObject(ManagedObjectReference _this, ID id, String category, String tag) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public void detachTagFromVStorageObject(ManagedObjectReference _this, ID id, String category, String tag) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public List<ID> listVStorageObjectsAttachedToTag(ManagedObjectReference _this, String category, String tag) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public List<VslmTagEntry> listTagsAttachedToVStorageObject(ManagedObjectReference _this, ID id) throws NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public ManagedObjectReference reconcileDatastoreInventoryTask(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void scheduleReconcileDatastoreInventory(ManagedObjectReference _this, ManagedObjectReference datastore) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference vStorageObjectCreateSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, String description) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObjectSnapshotInfo retrieveSnapshotInfo(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference createDiskFromSnapshotTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId, String name, List<VirtualMachineProfileSpec> profile, CryptoSpec crypto, String path) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference revertVStorageObjectTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public VStorageObjectSnapshotDetails retrieveSnapshotDetails(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public DiskChangeInfo vstorageObjectVCenterQueryChangedDiskAreas(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, ID snapshotId, long startOffset, String changeId) throws FileFaultFaultMsg, InvalidArgumentFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference deleteVStorageObjectExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference vCenterUpdateVStorageObjectMetadataExTask(ManagedObjectReference _this, ID id, ManagedObjectReference datastore, List<KeyValue> metadata, List<String> deleteKeys) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public ManagedObjectReference setVirtualDiskUuidExTask(ManagedObjectReference _this, String name, ManagedObjectReference datacenter, String uuid) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public String queryVirtualDiskUuidEx(ManagedObjectReference _this, String name, ManagedObjectReference datacenter) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
    return "";
  }

  @Override
  public ManagedObjectReference createFilter(ManagedObjectReference _this, PropertyFilterSpec spec, boolean partialUpdates) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg {
    return (ManagedObjectReference) scManager.invoke(_this, "createFilter", spec, partialUpdates);
  }

  @Override
  public List<ObjectContent> retrieveProperties(ManagedObjectReference _this, List<PropertyFilterSpec> specSet) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg {
    return List.of();
  }

  @Override
  public UpdateSet checkForUpdates(ManagedObjectReference _this, String version) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public UpdateSet waitForUpdates(ManagedObjectReference _this, String version) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void cancelWaitForUpdates(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public UpdateSet waitForUpdatesEx(ManagedObjectReference _this, String version, WaitOptions options) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg {
    return (UpdateSet) scManager.invoke(_this, "waitForUpdatesEx", version, options);
  }

  @Override
  public RetrieveResult retrievePropertiesEx(ManagedObjectReference _this, List<PropertyFilterSpec> specSet, RetrieveOptions options) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public RetrieveResult continueRetrievePropertiesEx(ManagedObjectReference _this, String token) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void cancelRetrievePropertiesEx(ManagedObjectReference _this, String token) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg {

  }

  @Override
  public ManagedObjectReference createPropertyCollector(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {
    return null;
  }

  @Override
  public void destroyPropertyCollector(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }

  @Override
  public void destroyPropertyFilter(ManagedObjectReference _this) throws RuntimeFaultFaultMsg {

  }
}
