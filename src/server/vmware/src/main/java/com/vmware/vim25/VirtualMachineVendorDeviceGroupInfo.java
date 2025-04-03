
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVendorDeviceGroupInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVendorDeviceGroupInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="deviceGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="componentDeviceInfo" type="{urn:internalvim25}VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVendorDeviceGroupInfo", propOrder = {
    "deviceGroupName",
    "deviceGroupDescription",
    "componentDeviceInfo"
})
public class VirtualMachineVendorDeviceGroupInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected String deviceGroupName;
    protected String deviceGroupDescription;
    protected List<VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo> componentDeviceInfo;

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

    /**
     * Gets the value of the deviceGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceGroupDescription() {
        return deviceGroupDescription;
    }

    /**
     * Sets the value of the deviceGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceGroupDescription(String value) {
        this.deviceGroupDescription = value;
    }

    /**
     * Gets the value of the componentDeviceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentDeviceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getComponentDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the componentDeviceInfo property.
     */
    public List<VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo> getComponentDeviceInfo() {
        if (componentDeviceInfo == null) {
            componentDeviceInfo = new ArrayList<>();
        }
        return this.componentDeviceInfo;
    }

}
