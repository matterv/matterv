
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDateTimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDateTimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="timeZone" type="{urn:internalvim25}HostDateTimeSystemTimeZone"/>
 *         <element name="systemClockProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ntpConfig" type="{urn:internalvim25}HostNtpConfig" minOccurs="0"/>
 *         <element name="ptpConfig" type="{urn:internalvim25}HostPtpConfig" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disableEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disableFallback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="inFallbackState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="serviceSync" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="remoteNtpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ntpRunTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ptpRunTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ntpDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ptpDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDateTimeInfo", propOrder = {
    "timeZone",
    "systemClockProtocol",
    "ntpConfig",
    "ptpConfig",
    "enabled",
    "disableEvents",
    "disableFallback",
    "inFallbackState",
    "serviceSync",
    "lastSyncTime",
    "remoteNtpServer",
    "ntpRunTime",
    "ptpRunTime",
    "ntpDuration",
    "ptpDuration"
})
public class HostDateTimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostDateTimeSystemTimeZone timeZone;
    protected String systemClockProtocol;
    protected HostNtpConfig ntpConfig;
    protected HostPtpConfig ptpConfig;
    protected Boolean enabled;
    protected Boolean disableEvents;
    protected Boolean disableFallback;
    protected Boolean inFallbackState;
    protected Boolean serviceSync;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncTime;
    protected String remoteNtpServer;
    protected Long ntpRunTime;
    protected Long ptpRunTime;
    protected String ntpDuration;
    protected String ptpDuration;

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link HostDateTimeSystemTimeZone }
     *     
     */
    public HostDateTimeSystemTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDateTimeSystemTimeZone }
     *     
     */
    public void setTimeZone(HostDateTimeSystemTimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the systemClockProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemClockProtocol() {
        return systemClockProtocol;
    }

    /**
     * Sets the value of the systemClockProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemClockProtocol(String value) {
        this.systemClockProtocol = value;
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
     * Gets the value of the inFallbackState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInFallbackState() {
        return inFallbackState;
    }

    /**
     * Sets the value of the inFallbackState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInFallbackState(Boolean value) {
        this.inFallbackState = value;
    }

    /**
     * Gets the value of the serviceSync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceSync() {
        return serviceSync;
    }

    /**
     * Sets the value of the serviceSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceSync(Boolean value) {
        this.serviceSync = value;
    }

    /**
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncTime(XMLGregorianCalendar value) {
        this.lastSyncTime = value;
    }

    /**
     * Gets the value of the remoteNtpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteNtpServer() {
        return remoteNtpServer;
    }

    /**
     * Sets the value of the remoteNtpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteNtpServer(String value) {
        this.remoteNtpServer = value;
    }

    /**
     * Gets the value of the ntpRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNtpRunTime() {
        return ntpRunTime;
    }

    /**
     * Sets the value of the ntpRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNtpRunTime(Long value) {
        this.ntpRunTime = value;
    }

    /**
     * Gets the value of the ptpRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtpRunTime() {
        return ptpRunTime;
    }

    /**
     * Sets the value of the ptpRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtpRunTime(Long value) {
        this.ptpRunTime = value;
    }

    /**
     * Gets the value of the ntpDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpDuration() {
        return ntpDuration;
    }

    /**
     * Sets the value of the ntpDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpDuration(String value) {
        this.ntpDuration = value;
    }

    /**
     * Gets the value of the ptpDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpDuration() {
        return ptpDuration;
    }

    /**
     * Sets the value of the ptpDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpDuration(String value) {
        this.ptpDuration = value;
    }

}
