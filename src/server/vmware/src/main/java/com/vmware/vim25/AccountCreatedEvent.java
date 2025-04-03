
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCreatedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountCreatedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="spec" type="{urn:internalvim25}HostAccountSpec"/>
 *         <element name="group" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreatedEvent", propOrder = {
    "spec",
    "group"
})
public class AccountCreatedEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected HostAccountSpec spec;
    protected boolean group;

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostAccountSpec }
     *     
     */
    public HostAccountSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAccountSpec }
     *     
     */
    public void setSpec(HostAccountSpec value) {
        this.spec = value;
    }

    /**
     * Gets the value of the group property.
     * 
     */
    public boolean isGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(boolean value) {
        this.group = value;
    }

}
