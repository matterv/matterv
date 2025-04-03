
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfHardwareExport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfHardwareExport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfExport">
 *       <sequence>
 *         <element name="device" type="{urn:internalvim25}VirtualDevice" minOccurs="0"/>
 *         <element name="vmPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfHardwareExport", propOrder = {
    "device",
    "vmPath"
})
@XmlSeeAlso({
    OvfConnectedDevice.class,
    OvfUnableToExportDisk.class,
    OvfUnknownDeviceBacking.class,
    OvfUnsupportedDeviceExport.class
})
public class OvfHardwareExport
    extends OvfExport
{

    protected VirtualDevice device;
    @XmlElement(required = true)
    protected String vmPath;

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

    /**
     * Gets the value of the vmPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmPath() {
        return vmPath;
    }

    /**
     * Sets the value of the vmPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmPath(String value) {
        this.vmPath = value;
    }

}
