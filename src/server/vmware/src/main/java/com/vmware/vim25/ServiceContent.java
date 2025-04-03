
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceContent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceContent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="rootFolder" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="propertyCollector" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="viewManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="about" type="{urn:internalvim25}AboutInfo"/>
 *         <element name="setting" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="userDirectory" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="sessionManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="authorizationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="serviceManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="perfManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="scheduledTaskManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="alarmManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="eventManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="taskManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="extensionManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="customizationSpecManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="guestCustomizationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="customFieldsManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="accountManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="diagnosticManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="licenseManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="searchIndex" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="fileManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="datastoreNamespaceManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="virtualDiskManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="virtualizationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="snmpSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vmProvisioningChecker" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vmCompatibilityChecker" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="ovfManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="ipPoolManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="dvSwitchManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="hostProfileManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="clusterProfileManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="complianceManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="localizationManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="storageResourceManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="guestOperationsManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="overheadMemoryManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="certificateManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="ioFilterManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vStorageObjectManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="hostSpecManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="cryptoManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="healthUpdateManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="failoverClusterConfigurator" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="failoverClusterManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="tenantManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="siteInfoManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="storageQueryManager" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceContent", propOrder = {
    "rootFolder",
    "propertyCollector",
    "viewManager",
    "about",
    "setting",
    "userDirectory",
    "sessionManager",
    "authorizationManager",
    "serviceManager",
    "perfManager",
    "scheduledTaskManager",
    "alarmManager",
    "eventManager",
    "taskManager",
    "extensionManager",
    "customizationSpecManager",
    "guestCustomizationManager",
    "customFieldsManager",
    "accountManager",
    "diagnosticManager",
    "licenseManager",
    "searchIndex",
    "fileManager",
    "datastoreNamespaceManager",
    "virtualDiskManager",
    "virtualizationManager",
    "snmpSystem",
    "vmProvisioningChecker",
    "vmCompatibilityChecker",
    "ovfManager",
    "ipPoolManager",
    "dvSwitchManager",
    "hostProfileManager",
    "clusterProfileManager",
    "complianceManager",
    "localizationManager",
    "storageResourceManager",
    "guestOperationsManager",
    "overheadMemoryManager",
    "certificateManager",
    "ioFilterManager",
    "vStorageObjectManager",
    "hostSpecManager",
    "cryptoManager",
    "healthUpdateManager",
    "failoverClusterConfigurator",
    "failoverClusterManager",
    "tenantManager",
    "siteInfoManager",
    "storageQueryManager"
})
public class ServiceContent
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference rootFolder;
    @XmlElement(required = true)
    protected ManagedObjectReference propertyCollector;
    protected ManagedObjectReference viewManager;
    @XmlElement(required = true)
    protected AboutInfo about;
    protected ManagedObjectReference setting;
    protected ManagedObjectReference userDirectory;
    protected ManagedObjectReference sessionManager;
    protected ManagedObjectReference authorizationManager;
    protected ManagedObjectReference serviceManager;
    protected ManagedObjectReference perfManager;
    protected ManagedObjectReference scheduledTaskManager;
    protected ManagedObjectReference alarmManager;
    protected ManagedObjectReference eventManager;
    protected ManagedObjectReference taskManager;
    protected ManagedObjectReference extensionManager;
    protected ManagedObjectReference customizationSpecManager;
    protected ManagedObjectReference guestCustomizationManager;
    protected ManagedObjectReference customFieldsManager;
    protected ManagedObjectReference accountManager;
    protected ManagedObjectReference diagnosticManager;
    protected ManagedObjectReference licenseManager;
    protected ManagedObjectReference searchIndex;
    protected ManagedObjectReference fileManager;
    protected ManagedObjectReference datastoreNamespaceManager;
    protected ManagedObjectReference virtualDiskManager;
    protected ManagedObjectReference virtualizationManager;
    protected ManagedObjectReference snmpSystem;
    protected ManagedObjectReference vmProvisioningChecker;
    protected ManagedObjectReference vmCompatibilityChecker;
    protected ManagedObjectReference ovfManager;
    protected ManagedObjectReference ipPoolManager;
    protected ManagedObjectReference dvSwitchManager;
    protected ManagedObjectReference hostProfileManager;
    protected ManagedObjectReference clusterProfileManager;
    protected ManagedObjectReference complianceManager;
    protected ManagedObjectReference localizationManager;
    protected ManagedObjectReference storageResourceManager;
    protected ManagedObjectReference guestOperationsManager;
    protected ManagedObjectReference overheadMemoryManager;
    protected ManagedObjectReference certificateManager;
    protected ManagedObjectReference ioFilterManager;
    protected ManagedObjectReference vStorageObjectManager;
    protected ManagedObjectReference hostSpecManager;
    protected ManagedObjectReference cryptoManager;
    protected ManagedObjectReference healthUpdateManager;
    protected ManagedObjectReference failoverClusterConfigurator;
    protected ManagedObjectReference failoverClusterManager;
    protected ManagedObjectReference tenantManager;
    protected ManagedObjectReference siteInfoManager;
    protected ManagedObjectReference storageQueryManager;

    /**
     * Gets the value of the rootFolder property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getRootFolder() {
        return rootFolder;
    }

    /**
     * Sets the value of the rootFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setRootFolder(ManagedObjectReference value) {
        this.rootFolder = value;
    }

    /**
     * Gets the value of the propertyCollector property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPropertyCollector() {
        return propertyCollector;
    }

    /**
     * Sets the value of the propertyCollector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPropertyCollector(ManagedObjectReference value) {
        this.propertyCollector = value;
    }

    /**
     * Gets the value of the viewManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getViewManager() {
        return viewManager;
    }

    /**
     * Sets the value of the viewManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setViewManager(ManagedObjectReference value) {
        this.viewManager = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link AboutInfo }
     *     
     */
    public AboutInfo getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link AboutInfo }
     *     
     */
    public void setAbout(AboutInfo value) {
        this.about = value;
    }

    /**
     * Gets the value of the setting property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSetting() {
        return setting;
    }

    /**
     * Sets the value of the setting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSetting(ManagedObjectReference value) {
        this.setting = value;
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
     * Gets the value of the sessionManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSessionManager() {
        return sessionManager;
    }

    /**
     * Sets the value of the sessionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSessionManager(ManagedObjectReference value) {
        this.sessionManager = value;
    }

    /**
     * Gets the value of the authorizationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAuthorizationManager() {
        return authorizationManager;
    }

    /**
     * Sets the value of the authorizationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAuthorizationManager(ManagedObjectReference value) {
        this.authorizationManager = value;
    }

    /**
     * Gets the value of the serviceManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getServiceManager() {
        return serviceManager;
    }

    /**
     * Sets the value of the serviceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setServiceManager(ManagedObjectReference value) {
        this.serviceManager = value;
    }

    /**
     * Gets the value of the perfManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPerfManager() {
        return perfManager;
    }

    /**
     * Sets the value of the perfManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPerfManager(ManagedObjectReference value) {
        this.perfManager = value;
    }

    /**
     * Gets the value of the scheduledTaskManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getScheduledTaskManager() {
        return scheduledTaskManager;
    }

    /**
     * Sets the value of the scheduledTaskManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setScheduledTaskManager(ManagedObjectReference value) {
        this.scheduledTaskManager = value;
    }

    /**
     * Gets the value of the alarmManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAlarmManager() {
        return alarmManager;
    }

    /**
     * Sets the value of the alarmManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAlarmManager(ManagedObjectReference value) {
        this.alarmManager = value;
    }

    /**
     * Gets the value of the eventManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEventManager() {
        return eventManager;
    }

    /**
     * Sets the value of the eventManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEventManager(ManagedObjectReference value) {
        this.eventManager = value;
    }

    /**
     * Gets the value of the taskManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getTaskManager() {
        return taskManager;
    }

    /**
     * Sets the value of the taskManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setTaskManager(ManagedObjectReference value) {
        this.taskManager = value;
    }

    /**
     * Gets the value of the extensionManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getExtensionManager() {
        return extensionManager;
    }

    /**
     * Sets the value of the extensionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setExtensionManager(ManagedObjectReference value) {
        this.extensionManager = value;
    }

    /**
     * Gets the value of the customizationSpecManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCustomizationSpecManager() {
        return customizationSpecManager;
    }

    /**
     * Sets the value of the customizationSpecManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCustomizationSpecManager(ManagedObjectReference value) {
        this.customizationSpecManager = value;
    }

    /**
     * Gets the value of the guestCustomizationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getGuestCustomizationManager() {
        return guestCustomizationManager;
    }

    /**
     * Sets the value of the guestCustomizationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setGuestCustomizationManager(ManagedObjectReference value) {
        this.guestCustomizationManager = value;
    }

    /**
     * Gets the value of the customFieldsManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCustomFieldsManager() {
        return customFieldsManager;
    }

    /**
     * Sets the value of the customFieldsManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCustomFieldsManager(ManagedObjectReference value) {
        this.customFieldsManager = value;
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
     * Gets the value of the diagnosticManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDiagnosticManager() {
        return diagnosticManager;
    }

    /**
     * Sets the value of the diagnosticManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDiagnosticManager(ManagedObjectReference value) {
        this.diagnosticManager = value;
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
     * Gets the value of the searchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSearchIndex() {
        return searchIndex;
    }

    /**
     * Sets the value of the searchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSearchIndex(ManagedObjectReference value) {
        this.searchIndex = value;
    }

    /**
     * Gets the value of the fileManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFileManager() {
        return fileManager;
    }

    /**
     * Sets the value of the fileManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFileManager(ManagedObjectReference value) {
        this.fileManager = value;
    }

    /**
     * Gets the value of the datastoreNamespaceManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastoreNamespaceManager() {
        return datastoreNamespaceManager;
    }

    /**
     * Sets the value of the datastoreNamespaceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastoreNamespaceManager(ManagedObjectReference value) {
        this.datastoreNamespaceManager = value;
    }

    /**
     * Gets the value of the virtualDiskManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVirtualDiskManager() {
        return virtualDiskManager;
    }

    /**
     * Sets the value of the virtualDiskManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVirtualDiskManager(ManagedObjectReference value) {
        this.virtualDiskManager = value;
    }

    /**
     * Gets the value of the virtualizationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVirtualizationManager() {
        return virtualizationManager;
    }

    /**
     * Sets the value of the virtualizationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVirtualizationManager(ManagedObjectReference value) {
        this.virtualizationManager = value;
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
     * Gets the value of the vmProvisioningChecker property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVmProvisioningChecker() {
        return vmProvisioningChecker;
    }

    /**
     * Sets the value of the vmProvisioningChecker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVmProvisioningChecker(ManagedObjectReference value) {
        this.vmProvisioningChecker = value;
    }

    /**
     * Gets the value of the vmCompatibilityChecker property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVmCompatibilityChecker() {
        return vmCompatibilityChecker;
    }

    /**
     * Sets the value of the vmCompatibilityChecker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVmCompatibilityChecker(ManagedObjectReference value) {
        this.vmCompatibilityChecker = value;
    }

    /**
     * Gets the value of the ovfManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getOvfManager() {
        return ovfManager;
    }

    /**
     * Sets the value of the ovfManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setOvfManager(ManagedObjectReference value) {
        this.ovfManager = value;
    }

    /**
     * Gets the value of the ipPoolManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getIpPoolManager() {
        return ipPoolManager;
    }

    /**
     * Sets the value of the ipPoolManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setIpPoolManager(ManagedObjectReference value) {
        this.ipPoolManager = value;
    }

    /**
     * Gets the value of the dvSwitchManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDvSwitchManager() {
        return dvSwitchManager;
    }

    /**
     * Sets the value of the dvSwitchManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDvSwitchManager(ManagedObjectReference value) {
        this.dvSwitchManager = value;
    }

    /**
     * Gets the value of the hostProfileManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHostProfileManager() {
        return hostProfileManager;
    }

    /**
     * Sets the value of the hostProfileManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHostProfileManager(ManagedObjectReference value) {
        this.hostProfileManager = value;
    }

    /**
     * Gets the value of the clusterProfileManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getClusterProfileManager() {
        return clusterProfileManager;
    }

    /**
     * Sets the value of the clusterProfileManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setClusterProfileManager(ManagedObjectReference value) {
        this.clusterProfileManager = value;
    }

    /**
     * Gets the value of the complianceManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getComplianceManager() {
        return complianceManager;
    }

    /**
     * Sets the value of the complianceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setComplianceManager(ManagedObjectReference value) {
        this.complianceManager = value;
    }

    /**
     * Gets the value of the localizationManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getLocalizationManager() {
        return localizationManager;
    }

    /**
     * Sets the value of the localizationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setLocalizationManager(ManagedObjectReference value) {
        this.localizationManager = value;
    }

    /**
     * Gets the value of the storageResourceManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getStorageResourceManager() {
        return storageResourceManager;
    }

    /**
     * Sets the value of the storageResourceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setStorageResourceManager(ManagedObjectReference value) {
        this.storageResourceManager = value;
    }

    /**
     * Gets the value of the guestOperationsManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getGuestOperationsManager() {
        return guestOperationsManager;
    }

    /**
     * Sets the value of the guestOperationsManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setGuestOperationsManager(ManagedObjectReference value) {
        this.guestOperationsManager = value;
    }

    /**
     * Gets the value of the overheadMemoryManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getOverheadMemoryManager() {
        return overheadMemoryManager;
    }

    /**
     * Sets the value of the overheadMemoryManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setOverheadMemoryManager(ManagedObjectReference value) {
        this.overheadMemoryManager = value;
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
     * Gets the value of the ioFilterManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getIoFilterManager() {
        return ioFilterManager;
    }

    /**
     * Sets the value of the ioFilterManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setIoFilterManager(ManagedObjectReference value) {
        this.ioFilterManager = value;
    }

    /**
     * Gets the value of the vStorageObjectManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVStorageObjectManager() {
        return vStorageObjectManager;
    }

    /**
     * Sets the value of the vStorageObjectManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVStorageObjectManager(ManagedObjectReference value) {
        this.vStorageObjectManager = value;
    }

    /**
     * Gets the value of the hostSpecManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHostSpecManager() {
        return hostSpecManager;
    }

    /**
     * Sets the value of the hostSpecManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHostSpecManager(ManagedObjectReference value) {
        this.hostSpecManager = value;
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
     * Gets the value of the healthUpdateManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHealthUpdateManager() {
        return healthUpdateManager;
    }

    /**
     * Sets the value of the healthUpdateManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHealthUpdateManager(ManagedObjectReference value) {
        this.healthUpdateManager = value;
    }

    /**
     * Gets the value of the failoverClusterConfigurator property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFailoverClusterConfigurator() {
        return failoverClusterConfigurator;
    }

    /**
     * Sets the value of the failoverClusterConfigurator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFailoverClusterConfigurator(ManagedObjectReference value) {
        this.failoverClusterConfigurator = value;
    }

    /**
     * Gets the value of the failoverClusterManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFailoverClusterManager() {
        return failoverClusterManager;
    }

    /**
     * Sets the value of the failoverClusterManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFailoverClusterManager(ManagedObjectReference value) {
        this.failoverClusterManager = value;
    }

    /**
     * Gets the value of the tenantManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getTenantManager() {
        return tenantManager;
    }

    /**
     * Sets the value of the tenantManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setTenantManager(ManagedObjectReference value) {
        this.tenantManager = value;
    }

    /**
     * Gets the value of the siteInfoManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSiteInfoManager() {
        return siteInfoManager;
    }

    /**
     * Sets the value of the siteInfoManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSiteInfoManager(ManagedObjectReference value) {
        this.siteInfoManager = value;
    }

    /**
     * Gets the value of the storageQueryManager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getStorageQueryManager() {
        return storageQueryManager;
    }

    /**
     * Sets the value of the storageQueryManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setStorageQueryManager(ManagedObjectReference value) {
        this.storageQueryManager = value;
    }

}
