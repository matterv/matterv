
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPciDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPciDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="classId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="bus" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="slot" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="function" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="subVendorId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="subDeviceId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="parentBridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPciDevice", propOrder = {
    "id",
    "classId",
    "bus",
    "slot",
    "function",
    "vendorId",
    "subVendorId",
    "vendorName",
    "deviceId",
    "subDeviceId",
    "parentBridge",
    "deviceName",
    "deviceClassName"
})
public class HostPciDevice
    extends DynamicData
{

    @XmlElement(required = true)
    protected String id;
    protected short classId;
    protected byte bus;
    protected byte slot;
    protected byte function;
    protected short vendorId;
    protected short subVendorId;
    @XmlElement(required = true)
    protected String vendorName;
    protected short deviceId;
    protected short subDeviceId;
    protected String parentBridge;
    @XmlElement(required = true)
    protected String deviceName;
    protected String deviceClassName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     */
    public short getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     */
    public void setClassId(short value) {
        this.classId = value;
    }

    /**
     * Gets the value of the bus property.
     * 
     */
    public byte getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     */
    public void setBus(byte value) {
        this.bus = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     */
    public byte getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     */
    public void setSlot(byte value) {
        this.slot = value;
    }

    /**
     * Gets the value of the function property.
     * 
     */
    public byte getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     */
    public void setFunction(byte value) {
        this.function = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     */
    public short getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     */
    public void setVendorId(short value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the subVendorId property.
     * 
     */
    public short getSubVendorId() {
        return subVendorId;
    }

    /**
     * Sets the value of the subVendorId property.
     * 
     */
    public void setSubVendorId(short value) {
        this.subVendorId = value;
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
     * Gets the value of the deviceId property.
     * 
     */
    public short getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     */
    public void setDeviceId(short value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the subDeviceId property.
     * 
     */
    public short getSubDeviceId() {
        return subDeviceId;
    }

    /**
     * Sets the value of the subDeviceId property.
     * 
     */
    public void setSubDeviceId(short value) {
        this.subDeviceId = value;
    }

    /**
     * Gets the value of the parentBridge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBridge() {
        return parentBridge;
    }

    /**
     * Sets the value of the parentBridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBridge(String value) {
        this.parentBridge = value;
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
     * Gets the value of the deviceClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceClassName() {
        return deviceClassName;
    }

    /**
     * Sets the value of the deviceClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceClassName(String value) {
        this.deviceClassName = value;
    }

}
