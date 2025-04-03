
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDasEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDasEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
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
@XmlType(name = "HostDasEvent")
@XmlSeeAlso({
    HostPrimaryAgentNotShortNameEvent.class,
    HostNotInClusterEvent.class,
    HostIsolationIpPingFailedEvent.class,
    HostShortNameInconsistentEvent.class,
    HostNoRedundantManagementNetworkEvent.class,
    HostNoAvailableNetworksEvent.class,
    HostExtraNetworksEvent.class,
    HostNoHAEnabledPortGroupsEvent.class,
    HostMissingNetworksEvent.class
})
public class HostDasEvent
    extends HostEvent
{


}
