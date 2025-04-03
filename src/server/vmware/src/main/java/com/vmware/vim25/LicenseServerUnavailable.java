
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseServerUnavailable complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseServerUnavailable">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="licenseServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerUnavailable", propOrder = {
    "licenseServer"
})
public class LicenseServerUnavailable
    extends VimFault
{

    @XmlElement(required = true)
    protected String licenseServer;

    /**
     * Gets the value of the licenseServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseServer() {
        return licenseServer;
    }

    /**
     * Sets the value of the licenseServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseServer(String value) {
        this.licenseServer = value;
    }

}
