
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIPassthroughAllowedDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIPassthroughAllowedDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="subVendorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="subDeviceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughAllowedDevice", propOrder = {
    "vendorId",
    "deviceId",
    "subVendorId",
    "subDeviceId",
    "revisionId"
})
public class VirtualPCIPassthroughAllowedDevice
    extends DynamicData
{

    protected int vendorId;
    protected int deviceId;
    protected Integer subVendorId;
    protected Integer subDeviceId;
    protected Short revisionId;

    /**
     * Gets the value of the vendorId property.
     * 
     */
    public int getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     */
    public void setVendorId(int value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     */
    public int getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     */
    public void setDeviceId(int value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the subVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubVendorId() {
        return subVendorId;
    }

    /**
     * Sets the value of the subVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubVendorId(Integer value) {
        this.subVendorId = value;
    }

    /**
     * Gets the value of the subDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubDeviceId() {
        return subDeviceId;
    }

    /**
     * Sets the value of the subDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubDeviceId(Integer value) {
        this.subDeviceId = value;
    }

    /**
     * Gets the value of the revisionId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRevisionId() {
        return revisionId;
    }

    /**
     * Sets the value of the revisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRevisionId(Short value) {
        this.revisionId = value;
    }

}
