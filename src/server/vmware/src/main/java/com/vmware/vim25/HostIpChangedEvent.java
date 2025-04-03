
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIpChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostIpChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="oldIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="newIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpChangedEvent", propOrder = {
    "oldIP",
    "newIP"
})
public class HostIpChangedEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected String oldIP;
    @XmlElement(required = true)
    protected String newIP;

    /**
     * Gets the value of the oldIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIP() {
        return oldIP;
    }

    /**
     * Sets the value of the oldIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIP(String value) {
        this.oldIP = value;
    }

    /**
     * Gets the value of the newIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIP() {
        return newIP;
    }

    /**
     * Sets the value of the newIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIP(String value) {
        this.newIP = value;
    }

}
