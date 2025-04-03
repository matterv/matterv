
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSPIAuthentication complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SSPIAuthentication">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestAuthentication">
 *       <sequence>
 *         <element name="sspiToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPIAuthentication", propOrder = {
    "sspiToken"
})
public class SSPIAuthentication
    extends GuestAuthentication
{

    @XmlElement(required = true)
    protected String sspiToken;

    /**
     * Gets the value of the sspiToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSspiToken() {
        return sspiToken;
    }

    /**
     * Sets the value of the sspiToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSspiToken(String value) {
        this.sspiToken = value;
    }

}
