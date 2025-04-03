
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="vswitch" type="{urn:internalvim25}VirtualSwitchProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmPortGroup" type="{urn:internalvim25}VmPortGroupProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostPortGroup" type="{urn:internalvim25}HostPortGroupProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="serviceConsolePortGroup" type="{urn:internalvim25}ServiceConsolePortGroupProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dnsConfig" type="{urn:internalvim25}NetworkProfileDnsConfigProfile" minOccurs="0"/>
 *         <element name="ipRouteConfig" type="{urn:internalvim25}IpRouteProfile" minOccurs="0"/>
 *         <element name="consoleIpRouteConfig" type="{urn:internalvim25}IpRouteProfile" minOccurs="0"/>
 *         <element name="pnic" type="{urn:internalvim25}PhysicalNicProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dvswitch" type="{urn:internalvim25}DvsProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dvsServiceConsoleNic" type="{urn:internalvim25}DvsServiceConsoleVNicProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dvsHostNic" type="{urn:internalvim25}DvsHostVNicProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nsxHostNic" type="{urn:internalvim25}NsxHostVNicProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="netStackInstance" type="{urn:internalvim25}NetStackInstanceProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="opaqueSwitch" type="{urn:internalvim25}OpaqueSwitchProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkProfile", propOrder = {
    "vswitch",
    "vmPortGroup",
    "hostPortGroup",
    "serviceConsolePortGroup",
    "dnsConfig",
    "ipRouteConfig",
    "consoleIpRouteConfig",
    "pnic",
    "dvswitch",
    "dvsServiceConsoleNic",
    "dvsHostNic",
    "nsxHostNic",
    "netStackInstance",
    "opaqueSwitch"
})
public class NetworkProfile
    extends ApplyProfile
{

    protected List<VirtualSwitchProfile> vswitch;
    protected List<VmPortGroupProfile> vmPortGroup;
    protected List<HostPortGroupProfile> hostPortGroup;
    protected List<ServiceConsolePortGroupProfile> serviceConsolePortGroup;
    protected NetworkProfileDnsConfigProfile dnsConfig;
    protected IpRouteProfile ipRouteConfig;
    protected IpRouteProfile consoleIpRouteConfig;
    protected List<PhysicalNicProfile> pnic;
    protected List<DvsProfile> dvswitch;
    protected List<DvsServiceConsoleVNicProfile> dvsServiceConsoleNic;
    protected List<DvsHostVNicProfile> dvsHostNic;
    protected List<NsxHostVNicProfile> nsxHostNic;
    protected List<NetStackInstanceProfile> netStackInstance;
    protected OpaqueSwitchProfile opaqueSwitch;

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
     * {@link VirtualSwitchProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the vswitch property.
     */
    public List<VirtualSwitchProfile> getVswitch() {
        if (vswitch == null) {
            vswitch = new ArrayList<>();
        }
        return this.vswitch;
    }

    /**
     * Gets the value of the vmPortGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmPortGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmPortGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmPortGroupProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmPortGroup property.
     */
    public List<VmPortGroupProfile> getVmPortGroup() {
        if (vmPortGroup == null) {
            vmPortGroup = new ArrayList<>();
        }
        return this.vmPortGroup;
    }

    /**
     * Gets the value of the hostPortGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPortGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostPortGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPortGroupProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostPortGroup property.
     */
    public List<HostPortGroupProfile> getHostPortGroup() {
        if (hostPortGroup == null) {
            hostPortGroup = new ArrayList<>();
        }
        return this.hostPortGroup;
    }

    /**
     * Gets the value of the serviceConsolePortGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConsolePortGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceConsolePortGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConsolePortGroupProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceConsolePortGroup property.
     */
    public List<ServiceConsolePortGroupProfile> getServiceConsolePortGroup() {
        if (serviceConsolePortGroup == null) {
            serviceConsolePortGroup = new ArrayList<>();
        }
        return this.serviceConsolePortGroup;
    }

    /**
     * Gets the value of the dnsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkProfileDnsConfigProfile }
     *     
     */
    public NetworkProfileDnsConfigProfile getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Sets the value of the dnsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkProfileDnsConfigProfile }
     *     
     */
    public void setDnsConfig(NetworkProfileDnsConfigProfile value) {
        this.dnsConfig = value;
    }

    /**
     * Gets the value of the ipRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IpRouteProfile }
     *     
     */
    public IpRouteProfile getIpRouteConfig() {
        return ipRouteConfig;
    }

    /**
     * Sets the value of the ipRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRouteProfile }
     *     
     */
    public void setIpRouteConfig(IpRouteProfile value) {
        this.ipRouteConfig = value;
    }

    /**
     * Gets the value of the consoleIpRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IpRouteProfile }
     *     
     */
    public IpRouteProfile getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }

    /**
     * Sets the value of the consoleIpRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRouteProfile }
     *     
     */
    public void setConsoleIpRouteConfig(IpRouteProfile value) {
        this.consoleIpRouteConfig = value;
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
     * {@link PhysicalNicProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the pnic property.
     */
    public List<PhysicalNicProfile> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<>();
        }
        return this.pnic;
    }

    /**
     * Gets the value of the dvswitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvswitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvswitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvswitch property.
     */
    public List<DvsProfile> getDvswitch() {
        if (dvswitch == null) {
            dvswitch = new ArrayList<>();
        }
        return this.dvswitch;
    }

    /**
     * Gets the value of the dvsServiceConsoleNic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvsServiceConsoleNic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvsServiceConsoleNic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsServiceConsoleVNicProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvsServiceConsoleNic property.
     */
    public List<DvsServiceConsoleVNicProfile> getDvsServiceConsoleNic() {
        if (dvsServiceConsoleNic == null) {
            dvsServiceConsoleNic = new ArrayList<>();
        }
        return this.dvsServiceConsoleNic;
    }

    /**
     * Gets the value of the dvsHostNic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvsHostNic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvsHostNic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsHostVNicProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvsHostNic property.
     */
    public List<DvsHostVNicProfile> getDvsHostNic() {
        if (dvsHostNic == null) {
            dvsHostNic = new ArrayList<>();
        }
        return this.dvsHostNic;
    }

    /**
     * Gets the value of the nsxHostNic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsxHostNic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsxHostNic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsxHostVNicProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsxHostNic property.
     */
    public List<NsxHostVNicProfile> getNsxHostNic() {
        if (nsxHostNic == null) {
            nsxHostNic = new ArrayList<>();
        }
        return this.nsxHostNic;
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
     * {@link NetStackInstanceProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the netStackInstance property.
     */
    public List<NetStackInstanceProfile> getNetStackInstance() {
        if (netStackInstance == null) {
            netStackInstance = new ArrayList<>();
        }
        return this.netStackInstance;
    }

    /**
     * Gets the value of the opaqueSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link OpaqueSwitchProfile }
     *     
     */
    public OpaqueSwitchProfile getOpaqueSwitch() {
        return opaqueSwitch;
    }

    /**
     * Sets the value of the opaqueSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpaqueSwitchProfile }
     *     
     */
    public void setOpaqueSwitch(OpaqueSwitchProfile value) {
        this.opaqueSwitch = value;
    }

}
