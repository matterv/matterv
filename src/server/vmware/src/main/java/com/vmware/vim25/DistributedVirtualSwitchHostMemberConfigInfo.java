
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMemberConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="maxProxySwitchPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="vendorSpecificConfig" type="{urn:internalvim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberBacking"/>
 *         <element name="nsxSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ensEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ensInterruptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="transportZones" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberTransportZoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nsxtUsedUplinkNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="networkOffloadingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberConfigInfo", propOrder = {
    "host",
    "maxProxySwitchPorts",
    "vendorSpecificConfig",
    "backing",
    "nsxSwitch",
    "ensEnabled",
    "ensInterruptEnabled",
    "transportZones",
    "nsxtUsedUplinkNames",
    "networkOffloadingEnabled"
})
public class DistributedVirtualSwitchHostMemberConfigInfo
    extends DynamicData
{

    protected ManagedObjectReference host;
    protected int maxProxySwitchPorts;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchHostMemberBacking backing;
    protected Boolean nsxSwitch;
    protected Boolean ensEnabled;
    protected Boolean ensInterruptEnabled;
    protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones;
    protected List<String> nsxtUsedUplinkNames;
    protected Boolean networkOffloadingEnabled;

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
     * Gets the value of the maxProxySwitchPorts property.
     * 
     */
    public int getMaxProxySwitchPorts() {
        return maxProxySwitchPorts;
    }

    /**
     * Sets the value of the maxProxySwitchPorts property.
     * 
     */
    public void setMaxProxySwitchPorts(int value) {
        this.maxProxySwitchPorts = value;
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
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public DistributedVirtualSwitchHostMemberBacking getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public void setBacking(DistributedVirtualSwitchHostMemberBacking value) {
        this.backing = value;
    }

    /**
     * Gets the value of the nsxSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNsxSwitch() {
        return nsxSwitch;
    }

    /**
     * Sets the value of the nsxSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNsxSwitch(Boolean value) {
        this.nsxSwitch = value;
    }

    /**
     * Gets the value of the ensEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsEnabled() {
        return ensEnabled;
    }

    /**
     * Sets the value of the ensEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsEnabled(Boolean value) {
        this.ensEnabled = value;
    }

    /**
     * Gets the value of the ensInterruptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsInterruptEnabled() {
        return ensInterruptEnabled;
    }

    /**
     * Sets the value of the ensInterruptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsInterruptEnabled(Boolean value) {
        this.ensInterruptEnabled = value;
    }

    /**
     * Gets the value of the transportZones property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportZones property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTransportZones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberTransportZoneInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the transportZones property.
     */
    public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
        if (transportZones == null) {
            transportZones = new ArrayList<>();
        }
        return this.transportZones;
    }

    /**
     * Gets the value of the nsxtUsedUplinkNames property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsxtUsedUplinkNames property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsxtUsedUplinkNames().add(newItem);
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
     *     The value of the nsxtUsedUplinkNames property.
     */
    public List<String> getNsxtUsedUplinkNames() {
        if (nsxtUsedUplinkNames == null) {
            nsxtUsedUplinkNames = new ArrayList<>();
        }
        return this.nsxtUsedUplinkNames;
    }

    /**
     * Gets the value of the networkOffloadingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkOffloadingEnabled() {
        return networkOffloadingEnabled;
    }

    /**
     * Sets the value of the networkOffloadingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkOffloadingEnabled(Boolean value) {
        this.networkOffloadingEnabled = value;
    }

}
