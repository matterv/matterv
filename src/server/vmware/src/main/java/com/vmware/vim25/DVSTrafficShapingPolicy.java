
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSTrafficShapingPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSTrafficShapingPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InheritablePolicy">
 *       <sequence>
 *         <element name="enabled" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="averageBandwidth" type="{urn:internalvim25}LongPolicy" minOccurs="0"/>
 *         <element name="peakBandwidth" type="{urn:internalvim25}LongPolicy" minOccurs="0"/>
 *         <element name="burstSize" type="{urn:internalvim25}LongPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSTrafficShapingPolicy", propOrder = {
    "enabled",
    "averageBandwidth",
    "peakBandwidth",
    "burstSize"
})
public class DVSTrafficShapingPolicy
    extends InheritablePolicy
{

    protected BoolPolicy enabled;
    protected LongPolicy averageBandwidth;
    protected LongPolicy peakBandwidth;
    protected LongPolicy burstSize;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setEnabled(BoolPolicy value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the averageBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link LongPolicy }
     *     
     */
    public LongPolicy getAverageBandwidth() {
        return averageBandwidth;
    }

    /**
     * Sets the value of the averageBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPolicy }
     *     
     */
    public void setAverageBandwidth(LongPolicy value) {
        this.averageBandwidth = value;
    }

    /**
     * Gets the value of the peakBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link LongPolicy }
     *     
     */
    public LongPolicy getPeakBandwidth() {
        return peakBandwidth;
    }

    /**
     * Sets the value of the peakBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPolicy }
     *     
     */
    public void setPeakBandwidth(LongPolicy value) {
        this.peakBandwidth = value;
    }

    /**
     * Gets the value of the burstSize property.
     * 
     * @return
     *     possible object is
     *     {@link LongPolicy }
     *     
     */
    public LongPolicy getBurstSize() {
        return burstSize;
    }

    /**
     * Sets the value of the burstSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPolicy }
     *     
     */
    public void setBurstSize(LongPolicy value) {
        this.burstSize = value;
    }

}
