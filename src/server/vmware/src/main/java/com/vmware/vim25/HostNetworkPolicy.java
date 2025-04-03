
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="security" type="{urn:internalvim25}HostNetworkSecurityPolicy" minOccurs="0"/>
 *         <element name="nicTeaming" type="{urn:internalvim25}HostNicTeamingPolicy" minOccurs="0"/>
 *         <element name="offloadPolicy" type="{urn:internalvim25}HostNetOffloadCapabilities" minOccurs="0"/>
 *         <element name="shapingPolicy" type="{urn:internalvim25}HostNetworkTrafficShapingPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkPolicy", propOrder = {
    "security",
    "nicTeaming",
    "offloadPolicy",
    "shapingPolicy"
})
public class HostNetworkPolicy
    extends DynamicData
{

    protected HostNetworkSecurityPolicy security;
    protected HostNicTeamingPolicy nicTeaming;
    protected HostNetOffloadCapabilities offloadPolicy;
    protected HostNetworkTrafficShapingPolicy shapingPolicy;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkSecurityPolicy }
     *     
     */
    public HostNetworkSecurityPolicy getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkSecurityPolicy }
     *     
     */
    public void setSecurity(HostNetworkSecurityPolicy value) {
        this.security = value;
    }

    /**
     * Gets the value of the nicTeaming property.
     * 
     * @return
     *     possible object is
     *     {@link HostNicTeamingPolicy }
     *     
     */
    public HostNicTeamingPolicy getNicTeaming() {
        return nicTeaming;
    }

    /**
     * Sets the value of the nicTeaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNicTeamingPolicy }
     *     
     */
    public void setNicTeaming(HostNicTeamingPolicy value) {
        this.nicTeaming = value;
    }

    /**
     * Gets the value of the offloadPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetOffloadCapabilities }
     *     
     */
    public HostNetOffloadCapabilities getOffloadPolicy() {
        return offloadPolicy;
    }

    /**
     * Sets the value of the offloadPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetOffloadCapabilities }
     *     
     */
    public void setOffloadPolicy(HostNetOffloadCapabilities value) {
        this.offloadPolicy = value;
    }

    /**
     * Gets the value of the shapingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkTrafficShapingPolicy }
     *     
     */
    public HostNetworkTrafficShapingPolicy getShapingPolicy() {
        return shapingPolicy;
    }

    /**
     * Sets the value of the shapingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkTrafficShapingPolicy }
     *     
     */
    public void setShapingPolicy(HostNetworkTrafficShapingPolicy value) {
        this.shapingPolicy = value;
    }

}
