
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVirtualDeviceGroupsVendorDeviceGroup complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVirtualDeviceGroupsVendorDeviceGroup">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineVirtualDeviceGroupsDeviceGroup">
 *       <sequence>
 *         <element name="deviceGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVirtualDeviceGroupsVendorDeviceGroup", propOrder = {
    "deviceGroupName"
})
public class VirtualMachineVirtualDeviceGroupsVendorDeviceGroup
    extends VirtualMachineVirtualDeviceGroupsDeviceGroup
{

    @XmlElement(required = true)
    protected String deviceGroupName;

    /**
     * Gets the value of the deviceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    /**
     * Sets the value of the deviceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceGroupName(String value) {
        this.deviceGroupName = value;
    }

}
