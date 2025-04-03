
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterConfigInfoEx complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterConfigInfoEx">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ComputeResourceConfigInfo">
 *       <sequence>
 *         <element name="systemVMsConfig" type="{urn:internalvim25}ClusterSystemVMsConfigInfo" minOccurs="0"/>
 *         <element name="dasConfig" type="{urn:internalvim25}ClusterDasConfigInfo"/>
 *         <element name="dasVmConfig" type="{urn:internalvim25}ClusterDasVmConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drsConfig" type="{urn:internalvim25}ClusterDrsConfigInfo"/>
 *         <element name="drsVmConfig" type="{urn:internalvim25}ClusterDrsVmConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rule" type="{urn:internalvim25}ClusterRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="orchestration" type="{urn:internalvim25}ClusterOrchestrationInfo" minOccurs="0"/>
 *         <element name="vmOrchestration" type="{urn:internalvim25}ClusterVmOrchestrationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dpmConfigInfo" type="{urn:internalvim25}ClusterDpmConfigInfo" minOccurs="0"/>
 *         <element name="dpmHostConfig" type="{urn:internalvim25}ClusterDpmHostConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vsanConfigInfo" type="{urn:internalvim25}VsanClusterConfigInfo" minOccurs="0"/>
 *         <element name="vsanHostConfig" type="{urn:internalvim25}VsanHostConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="group" type="{urn:internalvim25}ClusterGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="infraUpdateHaConfig" type="{urn:internalvim25}ClusterInfraUpdateHaConfigInfo" minOccurs="0"/>
 *         <element name="proactiveDrsConfig" type="{urn:internalvim25}ClusterProactiveDrsConfigInfo" minOccurs="0"/>
 *         <element name="cryptoConfig" type="{urn:internalvim25}ClusterCryptoConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigInfoEx", propOrder = {
    "systemVMsConfig",
    "dasConfig",
    "dasVmConfig",
    "drsConfig",
    "drsVmConfig",
    "rule",
    "orchestration",
    "vmOrchestration",
    "dpmConfigInfo",
    "dpmHostConfig",
    "vsanConfigInfo",
    "vsanHostConfig",
    "group",
    "infraUpdateHaConfig",
    "proactiveDrsConfig",
    "cryptoConfig"
})
public class ClusterConfigInfoEx
    extends ComputeResourceConfigInfo
{

    protected ClusterSystemVMsConfigInfo systemVMsConfig;
    @XmlElement(required = true)
    protected ClusterDasConfigInfo dasConfig;
    protected List<ClusterDasVmConfigInfo> dasVmConfig;
    @XmlElement(required = true)
    protected ClusterDrsConfigInfo drsConfig;
    protected List<ClusterDrsVmConfigInfo> drsVmConfig;
    protected List<ClusterRuleInfo> rule;
    protected ClusterOrchestrationInfo orchestration;
    protected List<ClusterVmOrchestrationInfo> vmOrchestration;
    protected ClusterDpmConfigInfo dpmConfigInfo;
    protected List<ClusterDpmHostConfigInfo> dpmHostConfig;
    protected VsanClusterConfigInfo vsanConfigInfo;
    protected List<VsanHostConfigInfo> vsanHostConfig;
    protected List<ClusterGroupInfo> group;
    protected ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    protected ClusterProactiveDrsConfigInfo proactiveDrsConfig;
    protected ClusterCryptoConfigInfo cryptoConfig;

    /**
     * Gets the value of the systemVMsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterSystemVMsConfigInfo }
     *     
     */
    public ClusterSystemVMsConfigInfo getSystemVMsConfig() {
        return systemVMsConfig;
    }

    /**
     * Sets the value of the systemVMsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterSystemVMsConfigInfo }
     *     
     */
    public void setSystemVMsConfig(ClusterSystemVMsConfigInfo value) {
        this.systemVMsConfig = value;
    }

    /**
     * Gets the value of the dasConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasConfigInfo }
     *     
     */
    public ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }

    /**
     * Sets the value of the dasConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasConfigInfo }
     *     
     */
    public void setDasConfig(ClusterDasConfigInfo value) {
        this.dasConfig = value;
    }

    /**
     * Gets the value of the dasVmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dasVmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDasVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasVmConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dasVmConfig property.
     */
    public List<ClusterDasVmConfigInfo> getDasVmConfig() {
        if (dasVmConfig == null) {
            dasVmConfig = new ArrayList<>();
        }
        return this.dasVmConfig;
    }

    /**
     * Gets the value of the drsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDrsConfigInfo }
     *     
     */
    public ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }

    /**
     * Sets the value of the drsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDrsConfigInfo }
     *     
     */
    public void setDrsConfig(ClusterDrsConfigInfo value) {
        this.drsConfig = value;
    }

    /**
     * Gets the value of the drsVmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drsVmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrsVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsVmConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the drsVmConfig property.
     */
    public List<ClusterDrsVmConfigInfo> getDrsVmConfig() {
        if (drsVmConfig == null) {
            drsVmConfig = new ArrayList<>();
        }
        return this.drsVmConfig;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the rule property.
     */
    public List<ClusterRuleInfo> getRule() {
        if (rule == null) {
            rule = new ArrayList<>();
        }
        return this.rule;
    }

    /**
     * Gets the value of the orchestration property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterOrchestrationInfo }
     *     
     */
    public ClusterOrchestrationInfo getOrchestration() {
        return orchestration;
    }

    /**
     * Sets the value of the orchestration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterOrchestrationInfo }
     *     
     */
    public void setOrchestration(ClusterOrchestrationInfo value) {
        this.orchestration = value;
    }

    /**
     * Gets the value of the vmOrchestration property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmOrchestration property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmOrchestration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterVmOrchestrationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmOrchestration property.
     */
    public List<ClusterVmOrchestrationInfo> getVmOrchestration() {
        if (vmOrchestration == null) {
            vmOrchestration = new ArrayList<>();
        }
        return this.vmOrchestration;
    }

    /**
     * Gets the value of the dpmConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDpmConfigInfo }
     *     
     */
    public ClusterDpmConfigInfo getDpmConfigInfo() {
        return dpmConfigInfo;
    }

    /**
     * Sets the value of the dpmConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDpmConfigInfo }
     *     
     */
    public void setDpmConfigInfo(ClusterDpmConfigInfo value) {
        this.dpmConfigInfo = value;
    }

    /**
     * Gets the value of the dpmHostConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpmHostConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDpmHostConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDpmHostConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dpmHostConfig property.
     */
    public List<ClusterDpmHostConfigInfo> getDpmHostConfig() {
        if (dpmHostConfig == null) {
            dpmHostConfig = new ArrayList<>();
        }
        return this.dpmHostConfig;
    }

    /**
     * Gets the value of the vsanConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VsanClusterConfigInfo }
     *     
     */
    public VsanClusterConfigInfo getVsanConfigInfo() {
        return vsanConfigInfo;
    }

    /**
     * Sets the value of the vsanConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanClusterConfigInfo }
     *     
     */
    public void setVsanConfigInfo(VsanClusterConfigInfo value) {
        this.vsanConfigInfo = value;
    }

    /**
     * Gets the value of the vsanHostConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsanHostConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVsanHostConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanHostConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vsanHostConfig property.
     */
    public List<VsanHostConfigInfo> getVsanHostConfig() {
        if (vsanHostConfig == null) {
            vsanHostConfig = new ArrayList<>();
        }
        return this.vsanHostConfig;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterGroupInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the group property.
     */
    public List<ClusterGroupInfo> getGroup() {
        if (group == null) {
            group = new ArrayList<>();
        }
        return this.group;
    }

    /**
     * Gets the value of the infraUpdateHaConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterInfraUpdateHaConfigInfo }
     *     
     */
    public ClusterInfraUpdateHaConfigInfo getInfraUpdateHaConfig() {
        return infraUpdateHaConfig;
    }

    /**
     * Sets the value of the infraUpdateHaConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterInfraUpdateHaConfigInfo }
     *     
     */
    public void setInfraUpdateHaConfig(ClusterInfraUpdateHaConfigInfo value) {
        this.infraUpdateHaConfig = value;
    }

    /**
     * Gets the value of the proactiveDrsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterProactiveDrsConfigInfo }
     *     
     */
    public ClusterProactiveDrsConfigInfo getProactiveDrsConfig() {
        return proactiveDrsConfig;
    }

    /**
     * Sets the value of the proactiveDrsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterProactiveDrsConfigInfo }
     *     
     */
    public void setProactiveDrsConfig(ClusterProactiveDrsConfigInfo value) {
        this.proactiveDrsConfig = value;
    }

    /**
     * Gets the value of the cryptoConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterCryptoConfigInfo }
     *     
     */
    public ClusterCryptoConfigInfo getCryptoConfig() {
        return cryptoConfig;
    }

    /**
     * Sets the value of the cryptoConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterCryptoConfigInfo }
     *     
     */
    public void setCryptoConfig(ClusterCryptoConfigInfo value) {
        this.cryptoConfig = value;
    }

}
