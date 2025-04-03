
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSPortSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSPortSetting">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVPortSetting">
 *       <sequence>
 *         <element name="vlan" type="{urn:internalvim25}VmwareDistributedVirtualSwitchVlanSpec" minOccurs="0"/>
 *         <element name="qosTag" type="{urn:internalvim25}IntPolicy" minOccurs="0"/>
 *         <element name="uplinkTeamingPolicy" type="{urn:internalvim25}VmwareUplinkPortTeamingPolicy" minOccurs="0"/>
 *         <element name="securityPolicy" type="{urn:internalvim25}DVSSecurityPolicy" minOccurs="0"/>
 *         <element name="ipfixEnabled" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="txUplink" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="lacpPolicy" type="{urn:internalvim25}VMwareUplinkLacpPolicy" minOccurs="0"/>
 *         <element name="macManagementPolicy" type="{urn:internalvim25}DVSMacManagementPolicy" minOccurs="0"/>
 *         <element name="VNI" type="{urn:internalvim25}IntPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPortSetting", propOrder = {
    "vlan",
    "qosTag",
    "uplinkTeamingPolicy",
    "securityPolicy",
    "ipfixEnabled",
    "txUplink",
    "lacpPolicy",
    "macManagementPolicy",
    "vni"
})
public class VMwareDVSPortSetting
    extends DVPortSetting
{

    protected VmwareDistributedVirtualSwitchVlanSpec vlan;
    protected IntPolicy qosTag;
    protected VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy;
    protected DVSSecurityPolicy securityPolicy;
    protected BoolPolicy ipfixEnabled;
    protected BoolPolicy txUplink;
    protected VMwareUplinkLacpPolicy lacpPolicy;
    protected DVSMacManagementPolicy macManagementPolicy;
    @XmlElement(name = "VNI")
    protected IntPolicy vni;

    /**
     * Gets the value of the vlan property.
     * 
     * @return
     *     possible object is
     *     {@link VmwareDistributedVirtualSwitchVlanSpec }
     *     
     */
    public VmwareDistributedVirtualSwitchVlanSpec getVlan() {
        return vlan;
    }

    /**
     * Sets the value of the vlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmwareDistributedVirtualSwitchVlanSpec }
     *     
     */
    public void setVlan(VmwareDistributedVirtualSwitchVlanSpec value) {
        this.vlan = value;
    }

    /**
     * Gets the value of the qosTag property.
     * 
     * @return
     *     possible object is
     *     {@link IntPolicy }
     *     
     */
    public IntPolicy getQosTag() {
        return qosTag;
    }

    /**
     * Sets the value of the qosTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPolicy }
     *     
     */
    public void setQosTag(IntPolicy value) {
        this.qosTag = value;
    }

    /**
     * Gets the value of the uplinkTeamingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VmwareUplinkPortTeamingPolicy }
     *     
     */
    public VmwareUplinkPortTeamingPolicy getUplinkTeamingPolicy() {
        return uplinkTeamingPolicy;
    }

    /**
     * Sets the value of the uplinkTeamingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmwareUplinkPortTeamingPolicy }
     *     
     */
    public void setUplinkTeamingPolicy(VmwareUplinkPortTeamingPolicy value) {
        this.uplinkTeamingPolicy = value;
    }

    /**
     * Gets the value of the securityPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSSecurityPolicy }
     *     
     */
    public DVSSecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * Sets the value of the securityPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSSecurityPolicy }
     *     
     */
    public void setSecurityPolicy(DVSSecurityPolicy value) {
        this.securityPolicy = value;
    }

    /**
     * Gets the value of the ipfixEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getIpfixEnabled() {
        return ipfixEnabled;
    }

    /**
     * Sets the value of the ipfixEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setIpfixEnabled(BoolPolicy value) {
        this.ipfixEnabled = value;
    }

    /**
     * Gets the value of the txUplink property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getTxUplink() {
        return txUplink;
    }

    /**
     * Sets the value of the txUplink property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setTxUplink(BoolPolicy value) {
        this.txUplink = value;
    }

    /**
     * Gets the value of the lacpPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareUplinkLacpPolicy }
     *     
     */
    public VMwareUplinkLacpPolicy getLacpPolicy() {
        return lacpPolicy;
    }

    /**
     * Sets the value of the lacpPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareUplinkLacpPolicy }
     *     
     */
    public void setLacpPolicy(VMwareUplinkLacpPolicy value) {
        this.lacpPolicy = value;
    }

    /**
     * Gets the value of the macManagementPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSMacManagementPolicy }
     *     
     */
    public DVSMacManagementPolicy getMacManagementPolicy() {
        return macManagementPolicy;
    }

    /**
     * Sets the value of the macManagementPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSMacManagementPolicy }
     *     
     */
    public void setMacManagementPolicy(DVSMacManagementPolicy value) {
        this.macManagementPolicy = value;
    }

    /**
     * Gets the value of the vni property.
     * 
     * @return
     *     possible object is
     *     {@link IntPolicy }
     *     
     */
    public IntPolicy getVNI() {
        return vni;
    }

    /**
     * Sets the value of the vni property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPolicy }
     *     
     */
    public void setVNI(IntPolicy value) {
        this.vni = value;
    }

}
