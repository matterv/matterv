
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFirewallDefaultPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFirewallDefaultPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="incomingBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="outgoingBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallDefaultPolicy", propOrder = {
    "incomingBlocked",
    "outgoingBlocked"
})
public class HostFirewallDefaultPolicy
    extends DynamicData
{

    protected Boolean incomingBlocked;
    protected Boolean outgoingBlocked;

    /**
     * Gets the value of the incomingBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncomingBlocked() {
        return incomingBlocked;
    }

    /**
     * Sets the value of the incomingBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncomingBlocked(Boolean value) {
        this.incomingBlocked = value;
    }

    /**
     * Gets the value of the outgoingBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutgoingBlocked() {
        return outgoingBlocked;
    }

    /**
     * Sets the value of the outgoingBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutgoingBlocked(Boolean value) {
        this.outgoingBlocked = value;
    }

}
