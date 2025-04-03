
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestAuthenticationChallenge complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestAuthenticationChallenge">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestOperationsFault">
 *       <sequence>
 *         <element name="serverChallenge" type="{urn:internalvim25}GuestAuthentication"/>
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthenticationChallenge", propOrder = {
    "serverChallenge",
    "sessionID"
})
public class GuestAuthenticationChallenge
    extends GuestOperationsFault
{

    @XmlElement(required = true)
    protected GuestAuthentication serverChallenge;
    protected long sessionID;

    /**
     * Gets the value of the serverChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link GuestAuthentication }
     *     
     */
    public GuestAuthentication getServerChallenge() {
        return serverChallenge;
    }

    /**
     * Sets the value of the serverChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestAuthentication }
     *     
     */
    public void setServerChallenge(GuestAuthentication value) {
        this.serverChallenge = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     */
    public long getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     */
    public void setSessionID(long value) {
        this.sessionID = value;
    }

}
