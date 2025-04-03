
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="nasDatastore" type="{urn:internalvim25}HostNasVolumeConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}HostNetworkConfig" minOccurs="0"/>
 *         <element name="nicTypeSelection" type="{urn:internalvim25}HostVirtualNicManagerNicTypeSelection" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="service" type="{urn:internalvim25}HostServiceConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="firewall" type="{urn:internalvim25}HostFirewallConfig" minOccurs="0"/>
 *         <element name="option" type="{urn:internalvim25}OptionValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="datastorePrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="datastorePrincipalPasswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="datetime" type="{urn:internalvim25}HostDateTimeConfig" minOccurs="0"/>
 *         <element name="storageDevice" type="{urn:internalvim25}HostStorageDeviceInfo" minOccurs="0"/>
 *         <element name="license" type="{urn:internalvim25}HostLicenseSpec" minOccurs="0"/>
 *         <element name="security" type="{urn:internalvim25}HostSecuritySpec" minOccurs="0"/>
 *         <element name="userAccount" type="{urn:internalvim25}HostAccountSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="usergroupAccount" type="{urn:internalvim25}HostAccountSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="memory" type="{urn:internalvim25}HostMemorySpec" minOccurs="0"/>
 *         <element name="activeDirectory" type="{urn:internalvim25}HostActiveDirectory" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="genericConfig" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="graphicsConfig" type="{urn:internalvim25}HostGraphicsConfig" minOccurs="0"/>
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
@XmlType(name = "HostConfigSpec", propOrder = {
    "nasDatastore",
    "network",
    "nicTypeSelection",
    "service",
    "firewall",
    "option",
    "datastorePrincipal",
    "datastorePrincipalPasswd",
    "datetime",
    "storageDevice",
    "license",
    "security",
    "userAccount",
    "usergroupAccount",
    "memory",
    "activeDirectory",
    "genericConfig",
    "graphicsConfig",
    "assignableHardwareConfig"
})
public class HostConfigSpec
    extends DynamicData
{

    protected List<HostNasVolumeConfig> nasDatastore;
    protected HostNetworkConfig network;
    protected List<HostVirtualNicManagerNicTypeSelection> nicTypeSelection;
    protected List<HostServiceConfig> service;
    protected HostFirewallConfig firewall;
    protected List<OptionValue> option;
    protected String datastorePrincipal;
    protected String datastorePrincipalPasswd;
    protected HostDateTimeConfig datetime;
    protected HostStorageDeviceInfo storageDevice;
    protected HostLicenseSpec license;
    protected HostSecuritySpec security;
    protected List<HostAccountSpec> userAccount;
    protected List<HostAccountSpec> usergroupAccount;
    protected HostMemorySpec memory;
    protected List<HostActiveDirectory> activeDirectory;
    protected List<KeyAnyValue> genericConfig;
    protected HostGraphicsConfig graphicsConfig;
    protected HostAssignableHardwareConfig assignableHardwareConfig;

    /**
     * Gets the value of the nasDatastore property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nasDatastore property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNasDatastore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNasVolumeConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the nasDatastore property.
     */
    public List<HostNasVolumeConfig> getNasDatastore() {
        if (nasDatastore == null) {
            nasDatastore = new ArrayList<>();
        }
        return this.nasDatastore;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkConfig }
     *     
     */
    public HostNetworkConfig getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkConfig }
     *     
     */
    public void setNetwork(HostNetworkConfig value) {
        this.network = value;
    }

    /**
     * Gets the value of the nicTypeSelection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicTypeSelection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNicTypeSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNicManagerNicTypeSelection }
     * </p>
     * 
     * 
     * @return
     *     The value of the nicTypeSelection property.
     */
    public List<HostVirtualNicManagerNicTypeSelection> getNicTypeSelection() {
        if (nicTypeSelection == null) {
            nicTypeSelection = new ArrayList<>();
        }
        return this.nicTypeSelection;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostServiceConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<HostServiceConfig> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

    /**
     * Gets the value of the firewall property.
     * 
     * @return
     *     possible object is
     *     {@link HostFirewallConfig }
     *     
     */
    public HostFirewallConfig getFirewall() {
        return firewall;
    }

    /**
     * Sets the value of the firewall property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFirewallConfig }
     *     
     */
    public void setFirewall(HostFirewallConfig value) {
        this.firewall = value;
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
     * Gets the value of the datastorePrincipalPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastorePrincipalPasswd() {
        return datastorePrincipalPasswd;
    }

    /**
     * Sets the value of the datastorePrincipalPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastorePrincipalPasswd(String value) {
        this.datastorePrincipalPasswd = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link HostDateTimeConfig }
     *     
     */
    public HostDateTimeConfig getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDateTimeConfig }
     *     
     */
    public void setDatetime(HostDateTimeConfig value) {
        this.datetime = value;
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
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link HostLicenseSpec }
     *     
     */
    public HostLicenseSpec getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLicenseSpec }
     *     
     */
    public void setLicense(HostLicenseSpec value) {
        this.license = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link HostSecuritySpec }
     *     
     */
    public HostSecuritySpec getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSecuritySpec }
     *     
     */
    public void setSecurity(HostSecuritySpec value) {
        this.security = value;
    }

    /**
     * Gets the value of the userAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAccountSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the userAccount property.
     */
    public List<HostAccountSpec> getUserAccount() {
        if (userAccount == null) {
            userAccount = new ArrayList<>();
        }
        return this.userAccount;
    }

    /**
     * Gets the value of the usergroupAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usergroupAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsergroupAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAccountSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the usergroupAccount property.
     */
    public List<HostAccountSpec> getUsergroupAccount() {
        if (usergroupAccount == null) {
            usergroupAccount = new ArrayList<>();
        }
        return this.usergroupAccount;
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link HostMemorySpec }
     *     
     */
    public HostMemorySpec getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMemorySpec }
     *     
     */
    public void setMemory(HostMemorySpec value) {
        this.memory = value;
    }

    /**
     * Gets the value of the activeDirectory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeDirectory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActiveDirectory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostActiveDirectory }
     * </p>
     * 
     * 
     * @return
     *     The value of the activeDirectory property.
     */
    public List<HostActiveDirectory> getActiveDirectory() {
        if (activeDirectory == null) {
            activeDirectory = new ArrayList<>();
        }
        return this.activeDirectory;
    }

    /**
     * Gets the value of the genericConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGenericConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAnyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the genericConfig property.
     */
    public List<KeyAnyValue> getGenericConfig() {
        if (genericConfig == null) {
            genericConfig = new ArrayList<>();
        }
        return this.genericConfig;
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
