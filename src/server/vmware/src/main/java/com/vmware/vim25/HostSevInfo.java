
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSevInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSevInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="sevState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="maxSevEsGuests" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSevInfo", propOrder = {
    "sevState",
    "maxSevEsGuests"
})
public class HostSevInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String sevState;
    protected long maxSevEsGuests;

    /**
     * Gets the value of the sevState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevState() {
        return sevState;
    }

    /**
     * Sets the value of the sevState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevState(String value) {
        this.sevState = value;
    }

    /**
     * Gets the value of the maxSevEsGuests property.
     * 
     */
    public long getMaxSevEsGuests() {
        return maxSevEsGuests;
    }

    /**
     * Sets the value of the maxSevEsGuests property.
     * 
     */
    public void setMaxSevEsGuests(long value) {
        this.maxSevEsGuests = value;
    }

}
