
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFirewallRule complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFirewallRule">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="endPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="direction" type="{urn:internalvim25}HostFirewallRuleDirection"/>
 *         <element name="portType" type="{urn:internalvim25}HostFirewallRulePortType" minOccurs="0"/>
 *         <element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRule", propOrder = {
    "port",
    "endPort",
    "direction",
    "portType",
    "protocol"
})
public class HostFirewallRule
    extends DynamicData
{

    protected int port;
    protected Integer endPort;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostFirewallRuleDirection direction;
    @XmlSchemaType(name = "string")
    protected HostFirewallRulePortType portType;
    @XmlElement(required = true)
    protected String protocol;

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the endPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndPort() {
        return endPort;
    }

    /**
     * Sets the value of the endPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndPort(Integer value) {
        this.endPort = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link HostFirewallRuleDirection }
     *     
     */
    public HostFirewallRuleDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFirewallRuleDirection }
     *     
     */
    public void setDirection(HostFirewallRuleDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link HostFirewallRulePortType }
     *     
     */
    public HostFirewallRulePortType getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFirewallRulePortType }
     *     
     */
    public void setPortType(HostFirewallRulePortType value) {
        this.portType = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

}
