
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVirtualDeviceGroupsDeviceGroup complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVirtualDeviceGroupsDeviceGroup">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="groupInstanceKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="deviceInfo" type="{urn:internalvim25}Description" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVirtualDeviceGroupsDeviceGroup", propOrder = {
    "groupInstanceKey",
    "deviceInfo"
})
@XmlSeeAlso({
    VirtualMachineVirtualDeviceGroupsVendorDeviceGroup.class
})
public class VirtualMachineVirtualDeviceGroupsDeviceGroup
    extends DynamicData
{

    protected int groupInstanceKey;
    protected Description deviceInfo;

    /**
     * Gets the value of the groupInstanceKey property.
     * 
     */
    public int getGroupInstanceKey() {
        return groupInstanceKey;
    }

    /**
     * Sets the value of the groupInstanceKey property.
     * 
     */
    public void setGroupInstanceKey(int value) {
        this.groupInstanceKey = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDeviceInfo(Description value) {
        this.deviceInfo = value;
    }

}
