
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsupportedGuest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnsupportedGuest">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidVmConfig">
 *       <sequence>
 *         <element name="unsupportedGuestOS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedGuest", propOrder = {
    "unsupportedGuestOS"
})
public class UnsupportedGuest
    extends InvalidVmConfig
{

    @XmlElement(required = true)
    protected String unsupportedGuestOS;

    /**
     * Gets the value of the unsupportedGuestOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsupportedGuestOS() {
        return unsupportedGuestOS;
    }

    /**
     * Sets the value of the unsupportedGuestOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsupportedGuestOS(String value) {
        this.unsupportedGuestOS = value;
    }

}
