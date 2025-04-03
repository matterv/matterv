
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEvent")
@XmlSeeAlso({
    HostConnectedEvent.class,
    HostDisconnectedEvent.class,
    HostSyncFailedEvent.class,
    HostConnectionLostEvent.class,
    HostReconnectionFailedEvent.class,
    HostCnxFailedNoConnectionEvent.class,
    HostCnxFailedBadUsernameEvent.class,
    HostCnxFailedBadVersionEvent.class,
    HostCnxFailedAlreadyManagedEvent.class,
    HostCnxFailedNoLicenseEvent.class,
    HostCnxFailedNetworkErrorEvent.class,
    HostRemovedEvent.class,
    HostCnxFailedCcagentUpgradeEvent.class,
    HostCnxFailedBadCcagentEvent.class,
    HostCnxFailedEvent.class,
    HostCnxFailedAccountFailedEvent.class,
    HostCnxFailedNoAccessEvent.class,
    HostShutdownEvent.class,
    HostCnxFailedNotFoundEvent.class,
    HostCnxFailedTimeoutEvent.class,
    HostUpgradeFailedEvent.class,
    EnteringMaintenanceModeEvent.class,
    EnteredMaintenanceModeEvent.class,
    ExitMaintenanceModeEvent.class,
    CanceledHostOperationEvent.class,
    TimedOutHostOperationEvent.class,
    HostDasEnabledEvent.class,
    HostDasDisabledEvent.class,
    HostDasEnablingEvent.class,
    HostDasDisablingEvent.class,
    HostDasErrorEvent.class,
    HostDasOkEvent.class,
    VcAgentUpgradedEvent.class,
    VcAgentUninstalledEvent.class,
    VcAgentUpgradeFailedEvent.class,
    VcAgentUninstallFailedEvent.class,
    HostAddedEvent.class,
    HostAddFailedEvent.class,
    HostIpChangedEvent.class,
    EnteringStandbyModeEvent.class,
    EnteredStandbyModeEvent.class,
    ExitingStandbyModeEvent.class,
    ExitedStandbyModeEvent.class,
    ExitStandbyModeFailedEvent.class,
    UpdatedAgentBeingRestartedEvent.class,
    AccountCreatedEvent.class,
    AccountRemovedEvent.class,
    UserPasswordChanged.class,
    AccountUpdatedEvent.class,
    UserAssignedToGroup.class,
    UserUnassignedFromGroup.class,
    DatastorePrincipalConfigured.class,
    VMFSDatastoreCreatedEvent.class,
    NASDatastoreCreatedEvent.class,
    LocalDatastoreCreatedEvent.class,
    VMFSDatastoreExtendedEvent.class,
    VMFSDatastoreExpandedEvent.class,
    DatastoreRemovedOnHostEvent.class,
    DatastoreRenamedOnHostEvent.class,
    DuplicateIpDetectedEvent.class,
    DatastoreDiscoveredEvent.class,
    DrsResourceConfigureFailedEvent.class,
    DrsResourceConfigureSyncedEvent.class,
    HostGetShortNameFailedEvent.class,
    HostShortNameToIpFailedEvent.class,
    HostIpToShortNameFailedEvent.class,
    HostIpInconsistentEvent.class,
    HostUserWorldSwapNotEnabledEvent.class,
    HostNonCompliantEvent.class,
    HostCompliantEvent.class,
    HostComplianceCheckedEvent.class,
    HostSpecificationUpdateEvent.class,
    HostSubSpecificationUpdateEvent.class,
    HostSubSpecificationDeleteEvent.class,
    HostSpecificationChangedEvent.class,
    HostSpecificationRequireEvent.class,
    HostConfigAppliedEvent.class,
    HostProfileAppliedEvent.class,
    HostDasEvent.class,
    HostVnicConnectedToCustomizedDVPortEvent.class,
    GhostDvsProxySwitchDetectedEvent.class,
    GhostDvsProxySwitchRemovedEvent.class,
    HostWwnConflictEvent.class,
    HostWwnChangedEvent.class,
    HostAdminDisableEvent.class,
    HostAdminEnableEvent.class,
    HostEnableAdminFailedEvent.class,
    NoDatastoresConfiguredEvent.class,
    AdminPasswordNotChangedEvent.class,
    HostInAuditModeEvent.class,
    LocalTSMEnabledEvent.class,
    RemoteTSMEnabledEvent.class,
    VimAccountPasswordChangedEvent.class,
    IScsiBootFailureEvent.class,
    DvsHealthStatusChangeEvent.class
})
public class HostEvent
    extends Event
{


}
