
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
 * <p>Java class for VirtualMachineRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="device" type="{urn:internalvim25}VirtualMachineDeviceRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="connectionState" type="{urn:internalvim25}VirtualMachineConnectionState"/>
 *         <element name="powerState" type="{urn:internalvim25}VirtualMachinePowerState"/>
 *         <element name="vmFailoverInProgress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="faultToleranceState" type="{urn:internalvim25}VirtualMachineFaultToleranceState" minOccurs="0"/>
 *         <element name="dasVmProtection" type="{urn:internalvim25}VirtualMachineRuntimeInfoDasProtectionState" minOccurs="0"/>
 *         <element name="toolsInstallerMounted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="suspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="bootTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="suspendInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="question" type="{urn:internalvim25}VirtualMachineQuestionInfo" minOccurs="0"/>
 *         <element name="memoryOverhead" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="maxCpuUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numMksConnections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recordReplayState" type="{urn:internalvim25}VirtualMachineRecordReplayState" minOccurs="0"/>
 *         <element name="cleanPowerOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="needSecondaryReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="onlineStandby" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="minRequiredEVCModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="consolidationNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="offlineFeatureRequirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureRequirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureMask" type="{urn:internalvim25}HostFeatureMask" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vFlashCacheAllocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="snapshotInBackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="quiescedForkParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="instantCloneFrozen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="cryptoState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suspendedToMemory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="opNotificationTimeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="iommuActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRuntimeInfo", propOrder = {
    "device",
    "host",
    "connectionState",
    "powerState",
    "vmFailoverInProgress",
    "faultToleranceState",
    "dasVmProtection",
    "toolsInstallerMounted",
    "suspendTime",
    "bootTime",
    "suspendInterval",
    "question",
    "memoryOverhead",
    "maxCpuUsage",
    "maxMemoryUsage",
    "numMksConnections",
    "recordReplayState",
    "cleanPowerOff",
    "needSecondaryReason",
    "onlineStandby",
    "minRequiredEVCModeKey",
    "consolidationNeeded",
    "offlineFeatureRequirement",
    "featureRequirement",
    "featureMask",
    "vFlashCacheAllocation",
    "paused",
    "snapshotInBackground",
    "quiescedForkParent",
    "instantCloneFrozen",
    "cryptoState",
    "suspendedToMemory",
    "opNotificationTimeout",
    "iommuActive"
})
public class VirtualMachineRuntimeInfo
    extends DynamicData
{

    protected List<VirtualMachineDeviceRuntimeInfo> device;
    protected ManagedObjectReference host;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachineConnectionState connectionState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachinePowerState powerState;
    protected Boolean vmFailoverInProgress;
    @XmlSchemaType(name = "string")
    protected VirtualMachineFaultToleranceState faultToleranceState;
    protected VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    protected boolean toolsInstallerMounted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspendTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bootTime;
    protected Long suspendInterval;
    protected VirtualMachineQuestionInfo question;
    protected Long memoryOverhead;
    protected Integer maxCpuUsage;
    protected Integer maxMemoryUsage;
    protected int numMksConnections;
    @XmlSchemaType(name = "string")
    protected VirtualMachineRecordReplayState recordReplayState;
    protected Boolean cleanPowerOff;
    protected String needSecondaryReason;
    protected Boolean onlineStandby;
    protected String minRequiredEVCModeKey;
    protected Boolean consolidationNeeded;
    protected List<VirtualMachineFeatureRequirement> offlineFeatureRequirement;
    protected List<VirtualMachineFeatureRequirement> featureRequirement;
    protected List<HostFeatureMask> featureMask;
    protected Long vFlashCacheAllocation;
    protected Boolean paused;
    protected Boolean snapshotInBackground;
    protected Boolean quiescedForkParent;
    protected Boolean instantCloneFrozen;
    protected String cryptoState;
    protected Boolean suspendedToMemory;
    protected Long opNotificationTimeout;
    protected Boolean iommuActive;

    /**
     * Gets the value of the device property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDeviceRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the device property.
     */
    public List<VirtualMachineDeviceRuntimeInfo> getDevice() {
        if (device == null) {
            device = new ArrayList<>();
        }
        return this.device;
    }

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
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConnectionState }
     *     
     */
    public VirtualMachineConnectionState getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConnectionState }
     *     
     */
    public void setConnectionState(VirtualMachineConnectionState value) {
        this.connectionState = value;
    }

    /**
     * Gets the value of the powerState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public VirtualMachinePowerState getPowerState() {
        return powerState;
    }

    /**
     * Sets the value of the powerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public void setPowerState(VirtualMachinePowerState value) {
        this.powerState = value;
    }

    /**
     * Gets the value of the vmFailoverInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmFailoverInProgress() {
        return vmFailoverInProgress;
    }

    /**
     * Sets the value of the vmFailoverInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmFailoverInProgress(Boolean value) {
        this.vmFailoverInProgress = value;
    }

    /**
     * Gets the value of the faultToleranceState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return faultToleranceState;
    }

    /**
     * Sets the value of the faultToleranceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public void setFaultToleranceState(VirtualMachineFaultToleranceState value) {
        this.faultToleranceState = value;
    }

    /**
     * Gets the value of the dasVmProtection property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRuntimeInfoDasProtectionState }
     *     
     */
    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return dasVmProtection;
    }

    /**
     * Sets the value of the dasVmProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRuntimeInfoDasProtectionState }
     *     
     */
    public void setDasVmProtection(VirtualMachineRuntimeInfoDasProtectionState value) {
        this.dasVmProtection = value;
    }

    /**
     * Gets the value of the toolsInstallerMounted property.
     * 
     */
    public boolean isToolsInstallerMounted() {
        return toolsInstallerMounted;
    }

    /**
     * Sets the value of the toolsInstallerMounted property.
     * 
     */
    public void setToolsInstallerMounted(boolean value) {
        this.toolsInstallerMounted = value;
    }

    /**
     * Gets the value of the suspendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendTime() {
        return suspendTime;
    }

    /**
     * Sets the value of the suspendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendTime(XMLGregorianCalendar value) {
        this.suspendTime = value;
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
     * Gets the value of the suspendInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuspendInterval() {
        return suspendInterval;
    }

    /**
     * Sets the value of the suspendInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuspendInterval(Long value) {
        this.suspendInterval = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineQuestionInfo }
     *     
     */
    public VirtualMachineQuestionInfo getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineQuestionInfo }
     *     
     */
    public void setQuestion(VirtualMachineQuestionInfo value) {
        this.question = value;
    }

    /**
     * Gets the value of the memoryOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemoryOverhead() {
        return memoryOverhead;
    }

    /**
     * Sets the value of the memoryOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemoryOverhead(Long value) {
        this.memoryOverhead = value;
    }

    /**
     * Gets the value of the maxCpuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCpuUsage() {
        return maxCpuUsage;
    }

    /**
     * Sets the value of the maxCpuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCpuUsage(Integer value) {
        this.maxCpuUsage = value;
    }

    /**
     * Gets the value of the maxMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMemoryUsage() {
        return maxMemoryUsage;
    }

    /**
     * Sets the value of the maxMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMemoryUsage(Integer value) {
        this.maxMemoryUsage = value;
    }

    /**
     * Gets the value of the numMksConnections property.
     * 
     */
    public int getNumMksConnections() {
        return numMksConnections;
    }

    /**
     * Sets the value of the numMksConnections property.
     * 
     */
    public void setNumMksConnections(int value) {
        this.numMksConnections = value;
    }

    /**
     * Gets the value of the recordReplayState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRecordReplayState }
     *     
     */
    public VirtualMachineRecordReplayState getRecordReplayState() {
        return recordReplayState;
    }

    /**
     * Sets the value of the recordReplayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRecordReplayState }
     *     
     */
    public void setRecordReplayState(VirtualMachineRecordReplayState value) {
        this.recordReplayState = value;
    }

    /**
     * Gets the value of the cleanPowerOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCleanPowerOff() {
        return cleanPowerOff;
    }

    /**
     * Sets the value of the cleanPowerOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleanPowerOff(Boolean value) {
        this.cleanPowerOff = value;
    }

    /**
     * Gets the value of the needSecondaryReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedSecondaryReason() {
        return needSecondaryReason;
    }

    /**
     * Sets the value of the needSecondaryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedSecondaryReason(String value) {
        this.needSecondaryReason = value;
    }

    /**
     * Gets the value of the onlineStandby property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlineStandby() {
        return onlineStandby;
    }

    /**
     * Sets the value of the onlineStandby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlineStandby(Boolean value) {
        this.onlineStandby = value;
    }

    /**
     * Gets the value of the minRequiredEVCModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinRequiredEVCModeKey() {
        return minRequiredEVCModeKey;
    }

    /**
     * Sets the value of the minRequiredEVCModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRequiredEVCModeKey(String value) {
        this.minRequiredEVCModeKey = value;
    }

    /**
     * Gets the value of the consolidationNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidationNeeded() {
        return consolidationNeeded;
    }

    /**
     * Sets the value of the consolidationNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidationNeeded(Boolean value) {
        this.consolidationNeeded = value;
    }

    /**
     * Gets the value of the offlineFeatureRequirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineFeatureRequirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfflineFeatureRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * </p>
     * 
     * 
     * @return
     *     The value of the offlineFeatureRequirement property.
     */
    public List<VirtualMachineFeatureRequirement> getOfflineFeatureRequirement() {
        if (offlineFeatureRequirement == null) {
            offlineFeatureRequirement = new ArrayList<>();
        }
        return this.offlineFeatureRequirement;
    }

    /**
     * Gets the value of the featureRequirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureRequirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureRequirement property.
     */
    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        if (featureRequirement == null) {
            featureRequirement = new ArrayList<>();
        }
        return this.featureRequirement;
    }

    /**
     * Gets the value of the featureMask property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMask property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureMask }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureMask property.
     */
    public List<HostFeatureMask> getFeatureMask() {
        if (featureMask == null) {
            featureMask = new ArrayList<>();
        }
        return this.featureMask;
    }

    /**
     * Gets the value of the vFlashCacheAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }

    /**
     * Sets the value of the vFlashCacheAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVFlashCacheAllocation(Long value) {
        this.vFlashCacheAllocation = value;
    }

    /**
     * Gets the value of the paused property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaused() {
        return paused;
    }

    /**
     * Sets the value of the paused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaused(Boolean value) {
        this.paused = value;
    }

    /**
     * Gets the value of the snapshotInBackground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnapshotInBackground() {
        return snapshotInBackground;
    }

    /**
     * Sets the value of the snapshotInBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotInBackground(Boolean value) {
        this.snapshotInBackground = value;
    }

    /**
     * Gets the value of the quiescedForkParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuiescedForkParent() {
        return quiescedForkParent;
    }

    /**
     * Sets the value of the quiescedForkParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuiescedForkParent(Boolean value) {
        this.quiescedForkParent = value;
    }

    /**
     * Gets the value of the instantCloneFrozen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantCloneFrozen() {
        return instantCloneFrozen;
    }

    /**
     * Sets the value of the instantCloneFrozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantCloneFrozen(Boolean value) {
        this.instantCloneFrozen = value;
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
     * Gets the value of the suspendedToMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspendedToMemory() {
        return suspendedToMemory;
    }

    /**
     * Sets the value of the suspendedToMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspendedToMemory(Boolean value) {
        this.suspendedToMemory = value;
    }

    /**
     * Gets the value of the opNotificationTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpNotificationTimeout() {
        return opNotificationTimeout;
    }

    /**
     * Sets the value of the opNotificationTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpNotificationTimeout(Long value) {
        this.opNotificationTimeout = value;
    }

    /**
     * Gets the value of the iommuActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIommuActive() {
        return iommuActive;
    }

    /**
     * Sets the value of the iommuActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIommuActive(Boolean value) {
        this.iommuActive = value;
    }

}
