
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPointingDeviceBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPointingDeviceBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingOption">
 *       <sequence>
 *         <element name="hostPointingDevice" type="{urn:internalvim25}ChoiceOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPointingDeviceBackingOption", propOrder = {
    "hostPointingDevice"
})
public class VirtualPointingDeviceBackingOption
    extends VirtualDeviceDeviceBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption hostPointingDevice;

    /**
     * Gets the value of the hostPointingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getHostPointingDevice() {
        return hostPointingDevice;
    }

    /**
     * Sets the value of the hostPointingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setHostPointingDevice(ChoiceOption value) {
        this.hostPointingDevice = value;
    }

}
