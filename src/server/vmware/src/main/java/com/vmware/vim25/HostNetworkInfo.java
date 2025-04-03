
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vswitch" type="{urn:internalvim25}HostVirtualSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="proxySwitch" type="{urn:internalvim25}HostProxySwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="portgroup" type="{urn:internalvim25}HostPortGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pnic" type="{urn:internalvim25}PhysicalNic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rdmaDevice" type="{urn:internalvim25}HostRdmaDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vnic" type="{urn:internalvim25}HostVirtualNic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="consoleVnic" type="{urn:internalvim25}HostVirtualNic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dnsConfig" type="{urn:internalvim25}HostDnsConfig" minOccurs="0"/>
 *         <element name="ipRouteConfig" type="{urn:internalvim25}HostIpRouteConfig" minOccurs="0"/>
 *         <element name="consoleIpRouteConfig" type="{urn:internalvim25}HostIpRouteConfig" minOccurs="0"/>
 *         <element name="routeTableInfo" type="{urn:internalvim25}HostIpRouteTableInfo" minOccurs="0"/>
 *         <element name="dhcp" type="{urn:internalvim25}HostDhcpService" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nat" type="{urn:internalvim25}HostNatService" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="atBootIpV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="netStackInstance" type="{urn:internalvim25}HostNetStackInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="opaqueSwitch" type="{urn:internalvim25}HostOpaqueSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="opaqueNetwork" type="{urn:internalvim25}HostOpaqueNetworkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nsxTransportNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nvdsToVdsMigrationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="migrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkInfo", propOrder = {
    "vswitch",
    "proxySwitch",
    "portgroup",
    "pnic",
    "rdmaDevice",
    "vnic",
    "consoleVnic",
    "dnsConfig",
    "ipRouteConfig",
    "consoleIpRouteConfig",
    "routeTableInfo",
    "dhcp",
    "nat",
    "ipV6Enabled",
    "atBootIpV6Enabled",
    "netStackInstance",
    "opaqueSwitch",
    "opaqueNetwork",
    "nsxTransportNodeId",
    "nvdsToVdsMigrationRequired",
    "migrationStatus"
})
public class HostNetworkInfo
    extends DynamicData
{

    protected List<HostVirtualSwitch> vswitch;
    protected List<HostProxySwitch> proxySwitch;
    protected List<HostPortGroup> portgroup;
    protected List<PhysicalNic> pnic;
    protected List<HostRdmaDevice> rdmaDevice;
    protected List<HostVirtualNic> vnic;
    protected List<HostVirtualNic> consoleVnic;
    protected HostDnsConfig dnsConfig;
    protected HostIpRouteConfig ipRouteConfig;
    protected HostIpRouteConfig consoleIpRouteConfig;
    protected HostIpRouteTableInfo routeTableInfo;
    protected List<HostDhcpService> dhcp;
    protected List<HostNatService> nat;
    protected Boolean ipV6Enabled;
    protected Boolean atBootIpV6Enabled;
    protected List<HostNetStackInstance> netStackInstance;
    protected List<HostOpaqueSwitch> opaqueSwitch;
    protected List<HostOpaqueNetworkInfo> opaqueNetwork;
    protected String nsxTransportNodeId;
    protected Boolean nvdsToVdsMigrationRequired;
    protected String migrationStatus;

    /**
     * Gets the value of the vswitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vswitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVswitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualSwitch }
     * </p>
     * 
     * 
     * @return
     *     The value of the vswitch property.
     */
    public List<HostVirtualSwitch> getVswitch() {
        if (vswitch == null) {
            vswitch = new ArrayList<>();
        }
        return this.vswitch;
    }

    /**
     * Gets the value of the proxySwitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxySwitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProxySwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitch }
     * </p>
     * 
     * 
     * @return
     *     The value of the proxySwitch property.
     */
    public List<HostProxySwitch> getProxySwitch() {
        if (proxySwitch == null) {
            proxySwitch = new ArrayList<>();
        }
        return this.proxySwitch;
    }

    /**
     * Gets the value of the portgroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portgroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPortgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPortGroup }
     * </p>
     * 
     * 
     * @return
     *     The value of the portgroup property.
     */
    public List<HostPortGroup> getPortgroup() {
        if (portgroup == null) {
            portgroup = new ArrayList<>();
        }
        return this.portgroup;
    }

    /**
     * Gets the value of the pnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNic }
     * </p>
     * 
     * 
     * @return
     *     The value of the pnic property.
     */
    public List<PhysicalNic> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<>();
        }
        return this.pnic;
    }

    /**
     * Gets the value of the rdmaDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdmaDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRdmaDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostRdmaDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the rdmaDevice property.
     */
    public List<HostRdmaDevice> getRdmaDevice() {
        if (rdmaDevice == null) {
            rdmaDevice = new ArrayList<>();
        }
        return this.rdmaDevice;
    }

    /**
     * Gets the value of the vnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNic }
     * </p>
     * 
     * 
     * @return
     *     The value of the vnic property.
     */
    public List<HostVirtualNic> getVnic() {
        if (vnic == null) {
            vnic = new ArrayList<>();
        }
        return this.vnic;
    }

    /**
     * Gets the value of the consoleVnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consoleVnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConsoleVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNic }
     * </p>
     * 
     * 
     * @return
     *     The value of the consoleVnic property.
     */
    public List<HostVirtualNic> getConsoleVnic() {
        if (consoleVnic == null) {
            consoleVnic = new ArrayList<>();
        }
        return this.consoleVnic;
    }

    /**
     * Gets the value of the dnsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostDnsConfig }
     *     
     */
    public HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Sets the value of the dnsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDnsConfig }
     *     
     */
    public void setDnsConfig(HostDnsConfig value) {
        this.dnsConfig = value;
    }

    /**
     * Gets the value of the ipRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    /**
     * Sets the value of the ipRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public void setIpRouteConfig(HostIpRouteConfig value) {
        this.ipRouteConfig = value;
    }

    /**
     * Gets the value of the consoleIpRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }

    /**
     * Sets the value of the consoleIpRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public void setConsoleIpRouteConfig(HostIpRouteConfig value) {
        this.consoleIpRouteConfig = value;
    }

    /**
     * Gets the value of the routeTableInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteTableInfo }
     *     
     */
    public HostIpRouteTableInfo getRouteTableInfo() {
        return routeTableInfo;
    }

    /**
     * Sets the value of the routeTableInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteTableInfo }
     *     
     */
    public void setRouteTableInfo(HostIpRouteTableInfo value) {
        this.routeTableInfo = value;
    }

    /**
     * Gets the value of the dhcp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dhcp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDhcp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDhcpService }
     * </p>
     * 
     * 
     * @return
     *     The value of the dhcp property.
     */
    public List<HostDhcpService> getDhcp() {
        if (dhcp == null) {
            dhcp = new ArrayList<>();
        }
        return this.dhcp;
    }

    /**
     * Gets the value of the nat property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nat property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNatService }
     * </p>
     * 
     * 
     * @return
     *     The value of the nat property.
     */
    public List<HostNatService> getNat() {
        if (nat == null) {
            nat = new ArrayList<>();
        }
        return this.nat;
    }

    /**
     * Gets the value of the ipV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpV6Enabled() {
        return ipV6Enabled;
    }

    /**
     * Sets the value of the ipV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpV6Enabled(Boolean value) {
        this.ipV6Enabled = value;
    }

    /**
     * Gets the value of the atBootIpV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtBootIpV6Enabled() {
        return atBootIpV6Enabled;
    }

    /**
     * Sets the value of the atBootIpV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtBootIpV6Enabled(Boolean value) {
        this.atBootIpV6Enabled = value;
    }

    /**
     * Gets the value of the netStackInstance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netStackInstance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetStackInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNetStackInstance }
     * </p>
     * 
     * 
     * @return
     *     The value of the netStackInstance property.
     */
    public List<HostNetStackInstance> getNetStackInstance() {
        if (netStackInstance == null) {
            netStackInstance = new ArrayList<>();
        }
        return this.netStackInstance;
    }

    /**
     * Gets the value of the opaqueSwitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opaqueSwitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOpaqueSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostOpaqueSwitch }
     * </p>
     * 
     * 
     * @return
     *     The value of the opaqueSwitch property.
     */
    public List<HostOpaqueSwitch> getOpaqueSwitch() {
        if (opaqueSwitch == null) {
            opaqueSwitch = new ArrayList<>();
        }
        return this.opaqueSwitch;
    }

    /**
     * Gets the value of the opaqueNetwork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opaqueNetwork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOpaqueNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostOpaqueNetworkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the opaqueNetwork property.
     */
    public List<HostOpaqueNetworkInfo> getOpaqueNetwork() {
        if (opaqueNetwork == null) {
            opaqueNetwork = new ArrayList<>();
        }
        return this.opaqueNetwork;
    }

    /**
     * Gets the value of the nsxTransportNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxTransportNodeId() {
        return nsxTransportNodeId;
    }

    /**
     * Sets the value of the nsxTransportNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxTransportNodeId(String value) {
        this.nsxTransportNodeId = value;
    }

    /**
     * Gets the value of the nvdsToVdsMigrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvdsToVdsMigrationRequired() {
        return nvdsToVdsMigrationRequired;
    }

    /**
     * Sets the value of the nvdsToVdsMigrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvdsToVdsMigrationRequired(Boolean value) {
        this.nvdsToVdsMigrationRequired = value;
    }

    /**
     * Gets the value of the migrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationStatus() {
        return migrationStatus;
    }

    /**
     * Sets the value of the migrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationStatus(String value) {
        this.migrationStatus = value;
    }

}
