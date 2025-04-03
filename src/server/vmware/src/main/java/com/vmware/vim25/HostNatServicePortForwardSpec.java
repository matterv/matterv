
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNatServicePortForwardSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNatServicePortForwardSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="guestPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="guestIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServicePortForwardSpec", propOrder = {
    "type",
    "name",
    "hostPort",
    "guestPort",
    "guestIpAddress"
})
public class HostNatServicePortForwardSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String name;
    protected int hostPort;
    protected int guestPort;
    @XmlElement(required = true)
    protected String guestIpAddress;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hostPort property.
     * 
     */
    public int getHostPort() {
        return hostPort;
    }

    /**
     * Sets the value of the hostPort property.
     * 
     */
    public void setHostPort(int value) {
        this.hostPort = value;
    }

    /**
     * Gets the value of the guestPort property.
     * 
     */
    public int getGuestPort() {
        return guestPort;
    }

    /**
     * Sets the value of the guestPort property.
     * 
     */
    public void setGuestPort(int value) {
        this.guestPort = value;
    }

    /**
     * Gets the value of the guestIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestIpAddress() {
        return guestIpAddress;
    }

    /**
     * Sets the value of the guestIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestIpAddress(String value) {
        this.guestIpAddress = value;
    }

}
