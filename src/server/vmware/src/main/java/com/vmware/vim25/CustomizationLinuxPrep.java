
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationLinuxPrep complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationLinuxPrep">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationIdentitySettings">
 *       <sequence>
 *         <element name="hostName" type="{urn:internalvim25}CustomizationName"/>
 *         <element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hwClockUTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="scriptText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="compatibleCustomizationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationLinuxPrep", propOrder = {
    "hostName",
    "domain",
    "timeZone",
    "hwClockUTC",
    "scriptText",
    "compatibleCustomizationMethod"
})
public class CustomizationLinuxPrep
    extends CustomizationIdentitySettings
{

    @XmlElement(required = true)
    protected CustomizationName hostName;
    @XmlElement(required = true)
    protected String domain;
    protected String timeZone;
    protected Boolean hwClockUTC;
    protected String scriptText;
    protected String compatibleCustomizationMethod;

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationName }
     *     
     */
    public CustomizationName getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationName }
     *     
     */
    public void setHostName(CustomizationName value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the hwClockUTC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHwClockUTC() {
        return hwClockUTC;
    }

    /**
     * Sets the value of the hwClockUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHwClockUTC(Boolean value) {
        this.hwClockUTC = value;
    }

    /**
     * Gets the value of the scriptText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptText() {
        return scriptText;
    }

    /**
     * Sets the value of the scriptText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptText(String value) {
        this.scriptText = value;
    }

    /**
     * Gets the value of the compatibleCustomizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleCustomizationMethod() {
        return compatibleCustomizationMethod;
    }

    /**
     * Sets the value of the compatibleCustomizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleCustomizationMethod(String value) {
        this.compatibleCustomizationMethod = value;
    }

}
