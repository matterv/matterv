
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numStandalonePorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="uplinkPortPolicy" type="{urn:internalvim25}DVSUplinkPortPolicy"/>
 *         <element name="uplinkPortgroup" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultPortConfig" type="{urn:internalvim25}DVPortSetting"/>
 *         <element name="host" type="{urn:internalvim25}DistributedVirtualSwitchHostMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="productInfo" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec"/>
 *         <element name="targetInfo" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec" minOccurs="0"/>
 *         <element name="extensionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vendorSpecificConfig" type="{urn:internalvim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="policy" type="{urn:internalvim25}DVSPolicy" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="configVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contact" type="{urn:internalvim25}DVSContactInfo"/>
 *         <element name="switchIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="networkResourceManagementEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultProxySwitchMaxNumPorts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="healthCheckConfig" type="{urn:internalvim25}DVSHealthCheckConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="infrastructureTrafficResourceConfig" type="{urn:internalvim25}DvsHostInfrastructureTrafficResource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="netResourcePoolTrafficResourceConfig" type="{urn:internalvim25}DvsHostInfrastructureTrafficResource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="networkResourceControlVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmVnicNetworkResourcePool" type="{urn:internalvim25}DVSVmVnicNetworkResourcePool" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pnicCapacityRatioForReservation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSConfigInfo", propOrder = {
    "uuid",
    "name",
    "numStandalonePorts",
    "numPorts",
    "maxPorts",
    "uplinkPortPolicy",
    "uplinkPortgroup",
    "defaultPortConfig",
    "host",
    "productInfo",
    "targetInfo",
    "extensionKey",
    "vendorSpecificConfig",
    "policy",
    "description",
    "configVersion",
    "contact",
    "switchIpAddress",
    "createTime",
    "networkResourceManagementEnabled",
    "defaultProxySwitchMaxNumPorts",
    "healthCheckConfig",
    "infrastructureTrafficResourceConfig",
    "netResourcePoolTrafficResourceConfig",
    "networkResourceControlVersion",
    "vmVnicNetworkResourcePool",
    "pnicCapacityRatioForReservation"
})
@XmlSeeAlso({
    VMwareDVSConfigInfo.class
})
public class DVSConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected String name;
    protected int numStandalonePorts;
    protected int numPorts;
    protected int maxPorts;
    @XmlElement(required = true)
    protected DVSUplinkPortPolicy uplinkPortPolicy;
    protected List<ManagedObjectReference> uplinkPortgroup;
    @XmlElement(required = true)
    protected DVPortSetting defaultPortConfig;
    protected List<DistributedVirtualSwitchHostMember> host;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchProductSpec productInfo;
    protected DistributedVirtualSwitchProductSpec targetInfo;
    protected String extensionKey;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
    protected DVSPolicy policy;
    protected String description;
    @XmlElement(required = true)
    protected String configVersion;
    @XmlElement(required = true)
    protected DVSContactInfo contact;
    protected String switchIpAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected Boolean networkResourceManagementEnabled;
    protected Integer defaultProxySwitchMaxNumPorts;
    protected List<DVSHealthCheckConfig> healthCheckConfig;
    protected List<DvsHostInfrastructureTrafficResource> infrastructureTrafficResourceConfig;
    protected List<DvsHostInfrastructureTrafficResource> netResourcePoolTrafficResourceConfig;
    protected String networkResourceControlVersion;
    protected List<DVSVmVnicNetworkResourcePool> vmVnicNetworkResourcePool;
    protected Integer pnicCapacityRatioForReservation;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numStandalonePorts property.
     * 
     */
    public int getNumStandalonePorts() {
        return numStandalonePorts;
    }

    /**
     * Sets the value of the numStandalonePorts property.
     * 
     */
    public void setNumStandalonePorts(int value) {
        this.numStandalonePorts = value;
    }

    /**
     * Gets the value of the numPorts property.
     * 
     */
    public int getNumPorts() {
        return numPorts;
    }

    /**
     * Sets the value of the numPorts property.
     * 
     */
    public void setNumPorts(int value) {
        this.numPorts = value;
    }

    /**
     * Gets the value of the maxPorts property.
     * 
     */
    public int getMaxPorts() {
        return maxPorts;
    }

    /**
     * Sets the value of the maxPorts property.
     * 
     */
    public void setMaxPorts(int value) {
        this.maxPorts = value;
    }

    /**
     * Gets the value of the uplinkPortPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSUplinkPortPolicy }
     *     
     */
    public DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }

    /**
     * Sets the value of the uplinkPortPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSUplinkPortPolicy }
     *     
     */
    public void setUplinkPortPolicy(DVSUplinkPortPolicy value) {
        this.uplinkPortPolicy = value;
    }

    /**
     * Gets the value of the uplinkPortgroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPortgroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUplinkPortgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the uplinkPortgroup property.
     */
    public List<ManagedObjectReference> getUplinkPortgroup() {
        if (uplinkPortgroup == null) {
            uplinkPortgroup = new ArrayList<>();
        }
        return this.uplinkPortgroup;
    }

    /**
     * Gets the value of the defaultPortConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortSetting }
     *     
     */
    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    /**
     * Sets the value of the defaultPortConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortSetting }
     *     
     */
    public void setDefaultPortConfig(DVPortSetting value) {
        this.defaultPortConfig = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the host property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMember }
     * </p>
     * 
     * 
     * @return
     *     The value of the host property.
     */
    public List<DistributedVirtualSwitchHostMember> getHost() {
        if (host == null) {
            host = new ArrayList<>();
        }
        return this.host;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setProductInfo(DistributedVirtualSwitchProductSpec value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the targetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getTargetInfo() {
        return targetInfo;
    }

    /**
     * Sets the value of the targetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setTargetInfo(DistributedVirtualSwitchProductSpec value) {
        this.targetInfo = value;
    }

    /**
     * Gets the value of the extensionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionKey() {
        return extensionKey;
    }

    /**
     * Sets the value of the extensionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionKey(String value) {
        this.extensionKey = value;
    }

    /**
     * Gets the value of the vendorSpecificConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSpecificConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVendorSpecificConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchKeyedOpaqueBlob }
     * </p>
     * 
     * 
     * @return
     *     The value of the vendorSpecificConfig property.
     */
    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        if (vendorSpecificConfig == null) {
            vendorSpecificConfig = new ArrayList<>();
        }
        return this.vendorSpecificConfig;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSPolicy }
     *     
     */
    public DVSPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSPolicy }
     *     
     */
    public void setPolicy(DVSPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the configVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVersion() {
        return configVersion;
    }

    /**
     * Sets the value of the configVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVersion(String value) {
        this.configVersion = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link DVSContactInfo }
     *     
     */
    public DVSContactInfo getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSContactInfo }
     *     
     */
    public void setContact(DVSContactInfo value) {
        this.contact = value;
    }

    /**
     * Gets the value of the switchIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchIpAddress() {
        return switchIpAddress;
    }

    /**
     * Sets the value of the switchIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchIpAddress(String value) {
        this.switchIpAddress = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the networkResourceManagementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkResourceManagementEnabled() {
        return networkResourceManagementEnabled;
    }

    /**
     * Sets the value of the networkResourceManagementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkResourceManagementEnabled(Boolean value) {
        this.networkResourceManagementEnabled = value;
    }

    /**
     * Gets the value of the defaultProxySwitchMaxNumPorts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }

    /**
     * Sets the value of the defaultProxySwitchMaxNumPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultProxySwitchMaxNumPorts(Integer value) {
        this.defaultProxySwitchMaxNumPorts = value;
    }

    /**
     * Gets the value of the healthCheckConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCheckConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHealthCheckConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DVSHealthCheckConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the healthCheckConfig property.
     */
    public List<DVSHealthCheckConfig> getHealthCheckConfig() {
        if (healthCheckConfig == null) {
            healthCheckConfig = new ArrayList<>();
        }
        return this.healthCheckConfig;
    }

    /**
     * Gets the value of the infrastructureTrafficResourceConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infrastructureTrafficResourceConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInfrastructureTrafficResourceConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsHostInfrastructureTrafficResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the infrastructureTrafficResourceConfig property.
     */
    public List<DvsHostInfrastructureTrafficResource> getInfrastructureTrafficResourceConfig() {
        if (infrastructureTrafficResourceConfig == null) {
            infrastructureTrafficResourceConfig = new ArrayList<>();
        }
        return this.infrastructureTrafficResourceConfig;
    }

    /**
     * Gets the value of the netResourcePoolTrafficResourceConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netResourcePoolTrafficResourceConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetResourcePoolTrafficResourceConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsHostInfrastructureTrafficResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the netResourcePoolTrafficResourceConfig property.
     */
    public List<DvsHostInfrastructureTrafficResource> getNetResourcePoolTrafficResourceConfig() {
        if (netResourcePoolTrafficResourceConfig == null) {
            netResourcePoolTrafficResourceConfig = new ArrayList<>();
        }
        return this.netResourcePoolTrafficResourceConfig;
    }

    /**
     * Gets the value of the networkResourceControlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }

    /**
     * Sets the value of the networkResourceControlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkResourceControlVersion(String value) {
        this.networkResourceControlVersion = value;
    }

    /**
     * Gets the value of the vmVnicNetworkResourcePool property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmVnicNetworkResourcePool property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmVnicNetworkResourcePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DVSVmVnicNetworkResourcePool }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmVnicNetworkResourcePool property.
     */
    public List<DVSVmVnicNetworkResourcePool> getVmVnicNetworkResourcePool() {
        if (vmVnicNetworkResourcePool == null) {
            vmVnicNetworkResourcePool = new ArrayList<>();
        }
        return this.vmVnicNetworkResourcePool;
    }

    /**
     * Gets the value of the pnicCapacityRatioForReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPnicCapacityRatioForReservation() {
        return pnicCapacityRatioForReservation;
    }

    /**
     * Sets the value of the pnicCapacityRatioForReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPnicCapacityRatioForReservation(Integer value) {
        this.pnicCapacityRatioForReservation = value;
    }

}
