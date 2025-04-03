
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIpInconsistentEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostIpInconsistentEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ipAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpInconsistentEvent", propOrder = {
    "ipAddress",
    "ipAddress2"
})
public class HostIpInconsistentEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String ipAddress2;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the ipAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress2() {
        return ipAddress2;
    }

    /**
     * Sets the value of the ipAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress2(String value) {
        this.ipAddress2 = value;
    }

}
