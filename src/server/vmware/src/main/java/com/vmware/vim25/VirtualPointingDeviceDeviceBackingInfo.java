
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPointingDeviceDeviceBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPointingDeviceDeviceBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingInfo">
 *       <sequence>
 *         <element name="hostPointingDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPointingDeviceDeviceBackingInfo", propOrder = {
    "hostPointingDevice"
})
public class VirtualPointingDeviceDeviceBackingInfo
    extends VirtualDeviceDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String hostPointingDevice;

    /**
     * Gets the value of the hostPointingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostPointingDevice() {
        return hostPointingDevice;
    }

    /**
     * Sets the value of the hostPointingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostPointingDevice(String value) {
        this.hostPointingDevice = value;
    }

}
