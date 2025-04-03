
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSwitchProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSwitchProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="link" type="{urn:internalvim25}LinkProfile"/>
 *         <element name="numPorts" type="{urn:internalvim25}NumPortsProfile"/>
 *         <element name="networkPolicy" type="{urn:internalvim25}NetworkPolicyProfile"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSwitchProfile", propOrder = {
    "key",
    "name",
    "link",
    "numPorts",
    "networkPolicy"
})
public class VirtualSwitchProfile
    extends ApplyProfile
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected LinkProfile link;
    @XmlElement(required = true)
    protected NumPortsProfile numPorts;
    @XmlElement(required = true)
    protected NetworkPolicyProfile networkPolicy;

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
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link LinkProfile }
     *     
     */
    public LinkProfile getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProfile }
     *     
     */
    public void setLink(LinkProfile value) {
        this.link = value;
    }

    /**
     * Gets the value of the numPorts property.
     * 
     * @return
     *     possible object is
     *     {@link NumPortsProfile }
     *     
     */
    public NumPortsProfile getNumPorts() {
        return numPorts;
    }

    /**
     * Sets the value of the numPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPortsProfile }
     *     
     */
    public void setNumPorts(NumPortsProfile value) {
        this.numPorts = value;
    }

    /**
     * Gets the value of the networkPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkPolicyProfile }
     *     
     */
    public NetworkPolicyProfile getNetworkPolicy() {
        return networkPolicy;
    }

    /**
     * Sets the value of the networkPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkPolicyProfile }
     *     
     */
    public void setNetworkPolicy(NetworkPolicyProfile value) {
        this.networkPolicy = value;
    }

}
