
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterEvent">
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
@XmlType(name = "ClusterEvent")
@XmlSeeAlso({
    ClusterComplianceCheckedEvent.class,
    DasEnabledEvent.class,
    DasDisabledEvent.class,
    DasAdmissionControlDisabledEvent.class,
    DasAdmissionControlEnabledEvent.class,
    DasHostFailedEvent.class,
    DasHostIsolatedEvent.class,
    DasClusterIsolatedEvent.class,
    DasAgentUnavailableEvent.class,
    DasAgentFoundEvent.class,
    InsufficientFailoverResourcesEvent.class,
    FailoverLevelRestored.class,
    ClusterOvercommittedEvent.class,
    ClusterStatusChangedEvent.class,
    ClusterCreatedEvent.class,
    ClusterDestroyedEvent.class,
    DrsEnabledEvent.class,
    DrsDisabledEvent.class,
    ClusterReconfiguredEvent.class,
    HostMonitoringStateChangedEvent.class,
    VmHealthMonitoringStateChangedEvent.class,
    DrsInvocationFailedEvent.class,
    DrsRecoveredFromFailureEvent.class
})
public class ClusterEvent
    extends Event
{


}
