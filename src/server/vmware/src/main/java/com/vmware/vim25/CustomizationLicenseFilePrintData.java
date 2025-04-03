
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationLicenseFilePrintData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationLicenseFilePrintData">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="autoMode" type="{urn:internalvim25}CustomizationLicenseDataMode"/>
 *         <element name="autoUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationLicenseFilePrintData", propOrder = {
    "autoMode",
    "autoUsers"
})
public class CustomizationLicenseFilePrintData
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CustomizationLicenseDataMode autoMode;
    protected Integer autoUsers;

    /**
     * Gets the value of the autoMode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationLicenseDataMode }
     *     
     */
    public CustomizationLicenseDataMode getAutoMode() {
        return autoMode;
    }

    /**
     * Sets the value of the autoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationLicenseDataMode }
     *     
     */
    public void setAutoMode(CustomizationLicenseDataMode value) {
        this.autoMode = value;
    }

    /**
     * Gets the value of the autoUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoUsers() {
        return autoUsers;
    }

    /**
     * Sets the value of the autoUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoUsers(Integer value) {
        this.autoUsers = value;
    }

}
