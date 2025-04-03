
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isConfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="device" type="{urn:internalvim25}VirtualDevice"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo", propOrder = {
    "type",
    "vendorName",
    "deviceName",
    "isConfigurable",
    "device"
})
public class VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String vendorName;
    @XmlElement(required = true)
    protected String deviceName;
    protected boolean isConfigurable;
    @XmlElement(required = true)
    protected VirtualDevice device;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the isConfigurable property.
     * 
     */
    public boolean isIsConfigurable() {
        return isConfigurable;
    }

    /**
     * Sets the value of the isConfigurable property.
     * 
     */
    public void setIsConfigurable(boolean value) {
        this.isConfigurable = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDevice }
     *     
     */
    public VirtualDevice getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDevice }
     *     
     */
    public void setDevice(VirtualDevice value) {
        this.device = value;
    }

}
