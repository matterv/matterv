
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMM complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNVDIMM">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="configuredCapacityInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMM", propOrder = {
    "capacityInMB",
    "configuredCapacityInMB"
})
public class VirtualNVDIMM
    extends VirtualDevice
{

    protected long capacityInMB;
    protected Long configuredCapacityInMB;

    /**
     * Gets the value of the capacityInMB property.
     * 
     */
    public long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     */
    public void setCapacityInMB(long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the configuredCapacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfiguredCapacityInMB() {
        return configuredCapacityInMB;
    }

    /**
     * Sets the value of the configuredCapacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfiguredCapacityInMB(Long value) {
        this.configuredCapacityInMB = value;
    }

}
