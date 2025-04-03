
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidIpmiMacAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidIpmiMacAddress">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="userProvidedMacAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="observedMacAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidIpmiMacAddress", propOrder = {
    "userProvidedMacAddress",
    "observedMacAddress"
})
public class InvalidIpmiMacAddress
    extends VimFault
{

    @XmlElement(required = true)
    protected String userProvidedMacAddress;
    @XmlElement(required = true)
    protected String observedMacAddress;

    /**
     * Gets the value of the userProvidedMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserProvidedMacAddress() {
        return userProvidedMacAddress;
    }

    /**
     * Sets the value of the userProvidedMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserProvidedMacAddress(String value) {
        this.userProvidedMacAddress = value;
    }

    /**
     * Gets the value of the observedMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedMacAddress() {
        return observedMacAddress;
    }

    /**
     * Sets the value of the observedMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedMacAddress(String value) {
        this.observedMacAddress = value;
    }

}
