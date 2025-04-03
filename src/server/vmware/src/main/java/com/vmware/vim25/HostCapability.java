
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="recursiveResourcePoolsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="cpuMemoryResourceConfigurationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="rebootSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shutdownSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vmotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="standbySupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipmiSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxSupportedVMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxRunningVMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxSupportedVcpus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxRegisteredVMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="datastorePrincipalSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sanSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="nfsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="iscsiSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vlanTaggingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="nicTeamingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="highGuestMemSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="maintenanceModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="suspendedRelocateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="restrictedSnapshotRelocateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="perVmSwapFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="localSwapDatastoreSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="unsharedSwapVMotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="backgroundSnapshotsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="preAssignedPCIUnitNumbersSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="screenshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="scaledScreenshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="storageVMotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmotionWithStorageVMotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmotionAcrossNetworkSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxNumDisksSVMotion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxVirtualDiskDescVersionSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="hbrNicSelectionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vrNfcNicSelectionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="recordReplaySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="replayUnsupportedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="replayCompatibilityIssues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="smpFtSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftCompatibilityIssues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="smpFtCompatibilityIssues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxVcpusPerFtVm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="loginBySSLThumbprintSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="cloneFromSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="deltaDiskBackingsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="perVMNetworkTrafficShapingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tpmSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tpmVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="txtEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportedCpuFeature" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="virtualExecUsageSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="storageIORMSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmDirectPathGen2Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmDirectPathGen2UnsupportedReason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmDirectPathGen2UnsupportedReasonExtended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportedVmfsMajorVersion" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vStorageCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="snapshotRelayoutSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="firewallIpRulesSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="servicePackageInfoSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxHostRunningVms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxHostSupportedVcpus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vmfsDatastoreMountCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="eightPlusHostVmfsSharedAccessSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nestedHVSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vPMCSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="interVMCommunicationThroughVMCISupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="scheduledHardwareUpgradeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="featureCapabilitiesSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="latencySensitivitySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="storagePolicySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="accel3dSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="reliableMemoryAware" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="multipleNetworkStackInstanceSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="messageBusProxySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vsanSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vFlashSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostAccessManagerSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="provisioningNicSelectionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nfs41Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nfs41Krb5iSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="turnDiskLocatorLedSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="virtualVolumeDatastoreSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="markAsSsdSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="markAsLocalSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="smartCardAuthenticationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pMemSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pMemSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="cryptoSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="oneKVolumeAPIsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="gatewayOnNicSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="upitSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="cpuHwMmuSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptedVMotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionChangeOnAddRemoveSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionHotOperationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionWithSnapshotsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionFaultToleranceSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionMemorySaveSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionRDMSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionVFlashSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionCBRCSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionHBRSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftEfiSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="unmapMethodSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maxMemMBPerFtVm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="virtualMmuUsageIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="virtualExecUsageIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmCreateDateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmfs3EOLSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftVmcpSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="quickBootSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptedFtSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="assignableHardwareSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="suspendToMemorySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="useFeatureReqsForOldHWv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="markPerenniallyReservedSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hppPspSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="deviceRebindWithoutRebootSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="storagePolicyChangeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="precisionTimeProtocolSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="remoteDeviceVMotionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxSupportedVmMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ahDeviceHintsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nvmeOverTcpSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nvmeStorageFabricServicesSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="assignHwPciConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="timeConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nvmeBatchOperationsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pMemFailoverSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostConfigEncryptionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxSupportedSimultaneousThreads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ptpConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="maxSupportedPtpPorts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sgxRegistrationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pMemIndependentSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="iommuSLDirtyCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmknicBindingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ultralowFixedUnmapSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nvmeVvolSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="fptHotplugSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mconnectSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vsanNicMgmtSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vvolNQNSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="stretchedSCSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmknicBindingOnNFSv41" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vpStatusCheckSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nConnectSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="userKeySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ndcmSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="uefiSecureBoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCapability", propOrder = {
    "recursiveResourcePoolsSupported",
    "cpuMemoryResourceConfigurationSupported",
    "rebootSupported",
    "shutdownSupported",
    "vmotionSupported",
    "standbySupported",
    "ipmiSupported",
    "maxSupportedVMs",
    "maxRunningVMs",
    "maxSupportedVcpus",
    "maxRegisteredVMs",
    "datastorePrincipalSupported",
    "sanSupported",
    "nfsSupported",
    "iscsiSupported",
    "vlanTaggingSupported",
    "nicTeamingSupported",
    "highGuestMemSupported",
    "maintenanceModeSupported",
    "suspendedRelocateSupported",
    "restrictedSnapshotRelocateSupported",
    "perVmSwapFiles",
    "localSwapDatastoreSupported",
    "unsharedSwapVMotionSupported",
    "backgroundSnapshotsSupported",
    "preAssignedPCIUnitNumbersSupported",
    "screenshotSupported",
    "scaledScreenshotSupported",
    "storageVMotionSupported",
    "vmotionWithStorageVMotionSupported",
    "vmotionAcrossNetworkSupported",
    "maxNumDisksSVMotion",
    "maxVirtualDiskDescVersionSupported",
    "hbrNicSelectionSupported",
    "vrNfcNicSelectionSupported",
    "recordReplaySupported",
    "ftSupported",
    "replayUnsupportedReason",
    "replayCompatibilityIssues",
    "smpFtSupported",
    "ftCompatibilityIssues",
    "smpFtCompatibilityIssues",
    "maxVcpusPerFtVm",
    "loginBySSLThumbprintSupported",
    "cloneFromSnapshotSupported",
    "deltaDiskBackingsSupported",
    "perVMNetworkTrafficShapingSupported",
    "tpmSupported",
    "tpmVersion",
    "txtEnabled",
    "supportedCpuFeature",
    "virtualExecUsageSupported",
    "storageIORMSupported",
    "vmDirectPathGen2Supported",
    "vmDirectPathGen2UnsupportedReason",
    "vmDirectPathGen2UnsupportedReasonExtended",
    "supportedVmfsMajorVersion",
    "vStorageCapable",
    "snapshotRelayoutSupported",
    "firewallIpRulesSupported",
    "servicePackageInfoSupported",
    "maxHostRunningVms",
    "maxHostSupportedVcpus",
    "vmfsDatastoreMountCapable",
    "eightPlusHostVmfsSharedAccessSupported",
    "nestedHVSupported",
    "vpmcSupported",
    "interVMCommunicationThroughVMCISupported",
    "scheduledHardwareUpgradeSupported",
    "featureCapabilitiesSupported",
    "latencySensitivitySupported",
    "storagePolicySupported",
    "accel3DSupported",
    "reliableMemoryAware",
    "multipleNetworkStackInstanceSupported",
    "messageBusProxySupported",
    "vsanSupported",
    "vFlashSupported",
    "hostAccessManagerSupported",
    "provisioningNicSelectionSupported",
    "nfs41Supported",
    "nfs41Krb5ISupported",
    "turnDiskLocatorLedSupported",
    "virtualVolumeDatastoreSupported",
    "markAsSsdSupported",
    "markAsLocalSupported",
    "smartCardAuthenticationSupported",
    "pMemSupported",
    "pMemSnapshotSupported",
    "cryptoSupported",
    "oneKVolumeAPIsSupported",
    "gatewayOnNicSupported",
    "upitSupported",
    "cpuHwMmuSupported",
    "encryptedVMotionSupported",
    "encryptionChangeOnAddRemoveSupported",
    "encryptionHotOperationSupported",
    "encryptionWithSnapshotsSupported",
    "encryptionFaultToleranceSupported",
    "encryptionMemorySaveSupported",
    "encryptionRDMSupported",
    "encryptionVFlashSupported",
    "encryptionCBRCSupported",
    "encryptionHBRSupported",
    "ftEfiSupported",
    "unmapMethodSupported",
    "maxMemMBPerFtVm",
    "virtualMmuUsageIgnored",
    "virtualExecUsageIgnored",
    "vmCreateDateSupported",
    "vmfs3EOLSupported",
    "ftVmcpSupported",
    "quickBootSupported",
    "encryptedFtSupported",
    "assignableHardwareSupported",
    "suspendToMemorySupported",
    "useFeatureReqsForOldHWv",
    "markPerenniallyReservedSupported",
    "hppPspSupported",
    "deviceRebindWithoutRebootSupported",
    "storagePolicyChangeSupported",
    "precisionTimeProtocolSupported",
    "remoteDeviceVMotionSupported",
    "maxSupportedVmMemory",
    "ahDeviceHintsSupported",
    "nvmeOverTcpSupported",
    "nvmeStorageFabricServicesSupported",
    "assignHwPciConfigSupported",
    "timeConfigSupported",
    "nvmeBatchOperationsSupported",
    "pMemFailoverSupported",
    "hostConfigEncryptionSupported",
    "maxSupportedSimultaneousThreads",
    "ptpConfigSupported",
    "maxSupportedPtpPorts",
    "sgxRegistrationSupported",
    "pMemIndependentSnapshotSupported",
    "iommuSLDirtyCapable",
    "vmknicBindingSupported",
    "ultralowFixedUnmapSupported",
    "nvmeVvolSupported",
    "fptHotplugSupported",
    "mconnectSupported",
    "vsanNicMgmtSupported",
    "vvolNQNSupported",
    "stretchedSCSupported",
    "vmknicBindingOnNFSv41",
    "vpStatusCheckSupported",
    "nConnectSupported",
    "userKeySupported",
    "ndcmSupported",
    "uefiSecureBoot"
})
public class HostCapability
    extends DynamicData
{

    protected boolean recursiveResourcePoolsSupported;
    protected boolean cpuMemoryResourceConfigurationSupported;
    protected boolean rebootSupported;
    protected boolean shutdownSupported;
    protected boolean vmotionSupported;
    protected boolean standbySupported;
    protected Boolean ipmiSupported;
    protected Integer maxSupportedVMs;
    protected Integer maxRunningVMs;
    protected Integer maxSupportedVcpus;
    protected Integer maxRegisteredVMs;
    protected boolean datastorePrincipalSupported;
    protected boolean sanSupported;
    protected boolean nfsSupported;
    protected boolean iscsiSupported;
    protected boolean vlanTaggingSupported;
    protected boolean nicTeamingSupported;
    protected boolean highGuestMemSupported;
    protected boolean maintenanceModeSupported;
    protected boolean suspendedRelocateSupported;
    protected boolean restrictedSnapshotRelocateSupported;
    protected boolean perVmSwapFiles;
    protected boolean localSwapDatastoreSupported;
    protected boolean unsharedSwapVMotionSupported;
    protected boolean backgroundSnapshotsSupported;
    protected boolean preAssignedPCIUnitNumbersSupported;
    protected boolean screenshotSupported;
    protected boolean scaledScreenshotSupported;
    protected Boolean storageVMotionSupported;
    protected Boolean vmotionWithStorageVMotionSupported;
    protected Boolean vmotionAcrossNetworkSupported;
    protected Integer maxNumDisksSVMotion;
    protected Integer maxVirtualDiskDescVersionSupported;
    protected Boolean hbrNicSelectionSupported;
    protected Boolean vrNfcNicSelectionSupported;
    protected Boolean recordReplaySupported;
    protected Boolean ftSupported;
    protected String replayUnsupportedReason;
    protected List<String> replayCompatibilityIssues;
    protected Boolean smpFtSupported;
    protected List<String> ftCompatibilityIssues;
    protected List<String> smpFtCompatibilityIssues;
    protected Integer maxVcpusPerFtVm;
    protected Boolean loginBySSLThumbprintSupported;
    protected Boolean cloneFromSnapshotSupported;
    protected Boolean deltaDiskBackingsSupported;
    protected Boolean perVMNetworkTrafficShapingSupported;
    protected Boolean tpmSupported;
    protected String tpmVersion;
    protected Boolean txtEnabled;
    protected List<HostCpuIdInfo> supportedCpuFeature;
    protected Boolean virtualExecUsageSupported;
    protected Boolean storageIORMSupported;
    protected Boolean vmDirectPathGen2Supported;
    protected List<String> vmDirectPathGen2UnsupportedReason;
    protected String vmDirectPathGen2UnsupportedReasonExtended;
    @XmlElement(type = Integer.class)
    protected List<Integer> supportedVmfsMajorVersion;
    protected Boolean vStorageCapable;
    protected Boolean snapshotRelayoutSupported;
    protected Boolean firewallIpRulesSupported;
    protected Boolean servicePackageInfoSupported;
    protected Integer maxHostRunningVms;
    protected Integer maxHostSupportedVcpus;
    protected Boolean vmfsDatastoreMountCapable;
    protected Boolean eightPlusHostVmfsSharedAccessSupported;
    protected Boolean nestedHVSupported;
    @XmlElement(name = "vPMCSupported")
    protected Boolean vpmcSupported;
    protected Boolean interVMCommunicationThroughVMCISupported;
    protected Boolean scheduledHardwareUpgradeSupported;
    protected Boolean featureCapabilitiesSupported;
    protected Boolean latencySensitivitySupported;
    protected Boolean storagePolicySupported;
    @XmlElement(name = "accel3dSupported")
    protected Boolean accel3DSupported;
    protected Boolean reliableMemoryAware;
    protected Boolean multipleNetworkStackInstanceSupported;
    protected Boolean messageBusProxySupported;
    protected Boolean vsanSupported;
    protected Boolean vFlashSupported;
    protected Boolean hostAccessManagerSupported;
    protected Boolean provisioningNicSelectionSupported;
    protected Boolean nfs41Supported;
    @XmlElement(name = "nfs41Krb5iSupported")
    protected Boolean nfs41Krb5ISupported;
    protected Boolean turnDiskLocatorLedSupported;
    protected Boolean virtualVolumeDatastoreSupported;
    protected Boolean markAsSsdSupported;
    protected Boolean markAsLocalSupported;
    protected Boolean smartCardAuthenticationSupported;
    protected Boolean pMemSupported;
    protected Boolean pMemSnapshotSupported;
    protected Boolean cryptoSupported;
    protected Boolean oneKVolumeAPIsSupported;
    protected Boolean gatewayOnNicSupported;
    protected Boolean upitSupported;
    protected Boolean cpuHwMmuSupported;
    protected Boolean encryptedVMotionSupported;
    protected Boolean encryptionChangeOnAddRemoveSupported;
    protected Boolean encryptionHotOperationSupported;
    protected Boolean encryptionWithSnapshotsSupported;
    protected Boolean encryptionFaultToleranceSupported;
    protected Boolean encryptionMemorySaveSupported;
    protected Boolean encryptionRDMSupported;
    protected Boolean encryptionVFlashSupported;
    protected Boolean encryptionCBRCSupported;
    protected Boolean encryptionHBRSupported;
    protected Boolean ftEfiSupported;
    protected String unmapMethodSupported;
    protected Integer maxMemMBPerFtVm;
    protected Boolean virtualMmuUsageIgnored;
    protected Boolean virtualExecUsageIgnored;
    protected Boolean vmCreateDateSupported;
    protected Boolean vmfs3EOLSupported;
    protected Boolean ftVmcpSupported;
    protected Boolean quickBootSupported;
    protected Boolean encryptedFtSupported;
    protected Boolean assignableHardwareSupported;
    protected Boolean suspendToMemorySupported;
    protected Boolean useFeatureReqsForOldHWv;
    protected Boolean markPerenniallyReservedSupported;
    protected Boolean hppPspSupported;
    protected Boolean deviceRebindWithoutRebootSupported;
    protected Boolean storagePolicyChangeSupported;
    protected Boolean precisionTimeProtocolSupported;
    protected Boolean remoteDeviceVMotionSupported;
    protected Integer maxSupportedVmMemory;
    protected Boolean ahDeviceHintsSupported;
    protected Boolean nvmeOverTcpSupported;
    protected Boolean nvmeStorageFabricServicesSupported;
    protected Boolean assignHwPciConfigSupported;
    protected Boolean timeConfigSupported;
    protected Boolean nvmeBatchOperationsSupported;
    protected Boolean pMemFailoverSupported;
    protected Boolean hostConfigEncryptionSupported;
    protected Integer maxSupportedSimultaneousThreads;
    protected Boolean ptpConfigSupported;
    protected Integer maxSupportedPtpPorts;
    protected Boolean sgxRegistrationSupported;
    protected Boolean pMemIndependentSnapshotSupported;
    protected Boolean iommuSLDirtyCapable;
    protected Boolean vmknicBindingSupported;
    protected Boolean ultralowFixedUnmapSupported;
    protected Boolean nvmeVvolSupported;
    protected Boolean fptHotplugSupported;
    protected Boolean mconnectSupported;
    protected Boolean vsanNicMgmtSupported;
    protected Boolean vvolNQNSupported;
    protected Boolean stretchedSCSupported;
    protected Boolean vmknicBindingOnNFSv41;
    protected Boolean vpStatusCheckSupported;
    protected Boolean nConnectSupported;
    protected Boolean userKeySupported;
    protected Boolean ndcmSupported;
    protected Boolean uefiSecureBoot;

    /**
     * Gets the value of the recursiveResourcePoolsSupported property.
     * 
     */
    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }

    /**
     * Sets the value of the recursiveResourcePoolsSupported property.
     * 
     */
    public void setRecursiveResourcePoolsSupported(boolean value) {
        this.recursiveResourcePoolsSupported = value;
    }

    /**
     * Gets the value of the cpuMemoryResourceConfigurationSupported property.
     * 
     */
    public boolean isCpuMemoryResourceConfigurationSupported() {
        return cpuMemoryResourceConfigurationSupported;
    }

    /**
     * Sets the value of the cpuMemoryResourceConfigurationSupported property.
     * 
     */
    public void setCpuMemoryResourceConfigurationSupported(boolean value) {
        this.cpuMemoryResourceConfigurationSupported = value;
    }

    /**
     * Gets the value of the rebootSupported property.
     * 
     */
    public boolean isRebootSupported() {
        return rebootSupported;
    }

    /**
     * Sets the value of the rebootSupported property.
     * 
     */
    public void setRebootSupported(boolean value) {
        this.rebootSupported = value;
    }

    /**
     * Gets the value of the shutdownSupported property.
     * 
     */
    public boolean isShutdownSupported() {
        return shutdownSupported;
    }

    /**
     * Sets the value of the shutdownSupported property.
     * 
     */
    public void setShutdownSupported(boolean value) {
        this.shutdownSupported = value;
    }

    /**
     * Gets the value of the vmotionSupported property.
     * 
     */
    public boolean isVmotionSupported() {
        return vmotionSupported;
    }

    /**
     * Sets the value of the vmotionSupported property.
     * 
     */
    public void setVmotionSupported(boolean value) {
        this.vmotionSupported = value;
    }

    /**
     * Gets the value of the standbySupported property.
     * 
     */
    public boolean isStandbySupported() {
        return standbySupported;
    }

    /**
     * Sets the value of the standbySupported property.
     * 
     */
    public void setStandbySupported(boolean value) {
        this.standbySupported = value;
    }

    /**
     * Gets the value of the ipmiSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpmiSupported() {
        return ipmiSupported;
    }

    /**
     * Sets the value of the ipmiSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpmiSupported(Boolean value) {
        this.ipmiSupported = value;
    }

    /**
     * Gets the value of the maxSupportedVMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }

    /**
     * Sets the value of the maxSupportedVMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSupportedVMs(Integer value) {
        this.maxSupportedVMs = value;
    }

    /**
     * Gets the value of the maxRunningVMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRunningVMs() {
        return maxRunningVMs;
    }

    /**
     * Sets the value of the maxRunningVMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRunningVMs(Integer value) {
        this.maxRunningVMs = value;
    }

    /**
     * Gets the value of the maxSupportedVcpus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }

    /**
     * Sets the value of the maxSupportedVcpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSupportedVcpus(Integer value) {
        this.maxSupportedVcpus = value;
    }

    /**
     * Gets the value of the maxRegisteredVMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRegisteredVMs() {
        return maxRegisteredVMs;
    }

    /**
     * Sets the value of the maxRegisteredVMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRegisteredVMs(Integer value) {
        this.maxRegisteredVMs = value;
    }

    /**
     * Gets the value of the datastorePrincipalSupported property.
     * 
     */
    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }

    /**
     * Sets the value of the datastorePrincipalSupported property.
     * 
     */
    public void setDatastorePrincipalSupported(boolean value) {
        this.datastorePrincipalSupported = value;
    }

    /**
     * Gets the value of the sanSupported property.
     * 
     */
    public boolean isSanSupported() {
        return sanSupported;
    }

    /**
     * Sets the value of the sanSupported property.
     * 
     */
    public void setSanSupported(boolean value) {
        this.sanSupported = value;
    }

    /**
     * Gets the value of the nfsSupported property.
     * 
     */
    public boolean isNfsSupported() {
        return nfsSupported;
    }

    /**
     * Sets the value of the nfsSupported property.
     * 
     */
    public void setNfsSupported(boolean value) {
        this.nfsSupported = value;
    }

    /**
     * Gets the value of the iscsiSupported property.
     * 
     */
    public boolean isIscsiSupported() {
        return iscsiSupported;
    }

    /**
     * Sets the value of the iscsiSupported property.
     * 
     */
    public void setIscsiSupported(boolean value) {
        this.iscsiSupported = value;
    }

    /**
     * Gets the value of the vlanTaggingSupported property.
     * 
     */
    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }

    /**
     * Sets the value of the vlanTaggingSupported property.
     * 
     */
    public void setVlanTaggingSupported(boolean value) {
        this.vlanTaggingSupported = value;
    }

    /**
     * Gets the value of the nicTeamingSupported property.
     * 
     */
    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }

    /**
     * Sets the value of the nicTeamingSupported property.
     * 
     */
    public void setNicTeamingSupported(boolean value) {
        this.nicTeamingSupported = value;
    }

    /**
     * Gets the value of the highGuestMemSupported property.
     * 
     */
    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }

    /**
     * Sets the value of the highGuestMemSupported property.
     * 
     */
    public void setHighGuestMemSupported(boolean value) {
        this.highGuestMemSupported = value;
    }

    /**
     * Gets the value of the maintenanceModeSupported property.
     * 
     */
    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }

    /**
     * Sets the value of the maintenanceModeSupported property.
     * 
     */
    public void setMaintenanceModeSupported(boolean value) {
        this.maintenanceModeSupported = value;
    }

    /**
     * Gets the value of the suspendedRelocateSupported property.
     * 
     */
    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }

    /**
     * Sets the value of the suspendedRelocateSupported property.
     * 
     */
    public void setSuspendedRelocateSupported(boolean value) {
        this.suspendedRelocateSupported = value;
    }

    /**
     * Gets the value of the restrictedSnapshotRelocateSupported property.
     * 
     */
    public boolean isRestrictedSnapshotRelocateSupported() {
        return restrictedSnapshotRelocateSupported;
    }

    /**
     * Sets the value of the restrictedSnapshotRelocateSupported property.
     * 
     */
    public void setRestrictedSnapshotRelocateSupported(boolean value) {
        this.restrictedSnapshotRelocateSupported = value;
    }

    /**
     * Gets the value of the perVmSwapFiles property.
     * 
     */
    public boolean isPerVmSwapFiles() {
        return perVmSwapFiles;
    }

    /**
     * Sets the value of the perVmSwapFiles property.
     * 
     */
    public void setPerVmSwapFiles(boolean value) {
        this.perVmSwapFiles = value;
    }

    /**
     * Gets the value of the localSwapDatastoreSupported property.
     * 
     */
    public boolean isLocalSwapDatastoreSupported() {
        return localSwapDatastoreSupported;
    }

    /**
     * Sets the value of the localSwapDatastoreSupported property.
     * 
     */
    public void setLocalSwapDatastoreSupported(boolean value) {
        this.localSwapDatastoreSupported = value;
    }

    /**
     * Gets the value of the unsharedSwapVMotionSupported property.
     * 
     */
    public boolean isUnsharedSwapVMotionSupported() {
        return unsharedSwapVMotionSupported;
    }

    /**
     * Sets the value of the unsharedSwapVMotionSupported property.
     * 
     */
    public void setUnsharedSwapVMotionSupported(boolean value) {
        this.unsharedSwapVMotionSupported = value;
    }

    /**
     * Gets the value of the backgroundSnapshotsSupported property.
     * 
     */
    public boolean isBackgroundSnapshotsSupported() {
        return backgroundSnapshotsSupported;
    }

    /**
     * Sets the value of the backgroundSnapshotsSupported property.
     * 
     */
    public void setBackgroundSnapshotsSupported(boolean value) {
        this.backgroundSnapshotsSupported = value;
    }

    /**
     * Gets the value of the preAssignedPCIUnitNumbersSupported property.
     * 
     */
    public boolean isPreAssignedPCIUnitNumbersSupported() {
        return preAssignedPCIUnitNumbersSupported;
    }

    /**
     * Sets the value of the preAssignedPCIUnitNumbersSupported property.
     * 
     */
    public void setPreAssignedPCIUnitNumbersSupported(boolean value) {
        this.preAssignedPCIUnitNumbersSupported = value;
    }

    /**
     * Gets the value of the screenshotSupported property.
     * 
     */
    public boolean isScreenshotSupported() {
        return screenshotSupported;
    }

    /**
     * Sets the value of the screenshotSupported property.
     * 
     */
    public void setScreenshotSupported(boolean value) {
        this.screenshotSupported = value;
    }

    /**
     * Gets the value of the scaledScreenshotSupported property.
     * 
     */
    public boolean isScaledScreenshotSupported() {
        return scaledScreenshotSupported;
    }

    /**
     * Sets the value of the scaledScreenshotSupported property.
     * 
     */
    public void setScaledScreenshotSupported(boolean value) {
        this.scaledScreenshotSupported = value;
    }

    /**
     * Gets the value of the storageVMotionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStorageVMotionSupported() {
        return storageVMotionSupported;
    }

    /**
     * Sets the value of the storageVMotionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStorageVMotionSupported(Boolean value) {
        this.storageVMotionSupported = value;
    }

    /**
     * Gets the value of the vmotionWithStorageVMotionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmotionWithStorageVMotionSupported() {
        return vmotionWithStorageVMotionSupported;
    }

    /**
     * Sets the value of the vmotionWithStorageVMotionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmotionWithStorageVMotionSupported(Boolean value) {
        this.vmotionWithStorageVMotionSupported = value;
    }

    /**
     * Gets the value of the vmotionAcrossNetworkSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmotionAcrossNetworkSupported() {
        return vmotionAcrossNetworkSupported;
    }

    /**
     * Sets the value of the vmotionAcrossNetworkSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmotionAcrossNetworkSupported(Boolean value) {
        this.vmotionAcrossNetworkSupported = value;
    }

    /**
     * Gets the value of the maxNumDisksSVMotion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumDisksSVMotion() {
        return maxNumDisksSVMotion;
    }

    /**
     * Sets the value of the maxNumDisksSVMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumDisksSVMotion(Integer value) {
        this.maxNumDisksSVMotion = value;
    }

    /**
     * Gets the value of the maxVirtualDiskDescVersionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxVirtualDiskDescVersionSupported() {
        return maxVirtualDiskDescVersionSupported;
    }

    /**
     * Sets the value of the maxVirtualDiskDescVersionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxVirtualDiskDescVersionSupported(Integer value) {
        this.maxVirtualDiskDescVersionSupported = value;
    }

    /**
     * Gets the value of the hbrNicSelectionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHbrNicSelectionSupported() {
        return hbrNicSelectionSupported;
    }

    /**
     * Sets the value of the hbrNicSelectionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHbrNicSelectionSupported(Boolean value) {
        this.hbrNicSelectionSupported = value;
    }

    /**
     * Gets the value of the vrNfcNicSelectionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVrNfcNicSelectionSupported() {
        return vrNfcNicSelectionSupported;
    }

    /**
     * Sets the value of the vrNfcNicSelectionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVrNfcNicSelectionSupported(Boolean value) {
        this.vrNfcNicSelectionSupported = value;
    }

    /**
     * Gets the value of the recordReplaySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordReplaySupported() {
        return recordReplaySupported;
    }

    /**
     * Sets the value of the recordReplaySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordReplaySupported(Boolean value) {
        this.recordReplaySupported = value;
    }

    /**
     * Gets the value of the ftSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtSupported() {
        return ftSupported;
    }

    /**
     * Sets the value of the ftSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtSupported(Boolean value) {
        this.ftSupported = value;
    }

    /**
     * Gets the value of the replayUnsupportedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplayUnsupportedReason() {
        return replayUnsupportedReason;
    }

    /**
     * Sets the value of the replayUnsupportedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplayUnsupportedReason(String value) {
        this.replayUnsupportedReason = value;
    }

    /**
     * Gets the value of the replayCompatibilityIssues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replayCompatibilityIssues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReplayCompatibilityIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the replayCompatibilityIssues property.
     */
    public List<String> getReplayCompatibilityIssues() {
        if (replayCompatibilityIssues == null) {
            replayCompatibilityIssues = new ArrayList<>();
        }
        return this.replayCompatibilityIssues;
    }

    /**
     * Gets the value of the smpFtSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmpFtSupported() {
        return smpFtSupported;
    }

    /**
     * Sets the value of the smpFtSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmpFtSupported(Boolean value) {
        this.smpFtSupported = value;
    }

    /**
     * Gets the value of the ftCompatibilityIssues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftCompatibilityIssues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFtCompatibilityIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ftCompatibilityIssues property.
     */
    public List<String> getFtCompatibilityIssues() {
        if (ftCompatibilityIssues == null) {
            ftCompatibilityIssues = new ArrayList<>();
        }
        return this.ftCompatibilityIssues;
    }

    /**
     * Gets the value of the smpFtCompatibilityIssues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smpFtCompatibilityIssues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSmpFtCompatibilityIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the smpFtCompatibilityIssues property.
     */
    public List<String> getSmpFtCompatibilityIssues() {
        if (smpFtCompatibilityIssues == null) {
            smpFtCompatibilityIssues = new ArrayList<>();
        }
        return this.smpFtCompatibilityIssues;
    }

    /**
     * Gets the value of the maxVcpusPerFtVm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxVcpusPerFtVm() {
        return maxVcpusPerFtVm;
    }

    /**
     * Sets the value of the maxVcpusPerFtVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxVcpusPerFtVm(Integer value) {
        this.maxVcpusPerFtVm = value;
    }

    /**
     * Gets the value of the loginBySSLThumbprintSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoginBySSLThumbprintSupported() {
        return loginBySSLThumbprintSupported;
    }

    /**
     * Sets the value of the loginBySSLThumbprintSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoginBySSLThumbprintSupported(Boolean value) {
        this.loginBySSLThumbprintSupported = value;
    }

    /**
     * Gets the value of the cloneFromSnapshotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloneFromSnapshotSupported() {
        return cloneFromSnapshotSupported;
    }

    /**
     * Sets the value of the cloneFromSnapshotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloneFromSnapshotSupported(Boolean value) {
        this.cloneFromSnapshotSupported = value;
    }

    /**
     * Gets the value of the deltaDiskBackingsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeltaDiskBackingsSupported() {
        return deltaDiskBackingsSupported;
    }

    /**
     * Sets the value of the deltaDiskBackingsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeltaDiskBackingsSupported(Boolean value) {
        this.deltaDiskBackingsSupported = value;
    }

    /**
     * Gets the value of the perVMNetworkTrafficShapingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerVMNetworkTrafficShapingSupported() {
        return perVMNetworkTrafficShapingSupported;
    }

    /**
     * Sets the value of the perVMNetworkTrafficShapingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerVMNetworkTrafficShapingSupported(Boolean value) {
        this.perVMNetworkTrafficShapingSupported = value;
    }

    /**
     * Gets the value of the tpmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpmSupported() {
        return tpmSupported;
    }

    /**
     * Sets the value of the tpmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpmSupported(Boolean value) {
        this.tpmSupported = value;
    }

    /**
     * Gets the value of the tpmVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmVersion() {
        return tpmVersion;
    }

    /**
     * Sets the value of the tpmVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmVersion(String value) {
        this.tpmVersion = value;
    }

    /**
     * Gets the value of the txtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxtEnabled() {
        return txtEnabled;
    }

    /**
     * Sets the value of the txtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxtEnabled(Boolean value) {
        this.txtEnabled = value;
    }

    /**
     * Gets the value of the supportedCpuFeature property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCpuFeature property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedCpuFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCpuIdInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedCpuFeature property.
     */
    public List<HostCpuIdInfo> getSupportedCpuFeature() {
        if (supportedCpuFeature == null) {
            supportedCpuFeature = new ArrayList<>();
        }
        return this.supportedCpuFeature;
    }

    /**
     * Gets the value of the virtualExecUsageSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualExecUsageSupported() {
        return virtualExecUsageSupported;
    }

    /**
     * Sets the value of the virtualExecUsageSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualExecUsageSupported(Boolean value) {
        this.virtualExecUsageSupported = value;
    }

    /**
     * Gets the value of the storageIORMSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStorageIORMSupported() {
        return storageIORMSupported;
    }

    /**
     * Sets the value of the storageIORMSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStorageIORMSupported(Boolean value) {
        this.storageIORMSupported = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    /**
     * Sets the value of the vmDirectPathGen2Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmDirectPathGen2Supported(Boolean value) {
        this.vmDirectPathGen2Supported = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2UnsupportedReason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmDirectPathGen2UnsupportedReason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmDirectPathGen2UnsupportedReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmDirectPathGen2UnsupportedReason property.
     */
    public List<String> getVmDirectPathGen2UnsupportedReason() {
        if (vmDirectPathGen2UnsupportedReason == null) {
            vmDirectPathGen2UnsupportedReason = new ArrayList<>();
        }
        return this.vmDirectPathGen2UnsupportedReason;
    }

    /**
     * Gets the value of the vmDirectPathGen2UnsupportedReasonExtended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmDirectPathGen2UnsupportedReasonExtended() {
        return vmDirectPathGen2UnsupportedReasonExtended;
    }

    /**
     * Sets the value of the vmDirectPathGen2UnsupportedReasonExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmDirectPathGen2UnsupportedReasonExtended(String value) {
        this.vmDirectPathGen2UnsupportedReasonExtended = value;
    }

    /**
     * Gets the value of the supportedVmfsMajorVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVmfsMajorVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedVmfsMajorVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedVmfsMajorVersion property.
     */
    public List<Integer> getSupportedVmfsMajorVersion() {
        if (supportedVmfsMajorVersion == null) {
            supportedVmfsMajorVersion = new ArrayList<>();
        }
        return this.supportedVmfsMajorVersion;
    }

    /**
     * Gets the value of the vStorageCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVStorageCapable() {
        return vStorageCapable;
    }

    /**
     * Sets the value of the vStorageCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVStorageCapable(Boolean value) {
        this.vStorageCapable = value;
    }

    /**
     * Gets the value of the snapshotRelayoutSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnapshotRelayoutSupported() {
        return snapshotRelayoutSupported;
    }

    /**
     * Sets the value of the snapshotRelayoutSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotRelayoutSupported(Boolean value) {
        this.snapshotRelayoutSupported = value;
    }

    /**
     * Gets the value of the firewallIpRulesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirewallIpRulesSupported() {
        return firewallIpRulesSupported;
    }

    /**
     * Sets the value of the firewallIpRulesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirewallIpRulesSupported(Boolean value) {
        this.firewallIpRulesSupported = value;
    }

    /**
     * Gets the value of the servicePackageInfoSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePackageInfoSupported() {
        return servicePackageInfoSupported;
    }

    /**
     * Sets the value of the servicePackageInfoSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicePackageInfoSupported(Boolean value) {
        this.servicePackageInfoSupported = value;
    }

    /**
     * Gets the value of the maxHostRunningVms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHostRunningVms() {
        return maxHostRunningVms;
    }

    /**
     * Sets the value of the maxHostRunningVms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHostRunningVms(Integer value) {
        this.maxHostRunningVms = value;
    }

    /**
     * Gets the value of the maxHostSupportedVcpus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHostSupportedVcpus() {
        return maxHostSupportedVcpus;
    }

    /**
     * Sets the value of the maxHostSupportedVcpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHostSupportedVcpus(Integer value) {
        this.maxHostSupportedVcpus = value;
    }

    /**
     * Gets the value of the vmfsDatastoreMountCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmfsDatastoreMountCapable() {
        return vmfsDatastoreMountCapable;
    }

    /**
     * Sets the value of the vmfsDatastoreMountCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmfsDatastoreMountCapable(Boolean value) {
        this.vmfsDatastoreMountCapable = value;
    }

    /**
     * Gets the value of the eightPlusHostVmfsSharedAccessSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEightPlusHostVmfsSharedAccessSupported() {
        return eightPlusHostVmfsSharedAccessSupported;
    }

    /**
     * Sets the value of the eightPlusHostVmfsSharedAccessSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEightPlusHostVmfsSharedAccessSupported(Boolean value) {
        this.eightPlusHostVmfsSharedAccessSupported = value;
    }

    /**
     * Gets the value of the nestedHVSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNestedHVSupported() {
        return nestedHVSupported;
    }

    /**
     * Sets the value of the nestedHVSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNestedHVSupported(Boolean value) {
        this.nestedHVSupported = value;
    }

    /**
     * Gets the value of the vpmcSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVPMCSupported() {
        return vpmcSupported;
    }

    /**
     * Sets the value of the vpmcSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVPMCSupported(Boolean value) {
        this.vpmcSupported = value;
    }

    /**
     * Gets the value of the interVMCommunicationThroughVMCISupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterVMCommunicationThroughVMCISupported() {
        return interVMCommunicationThroughVMCISupported;
    }

    /**
     * Sets the value of the interVMCommunicationThroughVMCISupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterVMCommunicationThroughVMCISupported(Boolean value) {
        this.interVMCommunicationThroughVMCISupported = value;
    }

    /**
     * Gets the value of the scheduledHardwareUpgradeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduledHardwareUpgradeSupported() {
        return scheduledHardwareUpgradeSupported;
    }

    /**
     * Sets the value of the scheduledHardwareUpgradeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduledHardwareUpgradeSupported(Boolean value) {
        this.scheduledHardwareUpgradeSupported = value;
    }

    /**
     * Gets the value of the featureCapabilitiesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeatureCapabilitiesSupported() {
        return featureCapabilitiesSupported;
    }

    /**
     * Sets the value of the featureCapabilitiesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeatureCapabilitiesSupported(Boolean value) {
        this.featureCapabilitiesSupported = value;
    }

    /**
     * Gets the value of the latencySensitivitySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatencySensitivitySupported() {
        return latencySensitivitySupported;
    }

    /**
     * Sets the value of the latencySensitivitySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatencySensitivitySupported(Boolean value) {
        this.latencySensitivitySupported = value;
    }

    /**
     * Gets the value of the storagePolicySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoragePolicySupported() {
        return storagePolicySupported;
    }

    /**
     * Sets the value of the storagePolicySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoragePolicySupported(Boolean value) {
        this.storagePolicySupported = value;
    }

    /**
     * Gets the value of the accel3DSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccel3DSupported() {
        return accel3DSupported;
    }

    /**
     * Sets the value of the accel3DSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccel3DSupported(Boolean value) {
        this.accel3DSupported = value;
    }

    /**
     * Gets the value of the reliableMemoryAware property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliableMemoryAware() {
        return reliableMemoryAware;
    }

    /**
     * Sets the value of the reliableMemoryAware property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliableMemoryAware(Boolean value) {
        this.reliableMemoryAware = value;
    }

    /**
     * Gets the value of the multipleNetworkStackInstanceSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleNetworkStackInstanceSupported() {
        return multipleNetworkStackInstanceSupported;
    }

    /**
     * Sets the value of the multipleNetworkStackInstanceSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleNetworkStackInstanceSupported(Boolean value) {
        this.multipleNetworkStackInstanceSupported = value;
    }

    /**
     * Gets the value of the messageBusProxySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageBusProxySupported() {
        return messageBusProxySupported;
    }

    /**
     * Sets the value of the messageBusProxySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageBusProxySupported(Boolean value) {
        this.messageBusProxySupported = value;
    }

    /**
     * Gets the value of the vsanSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsanSupported() {
        return vsanSupported;
    }

    /**
     * Sets the value of the vsanSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsanSupported(Boolean value) {
        this.vsanSupported = value;
    }

    /**
     * Gets the value of the vFlashSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVFlashSupported() {
        return vFlashSupported;
    }

    /**
     * Sets the value of the vFlashSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVFlashSupported(Boolean value) {
        this.vFlashSupported = value;
    }

    /**
     * Gets the value of the hostAccessManagerSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostAccessManagerSupported() {
        return hostAccessManagerSupported;
    }

    /**
     * Sets the value of the hostAccessManagerSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostAccessManagerSupported(Boolean value) {
        this.hostAccessManagerSupported = value;
    }

    /**
     * Gets the value of the provisioningNicSelectionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvisioningNicSelectionSupported() {
        return provisioningNicSelectionSupported;
    }

    /**
     * Sets the value of the provisioningNicSelectionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvisioningNicSelectionSupported(Boolean value) {
        this.provisioningNicSelectionSupported = value;
    }

    /**
     * Gets the value of the nfs41Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNfs41Supported() {
        return nfs41Supported;
    }

    /**
     * Sets the value of the nfs41Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNfs41Supported(Boolean value) {
        this.nfs41Supported = value;
    }

    /**
     * Gets the value of the nfs41Krb5ISupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNfs41Krb5ISupported() {
        return nfs41Krb5ISupported;
    }

    /**
     * Sets the value of the nfs41Krb5ISupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNfs41Krb5ISupported(Boolean value) {
        this.nfs41Krb5ISupported = value;
    }

    /**
     * Gets the value of the turnDiskLocatorLedSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTurnDiskLocatorLedSupported() {
        return turnDiskLocatorLedSupported;
    }

    /**
     * Sets the value of the turnDiskLocatorLedSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTurnDiskLocatorLedSupported(Boolean value) {
        this.turnDiskLocatorLedSupported = value;
    }

    /**
     * Gets the value of the virtualVolumeDatastoreSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualVolumeDatastoreSupported() {
        return virtualVolumeDatastoreSupported;
    }

    /**
     * Sets the value of the virtualVolumeDatastoreSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualVolumeDatastoreSupported(Boolean value) {
        this.virtualVolumeDatastoreSupported = value;
    }

    /**
     * Gets the value of the markAsSsdSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkAsSsdSupported() {
        return markAsSsdSupported;
    }

    /**
     * Sets the value of the markAsSsdSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkAsSsdSupported(Boolean value) {
        this.markAsSsdSupported = value;
    }

    /**
     * Gets the value of the markAsLocalSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkAsLocalSupported() {
        return markAsLocalSupported;
    }

    /**
     * Sets the value of the markAsLocalSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkAsLocalSupported(Boolean value) {
        this.markAsLocalSupported = value;
    }

    /**
     * Gets the value of the smartCardAuthenticationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartCardAuthenticationSupported() {
        return smartCardAuthenticationSupported;
    }

    /**
     * Sets the value of the smartCardAuthenticationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartCardAuthenticationSupported(Boolean value) {
        this.smartCardAuthenticationSupported = value;
    }

    /**
     * Gets the value of the pMemSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMemSupported() {
        return pMemSupported;
    }

    /**
     * Sets the value of the pMemSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMemSupported(Boolean value) {
        this.pMemSupported = value;
    }

    /**
     * Gets the value of the pMemSnapshotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMemSnapshotSupported() {
        return pMemSnapshotSupported;
    }

    /**
     * Sets the value of the pMemSnapshotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMemSnapshotSupported(Boolean value) {
        this.pMemSnapshotSupported = value;
    }

    /**
     * Gets the value of the cryptoSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCryptoSupported() {
        return cryptoSupported;
    }

    /**
     * Sets the value of the cryptoSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCryptoSupported(Boolean value) {
        this.cryptoSupported = value;
    }

    /**
     * Gets the value of the oneKVolumeAPIsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneKVolumeAPIsSupported() {
        return oneKVolumeAPIsSupported;
    }

    /**
     * Sets the value of the oneKVolumeAPIsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneKVolumeAPIsSupported(Boolean value) {
        this.oneKVolumeAPIsSupported = value;
    }

    /**
     * Gets the value of the gatewayOnNicSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayOnNicSupported() {
        return gatewayOnNicSupported;
    }

    /**
     * Sets the value of the gatewayOnNicSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayOnNicSupported(Boolean value) {
        this.gatewayOnNicSupported = value;
    }

    /**
     * Gets the value of the upitSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpitSupported() {
        return upitSupported;
    }

    /**
     * Sets the value of the upitSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpitSupported(Boolean value) {
        this.upitSupported = value;
    }

    /**
     * Gets the value of the cpuHwMmuSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpuHwMmuSupported() {
        return cpuHwMmuSupported;
    }

    /**
     * Sets the value of the cpuHwMmuSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpuHwMmuSupported(Boolean value) {
        this.cpuHwMmuSupported = value;
    }

    /**
     * Gets the value of the encryptedVMotionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptedVMotionSupported() {
        return encryptedVMotionSupported;
    }

    /**
     * Sets the value of the encryptedVMotionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptedVMotionSupported(Boolean value) {
        this.encryptedVMotionSupported = value;
    }

    /**
     * Gets the value of the encryptionChangeOnAddRemoveSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionChangeOnAddRemoveSupported() {
        return encryptionChangeOnAddRemoveSupported;
    }

    /**
     * Sets the value of the encryptionChangeOnAddRemoveSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionChangeOnAddRemoveSupported(Boolean value) {
        this.encryptionChangeOnAddRemoveSupported = value;
    }

    /**
     * Gets the value of the encryptionHotOperationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionHotOperationSupported() {
        return encryptionHotOperationSupported;
    }

    /**
     * Sets the value of the encryptionHotOperationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionHotOperationSupported(Boolean value) {
        this.encryptionHotOperationSupported = value;
    }

    /**
     * Gets the value of the encryptionWithSnapshotsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionWithSnapshotsSupported() {
        return encryptionWithSnapshotsSupported;
    }

    /**
     * Sets the value of the encryptionWithSnapshotsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionWithSnapshotsSupported(Boolean value) {
        this.encryptionWithSnapshotsSupported = value;
    }

    /**
     * Gets the value of the encryptionFaultToleranceSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionFaultToleranceSupported() {
        return encryptionFaultToleranceSupported;
    }

    /**
     * Sets the value of the encryptionFaultToleranceSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionFaultToleranceSupported(Boolean value) {
        this.encryptionFaultToleranceSupported = value;
    }

    /**
     * Gets the value of the encryptionMemorySaveSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionMemorySaveSupported() {
        return encryptionMemorySaveSupported;
    }

    /**
     * Sets the value of the encryptionMemorySaveSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionMemorySaveSupported(Boolean value) {
        this.encryptionMemorySaveSupported = value;
    }

    /**
     * Gets the value of the encryptionRDMSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionRDMSupported() {
        return encryptionRDMSupported;
    }

    /**
     * Sets the value of the encryptionRDMSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionRDMSupported(Boolean value) {
        this.encryptionRDMSupported = value;
    }

    /**
     * Gets the value of the encryptionVFlashSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionVFlashSupported() {
        return encryptionVFlashSupported;
    }

    /**
     * Sets the value of the encryptionVFlashSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionVFlashSupported(Boolean value) {
        this.encryptionVFlashSupported = value;
    }

    /**
     * Gets the value of the encryptionCBRCSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionCBRCSupported() {
        return encryptionCBRCSupported;
    }

    /**
     * Sets the value of the encryptionCBRCSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionCBRCSupported(Boolean value) {
        this.encryptionCBRCSupported = value;
    }

    /**
     * Gets the value of the encryptionHBRSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptionHBRSupported() {
        return encryptionHBRSupported;
    }

    /**
     * Sets the value of the encryptionHBRSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptionHBRSupported(Boolean value) {
        this.encryptionHBRSupported = value;
    }

    /**
     * Gets the value of the ftEfiSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtEfiSupported() {
        return ftEfiSupported;
    }

    /**
     * Sets the value of the ftEfiSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtEfiSupported(Boolean value) {
        this.ftEfiSupported = value;
    }

    /**
     * Gets the value of the unmapMethodSupported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmapMethodSupported() {
        return unmapMethodSupported;
    }

    /**
     * Sets the value of the unmapMethodSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmapMethodSupported(String value) {
        this.unmapMethodSupported = value;
    }

    /**
     * Gets the value of the maxMemMBPerFtVm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMemMBPerFtVm() {
        return maxMemMBPerFtVm;
    }

    /**
     * Sets the value of the maxMemMBPerFtVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMemMBPerFtVm(Integer value) {
        this.maxMemMBPerFtVm = value;
    }

    /**
     * Gets the value of the virtualMmuUsageIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualMmuUsageIgnored() {
        return virtualMmuUsageIgnored;
    }

    /**
     * Sets the value of the virtualMmuUsageIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualMmuUsageIgnored(Boolean value) {
        this.virtualMmuUsageIgnored = value;
    }

    /**
     * Gets the value of the virtualExecUsageIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualExecUsageIgnored() {
        return virtualExecUsageIgnored;
    }

    /**
     * Sets the value of the virtualExecUsageIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualExecUsageIgnored(Boolean value) {
        this.virtualExecUsageIgnored = value;
    }

    /**
     * Gets the value of the vmCreateDateSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmCreateDateSupported() {
        return vmCreateDateSupported;
    }

    /**
     * Sets the value of the vmCreateDateSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmCreateDateSupported(Boolean value) {
        this.vmCreateDateSupported = value;
    }

    /**
     * Gets the value of the vmfs3EOLSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmfs3EOLSupported() {
        return vmfs3EOLSupported;
    }

    /**
     * Sets the value of the vmfs3EOLSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmfs3EOLSupported(Boolean value) {
        this.vmfs3EOLSupported = value;
    }

    /**
     * Gets the value of the ftVmcpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtVmcpSupported() {
        return ftVmcpSupported;
    }

    /**
     * Sets the value of the ftVmcpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtVmcpSupported(Boolean value) {
        this.ftVmcpSupported = value;
    }

    /**
     * Gets the value of the quickBootSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuickBootSupported() {
        return quickBootSupported;
    }

    /**
     * Sets the value of the quickBootSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuickBootSupported(Boolean value) {
        this.quickBootSupported = value;
    }

    /**
     * Gets the value of the encryptedFtSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptedFtSupported() {
        return encryptedFtSupported;
    }

    /**
     * Sets the value of the encryptedFtSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptedFtSupported(Boolean value) {
        this.encryptedFtSupported = value;
    }

    /**
     * Gets the value of the assignableHardwareSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignableHardwareSupported() {
        return assignableHardwareSupported;
    }

    /**
     * Sets the value of the assignableHardwareSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignableHardwareSupported(Boolean value) {
        this.assignableHardwareSupported = value;
    }

    /**
     * Gets the value of the suspendToMemorySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspendToMemorySupported() {
        return suspendToMemorySupported;
    }

    /**
     * Sets the value of the suspendToMemorySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspendToMemorySupported(Boolean value) {
        this.suspendToMemorySupported = value;
    }

    /**
     * Gets the value of the useFeatureReqsForOldHWv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFeatureReqsForOldHWv() {
        return useFeatureReqsForOldHWv;
    }

    /**
     * Sets the value of the useFeatureReqsForOldHWv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFeatureReqsForOldHWv(Boolean value) {
        this.useFeatureReqsForOldHWv = value;
    }

    /**
     * Gets the value of the markPerenniallyReservedSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkPerenniallyReservedSupported() {
        return markPerenniallyReservedSupported;
    }

    /**
     * Sets the value of the markPerenniallyReservedSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkPerenniallyReservedSupported(Boolean value) {
        this.markPerenniallyReservedSupported = value;
    }

    /**
     * Gets the value of the hppPspSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHppPspSupported() {
        return hppPspSupported;
    }

    /**
     * Sets the value of the hppPspSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHppPspSupported(Boolean value) {
        this.hppPspSupported = value;
    }

    /**
     * Gets the value of the deviceRebindWithoutRebootSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceRebindWithoutRebootSupported() {
        return deviceRebindWithoutRebootSupported;
    }

    /**
     * Sets the value of the deviceRebindWithoutRebootSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceRebindWithoutRebootSupported(Boolean value) {
        this.deviceRebindWithoutRebootSupported = value;
    }

    /**
     * Gets the value of the storagePolicyChangeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoragePolicyChangeSupported() {
        return storagePolicyChangeSupported;
    }

    /**
     * Sets the value of the storagePolicyChangeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoragePolicyChangeSupported(Boolean value) {
        this.storagePolicyChangeSupported = value;
    }

    /**
     * Gets the value of the precisionTimeProtocolSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrecisionTimeProtocolSupported() {
        return precisionTimeProtocolSupported;
    }

    /**
     * Sets the value of the precisionTimeProtocolSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrecisionTimeProtocolSupported(Boolean value) {
        this.precisionTimeProtocolSupported = value;
    }

    /**
     * Gets the value of the remoteDeviceVMotionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteDeviceVMotionSupported() {
        return remoteDeviceVMotionSupported;
    }

    /**
     * Sets the value of the remoteDeviceVMotionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteDeviceVMotionSupported(Boolean value) {
        this.remoteDeviceVMotionSupported = value;
    }

    /**
     * Gets the value of the maxSupportedVmMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSupportedVmMemory() {
        return maxSupportedVmMemory;
    }

    /**
     * Sets the value of the maxSupportedVmMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSupportedVmMemory(Integer value) {
        this.maxSupportedVmMemory = value;
    }

    /**
     * Gets the value of the ahDeviceHintsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAhDeviceHintsSupported() {
        return ahDeviceHintsSupported;
    }

    /**
     * Sets the value of the ahDeviceHintsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAhDeviceHintsSupported(Boolean value) {
        this.ahDeviceHintsSupported = value;
    }

    /**
     * Gets the value of the nvmeOverTcpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvmeOverTcpSupported() {
        return nvmeOverTcpSupported;
    }

    /**
     * Sets the value of the nvmeOverTcpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvmeOverTcpSupported(Boolean value) {
        this.nvmeOverTcpSupported = value;
    }

    /**
     * Gets the value of the nvmeStorageFabricServicesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvmeStorageFabricServicesSupported() {
        return nvmeStorageFabricServicesSupported;
    }

    /**
     * Sets the value of the nvmeStorageFabricServicesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvmeStorageFabricServicesSupported(Boolean value) {
        this.nvmeStorageFabricServicesSupported = value;
    }

    /**
     * Gets the value of the assignHwPciConfigSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignHwPciConfigSupported() {
        return assignHwPciConfigSupported;
    }

    /**
     * Sets the value of the assignHwPciConfigSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignHwPciConfigSupported(Boolean value) {
        this.assignHwPciConfigSupported = value;
    }

    /**
     * Gets the value of the timeConfigSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeConfigSupported() {
        return timeConfigSupported;
    }

    /**
     * Sets the value of the timeConfigSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeConfigSupported(Boolean value) {
        this.timeConfigSupported = value;
    }

    /**
     * Gets the value of the nvmeBatchOperationsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvmeBatchOperationsSupported() {
        return nvmeBatchOperationsSupported;
    }

    /**
     * Sets the value of the nvmeBatchOperationsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvmeBatchOperationsSupported(Boolean value) {
        this.nvmeBatchOperationsSupported = value;
    }

    /**
     * Gets the value of the pMemFailoverSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMemFailoverSupported() {
        return pMemFailoverSupported;
    }

    /**
     * Sets the value of the pMemFailoverSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMemFailoverSupported(Boolean value) {
        this.pMemFailoverSupported = value;
    }

    /**
     * Gets the value of the hostConfigEncryptionSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostConfigEncryptionSupported() {
        return hostConfigEncryptionSupported;
    }

    /**
     * Sets the value of the hostConfigEncryptionSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostConfigEncryptionSupported(Boolean value) {
        this.hostConfigEncryptionSupported = value;
    }

    /**
     * Gets the value of the maxSupportedSimultaneousThreads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSupportedSimultaneousThreads() {
        return maxSupportedSimultaneousThreads;
    }

    /**
     * Sets the value of the maxSupportedSimultaneousThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSupportedSimultaneousThreads(Integer value) {
        this.maxSupportedSimultaneousThreads = value;
    }

    /**
     * Gets the value of the ptpConfigSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtpConfigSupported() {
        return ptpConfigSupported;
    }

    /**
     * Sets the value of the ptpConfigSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtpConfigSupported(Boolean value) {
        this.ptpConfigSupported = value;
    }

    /**
     * Gets the value of the maxSupportedPtpPorts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSupportedPtpPorts() {
        return maxSupportedPtpPorts;
    }

    /**
     * Sets the value of the maxSupportedPtpPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSupportedPtpPorts(Integer value) {
        this.maxSupportedPtpPorts = value;
    }

    /**
     * Gets the value of the sgxRegistrationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgxRegistrationSupported() {
        return sgxRegistrationSupported;
    }

    /**
     * Sets the value of the sgxRegistrationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSgxRegistrationSupported(Boolean value) {
        this.sgxRegistrationSupported = value;
    }

    /**
     * Gets the value of the pMemIndependentSnapshotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMemIndependentSnapshotSupported() {
        return pMemIndependentSnapshotSupported;
    }

    /**
     * Sets the value of the pMemIndependentSnapshotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMemIndependentSnapshotSupported(Boolean value) {
        this.pMemIndependentSnapshotSupported = value;
    }

    /**
     * Gets the value of the iommuSLDirtyCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIommuSLDirtyCapable() {
        return iommuSLDirtyCapable;
    }

    /**
     * Sets the value of the iommuSLDirtyCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIommuSLDirtyCapable(Boolean value) {
        this.iommuSLDirtyCapable = value;
    }

    /**
     * Gets the value of the vmknicBindingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmknicBindingSupported() {
        return vmknicBindingSupported;
    }

    /**
     * Sets the value of the vmknicBindingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmknicBindingSupported(Boolean value) {
        this.vmknicBindingSupported = value;
    }

    /**
     * Gets the value of the ultralowFixedUnmapSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUltralowFixedUnmapSupported() {
        return ultralowFixedUnmapSupported;
    }

    /**
     * Sets the value of the ultralowFixedUnmapSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUltralowFixedUnmapSupported(Boolean value) {
        this.ultralowFixedUnmapSupported = value;
    }

    /**
     * Gets the value of the nvmeVvolSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvmeVvolSupported() {
        return nvmeVvolSupported;
    }

    /**
     * Sets the value of the nvmeVvolSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvmeVvolSupported(Boolean value) {
        this.nvmeVvolSupported = value;
    }

    /**
     * Gets the value of the fptHotplugSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFptHotplugSupported() {
        return fptHotplugSupported;
    }

    /**
     * Sets the value of the fptHotplugSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFptHotplugSupported(Boolean value) {
        this.fptHotplugSupported = value;
    }

    /**
     * Gets the value of the mconnectSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMconnectSupported() {
        return mconnectSupported;
    }

    /**
     * Sets the value of the mconnectSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMconnectSupported(Boolean value) {
        this.mconnectSupported = value;
    }

    /**
     * Gets the value of the vsanNicMgmtSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsanNicMgmtSupported() {
        return vsanNicMgmtSupported;
    }

    /**
     * Sets the value of the vsanNicMgmtSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsanNicMgmtSupported(Boolean value) {
        this.vsanNicMgmtSupported = value;
    }

    /**
     * Gets the value of the vvolNQNSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVvolNQNSupported() {
        return vvolNQNSupported;
    }

    /**
     * Sets the value of the vvolNQNSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVvolNQNSupported(Boolean value) {
        this.vvolNQNSupported = value;
    }

    /**
     * Gets the value of the stretchedSCSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStretchedSCSupported() {
        return stretchedSCSupported;
    }

    /**
     * Sets the value of the stretchedSCSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStretchedSCSupported(Boolean value) {
        this.stretchedSCSupported = value;
    }

    /**
     * Gets the value of the vmknicBindingOnNFSv41 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmknicBindingOnNFSv41() {
        return vmknicBindingOnNFSv41;
    }

    /**
     * Sets the value of the vmknicBindingOnNFSv41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmknicBindingOnNFSv41(Boolean value) {
        this.vmknicBindingOnNFSv41 = value;
    }

    /**
     * Gets the value of the vpStatusCheckSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpStatusCheckSupported() {
        return vpStatusCheckSupported;
    }

    /**
     * Sets the value of the vpStatusCheckSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpStatusCheckSupported(Boolean value) {
        this.vpStatusCheckSupported = value;
    }

    /**
     * Gets the value of the nConnectSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNConnectSupported() {
        return nConnectSupported;
    }

    /**
     * Sets the value of the nConnectSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNConnectSupported(Boolean value) {
        this.nConnectSupported = value;
    }

    /**
     * Gets the value of the userKeySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserKeySupported() {
        return userKeySupported;
    }

    /**
     * Sets the value of the userKeySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserKeySupported(Boolean value) {
        this.userKeySupported = value;
    }

    /**
     * Gets the value of the ndcmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNdcmSupported() {
        return ndcmSupported;
    }

    /**
     * Sets the value of the ndcmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNdcmSupported(Boolean value) {
        this.ndcmSupported = value;
    }

    /**
     * Gets the value of the uefiSecureBoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUefiSecureBoot() {
        return uefiSecureBoot;
    }

    /**
     * Sets the value of the uefiSecureBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUefiSecureBoot(Boolean value) {
        this.uefiSecureBoot = value;
    }

}
