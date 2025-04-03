
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestAuthentication complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestAuthentication">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="interactiveSession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthentication", propOrder = {
    "interactiveSession"
})
@XmlSeeAlso({
    NamePasswordAuthentication.class,
    SAMLTokenAuthentication.class,
    SSPIAuthentication.class,
    TicketedSessionAuthentication.class
})
public class GuestAuthentication
    extends DynamicData
{

    protected boolean interactiveSession;

    /**
     * Gets the value of the interactiveSession property.
     * 
     */
    public boolean isInteractiveSession() {
        return interactiveSession;
    }

    /**
     * Sets the value of the interactiveSession property.
     * 
     */
    public void setInteractiveSession(boolean value) {
        this.interactiveSession = value;
    }

}
