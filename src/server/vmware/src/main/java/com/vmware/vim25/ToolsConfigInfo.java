
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToolsConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ToolsConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="toolsVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="toolsInstallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="afterPowerOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="afterResume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="beforeGuestStandby" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="beforeGuestShutdown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="beforeGuestReboot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="toolsUpgradePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pendingCustomization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customizationKeyId" type="{urn:internalvim25}CryptoKeyId" minOccurs="0"/>
 *         <element name="syncTimeWithHostAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="syncTimeWithHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lastInstallInfo" type="{urn:internalvim25}ToolsConfigInfoToolsLastInstallInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolsConfigInfo", propOrder = {
    "toolsVersion",
    "toolsInstallType",
    "afterPowerOn",
    "afterResume",
    "beforeGuestStandby",
    "beforeGuestShutdown",
    "beforeGuestReboot",
    "toolsUpgradePolicy",
    "pendingCustomization",
    "customizationKeyId",
    "syncTimeWithHostAllowed",
    "syncTimeWithHost",
    "lastInstallInfo"
})
public class ToolsConfigInfo
    extends DynamicData
{

    protected Integer toolsVersion;
    protected String toolsInstallType;
    protected Boolean afterPowerOn;
    protected Boolean afterResume;
    protected Boolean beforeGuestStandby;
    protected Boolean beforeGuestShutdown;
    protected Boolean beforeGuestReboot;
    protected String toolsUpgradePolicy;
    protected String pendingCustomization;
    protected CryptoKeyId customizationKeyId;
    protected Boolean syncTimeWithHostAllowed;
    protected Boolean syncTimeWithHost;
    protected ToolsConfigInfoToolsLastInstallInfo lastInstallInfo;

    /**
     * Gets the value of the toolsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToolsVersion() {
        return toolsVersion;
    }

    /**
     * Sets the value of the toolsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToolsVersion(Integer value) {
        this.toolsVersion = value;
    }

    /**
     * Gets the value of the toolsInstallType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsInstallType() {
        return toolsInstallType;
    }

    /**
     * Sets the value of the toolsInstallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsInstallType(String value) {
        this.toolsInstallType = value;
    }

    /**
     * Gets the value of the afterPowerOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfterPowerOn() {
        return afterPowerOn;
    }

    /**
     * Sets the value of the afterPowerOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfterPowerOn(Boolean value) {
        this.afterPowerOn = value;
    }

    /**
     * Gets the value of the afterResume property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfterResume() {
        return afterResume;
    }

    /**
     * Sets the value of the afterResume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfterResume(Boolean value) {
        this.afterResume = value;
    }

    /**
     * Gets the value of the beforeGuestStandby property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeforeGuestStandby() {
        return beforeGuestStandby;
    }

    /**
     * Sets the value of the beforeGuestStandby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeforeGuestStandby(Boolean value) {
        this.beforeGuestStandby = value;
    }

    /**
     * Gets the value of the beforeGuestShutdown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeforeGuestShutdown() {
        return beforeGuestShutdown;
    }

    /**
     * Sets the value of the beforeGuestShutdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeforeGuestShutdown(Boolean value) {
        this.beforeGuestShutdown = value;
    }

    /**
     * Gets the value of the beforeGuestReboot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeforeGuestReboot() {
        return beforeGuestReboot;
    }

    /**
     * Sets the value of the beforeGuestReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeforeGuestReboot(Boolean value) {
        this.beforeGuestReboot = value;
    }

    /**
     * Gets the value of the toolsUpgradePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsUpgradePolicy() {
        return toolsUpgradePolicy;
    }

    /**
     * Sets the value of the toolsUpgradePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsUpgradePolicy(String value) {
        this.toolsUpgradePolicy = value;
    }

    /**
     * Gets the value of the pendingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingCustomization() {
        return pendingCustomization;
    }

    /**
     * Sets the value of the pendingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingCustomization(String value) {
        this.pendingCustomization = value;
    }

    /**
     * Gets the value of the customizationKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getCustomizationKeyId() {
        return customizationKeyId;
    }

    /**
     * Sets the value of the customizationKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setCustomizationKeyId(CryptoKeyId value) {
        this.customizationKeyId = value;
    }

    /**
     * Gets the value of the syncTimeWithHostAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncTimeWithHostAllowed() {
        return syncTimeWithHostAllowed;
    }

    /**
     * Sets the value of the syncTimeWithHostAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncTimeWithHostAllowed(Boolean value) {
        this.syncTimeWithHostAllowed = value;
    }

    /**
     * Gets the value of the syncTimeWithHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncTimeWithHost() {
        return syncTimeWithHost;
    }

    /**
     * Sets the value of the syncTimeWithHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncTimeWithHost(Boolean value) {
        this.syncTimeWithHost = value;
    }

    /**
     * Gets the value of the lastInstallInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ToolsConfigInfoToolsLastInstallInfo }
     *     
     */
    public ToolsConfigInfoToolsLastInstallInfo getLastInstallInfo() {
        return lastInstallInfo;
    }

    /**
     * Sets the value of the lastInstallInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsConfigInfoToolsLastInstallInfo }
     *     
     */
    public void setLastInstallInfo(ToolsConfigInfoToolsLastInstallInfo value) {
        this.lastInstallInfo = value;
    }

}
