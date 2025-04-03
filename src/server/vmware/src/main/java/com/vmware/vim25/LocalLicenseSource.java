
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalLicenseSource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LocalLicenseSource">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}LicenseSource">
 *       <sequence>
 *         <element name="licenseKeys" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalLicenseSource", propOrder = {
    "licenseKeys"
})
public class LocalLicenseSource
    extends LicenseSource
{

    @XmlElement(required = true)
    protected String licenseKeys;

    /**
     * Gets the value of the licenseKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKeys() {
        return licenseKeys;
    }

    /**
     * Sets the value of the licenseKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKeys(String value) {
        this.licenseKeys = value;
    }

}
