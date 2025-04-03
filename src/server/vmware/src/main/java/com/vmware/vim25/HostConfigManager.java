
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigManager complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConfigManager">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cpuScheduler" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="datastoreSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="memoryManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="storageSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="networkSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vmotionSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="virtualNicManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="serviceSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="firewallSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="advancedOption" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="diagnosticSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="autoStartManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="snmpSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="dateTimeSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="patchManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="imageConfigManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="bootDeviceSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="firmwareSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="healthStatusSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="pciPassthruSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="licenseManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="kernelModuleSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="authenticationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="powerSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="cacheConfigurationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="esxAgentHostManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="iscsiManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vFlashManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vsanSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="messageBusProxy" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="userDirectory" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="accountManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="hostAccessManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="graphicsManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vsanInternalSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="certificateManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="cryptoManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="nvdimmSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="assignableHardwareManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigManager", propOrder = {
    "cpuScheduler",
    "datastoreSystem",
    "memoryManager",
    "storageSystem",
    "networkSystem",
    "vmotionSystem",
    "virtualNicManager",
    "serviceSystem",
    "firewallSystem",
    "advancedOption",
    "diagnosticSystem",
    "autoStartManager",
    "snmpSystem",
    "dateTimeSystem",
    "patchManager",
    "imageConfigManager",
    "bootDeviceSystem",
    "firmwareSystem",
    "healthStatusSystem",
    "pciPassthruSystem",
    "licenseManager",
    "kernelModuleSystem",
    "authenticationManager",
    "powerSystem",
    "cacheConfigurationManager",
    "esxAgentHostManager",
    "iscsiManager",
    "vFlashManager",
    "vsanSystem",
    "messageBusProxy",
    "userDirectory",
    "accountManager",
    "hostAccessManager",
    "graphicsManager",
    "vsanInternalSystem",
    "certificateManager",
    "cryptoManager",
    "nvdimmSystem",
    "assignableHardwareManager"
})
public class HostConfigManager
    extends DynamicData
{

    protected ManagedObjectReference cpuScheduler;
    protected ManagedObjectReference datastoreSystem;
    protected ManagedObjectReference memoryManager;
    protected ManagedObjectReference storageSystem;
    protected ManagedObjectReference networkSystem;
    protected ManagedObjectReference vmotionSystem;
    protected ManagedObjectReference virtualNicManager;
    protected ManagedObjectReference serviceSystem;
    protected ManagedObjectReference firewallSystem;
    protected ManagedObjectReference advancedOption;
    protected ManagedObjectReference diagnosticSystem;
    protected ManagedObjectReference autoStartManager;
    protected ManagedObjectReference snmpSystem;
    protected ManagedObjectReference dateTimeSystem;
    protected ManagedObjectReference patchManager;
    protected ManagedObjectReference imageConfigManager;
    protected ManagedObjectReference bootDeviceSystem;
    protected ManagedObjectReference firmwareSystem;
    protected ManagedObjectReference healthStatusSystem;
    protected ManagedObjectReference pciPassthruSystem;
    protected ManagedObjectReference licenseManager;
    protected ManagedObjectReference kernelModuleSystem;
    protected ManagedObjectReference authenticationManager;
    protected ManagedObjectReference powerSystem;
    protected ManagedObjectReference cacheConfigurationManager;
    protected ManagedObjectReference esxAgentHostManager;
    protected ManagedObjectReference iscsiManager;
    protected ManagedObjectReference vFlashManager;
    protected ManagedObjectReference vsanSystem;
    protected ManagedObjectReference messageBusProxy;
    protected ManagedObjectReference userDirectory;
    protected ManagedObjectReference accountManager;
    protected ManagedObjectReference hostAccessManager;
    protected ManagedObjectReference graphicsManager;
    protected ManagedObjectReference vsanInternalSystem;
    protected ManagedObjectReference certificateManager;
    protected ManagedObjectReference cryptoManager;
    protected ManagedObjectReference nvdimmSystem;
    protected ManagedObjectReference assignableHardwareManager;

    /**
     * Gets the value of the cpuScheduler property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCpuScheduler() {
        return cpuScheduler;
    }

    /**
     * Sets the value of the cpuScheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCpuScheduler(ManagedObjectReference value) {
        this.cpuScheduler = value;
    }

    /**
     * Gets the value of the datastoreSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastoreSystem() {
        return datastoreSystem;
    }

    /**
     * Sets the value of the datastoreSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastoreSystem(ManagedObjectReference value) {
        this.datastoreSystem = value;
    }

    /**
     * Gets the value of the memoryManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getMemoryManager() {
        return memoryManager;
    }

    /**
     * Sets the value of the memoryManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setMemoryManager(ManagedObjectReference value) {
        this.memoryManager = value;
    }

    /**
     * Gets the value of the storageSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getStorageSystem() {
        return storageSystem;
    }

    /**
     * Sets the value of the storageSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setStorageSystem(ManagedObjectReference value) {
        this.storageSystem = value;
    }

    /**
     * Gets the value of the networkSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getNetworkSystem() {
        return networkSystem;
    }

    /**
     * Sets the value of the networkSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setNetworkSystem(ManagedObjectReference value) {
        this.networkSystem = value;
    }

    /**
     * Gets the value of the vmotionSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVmotionSystem() {
        return vmotionSystem;
    }

    /**
     * Sets the value of the vmotionSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVmotionSystem(ManagedObjectReference value) {
        this.vmotionSystem = value;
    }

    /**
     * Gets the value of the virtualNicManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVirtualNicManager() {
        return virtualNicManager;
    }

    /**
     * Sets the value of the virtualNicManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVirtualNicManager(ManagedObjectReference value) {
        this.virtualNicManager = value;
    }

    /**
     * Gets the value of the serviceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getServiceSystem() {
        return serviceSystem;
    }

    /**
     * Sets the value of the serviceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setServiceSystem(ManagedObjectReference value) {
        this.serviceSystem = value;
    }

    /**
     * Gets the value of the firewallSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFirewallSystem() {
        return firewallSystem;
    }

    /**
     * Sets the value of the firewallSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFirewallSystem(ManagedObjectReference value) {
        this.firewallSystem = value;
    }

    /**
     * Gets the value of the advancedOption property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAdvancedOption() {
        return advancedOption;
    }

    /**
     * Sets the value of the advancedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAdvancedOption(ManagedObjectReference value) {
        this.advancedOption = value;
    }

    /**
     * Gets the value of the diagnosticSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDiagnosticSystem() {
        return diagnosticSystem;
    }

    /**
     * Sets the value of the diagnosticSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDiagnosticSystem(ManagedObjectReference value) {
        this.diagnosticSystem = value;
    }

    /**
     * Gets the value of the autoStartManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAutoStartManager() {
        return autoStartManager;
    }

    /**
     * Sets the value of the autoStartManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAutoStartManager(ManagedObjectReference value) {
        this.autoStartManager = value;
    }

    /**
     * Gets the value of the snmpSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSnmpSystem() {
        return snmpSystem;
    }

    /**
     * Sets the value of the snmpSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSnmpSystem(ManagedObjectReference value) {
        this.snmpSystem = value;
    }

    /**
     * Gets the value of the dateTimeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDateTimeSystem() {
        return dateTimeSystem;
    }

    /**
     * Sets the value of the dateTimeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDateTimeSystem(ManagedObjectReference value) {
        this.dateTimeSystem = value;
    }

    /**
     * Gets the value of the patchManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPatchManager() {
        return patchManager;
    }

    /**
     * Sets the value of the patchManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPatchManager(ManagedObjectReference value) {
        this.patchManager = value;
    }

    /**
     * Gets the value of the imageConfigManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getImageConfigManager() {
        return imageConfigManager;
    }

    /**
     * Sets the value of the imageConfigManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setImageConfigManager(ManagedObjectReference value) {
        this.imageConfigManager = value;
    }

    /**
     * Gets the value of the bootDeviceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getBootDeviceSystem() {
        return bootDeviceSystem;
    }

    /**
     * Sets the value of the bootDeviceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setBootDeviceSystem(ManagedObjectReference value) {
        this.bootDeviceSystem = value;
    }

    /**
     * Gets the value of the firmwareSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFirmwareSystem() {
        return firmwareSystem;
    }

    /**
     * Sets the value of the firmwareSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFirmwareSystem(ManagedObjectReference value) {
        this.firmwareSystem = value;
    }

    /**
     * Gets the value of the healthStatusSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHealthStatusSystem() {
        return healthStatusSystem;
    }

    /**
     * Sets the value of the healthStatusSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHealthStatusSystem(ManagedObjectReference value) {
        this.healthStatusSystem = value;
    }

    /**
     * Gets the value of the pciPassthruSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPciPassthruSystem() {
        return pciPassthruSystem;
    }

    /**
     * Sets the value of the pciPassthruSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPciPassthruSystem(ManagedObjectReference value) {
        this.pciPassthruSystem = value;
    }

    /**
     * Gets the value of the licenseManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getLicenseManager() {
        return licenseManager;
    }

    /**
     * Sets the value of the licenseManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setLicenseManager(ManagedObjectReference value) {
        this.licenseManager = value;
    }

    /**
     * Gets the value of the kernelModuleSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getKernelModuleSystem() {
        return kernelModuleSystem;
    }

    /**
     * Sets the value of the kernelModuleSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setKernelModuleSystem(ManagedObjectReference value) {
        this.kernelModuleSystem = value;
    }

    /**
     * Gets the value of the authenticationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAuthenticationManager() {
        return authenticationManager;
    }

    /**
     * Sets the value of the authenticationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAuthenticationManager(ManagedObjectReference value) {
        this.authenticationManager = value;
    }

    /**
     * Gets the value of the powerSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPowerSystem() {
        return powerSystem;
    }

    /**
     * Sets the value of the powerSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPowerSystem(ManagedObjectReference value) {
        this.powerSystem = value;
    }

    /**
     * Gets the value of the cacheConfigurationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCacheConfigurationManager() {
        return cacheConfigurationManager;
    }

    /**
     * Sets the value of the cacheConfigurationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCacheConfigurationManager(ManagedObjectReference value) {
        this.cacheConfigurationManager = value;
    }

    /**
     * Gets the value of the esxAgentHostManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEsxAgentHostManager() {
        return esxAgentHostManager;
    }

    /**
     * Sets the value of the esxAgentHostManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEsxAgentHostManager(ManagedObjectReference value) {
        this.esxAgentHostManager = value;
    }

    /**
     * Gets the value of the iscsiManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getIscsiManager() {
        return iscsiManager;
    }

    /**
     * Sets the value of the iscsiManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setIscsiManager(ManagedObjectReference value) {
        this.iscsiManager = value;
    }

    /**
     * Gets the value of the vFlashManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVFlashManager() {
        return vFlashManager;
    }

    /**
     * Sets the value of the vFlashManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVFlashManager(ManagedObjectReference value) {
        this.vFlashManager = value;
    }

    /**
     * Gets the value of the vsanSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVsanSystem() {
        return vsanSystem;
    }

    /**
     * Sets the value of the vsanSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVsanSystem(ManagedObjectReference value) {
        this.vsanSystem = value;
    }

    /**
     * Gets the value of the messageBusProxy property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getMessageBusProxy() {
        return messageBusProxy;
    }

    /**
     * Sets the value of the messageBusProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setMessageBusProxy(ManagedObjectReference value) {
        this.messageBusProxy = value;
    }

    /**
     * Gets the value of the userDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getUserDirectory() {
        return userDirectory;
    }

    /**
     * Sets the value of the userDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setUserDirectory(ManagedObjectReference value) {
        this.userDirectory = value;
    }

    /**
     * Gets the value of the accountManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAccountManager() {
        return accountManager;
    }

    /**
     * Sets the value of the accountManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAccountManager(ManagedObjectReference value) {
        this.accountManager = value;
    }

    /**
     * Gets the value of the hostAccessManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHostAccessManager() {
        return hostAccessManager;
    }

    /**
     * Sets the value of the hostAccessManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHostAccessManager(ManagedObjectReference value) {
        this.hostAccessManager = value;
    }

    /**
     * Gets the value of the graphicsManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getGraphicsManager() {
        return graphicsManager;
    }

    /**
     * Sets the value of the graphicsManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setGraphicsManager(ManagedObjectReference value) {
        this.graphicsManager = value;
    }

    /**
     * Gets the value of the vsanInternalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVsanInternalSystem() {
        return vsanInternalSystem;
    }

    /**
     * Sets the value of the vsanInternalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVsanInternalSystem(ManagedObjectReference value) {
        this.vsanInternalSystem = value;
    }

    /**
     * Gets the value of the certificateManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCertificateManager() {
        return certificateManager;
    }

    /**
     * Sets the value of the certificateManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCertificateManager(ManagedObjectReference value) {
        this.certificateManager = value;
    }

    /**
     * Gets the value of the cryptoManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCryptoManager() {
        return cryptoManager;
    }

    /**
     * Sets the value of the cryptoManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCryptoManager(ManagedObjectReference value) {
        this.cryptoManager = value;
    }

    /**
     * Gets the value of the nvdimmSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getNvdimmSystem() {
        return nvdimmSystem;
    }

    /**
     * Sets the value of the nvdimmSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setNvdimmSystem(ManagedObjectReference value) {
        this.nvdimmSystem = value;
    }

    /**
     * Gets the value of the assignableHardwareManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAssignableHardwareManager() {
        return assignableHardwareManager;
    }

    /**
     * Sets the value of the assignableHardwareManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAssignableHardwareManager(ManagedObjectReference value) {
        this.assignableHardwareManager = value;
    }

}
