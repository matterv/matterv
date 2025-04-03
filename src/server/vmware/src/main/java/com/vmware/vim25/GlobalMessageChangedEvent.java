
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMessageChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GlobalMessageChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}SessionEvent">
 *       <sequence>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prevMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalMessageChangedEvent", propOrder = {
    "message",
    "prevMessage"
})
public class GlobalMessageChangedEvent
    extends SessionEvent
{

    @XmlElement(required = true)
    protected String message;
    protected String prevMessage;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the prevMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevMessage() {
        return prevMessage;
    }

    /**
     * Sets the value of the prevMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevMessage(String value) {
        this.prevMessage = value;
    }

}
