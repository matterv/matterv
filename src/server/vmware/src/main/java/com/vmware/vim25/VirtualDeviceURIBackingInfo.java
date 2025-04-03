
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceURIBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceURIBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="serviceURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="proxyURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceURIBackingInfo", propOrder = {
    "serviceURI",
    "direction",
    "proxyURI"
})
@XmlSeeAlso({
    VirtualSerialPortURIBackingInfo.class
})
public class VirtualDeviceURIBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String serviceURI;
    @XmlElement(required = true)
    protected String direction;
    protected String proxyURI;

    /**
     * Gets the value of the serviceURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceURI() {
        return serviceURI;
    }

    /**
     * Sets the value of the serviceURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceURI(String value) {
        this.serviceURI = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the proxyURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyURI() {
        return proxyURI;
    }

    /**
     * Sets the value of the proxyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyURI(String value) {
        this.proxyURI = value;
    }

}
