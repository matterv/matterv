
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVgpuDeviceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVgpuDeviceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceVendorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="maxFbSizeInGib" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="timeSlicedCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="migCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="computeProfileCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="quadroProfileCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVgpuDeviceInfo", propOrder = {
    "deviceName",
    "deviceVendorId",
    "maxFbSizeInGib",
    "timeSlicedCapable",
    "migCapable",
    "computeProfileCapable",
    "quadroProfileCapable"
})
public class VirtualMachineVgpuDeviceInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected String deviceName;
    protected long deviceVendorId;
    protected long maxFbSizeInGib;
    protected boolean timeSlicedCapable;
    protected boolean migCapable;
    protected boolean computeProfileCapable;
    protected boolean quadroProfileCapable;

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
     * Gets the value of the deviceVendorId property.
     * 
     */
    public long getDeviceVendorId() {
        return deviceVendorId;
    }

    /**
     * Sets the value of the deviceVendorId property.
     * 
     */
    public void setDeviceVendorId(long value) {
        this.deviceVendorId = value;
    }

    /**
     * Gets the value of the maxFbSizeInGib property.
     * 
     */
    public long getMaxFbSizeInGib() {
        return maxFbSizeInGib;
    }

    /**
     * Sets the value of the maxFbSizeInGib property.
     * 
     */
    public void setMaxFbSizeInGib(long value) {
        this.maxFbSizeInGib = value;
    }

    /**
     * Gets the value of the timeSlicedCapable property.
     * 
     */
    public boolean isTimeSlicedCapable() {
        return timeSlicedCapable;
    }

    /**
     * Sets the value of the timeSlicedCapable property.
     * 
     */
    public void setTimeSlicedCapable(boolean value) {
        this.timeSlicedCapable = value;
    }

    /**
     * Gets the value of the migCapable property.
     * 
     */
    public boolean isMigCapable() {
        return migCapable;
    }

    /**
     * Sets the value of the migCapable property.
     * 
     */
    public void setMigCapable(boolean value) {
        this.migCapable = value;
    }

    /**
     * Gets the value of the computeProfileCapable property.
     * 
     */
    public boolean isComputeProfileCapable() {
        return computeProfileCapable;
    }

    /**
     * Sets the value of the computeProfileCapable property.
     * 
     */
    public void setComputeProfileCapable(boolean value) {
        this.computeProfileCapable = value;
    }

    /**
     * Gets the value of the quadroProfileCapable property.
     * 
     */
    public boolean isQuadroProfileCapable() {
        return quadroProfileCapable;
    }

    /**
     * Sets the value of the quadroProfileCapable property.
     * 
     */
    public void setQuadroProfileCapable(boolean value) {
        this.quadroProfileCapable = value;
    }

}
