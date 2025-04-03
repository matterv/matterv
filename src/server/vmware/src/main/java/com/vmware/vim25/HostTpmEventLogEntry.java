
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmEventLogEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmEventLogEntry">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pcrIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="eventDetails" type="{urn:internalvim25}HostTpmEventDetails"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmEventLogEntry", propOrder = {
    "pcrIndex",
    "eventDetails"
})
public class HostTpmEventLogEntry
    extends DynamicData
{

    protected int pcrIndex;
    @XmlElement(required = true)
    protected HostTpmEventDetails eventDetails;

    /**
     * Gets the value of the pcrIndex property.
     * 
     */
    public int getPcrIndex() {
        return pcrIndex;
    }

    /**
     * Sets the value of the pcrIndex property.
     * 
     */
    public void setPcrIndex(int value) {
        this.pcrIndex = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link HostTpmEventDetails }
     *     
     */
    public HostTpmEventDetails getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTpmEventDetails }
     *     
     */
    public void setEventDetails(HostTpmEventDetails value) {
        this.eventDetails = value;
    }

}
