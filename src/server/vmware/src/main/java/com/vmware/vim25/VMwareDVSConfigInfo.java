
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSConfigInfo">
 *       <sequence>
 *         <element name="vspanSession" type="{urn:internalvim25}VMwareVspanSession" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pvlanConfig" type="{urn:internalvim25}VMwareDVSPvlanMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxMtu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="linkDiscoveryProtocolConfig" type="{urn:internalvim25}LinkDiscoveryProtocolConfig" minOccurs="0"/>
 *         <element name="ipfixConfig" type="{urn:internalvim25}VMwareIpfixConfig" minOccurs="0"/>
 *         <element name="lacpGroupConfig" type="{urn:internalvim25}VMwareDvsLacpGroupConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lacpApiVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="multicastFilteringMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkOffloadSpecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkOffloadConfig" type="{urn:internalvim25}VmwareDistributedVirtualSwitchNetworkOffloadConfig" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSConfigInfo", propOrder = {
    "vspanSession",
    "pvlanConfig",
    "maxMtu",
    "linkDiscoveryProtocolConfig",
    "ipfixConfig",
    "lacpGroupConfig",
    "lacpApiVersion",
    "multicastFilteringMode",
    "networkOffloadSpecId",
    "networkOffloadConfig"
})
public class VMwareDVSConfigInfo
    extends DVSConfigInfo
{

    protected List<VMwareVspanSession> vspanSession;
    protected List<VMwareDVSPvlanMapEntry> pvlanConfig;
    protected int maxMtu;
    protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    protected VMwareIpfixConfig ipfixConfig;
    protected List<VMwareDvsLacpGroupConfig> lacpGroupConfig;
    protected String lacpApiVersion;
    protected String multicastFilteringMode;
    protected String networkOffloadSpecId;
    protected VmwareDistributedVirtualSwitchNetworkOffloadConfig networkOffloadConfig;

    /**
     * Gets the value of the vspanSession property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vspanSession property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVspanSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareVspanSession }
     * </p>
     * 
     * 
     * @return
     *     The value of the vspanSession property.
     */
    public List<VMwareVspanSession> getVspanSession() {
        if (vspanSession == null) {
            vspanSession = new ArrayList<>();
        }
        return this.vspanSession;
    }

    /**
     * Gets the value of the pvlanConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvlanConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPvlanConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDVSPvlanMapEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the pvlanConfig property.
     */
    public List<VMwareDVSPvlanMapEntry> getPvlanConfig() {
        if (pvlanConfig == null) {
            pvlanConfig = new ArrayList<>();
        }
        return this.pvlanConfig;
    }

    /**
     * Gets the value of the maxMtu property.
     * 
     */
    public int getMaxMtu() {
        return maxMtu;
    }

    /**
     * Sets the value of the maxMtu property.
     * 
     */
    public void setMaxMtu(int value) {
        this.maxMtu = value;
    }

    /**
     * Gets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }

    /**
     * Sets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig value) {
        this.linkDiscoveryProtocolConfig = value;
    }

    /**
     * Gets the value of the ipfixConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareIpfixConfig }
     *     
     */
    public VMwareIpfixConfig getIpfixConfig() {
        return ipfixConfig;
    }

    /**
     * Sets the value of the ipfixConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareIpfixConfig }
     *     
     */
    public void setIpfixConfig(VMwareIpfixConfig value) {
        this.ipfixConfig = value;
    }

    /**
     * Gets the value of the lacpGroupConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacpGroupConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLacpGroupConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDvsLacpGroupConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the lacpGroupConfig property.
     */
    public List<VMwareDvsLacpGroupConfig> getLacpGroupConfig() {
        if (lacpGroupConfig == null) {
            lacpGroupConfig = new ArrayList<>();
        }
        return this.lacpGroupConfig;
    }

    /**
     * Gets the value of the lacpApiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLacpApiVersion() {
        return lacpApiVersion;
    }

    /**
     * Sets the value of the lacpApiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLacpApiVersion(String value) {
        this.lacpApiVersion = value;
    }

    /**
     * Gets the value of the multicastFilteringMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastFilteringMode() {
        return multicastFilteringMode;
    }

    /**
     * Sets the value of the multicastFilteringMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastFilteringMode(String value) {
        this.multicastFilteringMode = value;
    }

    /**
     * Gets the value of the networkOffloadSpecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkOffloadSpecId() {
        return networkOffloadSpecId;
    }

    /**
     * Sets the value of the networkOffloadSpecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkOffloadSpecId(String value) {
        this.networkOffloadSpecId = value;
    }

    /**
     * Gets the value of the networkOffloadConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VmwareDistributedVirtualSwitchNetworkOffloadConfig }
     *     
     */
    public VmwareDistributedVirtualSwitchNetworkOffloadConfig getNetworkOffloadConfig() {
        return networkOffloadConfig;
    }

    /**
     * Sets the value of the networkOffloadConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmwareDistributedVirtualSwitchNetworkOffloadConfig }
     *     
     */
    public void setNetworkOffloadConfig(VmwareDistributedVirtualSwitchNetworkOffloadConfig value) {
        this.networkOffloadConfig = value;
    }

}
