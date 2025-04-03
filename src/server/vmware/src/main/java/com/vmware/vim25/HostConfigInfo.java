
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="product" type="{urn:internalvim25}AboutInfo"/>
 *         <element name="deploymentInfo" type="{urn:internalvim25}HostDeploymentInfo" minOccurs="0"/>
 *         <element name="hyperThread" type="{urn:internalvim25}HostHyperThreadScheduleInfo" minOccurs="0"/>
 *         <element name="cpuScheduler" type="{urn:internalvim25}HostCpuSchedulerInfo" minOccurs="0"/>
 *         <element name="consoleReservation" type="{urn:internalvim25}ServiceConsoleReservationInfo" minOccurs="0"/>
 *         <element name="virtualMachineReservation" type="{urn:internalvim25}VirtualMachineMemoryReservationInfo" minOccurs="0"/>
 *         <element name="storageDevice" type="{urn:internalvim25}HostStorageDeviceInfo" minOccurs="0"/>
 *         <element name="multipathState" type="{urn:internalvim25}HostMultipathStateInfo" minOccurs="0"/>
 *         <element name="fileSystemVolume" type="{urn:internalvim25}HostFileSystemVolumeInfo" minOccurs="0"/>
 *         <element name="systemFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}HostNetworkInfo" minOccurs="0"/>
 *         <element name="vmotion" type="{urn:internalvim25}HostVMotionInfo" minOccurs="0"/>
 *         <element name="virtualNicManagerInfo" type="{urn:internalvim25}HostVirtualNicManagerInfo" minOccurs="0"/>
 *         <element name="capabilities" type="{urn:internalvim25}HostNetCapabilities" minOccurs="0"/>
 *         <element name="datastoreCapabilities" type="{urn:internalvim25}HostDatastoreSystemCapabilities" minOccurs="0"/>
 *         <element name="offloadCapabilities" type="{urn:internalvim25}HostNetOffloadCapabilities" minOccurs="0"/>
 *         <element name="service" type="{urn:internalvim25}HostServiceInfo" minOccurs="0"/>
 *         <element name="firewall" type="{urn:internalvim25}HostFirewallInfo" minOccurs="0"/>
 *         <element name="autoStart" type="{urn:internalvim25}HostAutoStartManagerConfig" minOccurs="0"/>
 *         <element name="activeDiagnosticPartition" type="{urn:internalvim25}HostDiagnosticPartition" minOccurs="0"/>
 *         <element name="option" type="{urn:internalvim25}OptionValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="optionDef" type="{urn:internalvim25}OptionDef" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="datastorePrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="localSwapDatastore" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="systemSwapConfiguration" type="{urn:internalvim25}HostSystemSwapConfiguration" minOccurs="0"/>
 *         <element name="systemResources" type="{urn:internalvim25}HostSystemResourceInfo" minOccurs="0"/>
 *         <element name="dateTimeInfo" type="{urn:internalvim25}HostDateTimeInfo" minOccurs="0"/>
 *         <element name="flags" type="{urn:internalvim25}HostFlagInfo" minOccurs="0"/>
 *         <element name="adminDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lockdownMode" type="{urn:internalvim25}HostLockdownMode" minOccurs="0"/>
 *         <element name="ipmi" type="{urn:internalvim25}HostIpmiInfo" minOccurs="0"/>
 *         <element name="sslThumbprintInfo" type="{urn:internalvim25}HostSslThumbprintInfo" minOccurs="0"/>
 *         <element name="sslThumbprintData" type="{urn:internalvim25}HostSslThumbprintInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="certificate" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pciPassthruInfo" type="{urn:internalvim25}HostPciPassthruInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="authenticationManagerInfo" type="{urn:internalvim25}HostAuthenticationManagerInfo" minOccurs="0"/>
 *         <element name="featureVersion" type="{urn:internalvim25}HostFeatureVersionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="powerSystemCapability" type="{urn:internalvim25}PowerSystemCapability" minOccurs="0"/>
 *         <element name="powerSystemInfo" type="{urn:internalvim25}PowerSystemInfo" minOccurs="0"/>
 *         <element name="cacheConfigurationInfo" type="{urn:internalvim25}HostCacheConfigurationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="wakeOnLanCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="featureCapability" type="{urn:internalvim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maskedFeatureCapability" type="{urn:internalvim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vFlashConfigInfo" type="{urn:internalvim25}HostVFlashManagerVFlashConfigInfo" minOccurs="0"/>
 *         <element name="vsanHostConfig" type="{urn:internalvim25}VsanHostConfigInfo" minOccurs="0"/>
 *         <element name="domainList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scriptCheckSum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="hostConfigCheckSum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="descriptionTreeCheckSum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="graphicsInfo" type="{urn:internalvim25}HostGraphicsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sharedPassthruGpuTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="graphicsConfig" type="{urn:internalvim25}HostGraphicsConfig" minOccurs="0"/>
 *         <element name="sharedGpuCapabilities" type="{urn:internalvim25}HostSharedGpuCapabilities" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ioFilterInfo" type="{urn:internalvim25}HostIoFilterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sriovDevicePool" type="{urn:internalvim25}HostSriovDevicePoolInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="assignableHardwareBinding" type="{urn:internalvim25}HostAssignableHardwareBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="assignableHardwareConfig" type="{urn:internalvim25}HostAssignableHardwareConfig" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigInfo", propOrder = {
    "host",
    "product",
    "deploymentInfo",
    "hyperThread",
    "cpuScheduler",
    "consoleReservation",
    "virtualMachineReservation",
    "storageDevice",
    "multipathState",
    "fileSystemVolume",
    "systemFile",
    "network",
    "vmotion",
    "virtualNicManagerInfo",
    "capabilities",
    "datastoreCapabilities",
    "offloadCapabilities",
    "service",
    "firewall",
    "autoStart",
    "activeDiagnosticPartition",
    "option",
    "optionDef",
    "datastorePrincipal",
    "localSwapDatastore",
    "systemSwapConfiguration",
    "systemResources",
    "dateTimeInfo",
    "flags",
    "adminDisabled",
    "lockdownMode",
    "ipmi",
    "sslThumbprintInfo",
    "sslThumbprintData",
    "certificate",
    "pciPassthruInfo",
    "authenticationManagerInfo",
    "featureVersion",
    "powerSystemCapability",
    "powerSystemInfo",
    "cacheConfigurationInfo",
    "wakeOnLanCapable",
    "featureCapability",
    "maskedFeatureCapability",
    "vFlashConfigInfo",
    "vsanHostConfig",
    "domainList",
    "scriptCheckSum",
    "hostConfigCheckSum",
    "descriptionTreeCheckSum",
    "graphicsInfo",
    "sharedPassthruGpuTypes",
    "graphicsConfig",
    "sharedGpuCapabilities",
    "ioFilterInfo",
    "sriovDevicePool",
    "assignableHardwareBinding",
    "assignableHardwareConfig"
})
public class HostConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    @XmlElement(required = true)
    protected AboutInfo product;
    protected HostDeploymentInfo deploymentInfo;
    protected HostHyperThreadScheduleInfo hyperThread;
    protected HostCpuSchedulerInfo cpuScheduler;
    protected ServiceConsoleReservationInfo consoleReservation;
    protected VirtualMachineMemoryReservationInfo virtualMachineReservation;
    protected HostStorageDeviceInfo storageDevice;
    protected HostMultipathStateInfo multipathState;
    protected HostFileSystemVolumeInfo fileSystemVolume;
    protected List<String> systemFile;
    protected HostNetworkInfo network;
    protected HostVMotionInfo vmotion;
    protected HostVirtualNicManagerInfo virtualNicManagerInfo;
    protected HostNetCapabilities capabilities;
    protected HostDatastoreSystemCapabilities datastoreCapabilities;
    protected HostNetOffloadCapabilities offloadCapabilities;
    protected HostServiceInfo service;
    protected HostFirewallInfo firewall;
    protected HostAutoStartManagerConfig autoStart;
    protected HostDiagnosticPartition activeDiagnosticPartition;
    protected List<OptionValue> option;
    protected List<OptionDef> optionDef;
    protected String datastorePrincipal;
    protected ManagedObjectReference localSwapDatastore;
    protected HostSystemSwapConfiguration systemSwapConfiguration;
    protected HostSystemResourceInfo systemResources;
    protected HostDateTimeInfo dateTimeInfo;
    protected HostFlagInfo flags;
    protected Boolean adminDisabled;
    @XmlSchemaType(name = "string")
    protected HostLockdownMode lockdownMode;
    protected HostIpmiInfo ipmi;
    protected HostSslThumbprintInfo sslThumbprintInfo;
    protected List<HostSslThumbprintInfo> sslThumbprintData;
    @XmlElement(type = Byte.class)
    protected List<Byte> certificate;
    protected List<HostPciPassthruInfo> pciPassthruInfo;
    protected HostAuthenticationManagerInfo authenticationManagerInfo;
    protected List<HostFeatureVersionInfo> featureVersion;
    protected PowerSystemCapability powerSystemCapability;
    protected PowerSystemInfo powerSystemInfo;
    protected List<HostCacheConfigurationInfo> cacheConfigurationInfo;
    protected Boolean wakeOnLanCapable;
    protected List<HostFeatureCapability> featureCapability;
    protected List<HostFeatureCapability> maskedFeatureCapability;
    protected HostVFlashManagerVFlashConfigInfo vFlashConfigInfo;
    protected VsanHostConfigInfo vsanHostConfig;
    protected List<String> domainList;
    protected byte[] scriptCheckSum;
    protected byte[] hostConfigCheckSum;
    protected byte[] descriptionTreeCheckSum;
    protected List<HostGraphicsInfo> graphicsInfo;
    protected List<String> sharedPassthruGpuTypes;
    protected HostGraphicsConfig graphicsConfig;
    protected List<HostSharedGpuCapabilities> sharedGpuCapabilities;
    protected List<HostIoFilterInfo> ioFilterInfo;
    protected List<HostSriovDevicePoolInfo> sriovDevicePool;
    protected List<HostAssignableHardwareBinding> assignableHardwareBinding;
    protected HostAssignableHardwareConfig assignableHardwareConfig;

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link AboutInfo }
     *     
     */
    public AboutInfo getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link AboutInfo }
     *     
     */
    public void setProduct(AboutInfo value) {
        this.product = value;
    }

    /**
     * Gets the value of the deploymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostDeploymentInfo }
     *     
     */
    public HostDeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    /**
     * Sets the value of the deploymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDeploymentInfo }
     *     
     */
    public void setDeploymentInfo(HostDeploymentInfo value) {
        this.deploymentInfo = value;
    }

    /**
     * Gets the value of the hyperThread property.
     * 
     * @return
     *     possible object is
     *     {@link HostHyperThreadScheduleInfo }
     *     
     */
    public HostHyperThreadScheduleInfo getHyperThread() {
        return hyperThread;
    }

    /**
     * Sets the value of the hyperThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHyperThreadScheduleInfo }
     *     
     */
    public void setHyperThread(HostHyperThreadScheduleInfo value) {
        this.hyperThread = value;
    }

    /**
     * Gets the value of the cpuScheduler property.
     * 
     * @return
     *     possible object is
     *     {@link HostCpuSchedulerInfo }
     *     
     */
    public HostCpuSchedulerInfo getCpuScheduler() {
        return cpuScheduler;
    }

    /**
     * Sets the value of the cpuScheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCpuSchedulerInfo }
     *     
     */
    public void setCpuScheduler(HostCpuSchedulerInfo value) {
        this.cpuScheduler = value;
    }

    /**
     * Gets the value of the consoleReservation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConsoleReservationInfo }
     *     
     */
    public ServiceConsoleReservationInfo getConsoleReservation() {
        return consoleReservation;
    }

    /**
     * Sets the value of the consoleReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConsoleReservationInfo }
     *     
     */
    public void setConsoleReservation(ServiceConsoleReservationInfo value) {
        this.consoleReservation = value;
    }

    /**
     * Gets the value of the virtualMachineReservation property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineMemoryReservationInfo }
     *     
     */
    public VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
        return virtualMachineReservation;
    }

    /**
     * Sets the value of the virtualMachineReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineMemoryReservationInfo }
     *     
     */
    public void setVirtualMachineReservation(VirtualMachineMemoryReservationInfo value) {
        this.virtualMachineReservation = value;
    }

    /**
     * Gets the value of the storageDevice property.
     * 
     * @return
     *     possible object is
     *     {@link HostStorageDeviceInfo }
     *     
     */
    public HostStorageDeviceInfo getStorageDevice() {
        return storageDevice;
    }

    /**
     * Sets the value of the storageDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStorageDeviceInfo }
     *     
     */
    public void setStorageDevice(HostStorageDeviceInfo value) {
        this.storageDevice = value;
    }

    /**
     * Gets the value of the multipathState property.
     * 
     * @return
     *     possible object is
     *     {@link HostMultipathStateInfo }
     *     
     */
    public HostMultipathStateInfo getMultipathState() {
        return multipathState;
    }

    /**
     * Sets the value of the multipathState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMultipathStateInfo }
     *     
     */
    public void setMultipathState(HostMultipathStateInfo value) {
        this.multipathState = value;
    }

    /**
     * Gets the value of the fileSystemVolume property.
     * 
     * @return
     *     possible object is
     *     {@link HostFileSystemVolumeInfo }
     *     
     */
    public HostFileSystemVolumeInfo getFileSystemVolume() {
        return fileSystemVolume;
    }

    /**
     * Sets the value of the fileSystemVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFileSystemVolumeInfo }
     *     
     */
    public void setFileSystemVolume(HostFileSystemVolumeInfo value) {
        this.fileSystemVolume = value;
    }

    /**
     * Gets the value of the systemFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSystemFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the systemFile property.
     */
    public List<String> getSystemFile() {
        if (systemFile == null) {
            systemFile = new ArrayList<>();
        }
        return this.systemFile;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkInfo }
     *     
     */
    public HostNetworkInfo getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkInfo }
     *     
     */
    public void setNetwork(HostNetworkInfo value) {
        this.network = value;
    }

    /**
     * Gets the value of the vmotion property.
     * 
     * @return
     *     possible object is
     *     {@link HostVMotionInfo }
     *     
     */
    public HostVMotionInfo getVmotion() {
        return vmotion;
    }

    /**
     * Sets the value of the vmotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVMotionInfo }
     *     
     */
    public void setVmotion(HostVMotionInfo value) {
        this.vmotion = value;
    }

    /**
     * Gets the value of the virtualNicManagerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicManagerInfo }
     *     
     */
    public HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
        return virtualNicManagerInfo;
    }

    /**
     * Sets the value of the virtualNicManagerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicManagerInfo }
     *     
     */
    public void setVirtualNicManagerInfo(HostVirtualNicManagerInfo value) {
        this.virtualNicManagerInfo = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetCapabilities }
     *     
     */
    public HostNetCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetCapabilities }
     *     
     */
    public void setCapabilities(HostNetCapabilities value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the datastoreCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostDatastoreSystemCapabilities }
     *     
     */
    public HostDatastoreSystemCapabilities getDatastoreCapabilities() {
        return datastoreCapabilities;
    }

    /**
     * Sets the value of the datastoreCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDatastoreSystemCapabilities }
     *     
     */
    public void setDatastoreCapabilities(HostDatastoreSystemCapabilities value) {
        this.datastoreCapabilities = value;
    }

    /**
     * Gets the value of the offloadCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetOffloadCapabilities }
     *     
     */
    public HostNetOffloadCapabilities getOffloadCapabilities() {
        return offloadCapabilities;
    }

    /**
     * Sets the value of the offloadCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetOffloadCapabilities }
     *     
     */
    public void setOffloadCapabilities(HostNetOffloadCapabilities value) {
        this.offloadCapabilities = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link HostServiceInfo }
     *     
     */
    public HostServiceInfo getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostServiceInfo }
     *     
     */
    public void setService(HostServiceInfo value) {
        this.service = value;
    }

    /**
     * Gets the value of the firewall property.
     * 
     * @return
     *     possible object is
     *     {@link HostFirewallInfo }
     *     
     */
    public HostFirewallInfo getFirewall() {
        return firewall;
    }

    /**
     * Sets the value of the firewall property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFirewallInfo }
     *     
     */
    public void setFirewall(HostFirewallInfo value) {
        this.firewall = value;
    }

    /**
     * Gets the value of the autoStart property.
     * 
     * @return
     *     possible object is
     *     {@link HostAutoStartManagerConfig }
     *     
     */
    public HostAutoStartManagerConfig getAutoStart() {
        return autoStart;
    }

    /**
     * Sets the value of the autoStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAutoStartManagerConfig }
     *     
     */
    public void setAutoStart(HostAutoStartManagerConfig value) {
        this.autoStart = value;
    }

    /**
     * Gets the value of the activeDiagnosticPartition property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiagnosticPartition }
     *     
     */
    public HostDiagnosticPartition getActiveDiagnosticPartition() {
        return activeDiagnosticPartition;
    }

    /**
     * Sets the value of the activeDiagnosticPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiagnosticPartition }
     *     
     */
    public void setActiveDiagnosticPartition(HostDiagnosticPartition value) {
        this.activeDiagnosticPartition = value;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the option property.
     */
    public List<OptionValue> getOption() {
        if (option == null) {
            option = new ArrayList<>();
        }
        return this.option;
    }

    /**
     * Gets the value of the optionDef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionDef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOptionDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionDef }
     * </p>
     * 
     * 
     * @return
     *     The value of the optionDef property.
     */
    public List<OptionDef> getOptionDef() {
        if (optionDef == null) {
            optionDef = new ArrayList<>();
        }
        return this.optionDef;
    }

    /**
     * Gets the value of the datastorePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastorePrincipal() {
        return datastorePrincipal;
    }

    /**
     * Sets the value of the datastorePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastorePrincipal(String value) {
        this.datastorePrincipal = value;
    }

    /**
     * Gets the value of the localSwapDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getLocalSwapDatastore() {
        return localSwapDatastore;
    }

    /**
     * Sets the value of the localSwapDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setLocalSwapDatastore(ManagedObjectReference value) {
        this.localSwapDatastore = value;
    }

    /**
     * Gets the value of the systemSwapConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemSwapConfiguration }
     *     
     */
    public HostSystemSwapConfiguration getSystemSwapConfiguration() {
        return systemSwapConfiguration;
    }

    /**
     * Sets the value of the systemSwapConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemSwapConfiguration }
     *     
     */
    public void setSystemSwapConfiguration(HostSystemSwapConfiguration value) {
        this.systemSwapConfiguration = value;
    }

    /**
     * Gets the value of the systemResources property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemResourceInfo }
     *     
     */
    public HostSystemResourceInfo getSystemResources() {
        return systemResources;
    }

    /**
     * Sets the value of the systemResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemResourceInfo }
     *     
     */
    public void setSystemResources(HostSystemResourceInfo value) {
        this.systemResources = value;
    }

    /**
     * Gets the value of the dateTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostDateTimeInfo }
     *     
     */
    public HostDateTimeInfo getDateTimeInfo() {
        return dateTimeInfo;
    }

    /**
     * Sets the value of the dateTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDateTimeInfo }
     *     
     */
    public void setDateTimeInfo(HostDateTimeInfo value) {
        this.dateTimeInfo = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link HostFlagInfo }
     *     
     */
    public HostFlagInfo getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFlagInfo }
     *     
     */
    public void setFlags(HostFlagInfo value) {
        this.flags = value;
    }

    /**
     * Gets the value of the adminDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminDisabled() {
        return adminDisabled;
    }

    /**
     * Sets the value of the adminDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminDisabled(Boolean value) {
        this.adminDisabled = value;
    }

    /**
     * Gets the value of the lockdownMode property.
     * 
     * @return
     *     possible object is
     *     {@link HostLockdownMode }
     *     
     */
    public HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }

    /**
     * Sets the value of the lockdownMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLockdownMode }
     *     
     */
    public void setLockdownMode(HostLockdownMode value) {
        this.lockdownMode = value;
    }

    /**
     * Gets the value of the ipmi property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpmiInfo }
     *     
     */
    public HostIpmiInfo getIpmi() {
        return ipmi;
    }

    /**
     * Sets the value of the ipmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpmiInfo }
     *     
     */
    public void setIpmi(HostIpmiInfo value) {
        this.ipmi = value;
    }

    /**
     * Gets the value of the sslThumbprintInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSslThumbprintInfo }
     *     
     */
    public HostSslThumbprintInfo getSslThumbprintInfo() {
        return sslThumbprintInfo;
    }

    /**
     * Sets the value of the sslThumbprintInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSslThumbprintInfo }
     *     
     */
    public void setSslThumbprintInfo(HostSslThumbprintInfo value) {
        this.sslThumbprintInfo = value;
    }

    /**
     * Gets the value of the sslThumbprintData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sslThumbprintData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSslThumbprintData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSslThumbprintInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sslThumbprintData property.
     */
    public List<HostSslThumbprintInfo> getSslThumbprintData() {
        if (sslThumbprintData == null) {
            sslThumbprintData = new ArrayList<>();
        }
        return this.sslThumbprintData;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * </p>
     * 
     * 
     * @return
     *     The value of the certificate property.
     */
    public List<Byte> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<>();
        }
        return this.certificate;
    }

    /**
     * Gets the value of the pciPassthruInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pciPassthruInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPciPassthruInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPciPassthruInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the pciPassthruInfo property.
     */
    public List<HostPciPassthruInfo> getPciPassthruInfo() {
        if (pciPassthruInfo == null) {
            pciPassthruInfo = new ArrayList<>();
        }
        return this.pciPassthruInfo;
    }

    /**
     * Gets the value of the authenticationManagerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostAuthenticationManagerInfo }
     *     
     */
    public HostAuthenticationManagerInfo getAuthenticationManagerInfo() {
        return authenticationManagerInfo;
    }

    /**
     * Sets the value of the authenticationManagerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAuthenticationManagerInfo }
     *     
     */
    public void setAuthenticationManagerInfo(HostAuthenticationManagerInfo value) {
        this.authenticationManagerInfo = value;
    }

    /**
     * Gets the value of the featureVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureVersionInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureVersion property.
     */
    public List<HostFeatureVersionInfo> getFeatureVersion() {
        if (featureVersion == null) {
            featureVersion = new ArrayList<>();
        }
        return this.featureVersion;
    }

    /**
     * Gets the value of the powerSystemCapability property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemCapability }
     *     
     */
    public PowerSystemCapability getPowerSystemCapability() {
        return powerSystemCapability;
    }

    /**
     * Sets the value of the powerSystemCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemCapability }
     *     
     */
    public void setPowerSystemCapability(PowerSystemCapability value) {
        this.powerSystemCapability = value;
    }

    /**
     * Gets the value of the powerSystemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemInfo }
     *     
     */
    public PowerSystemInfo getPowerSystemInfo() {
        return powerSystemInfo;
    }

    /**
     * Sets the value of the powerSystemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemInfo }
     *     
     */
    public void setPowerSystemInfo(PowerSystemInfo value) {
        this.powerSystemInfo = value;
    }

    /**
     * Gets the value of the cacheConfigurationInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheConfigurationInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCacheConfigurationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCacheConfigurationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the cacheConfigurationInfo property.
     */
    public List<HostCacheConfigurationInfo> getCacheConfigurationInfo() {
        if (cacheConfigurationInfo == null) {
            cacheConfigurationInfo = new ArrayList<>();
        }
        return this.cacheConfigurationInfo;
    }

    /**
     * Gets the value of the wakeOnLanCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWakeOnLanCapable() {
        return wakeOnLanCapable;
    }

    /**
     * Sets the value of the wakeOnLanCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWakeOnLanCapable(Boolean value) {
        this.wakeOnLanCapable = value;
    }

    /**
     * Gets the value of the featureCapability property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureCapability property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureCapability }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureCapability property.
     */
    public List<HostFeatureCapability> getFeatureCapability() {
        if (featureCapability == null) {
            featureCapability = new ArrayList<>();
        }
        return this.featureCapability;
    }

    /**
     * Gets the value of the maskedFeatureCapability property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maskedFeatureCapability property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMaskedFeatureCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureCapability }
     * </p>
     * 
     * 
     * @return
     *     The value of the maskedFeatureCapability property.
     */
    public List<HostFeatureCapability> getMaskedFeatureCapability() {
        if (maskedFeatureCapability == null) {
            maskedFeatureCapability = new ArrayList<>();
        }
        return this.maskedFeatureCapability;
    }

    /**
     * Gets the value of the vFlashConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashConfigInfo }
     *     
     */
    public HostVFlashManagerVFlashConfigInfo getVFlashConfigInfo() {
        return vFlashConfigInfo;
    }

    /**
     * Sets the value of the vFlashConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashConfigInfo }
     *     
     */
    public void setVFlashConfigInfo(HostVFlashManagerVFlashConfigInfo value) {
        this.vFlashConfigInfo = value;
    }

    /**
     * Gets the value of the vsanHostConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostConfigInfo }
     *     
     */
    public VsanHostConfigInfo getVsanHostConfig() {
        return vsanHostConfig;
    }

    /**
     * Sets the value of the vsanHostConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostConfigInfo }
     *     
     */
    public void setVsanHostConfig(VsanHostConfigInfo value) {
        this.vsanHostConfig = value;
    }

    /**
     * Gets the value of the domainList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDomainList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the domainList property.
     */
    public List<String> getDomainList() {
        if (domainList == null) {
            domainList = new ArrayList<>();
        }
        return this.domainList;
    }

    /**
     * Gets the value of the scriptCheckSum property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getScriptCheckSum() {
        return scriptCheckSum;
    }

    /**
     * Sets the value of the scriptCheckSum property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setScriptCheckSum(byte[] value) {
        this.scriptCheckSum = value;
    }

    /**
     * Gets the value of the hostConfigCheckSum property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHostConfigCheckSum() {
        return hostConfigCheckSum;
    }

    /**
     * Sets the value of the hostConfigCheckSum property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHostConfigCheckSum(byte[] value) {
        this.hostConfigCheckSum = value;
    }

    /**
     * Gets the value of the descriptionTreeCheckSum property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDescriptionTreeCheckSum() {
        return descriptionTreeCheckSum;
    }

    /**
     * Sets the value of the descriptionTreeCheckSum property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDescriptionTreeCheckSum(byte[] value) {
        this.descriptionTreeCheckSum = value;
    }

    /**
     * Gets the value of the graphicsInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGraphicsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostGraphicsInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the graphicsInfo property.
     */
    public List<HostGraphicsInfo> getGraphicsInfo() {
        if (graphicsInfo == null) {
            graphicsInfo = new ArrayList<>();
        }
        return this.graphicsInfo;
    }

    /**
     * Gets the value of the sharedPassthruGpuTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedPassthruGpuTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSharedPassthruGpuTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the sharedPassthruGpuTypes property.
     */
    public List<String> getSharedPassthruGpuTypes() {
        if (sharedPassthruGpuTypes == null) {
            sharedPassthruGpuTypes = new ArrayList<>();
        }
        return this.sharedPassthruGpuTypes;
    }

    /**
     * Gets the value of the graphicsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostGraphicsConfig }
     *     
     */
    public HostGraphicsConfig getGraphicsConfig() {
        return graphicsConfig;
    }

    /**
     * Sets the value of the graphicsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostGraphicsConfig }
     *     
     */
    public void setGraphicsConfig(HostGraphicsConfig value) {
        this.graphicsConfig = value;
    }

    /**
     * Gets the value of the sharedGpuCapabilities property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedGpuCapabilities property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSharedGpuCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSharedGpuCapabilities }
     * </p>
     * 
     * 
     * @return
     *     The value of the sharedGpuCapabilities property.
     */
    public List<HostSharedGpuCapabilities> getSharedGpuCapabilities() {
        if (sharedGpuCapabilities == null) {
            sharedGpuCapabilities = new ArrayList<>();
        }
        return this.sharedGpuCapabilities;
    }

    /**
     * Gets the value of the ioFilterInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ioFilterInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIoFilterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIoFilterInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ioFilterInfo property.
     */
    public List<HostIoFilterInfo> getIoFilterInfo() {
        if (ioFilterInfo == null) {
            ioFilterInfo = new ArrayList<>();
        }
        return this.ioFilterInfo;
    }

    /**
     * Gets the value of the sriovDevicePool property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sriovDevicePool property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSriovDevicePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSriovDevicePoolInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sriovDevicePool property.
     */
    public List<HostSriovDevicePoolInfo> getSriovDevicePool() {
        if (sriovDevicePool == null) {
            sriovDevicePool = new ArrayList<>();
        }
        return this.sriovDevicePool;
    }

    /**
     * Gets the value of the assignableHardwareBinding property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignableHardwareBinding property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssignableHardwareBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAssignableHardwareBinding }
     * </p>
     * 
     * 
     * @return
     *     The value of the assignableHardwareBinding property.
     */
    public List<HostAssignableHardwareBinding> getAssignableHardwareBinding() {
        if (assignableHardwareBinding == null) {
            assignableHardwareBinding = new ArrayList<>();
        }
        return this.assignableHardwareBinding;
    }

    /**
     * Gets the value of the assignableHardwareConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostAssignableHardwareConfig }
     *     
     */
    public HostAssignableHardwareConfig getAssignableHardwareConfig() {
        return assignableHardwareConfig;
    }

    /**
     * Sets the value of the assignableHardwareConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAssignableHardwareConfig }
     *     
     */
    public void setAssignableHardwareConfig(HostAssignableHardwareConfig value) {
        this.assignableHardwareConfig = value;
    }

}
