
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidLicense complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidLicense">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="licenseContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidLicense", propOrder = {
    "licenseContent"
})
public class InvalidLicense
    extends VimFault
{

    @XmlElement(required = true)
    protected String licenseContent;

    /**
     * Gets the value of the licenseContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseContent() {
        return licenseContent;
    }

    /**
     * Sets the value of the licenseContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseContent(String value) {
        this.licenseContent = value;
    }

}
