
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPrimaryAgentNotShortNameEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPrimaryAgentNotShortNameEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDasEvent">
 *       <sequence>
 *         <element name="primaryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPrimaryAgentNotShortNameEvent", propOrder = {
    "primaryAgent"
})
public class HostPrimaryAgentNotShortNameEvent
    extends HostDasEvent
{

    @XmlElement(required = true)
    protected String primaryAgent;

    /**
     * Gets the value of the primaryAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAgent() {
        return primaryAgent;
    }

    /**
     * Sets the value of the primaryAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAgent(String value) {
        this.primaryAgent = value;
    }

}
