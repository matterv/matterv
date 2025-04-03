
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseSourceUnavailable complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseSourceUnavailable">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotEnoughLicenses">
 *       <sequence>
 *         <element name="licenseSource" type="{urn:internalvim25}LicenseSource"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseSourceUnavailable", propOrder = {
    "licenseSource"
})
public class LicenseSourceUnavailable
    extends NotEnoughLicenses
{

    @XmlElement(required = true)
    protected LicenseSource licenseSource;

    /**
     * Gets the value of the licenseSource property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseSource }
     *     
     */
    public LicenseSource getLicenseSource() {
        return licenseSource;
    }

    /**
     * Sets the value of the licenseSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseSource }
     *     
     */
    public void setLicenseSource(LicenseSource value) {
        this.licenseSource = value;
    }

}
