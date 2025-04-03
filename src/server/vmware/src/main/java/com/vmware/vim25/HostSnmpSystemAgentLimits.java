
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSnmpSystemAgentLimits complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSnmpSystemAgentLimits">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="maxReadOnlyCommunities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxTrapDestinations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxCommunityLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxBufferSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="capability" type="{urn:internalvim25}HostSnmpAgentCapability" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSnmpSystemAgentLimits", propOrder = {
    "maxReadOnlyCommunities",
    "maxTrapDestinations",
    "maxCommunityLength",
    "maxBufferSize",
    "capability"
})
public class HostSnmpSystemAgentLimits
    extends DynamicData
{

    protected int maxReadOnlyCommunities;
    protected int maxTrapDestinations;
    protected int maxCommunityLength;
    protected int maxBufferSize;
    @XmlSchemaType(name = "string")
    protected HostSnmpAgentCapability capability;

    /**
     * Gets the value of the maxReadOnlyCommunities property.
     * 
     */
    public int getMaxReadOnlyCommunities() {
        return maxReadOnlyCommunities;
    }

    /**
     * Sets the value of the maxReadOnlyCommunities property.
     * 
     */
    public void setMaxReadOnlyCommunities(int value) {
        this.maxReadOnlyCommunities = value;
    }

    /**
     * Gets the value of the maxTrapDestinations property.
     * 
     */
    public int getMaxTrapDestinations() {
        return maxTrapDestinations;
    }

    /**
     * Sets the value of the maxTrapDestinations property.
     * 
     */
    public void setMaxTrapDestinations(int value) {
        this.maxTrapDestinations = value;
    }

    /**
     * Gets the value of the maxCommunityLength property.
     * 
     */
    public int getMaxCommunityLength() {
        return maxCommunityLength;
    }

    /**
     * Sets the value of the maxCommunityLength property.
     * 
     */
    public void setMaxCommunityLength(int value) {
        this.maxCommunityLength = value;
    }

    /**
     * Gets the value of the maxBufferSize property.
     * 
     */
    public int getMaxBufferSize() {
        return maxBufferSize;
    }

    /**
     * Sets the value of the maxBufferSize property.
     * 
     */
    public void setMaxBufferSize(int value) {
        this.maxBufferSize = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link HostSnmpAgentCapability }
     *     
     */
    public HostSnmpAgentCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSnmpAgentCapability }
     *     
     */
    public void setCapability(HostSnmpAgentCapability value) {
        this.capability = value;
    }

}
