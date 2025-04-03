
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDateTimeConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDateTimeConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ntpConfig" type="{urn:internalvim25}HostNtpConfig" minOccurs="0"/>
 *         <element name="ptpConfig" type="{urn:internalvim25}HostPtpConfig" minOccurs="0"/>
 *         <element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disableEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disableFallback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="resetToFactoryDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDateTimeConfig", propOrder = {
    "timeZone",
    "ntpConfig",
    "ptpConfig",
    "protocol",
    "enabled",
    "disableEvents",
    "disableFallback",
    "resetToFactoryDefaults"
})
public class HostDateTimeConfig
    extends DynamicData
{

    protected String timeZone;
    protected HostNtpConfig ntpConfig;
    protected HostPtpConfig ptpConfig;
    protected String protocol;
    protected Boolean enabled;
    protected Boolean disableEvents;
    protected Boolean disableFallback;
    protected Boolean resetToFactoryDefaults;

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
     * Gets the value of the ntpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostNtpConfig }
     *     
     */
    public HostNtpConfig getNtpConfig() {
        return ntpConfig;
    }

    /**
     * Sets the value of the ntpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNtpConfig }
     *     
     */
    public void setNtpConfig(HostNtpConfig value) {
        this.ntpConfig = value;
    }

    /**
     * Gets the value of the ptpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostPtpConfig }
     *     
     */
    public HostPtpConfig getPtpConfig() {
        return ptpConfig;
    }

    /**
     * Sets the value of the ptpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPtpConfig }
     *     
     */
    public void setPtpConfig(HostPtpConfig value) {
        this.ptpConfig = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the disableEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableEvents() {
        return disableEvents;
    }

    /**
     * Sets the value of the disableEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableEvents(Boolean value) {
        this.disableEvents = value;
    }

    /**
     * Gets the value of the disableFallback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableFallback() {
        return disableFallback;
    }

    /**
     * Sets the value of the disableFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableFallback(Boolean value) {
        this.disableFallback = value;
    }

    /**
     * Gets the value of the resetToFactoryDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetToFactoryDefaults() {
        return resetToFactoryDefaults;
    }

    /**
     * Sets the value of the resetToFactoryDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetToFactoryDefaults(Boolean value) {
        this.resetToFactoryDefaults = value;
    }

}
