
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="returnval" type="{urn:internalvim25}SessionManagerGenericServiceTicket"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnval"
})
@XmlRootElement(name = "AcquireGenericServiceTicketResponse")
public class AcquireGenericServiceTicketResponse {

    @XmlElement(required = true)
    protected SessionManagerGenericServiceTicket returnval;

    /**
     * Gets the value of the returnval property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManagerGenericServiceTicket }
     *     
     */
    public SessionManagerGenericServiceTicket getReturnval() {
        return returnval;
    }

    /**
     * Sets the value of the returnval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManagerGenericServiceTicket }
     *     
     */
    public void setReturnval(SessionManagerGenericServiceTicket value) {
        this.returnval = value;
    }

}
