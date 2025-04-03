
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationSysprep complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationSysprep">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationIdentitySettings">
 *       <sequence>
 *         <element name="guiUnattended" type="{urn:internalvim25}CustomizationGuiUnattended"/>
 *         <element name="userData" type="{urn:internalvim25}CustomizationUserData"/>
 *         <element name="guiRunOnce" type="{urn:internalvim25}CustomizationGuiRunOnce" minOccurs="0"/>
 *         <element name="identification" type="{urn:internalvim25}CustomizationIdentification"/>
 *         <element name="licenseFilePrintData" type="{urn:internalvim25}CustomizationLicenseFilePrintData" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSysprep", propOrder = {
    "guiUnattended",
    "userData",
    "guiRunOnce",
    "identification",
    "licenseFilePrintData"
})
public class CustomizationSysprep
    extends CustomizationIdentitySettings
{

    @XmlElement(required = true)
    protected CustomizationGuiUnattended guiUnattended;
    @XmlElement(required = true)
    protected CustomizationUserData userData;
    protected CustomizationGuiRunOnce guiRunOnce;
    @XmlElement(required = true)
    protected CustomizationIdentification identification;
    protected CustomizationLicenseFilePrintData licenseFilePrintData;

    /**
     * Gets the value of the guiUnattended property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationGuiUnattended }
     *     
     */
    public CustomizationGuiUnattended getGuiUnattended() {
        return guiUnattended;
    }

    /**
     * Sets the value of the guiUnattended property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationGuiUnattended }
     *     
     */
    public void setGuiUnattended(CustomizationGuiUnattended value) {
        this.guiUnattended = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationUserData }
     *     
     */
    public CustomizationUserData getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationUserData }
     *     
     */
    public void setUserData(CustomizationUserData value) {
        this.userData = value;
    }

    /**
     * Gets the value of the guiRunOnce property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationGuiRunOnce }
     *     
     */
    public CustomizationGuiRunOnce getGuiRunOnce() {
        return guiRunOnce;
    }

    /**
     * Sets the value of the guiRunOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationGuiRunOnce }
     *     
     */
    public void setGuiRunOnce(CustomizationGuiRunOnce value) {
        this.guiRunOnce = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIdentification }
     *     
     */
    public CustomizationIdentification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIdentification }
     *     
     */
    public void setIdentification(CustomizationIdentification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the licenseFilePrintData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationLicenseFilePrintData }
     *     
     */
    public CustomizationLicenseFilePrintData getLicenseFilePrintData() {
        return licenseFilePrintData;
    }

    /**
     * Sets the value of the licenseFilePrintData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationLicenseFilePrintData }
     *     
     */
    public void setLicenseFilePrintData(CustomizationLicenseFilePrintData value) {
        this.licenseFilePrintData = value;
    }

}
