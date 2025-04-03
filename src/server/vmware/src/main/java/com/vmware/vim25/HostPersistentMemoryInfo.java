
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPersistentMemoryInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPersistentMemoryInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="volumeUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPersistentMemoryInfo", propOrder = {
    "capacityInMB",
    "volumeUUID"
})
public class HostPersistentMemoryInfo
    extends DynamicData
{

    protected Long capacityInMB;
    protected String volumeUUID;

    /**
     * Gets the value of the capacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityInMB(Long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the volumeUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUUID() {
        return volumeUUID;
    }

    /**
     * Sets the value of the volumeUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUUID(String value) {
        this.volumeUUID = value;
    }

}
