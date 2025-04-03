
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostListSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostListSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="hardware" type="{urn:internalvim25}HostHardwareSummary" minOccurs="0"/>
 *         <element name="runtime" type="{urn:internalvim25}HostRuntimeInfo" minOccurs="0"/>
 *         <element name="config" type="{urn:internalvim25}HostConfigSummary"/>
 *         <element name="quickStats" type="{urn:internalvim25}HostListSummaryQuickStats"/>
 *         <element name="overallStatus" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="rebootRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="customValue" type="{urn:internalvim25}CustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="managementServerIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maxEVCModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="currentEVCModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="currentEVCGraphicsModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gateway" type="{urn:internalvim25}HostListSummaryGatewaySummary" minOccurs="0"/>
 *         <element name="tpmAttestation" type="{urn:internalvim25}HostTpmAttestationInfo" minOccurs="0"/>
 *         <element name="trustAuthorityAttestationInfos" type="{urn:internalvim25}HostTrustAuthorityAttestationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostListSummary", propOrder = {
    "host",
    "hardware",
    "runtime",
    "config",
    "quickStats",
    "overallStatus",
    "rebootRequired",
    "customValue",
    "managementServerIp",
    "maxEVCModeKey",
    "currentEVCModeKey",
    "currentEVCGraphicsModeKey",
    "gateway",
    "tpmAttestation",
    "trustAuthorityAttestationInfos"
})
public class HostListSummary
    extends DynamicData
{

    protected ManagedObjectReference host;
    protected HostHardwareSummary hardware;
    protected HostRuntimeInfo runtime;
    @XmlElement(required = true)
    protected HostConfigSummary config;
    @XmlElement(required = true)
    protected HostListSummaryQuickStats quickStats;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus overallStatus;
    protected boolean rebootRequired;
    protected List<CustomFieldValue> customValue;
    protected String managementServerIp;
    protected String maxEVCModeKey;
    protected String currentEVCModeKey;
    protected String currentEVCGraphicsModeKey;
    protected HostListSummaryGatewaySummary gateway;
    protected HostTpmAttestationInfo tpmAttestation;
    protected List<HostTrustAuthorityAttestationInfo> trustAuthorityAttestationInfos;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link HostHardwareSummary }
     *     
     */
    public HostHardwareSummary getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHardwareSummary }
     *     
     */
    public void setHardware(HostHardwareSummary value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the runtime property.
     * 
     * @return
     *     possible object is
     *     {@link HostRuntimeInfo }
     *     
     */
    public HostRuntimeInfo getRuntime() {
        return runtime;
    }

    /**
     * Sets the value of the runtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRuntimeInfo }
     *     
     */
    public void setRuntime(HostRuntimeInfo value) {
        this.runtime = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link HostConfigSummary }
     *     
     */
    public HostConfigSummary getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConfigSummary }
     *     
     */
    public void setConfig(HostConfigSummary value) {
        this.config = value;
    }

    /**
     * Gets the value of the quickStats property.
     * 
     * @return
     *     possible object is
     *     {@link HostListSummaryQuickStats }
     *     
     */
    public HostListSummaryQuickStats getQuickStats() {
        return quickStats;
    }

    /**
     * Sets the value of the quickStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostListSummaryQuickStats }
     *     
     */
    public void setQuickStats(HostListSummaryQuickStats value) {
        this.quickStats = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setOverallStatus(ManagedEntityStatus value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the rebootRequired property.
     * 
     */
    public boolean isRebootRequired() {
        return rebootRequired;
    }

    /**
     * Sets the value of the rebootRequired property.
     * 
     */
    public void setRebootRequired(boolean value) {
        this.rebootRequired = value;
    }

    /**
     * Gets the value of the customValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the customValue property.
     */
    public List<CustomFieldValue> getCustomValue() {
        if (customValue == null) {
            customValue = new ArrayList<>();
        }
        return this.customValue;
    }

    /**
     * Gets the value of the managementServerIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementServerIp() {
        return managementServerIp;
    }

    /**
     * Sets the value of the managementServerIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementServerIp(String value) {
        this.managementServerIp = value;
    }

    /**
     * Gets the value of the maxEVCModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxEVCModeKey() {
        return maxEVCModeKey;
    }

    /**
     * Sets the value of the maxEVCModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxEVCModeKey(String value) {
        this.maxEVCModeKey = value;
    }

    /**
     * Gets the value of the currentEVCModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    /**
     * Sets the value of the currentEVCModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEVCModeKey(String value) {
        this.currentEVCModeKey = value;
    }

    /**
     * Gets the value of the currentEVCGraphicsModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEVCGraphicsModeKey() {
        return currentEVCGraphicsModeKey;
    }

    /**
     * Sets the value of the currentEVCGraphicsModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEVCGraphicsModeKey(String value) {
        this.currentEVCGraphicsModeKey = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link HostListSummaryGatewaySummary }
     *     
     */
    public HostListSummaryGatewaySummary getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostListSummaryGatewaySummary }
     *     
     */
    public void setGateway(HostListSummaryGatewaySummary value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the tpmAttestation property.
     * 
     * @return
     *     possible object is
     *     {@link HostTpmAttestationInfo }
     *     
     */
    public HostTpmAttestationInfo getTpmAttestation() {
        return tpmAttestation;
    }

    /**
     * Sets the value of the tpmAttestation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTpmAttestationInfo }
     *     
     */
    public void setTpmAttestation(HostTpmAttestationInfo value) {
        this.tpmAttestation = value;
    }

    /**
     * Gets the value of the trustAuthorityAttestationInfos property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustAuthorityAttestationInfos property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrustAuthorityAttestationInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTrustAuthorityAttestationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the trustAuthorityAttestationInfos property.
     */
    public List<HostTrustAuthorityAttestationInfo> getTrustAuthorityAttestationInfos() {
        if (trustAuthorityAttestationInfos == null) {
            trustAuthorityAttestationInfos = new ArrayList<>();
        }
        return this.trustAuthorityAttestationInfos;
    }

}
