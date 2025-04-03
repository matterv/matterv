
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsEvent">
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
@XmlType(name = "DvsEvent")
@XmlSeeAlso({
    DvsUpgradeAvailableEvent.class,
    DvsCreatedEvent.class,
    DvsRenamedEvent.class,
    DvsReconfiguredEvent.class,
    DvsUpgradeInProgressEvent.class,
    DvsUpgradeRejectedEvent.class,
    DvsUpgradedEvent.class,
    DvsHostJoinedEvent.class,
    DvsHostLeftEvent.class,
    OutOfSyncDvsHost.class,
    DvsHostWentOutOfSyncEvent.class,
    DvsHostBackInSyncEvent.class,
    DvsHostStatusUpdated.class,
    DvsPortCreatedEvent.class,
    DvsPortReconfiguredEvent.class,
    DvsPortDeletedEvent.class,
    DvsPortConnectedEvent.class,
    DvsPortDisconnectedEvent.class,
    DvsPortVendorSpecificStateChangeEvent.class,
    DvsPortRuntimeChangeEvent.class,
    DvsPortLinkUpEvent.class,
    DvsPortLinkDownEvent.class,
    DvsPortJoinPortgroupEvent.class,
    DvsPortLeavePortgroupEvent.class,
    DvsPortBlockedEvent.class,
    DvsPortUnblockedEvent.class,
    DvsPortEnteredPassthruEvent.class,
    DvsPortExitedPassthruEvent.class,
    DvsDestroyedEvent.class,
    DvsMergedEvent.class,
    HostLocalPortCreatedEvent.class,
    RollbackEvent.class,
    RecoveryEvent.class,
    DvsImportEvent.class,
    DvsRestoreEvent.class,
    VmVnicPoolReservationViolationRaiseEvent.class,
    VmVnicPoolReservationViolationClearEvent.class
})
public class DvsEvent
    extends Event
{


}
