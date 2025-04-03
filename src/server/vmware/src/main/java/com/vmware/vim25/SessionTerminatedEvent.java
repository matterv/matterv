
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionTerminatedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SessionTerminatedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}SessionEvent">
 *       <sequence>
 *         <element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terminatedUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionTerminatedEvent", propOrder = {
    "sessionId",
    "terminatedUsername"
})
public class SessionTerminatedEvent
    extends SessionEvent
{

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String terminatedUsername;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the terminatedUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminatedUsername() {
        return terminatedUsername;
    }

    /**
     * Sets the value of the terminatedUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminatedUsername(String value) {
        this.terminatedUsername = value;
    }

}
