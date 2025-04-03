
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashManagerVFlashResourceConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashManagerVFlashResourceConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vffs" type="{urn:internalvim25}HostVffsVolume" minOccurs="0"/>
 *         <element name="capacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashResourceConfigInfo", propOrder = {
    "vffs",
    "capacity"
})
public class HostVFlashManagerVFlashResourceConfigInfo
    extends DynamicData
{

    protected HostVffsVolume vffs;
    protected long capacity;

    /**
     * Gets the value of the vffs property.
     * 
     * @return
     *     possible object is
     *     {@link HostVffsVolume }
     *     
     */
    public HostVffsVolume getVffs() {
        return vffs;
    }

    /**
     * Sets the value of the vffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVffsVolume }
     *     
     */
    public void setVffs(HostVffsVolume value) {
        this.vffs = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(long value) {
        this.capacity = value;
    }

}
