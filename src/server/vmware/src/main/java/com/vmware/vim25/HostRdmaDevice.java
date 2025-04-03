
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRdmaDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="driver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}HostRdmaDeviceBacking" minOccurs="0"/>
 *         <element name="connectionInfo" type="{urn:internalvim25}HostRdmaDeviceConnectionInfo"/>
 *         <element name="capability" type="{urn:internalvim25}HostRdmaDeviceCapability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDevice", propOrder = {
    "key",
    "device",
    "driver",
    "description",
    "backing",
    "connectionInfo",
    "capability"
})
public class HostRdmaDevice
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String device;
    protected String driver;
    protected String description;
    protected HostRdmaDeviceBacking backing;
    @XmlElement(required = true)
    protected HostRdmaDeviceConnectionInfo connectionInfo;
    @XmlElement(required = true)
    protected HostRdmaDeviceCapability capability;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link HostRdmaDeviceBacking }
     *     
     */
    public HostRdmaDeviceBacking getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRdmaDeviceBacking }
     *     
     */
    public void setBacking(HostRdmaDeviceBacking value) {
        this.backing = value;
    }

    /**
     * Gets the value of the connectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostRdmaDeviceConnectionInfo }
     *     
     */
    public HostRdmaDeviceConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    /**
     * Sets the value of the connectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRdmaDeviceConnectionInfo }
     *     
     */
    public void setConnectionInfo(HostRdmaDeviceConnectionInfo value) {
        this.connectionInfo = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link HostRdmaDeviceCapability }
     *     
     */
    public HostRdmaDeviceCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRdmaDeviceCapability }
     *     
     */
    public void setCapability(HostRdmaDeviceCapability value) {
        this.capability = value;
    }

}
