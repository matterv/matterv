
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkTrafficShapingPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkTrafficShapingPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="averageBandwidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="peakBandwidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="burstSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkTrafficShapingPolicy", propOrder = {
    "enabled",
    "averageBandwidth",
    "peakBandwidth",
    "burstSize"
})
public class HostNetworkTrafficShapingPolicy
    extends DynamicData
{

    protected Boolean enabled;
    protected Long averageBandwidth;
    protected Long peakBandwidth;
    protected Long burstSize;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the averageBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAverageBandwidth() {
        return averageBandwidth;
    }

    /**
     * Sets the value of the averageBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAverageBandwidth(Long value) {
        this.averageBandwidth = value;
    }

    /**
     * Gets the value of the peakBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeakBandwidth() {
        return peakBandwidth;
    }

    /**
     * Sets the value of the peakBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeakBandwidth(Long value) {
        this.peakBandwidth = value;
    }

    /**
     * Gets the value of the burstSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBurstSize() {
        return burstSize;
    }

    /**
     * Sets the value of the burstSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBurstSize(Long value) {
        this.burstSize = value;
    }

}
