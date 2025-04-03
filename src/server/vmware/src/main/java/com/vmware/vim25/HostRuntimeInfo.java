
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="connectionState" type="{urn:internalvim25}HostSystemConnectionState"/>
 *         <element name="powerState" type="{urn:internalvim25}HostSystemPowerState"/>
 *         <element name="standbyMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="inMaintenanceMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="inQuarantineMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bootTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="healthSystemRuntime" type="{urn:internalvim25}HealthSystemRuntime" minOccurs="0"/>
 *         <element name="dasHostState" type="{urn:internalvim25}ClusterDasFdmHostState" minOccurs="0"/>
 *         <element name="tpmPcrValues" type="{urn:internalvim25}HostTpmDigestInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vsanRuntimeInfo" type="{urn:internalvim25}VsanHostRuntimeInfo" minOccurs="0"/>
 *         <element name="networkRuntimeInfo" type="{urn:internalvim25}HostRuntimeInfoNetworkRuntimeInfo" minOccurs="0"/>
 *         <element name="vFlashResourceRuntimeInfo" type="{urn:internalvim25}HostVFlashManagerVFlashResourceRunTimeInfo" minOccurs="0"/>
 *         <element name="hostMaxVirtualDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="cryptoState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cryptoKeyId" type="{urn:internalvim25}CryptoKeyId" minOccurs="0"/>
 *         <element name="statelessNvdsMigrationReady" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partialMaintenanceMode" type="{urn:internalvim25}HostPartialMaintenanceModeRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="stateEncryption" type="{urn:internalvim25}HostRuntimeInfoStateEncryptionInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfo", propOrder = {
    "connectionState",
    "powerState",
    "standbyMode",
    "inMaintenanceMode",
    "inQuarantineMode",
    "bootTime",
    "healthSystemRuntime",
    "dasHostState",
    "tpmPcrValues",
    "vsanRuntimeInfo",
    "networkRuntimeInfo",
    "vFlashResourceRuntimeInfo",
    "hostMaxVirtualDiskCapacity",
    "cryptoState",
    "cryptoKeyId",
    "statelessNvdsMigrationReady",
    "partialMaintenanceMode",
    "stateEncryption"
})
public class HostRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostSystemConnectionState connectionState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostSystemPowerState powerState;
    protected String standbyMode;
    protected boolean inMaintenanceMode;
    protected Boolean inQuarantineMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bootTime;
    protected HealthSystemRuntime healthSystemRuntime;
    protected ClusterDasFdmHostState dasHostState;
    protected List<HostTpmDigestInfo> tpmPcrValues;
    protected VsanHostRuntimeInfo vsanRuntimeInfo;
    protected HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo;
    protected HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo;
    protected Long hostMaxVirtualDiskCapacity;
    protected String cryptoState;
    protected CryptoKeyId cryptoKeyId;
    protected String statelessNvdsMigrationReady;
    protected List<HostPartialMaintenanceModeRuntimeInfo> partialMaintenanceMode;
    protected HostRuntimeInfoStateEncryptionInfo stateEncryption;

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemConnectionState }
     *     
     */
    public HostSystemConnectionState getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemConnectionState }
     *     
     */
    public void setConnectionState(HostSystemConnectionState value) {
        this.connectionState = value;
    }

    /**
     * Gets the value of the powerState property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemPowerState }
     *     
     */
    public HostSystemPowerState getPowerState() {
        return powerState;
    }

    /**
     * Sets the value of the powerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemPowerState }
     *     
     */
    public void setPowerState(HostSystemPowerState value) {
        this.powerState = value;
    }

    /**
     * Gets the value of the standbyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyMode() {
        return standbyMode;
    }

    /**
     * Sets the value of the standbyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyMode(String value) {
        this.standbyMode = value;
    }

    /**
     * Gets the value of the inMaintenanceMode property.
     * 
     */
    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }

    /**
     * Sets the value of the inMaintenanceMode property.
     * 
     */
    public void setInMaintenanceMode(boolean value) {
        this.inMaintenanceMode = value;
    }

    /**
     * Gets the value of the inQuarantineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInQuarantineMode() {
        return inQuarantineMode;
    }

    /**
     * Sets the value of the inQuarantineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInQuarantineMode(Boolean value) {
        this.inQuarantineMode = value;
    }

    /**
     * Gets the value of the bootTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBootTime() {
        return bootTime;
    }

    /**
     * Sets the value of the bootTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBootTime(XMLGregorianCalendar value) {
        this.bootTime = value;
    }

    /**
     * Gets the value of the healthSystemRuntime property.
     * 
     * @return
     *     possible object is
     *     {@link HealthSystemRuntime }
     *     
     */
    public HealthSystemRuntime getHealthSystemRuntime() {
        return healthSystemRuntime;
    }

    /**
     * Sets the value of the healthSystemRuntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthSystemRuntime }
     *     
     */
    public void setHealthSystemRuntime(HealthSystemRuntime value) {
        this.healthSystemRuntime = value;
    }

    /**
     * Gets the value of the dasHostState property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasFdmHostState }
     *     
     */
    public ClusterDasFdmHostState getDasHostState() {
        return dasHostState;
    }

    /**
     * Sets the value of the dasHostState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasFdmHostState }
     *     
     */
    public void setDasHostState(ClusterDasFdmHostState value) {
        this.dasHostState = value;
    }

    /**
     * Gets the value of the tpmPcrValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpmPcrValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTpmPcrValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTpmDigestInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the tpmPcrValues property.
     */
    public List<HostTpmDigestInfo> getTpmPcrValues() {
        if (tpmPcrValues == null) {
            tpmPcrValues = new ArrayList<>();
        }
        return this.tpmPcrValues;
    }

    /**
     * Gets the value of the vsanRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostRuntimeInfo }
     *     
     */
    public VsanHostRuntimeInfo getVsanRuntimeInfo() {
        return vsanRuntimeInfo;
    }

    /**
     * Sets the value of the vsanRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostRuntimeInfo }
     *     
     */
    public void setVsanRuntimeInfo(VsanHostRuntimeInfo value) {
        this.vsanRuntimeInfo = value;
    }

    /**
     * Gets the value of the networkRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostRuntimeInfoNetworkRuntimeInfo }
     *     
     */
    public HostRuntimeInfoNetworkRuntimeInfo getNetworkRuntimeInfo() {
        return networkRuntimeInfo;
    }

    /**
     * Sets the value of the networkRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRuntimeInfoNetworkRuntimeInfo }
     *     
     */
    public void setNetworkRuntimeInfo(HostRuntimeInfoNetworkRuntimeInfo value) {
        this.networkRuntimeInfo = value;
    }

    /**
     * Gets the value of the vFlashResourceRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashResourceRunTimeInfo }
     *     
     */
    public HostVFlashManagerVFlashResourceRunTimeInfo getVFlashResourceRuntimeInfo() {
        return vFlashResourceRuntimeInfo;
    }

    /**
     * Sets the value of the vFlashResourceRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashResourceRunTimeInfo }
     *     
     */
    public void setVFlashResourceRuntimeInfo(HostVFlashManagerVFlashResourceRunTimeInfo value) {
        this.vFlashResourceRuntimeInfo = value;
    }

    /**
     * Gets the value of the hostMaxVirtualDiskCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHostMaxVirtualDiskCapacity() {
        return hostMaxVirtualDiskCapacity;
    }

    /**
     * Sets the value of the hostMaxVirtualDiskCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHostMaxVirtualDiskCapacity(Long value) {
        this.hostMaxVirtualDiskCapacity = value;
    }

    /**
     * Gets the value of the cryptoState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoState() {
        return cryptoState;
    }

    /**
     * Sets the value of the cryptoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoState(String value) {
        this.cryptoState = value;
    }

    /**
     * Gets the value of the cryptoKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getCryptoKeyId() {
        return cryptoKeyId;
    }

    /**
     * Sets the value of the cryptoKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setCryptoKeyId(CryptoKeyId value) {
        this.cryptoKeyId = value;
    }

    /**
     * Gets the value of the statelessNvdsMigrationReady property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatelessNvdsMigrationReady() {
        return statelessNvdsMigrationReady;
    }

    /**
     * Sets the value of the statelessNvdsMigrationReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatelessNvdsMigrationReady(String value) {
        this.statelessNvdsMigrationReady = value;
    }

    /**
     * Gets the value of the partialMaintenanceMode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialMaintenanceMode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartialMaintenanceMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPartialMaintenanceModeRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the partialMaintenanceMode property.
     */
    public List<HostPartialMaintenanceModeRuntimeInfo> getPartialMaintenanceMode() {
        if (partialMaintenanceMode == null) {
            partialMaintenanceMode = new ArrayList<>();
        }
        return this.partialMaintenanceMode;
    }

    /**
     * Gets the value of the stateEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link HostRuntimeInfoStateEncryptionInfo }
     *     
     */
    public HostRuntimeInfoStateEncryptionInfo getStateEncryption() {
        return stateEncryption;
    }

    /**
     * Sets the value of the stateEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRuntimeInfoStateEncryptionInfo }
     *     
     */
    public void setStateEncryption(HostRuntimeInfoStateEncryptionInfo value) {
        this.stateEncryption = value;
    }

}
