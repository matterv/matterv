
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterConfigSpecEx complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterConfigSpecEx">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ComputeResourceConfigSpec">
 *       <sequence>
 *         <element name="systemVMsConfig" type="{urn:internalvim25}ClusterSystemVMsConfigSpec" minOccurs="0"/>
 *         <element name="dasConfig" type="{urn:internalvim25}ClusterDasConfigInfo" minOccurs="0"/>
 *         <element name="dasVmConfigSpec" type="{urn:internalvim25}ClusterDasVmConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drsConfig" type="{urn:internalvim25}ClusterDrsConfigInfo" minOccurs="0"/>
 *         <element name="drsVmConfigSpec" type="{urn:internalvim25}ClusterDrsVmConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rulesSpec" type="{urn:internalvim25}ClusterRuleSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="orchestration" type="{urn:internalvim25}ClusterOrchestrationInfo" minOccurs="0"/>
 *         <element name="vmOrchestrationSpec" type="{urn:internalvim25}ClusterVmOrchestrationSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dpmConfig" type="{urn:internalvim25}ClusterDpmConfigInfo" minOccurs="0"/>
 *         <element name="dpmHostConfigSpec" type="{urn:internalvim25}ClusterDpmHostConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vsanConfig" type="{urn:internalvim25}VsanClusterConfigInfo" minOccurs="0"/>
 *         <element name="vsanHostConfigSpec" type="{urn:internalvim25}VsanHostConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="groupSpec" type="{urn:internalvim25}ClusterGroupSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="infraUpdateHaConfig" type="{urn:internalvim25}ClusterInfraUpdateHaConfigInfo" minOccurs="0"/>
 *         <element name="proactiveDrsConfig" type="{urn:internalvim25}ClusterProactiveDrsConfigInfo" minOccurs="0"/>
 *         <element name="inHciWorkflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ClusterConfigSpecEx", propOrder = {
    "systemVMsConfig",
    "dasConfig",
    "dasVmConfigSpec",
    "drsConfig",
    "drsVmConfigSpec",
    "rulesSpec",
    "orchestration",
    "vmOrchestrationSpec",
    "dpmConfig",
    "dpmHostConfigSpec",
    "vsanConfig",
    "vsanHostConfigSpec",
    "groupSpec",
    "infraUpdateHaConfig",
    "proactiveDrsConfig",
    "inHciWorkflow",
    "cryptoConfig"
})
public class ClusterConfigSpecEx
    extends ComputeResourceConfigSpec
{

    protected ClusterSystemVMsConfigSpec systemVMsConfig;
    protected ClusterDasConfigInfo dasConfig;
    protected List<ClusterDasVmConfigSpec> dasVmConfigSpec;
    protected ClusterDrsConfigInfo drsConfig;
    protected List<ClusterDrsVmConfigSpec> drsVmConfigSpec;
    protected List<ClusterRuleSpec> rulesSpec;
    protected ClusterOrchestrationInfo orchestration;
    protected List<ClusterVmOrchestrationSpec> vmOrchestrationSpec;
    protected ClusterDpmConfigInfo dpmConfig;
    protected List<ClusterDpmHostConfigSpec> dpmHostConfigSpec;
    protected VsanClusterConfigInfo vsanConfig;
    protected List<VsanHostConfigInfo> vsanHostConfigSpec;
    protected List<ClusterGroupSpec> groupSpec;
    protected ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    protected ClusterProactiveDrsConfigInfo proactiveDrsConfig;
    protected Boolean inHciWorkflow;
    protected ClusterCryptoConfigInfo cryptoConfig;

    /**
     * Gets the value of the systemVMsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterSystemVMsConfigSpec }
     *     
     */
    public ClusterSystemVMsConfigSpec getSystemVMsConfig() {
        return systemVMsConfig;
    }

    /**
     * Sets the value of the systemVMsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterSystemVMsConfigSpec }
     *     
     */
    public void setSystemVMsConfig(ClusterSystemVMsConfigSpec value) {
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
     * Gets the value of the dasVmConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dasVmConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDasVmConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasVmConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the dasVmConfigSpec property.
     */
    public List<ClusterDasVmConfigSpec> getDasVmConfigSpec() {
        if (dasVmConfigSpec == null) {
            dasVmConfigSpec = new ArrayList<>();
        }
        return this.dasVmConfigSpec;
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
     * Gets the value of the drsVmConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drsVmConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrsVmConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsVmConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the drsVmConfigSpec property.
     */
    public List<ClusterDrsVmConfigSpec> getDrsVmConfigSpec() {
        if (drsVmConfigSpec == null) {
            drsVmConfigSpec = new ArrayList<>();
        }
        return this.drsVmConfigSpec;
    }

    /**
     * Gets the value of the rulesSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulesSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRulesSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the rulesSpec property.
     */
    public List<ClusterRuleSpec> getRulesSpec() {
        if (rulesSpec == null) {
            rulesSpec = new ArrayList<>();
        }
        return this.rulesSpec;
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
     * Gets the value of the vmOrchestrationSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmOrchestrationSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmOrchestrationSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterVmOrchestrationSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmOrchestrationSpec property.
     */
    public List<ClusterVmOrchestrationSpec> getVmOrchestrationSpec() {
        if (vmOrchestrationSpec == null) {
            vmOrchestrationSpec = new ArrayList<>();
        }
        return this.vmOrchestrationSpec;
    }

    /**
     * Gets the value of the dpmConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDpmConfigInfo }
     *     
     */
    public ClusterDpmConfigInfo getDpmConfig() {
        return dpmConfig;
    }

    /**
     * Sets the value of the dpmConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDpmConfigInfo }
     *     
     */
    public void setDpmConfig(ClusterDpmConfigInfo value) {
        this.dpmConfig = value;
    }

    /**
     * Gets the value of the dpmHostConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpmHostConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDpmHostConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDpmHostConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the dpmHostConfigSpec property.
     */
    public List<ClusterDpmHostConfigSpec> getDpmHostConfigSpec() {
        if (dpmHostConfigSpec == null) {
            dpmHostConfigSpec = new ArrayList<>();
        }
        return this.dpmHostConfigSpec;
    }

    /**
     * Gets the value of the vsanConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VsanClusterConfigInfo }
     *     
     */
    public VsanClusterConfigInfo getVsanConfig() {
        return vsanConfig;
    }

    /**
     * Sets the value of the vsanConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanClusterConfigInfo }
     *     
     */
    public void setVsanConfig(VsanClusterConfigInfo value) {
        this.vsanConfig = value;
    }

    /**
     * Gets the value of the vsanHostConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsanHostConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVsanHostConfigSpec().add(newItem);
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
     *     The value of the vsanHostConfigSpec property.
     */
    public List<VsanHostConfigInfo> getVsanHostConfigSpec() {
        if (vsanHostConfigSpec == null) {
            vsanHostConfigSpec = new ArrayList<>();
        }
        return this.vsanHostConfigSpec;
    }

    /**
     * Gets the value of the groupSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroupSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterGroupSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the groupSpec property.
     */
    public List<ClusterGroupSpec> getGroupSpec() {
        if (groupSpec == null) {
            groupSpec = new ArrayList<>();
        }
        return this.groupSpec;
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
     * Gets the value of the inHciWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInHciWorkflow() {
        return inHciWorkflow;
    }

    /**
     * Sets the value of the inHciWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInHciWorkflow(Boolean value) {
        this.inHciWorkflow = value;
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
