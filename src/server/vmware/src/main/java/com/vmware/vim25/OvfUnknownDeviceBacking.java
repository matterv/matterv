
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfUnknownDeviceBacking complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfUnknownDeviceBacking">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfHardwareExport">
 *       <sequence>
 *         <element name="backing" type="{urn:internalvim25}VirtualDeviceBackingInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnknownDeviceBacking", propOrder = {
    "backing"
})
public class OvfUnknownDeviceBacking
    extends OvfHardwareExport
{

    @XmlElement(required = true)
    protected VirtualDeviceBackingInfo backing;

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public VirtualDeviceBackingInfo getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public void setBacking(VirtualDeviceBackingInfo value) {
        this.backing = value;
    }

}
