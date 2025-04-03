
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vswitch" type="{urn:internalvim25}HostVirtualSwitchConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="proxySwitch" type="{urn:internalvim25}HostProxySwitchConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="portgroup" type="{urn:internalvim25}HostPortGroupConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pnic" type="{urn:internalvim25}PhysicalNicConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vnic" type="{urn:internalvim25}HostVirtualNicConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="consoleVnic" type="{urn:internalvim25}HostVirtualNicConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dnsConfig" type="{urn:internalvim25}HostDnsConfig" minOccurs="0"/>
 *         <element name="ipRouteConfig" type="{urn:internalvim25}HostIpRouteConfig" minOccurs="0"/>
 *         <element name="consoleIpRouteConfig" type="{urn:internalvim25}HostIpRouteConfig" minOccurs="0"/>
 *         <element name="routeTableConfig" type="{urn:internalvim25}HostIpRouteTableConfig" minOccurs="0"/>
 *         <element name="dhcp" type="{urn:internalvim25}HostDhcpServiceConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nat" type="{urn:internalvim25}HostNatServiceConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="netStackSpec" type="{urn:internalvim25}HostNetworkConfigNetStackSpec" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HostNetworkConfig", propOrder = {
    "vswitch",
    "proxySwitch",
    "portgroup",
    "pnic",
    "vnic",
    "consoleVnic",
    "dnsConfig",
    "ipRouteConfig",
    "consoleIpRouteConfig",
    "routeTableConfig",
    "dhcp",
    "nat",
    "ipV6Enabled",
    "netStackSpec",
    "migrationStatus"
})
public class HostNetworkConfig
    extends DynamicData
{

    protected List<HostVirtualSwitchConfig> vswitch;
    protected List<HostProxySwitchConfig> proxySwitch;
    protected List<HostPortGroupConfig> portgroup;
    protected List<PhysicalNicConfig> pnic;
    protected List<HostVirtualNicConfig> vnic;
    protected List<HostVirtualNicConfig> consoleVnic;
    protected HostDnsConfig dnsConfig;
    protected HostIpRouteConfig ipRouteConfig;
    protected HostIpRouteConfig consoleIpRouteConfig;
    protected HostIpRouteTableConfig routeTableConfig;
    protected List<HostDhcpServiceConfig> dhcp;
    protected List<HostNatServiceConfig> nat;
    protected Boolean ipV6Enabled;
    protected List<HostNetworkConfigNetStackSpec> netStackSpec;
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
     * {@link HostVirtualSwitchConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the vswitch property.
     */
    public List<HostVirtualSwitchConfig> getVswitch() {
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
     * {@link HostProxySwitchConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the proxySwitch property.
     */
    public List<HostProxySwitchConfig> getProxySwitch() {
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
     * {@link HostPortGroupConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the portgroup property.
     */
    public List<HostPortGroupConfig> getPortgroup() {
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
     * {@link PhysicalNicConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the pnic property.
     */
    public List<PhysicalNicConfig> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<>();
        }
        return this.pnic;
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
     * {@link HostVirtualNicConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the vnic property.
     */
    public List<HostVirtualNicConfig> getVnic() {
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
     * {@link HostVirtualNicConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the consoleVnic property.
     */
    public List<HostVirtualNicConfig> getConsoleVnic() {
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
     * Gets the value of the routeTableConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteTableConfig }
     *     
     */
    public HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }

    /**
     * Sets the value of the routeTableConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteTableConfig }
     *     
     */
    public void setRouteTableConfig(HostIpRouteTableConfig value) {
        this.routeTableConfig = value;
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
     * {@link HostDhcpServiceConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the dhcp property.
     */
    public List<HostDhcpServiceConfig> getDhcp() {
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
     * {@link HostNatServiceConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the nat property.
     */
    public List<HostNatServiceConfig> getNat() {
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
     * Gets the value of the netStackSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netStackSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetStackSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNetworkConfigNetStackSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the netStackSpec property.
     */
    public List<HostNetworkConfigNetStackSpec> getNetStackSpec() {
        if (netStackSpec == null) {
            netStackSpec = new ArrayList<>();
        }
        return this.netStackSpec;
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
