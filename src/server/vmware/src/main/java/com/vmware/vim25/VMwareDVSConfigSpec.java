
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSConfigSpec">
 *       <sequence>
 *         <element name="pvlanConfigSpec" type="{urn:internalvim25}VMwareDVSPvlanConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vspanConfigSpec" type="{urn:internalvim25}VMwareDVSVspanConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxMtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="linkDiscoveryProtocolConfig" type="{urn:internalvim25}LinkDiscoveryProtocolConfig" minOccurs="0"/>
 *         <element name="ipfixConfig" type="{urn:internalvim25}VMwareIpfixConfig" minOccurs="0"/>
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
@XmlType(name = "VMwareDVSConfigSpec", propOrder = {
    "pvlanConfigSpec",
    "vspanConfigSpec",
    "maxMtu",
    "linkDiscoveryProtocolConfig",
    "ipfixConfig",
    "lacpApiVersion",
    "multicastFilteringMode",
    "networkOffloadSpecId",
    "networkOffloadConfig"
})
public class VMwareDVSConfigSpec
    extends DVSConfigSpec
{

    protected List<VMwareDVSPvlanConfigSpec> pvlanConfigSpec;
    protected List<VMwareDVSVspanConfigSpec> vspanConfigSpec;
    protected Integer maxMtu;
    protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    protected VMwareIpfixConfig ipfixConfig;
    protected String lacpApiVersion;
    protected String multicastFilteringMode;
    protected String networkOffloadSpecId;
    protected VmwareDistributedVirtualSwitchNetworkOffloadConfig networkOffloadConfig;

    /**
     * Gets the value of the pvlanConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvlanConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPvlanConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDVSPvlanConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the pvlanConfigSpec property.
     */
    public List<VMwareDVSPvlanConfigSpec> getPvlanConfigSpec() {
        if (pvlanConfigSpec == null) {
            pvlanConfigSpec = new ArrayList<>();
        }
        return this.pvlanConfigSpec;
    }

    /**
     * Gets the value of the vspanConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vspanConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVspanConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDVSVspanConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the vspanConfigSpec property.
     */
    public List<VMwareDVSVspanConfigSpec> getVspanConfigSpec() {
        if (vspanConfigSpec == null) {
            vspanConfigSpec = new ArrayList<>();
        }
        return this.vspanConfigSpec;
    }

    /**
     * Gets the value of the maxMtu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMtu() {
        return maxMtu;
    }

    /**
     * Sets the value of the maxMtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMtu(Integer value) {
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
