
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMMOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNVDIMMOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="capacityInMB" type="{urn:internalvim25}LongOption"/>
 *         <element name="growable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hotGrowable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="granularityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMOption", propOrder = {
    "capacityInMB",
    "growable",
    "hotGrowable",
    "granularityInMB"
})
public class VirtualNVDIMMOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected LongOption capacityInMB;
    protected boolean growable;
    protected boolean hotGrowable;
    protected long granularityInMB;

    /**
     * Gets the value of the capacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setCapacityInMB(LongOption value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the growable property.
     * 
     */
    public boolean isGrowable() {
        return growable;
    }

    /**
     * Sets the value of the growable property.
     * 
     */
    public void setGrowable(boolean value) {
        this.growable = value;
    }

    /**
     * Gets the value of the hotGrowable property.
     * 
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }

    /**
     * Sets the value of the hotGrowable property.
     * 
     */
    public void setHotGrowable(boolean value) {
        this.hotGrowable = value;
    }

    /**
     * Gets the value of the granularityInMB property.
     * 
     */
    public long getGranularityInMB() {
        return granularityInMB;
    }

    /**
     * Sets the value of the granularityInMB property.
     * 
     */
    public void setGranularityInMB(long value) {
        this.granularityInMB = value;
    }

}
