
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Capability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="provisioningSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="multiHostSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="userShellAccessSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="supportedEVCMode" type="{urn:internalvim25}EVCMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supportedEVCGraphicsMode" type="{urn:internalvim25}FeatureEVCMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="networkBackupAndRestoreSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftDrsWithoutEvcSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hciWorkflowSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="computePolicyVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="clusterPlacementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lifecycleManagementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostSeedingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="scalableSharesSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hadcsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="configMgmtSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capability", propOrder = {
    "provisioningSupported",
    "multiHostSupported",
    "userShellAccessSupported",
    "supportedEVCMode",
    "supportedEVCGraphicsMode",
    "networkBackupAndRestoreSupported",
    "ftDrsWithoutEvcSupported",
    "hciWorkflowSupported",
    "computePolicyVersion",
    "clusterPlacementSupported",
    "lifecycleManagementSupported",
    "hostSeedingSupported",
    "scalableSharesSupported",
    "hadcsSupported",
    "configMgmtSupported"
})
public class Capability
    extends DynamicData
{

    protected boolean provisioningSupported;
    protected boolean multiHostSupported;
    protected boolean userShellAccessSupported;
    protected List<EVCMode> supportedEVCMode;
    protected List<FeatureEVCMode> supportedEVCGraphicsMode;
    protected Boolean networkBackupAndRestoreSupported;
    protected Boolean ftDrsWithoutEvcSupported;
    protected Boolean hciWorkflowSupported;
    protected Integer computePolicyVersion;
    protected Boolean clusterPlacementSupported;
    protected Boolean lifecycleManagementSupported;
    protected Boolean hostSeedingSupported;
    protected Boolean scalableSharesSupported;
    protected Boolean hadcsSupported;
    protected Boolean configMgmtSupported;

    /**
     * Gets the value of the provisioningSupported property.
     * 
     */
    public boolean isProvisioningSupported() {
        return provisioningSupported;
    }

    /**
     * Sets the value of the provisioningSupported property.
     * 
     */
    public void setProvisioningSupported(boolean value) {
        this.provisioningSupported = value;
    }

    /**
     * Gets the value of the multiHostSupported property.
     * 
     */
    public boolean isMultiHostSupported() {
        return multiHostSupported;
    }

    /**
     * Sets the value of the multiHostSupported property.
     * 
     */
    public void setMultiHostSupported(boolean value) {
        this.multiHostSupported = value;
    }

    /**
     * Gets the value of the userShellAccessSupported property.
     * 
     */
    public boolean isUserShellAccessSupported() {
        return userShellAccessSupported;
    }

    /**
     * Sets the value of the userShellAccessSupported property.
     * 
     */
    public void setUserShellAccessSupported(boolean value) {
        this.userShellAccessSupported = value;
    }

    /**
     * Gets the value of the supportedEVCMode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEVCMode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEVCMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVCMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedEVCMode property.
     */
    public List<EVCMode> getSupportedEVCMode() {
        if (supportedEVCMode == null) {
            supportedEVCMode = new ArrayList<>();
        }
        return this.supportedEVCMode;
    }

    /**
     * Gets the value of the supportedEVCGraphicsMode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEVCGraphicsMode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEVCGraphicsMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureEVCMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedEVCGraphicsMode property.
     */
    public List<FeatureEVCMode> getSupportedEVCGraphicsMode() {
        if (supportedEVCGraphicsMode == null) {
            supportedEVCGraphicsMode = new ArrayList<>();
        }
        return this.supportedEVCGraphicsMode;
    }

    /**
     * Gets the value of the networkBackupAndRestoreSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkBackupAndRestoreSupported() {
        return networkBackupAndRestoreSupported;
    }

    /**
     * Sets the value of the networkBackupAndRestoreSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkBackupAndRestoreSupported(Boolean value) {
        this.networkBackupAndRestoreSupported = value;
    }

    /**
     * Gets the value of the ftDrsWithoutEvcSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtDrsWithoutEvcSupported() {
        return ftDrsWithoutEvcSupported;
    }

    /**
     * Sets the value of the ftDrsWithoutEvcSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtDrsWithoutEvcSupported(Boolean value) {
        this.ftDrsWithoutEvcSupported = value;
    }

    /**
     * Gets the value of the hciWorkflowSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHciWorkflowSupported() {
        return hciWorkflowSupported;
    }

    /**
     * Sets the value of the hciWorkflowSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHciWorkflowSupported(Boolean value) {
        this.hciWorkflowSupported = value;
    }

    /**
     * Gets the value of the computePolicyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComputePolicyVersion() {
        return computePolicyVersion;
    }

    /**
     * Sets the value of the computePolicyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComputePolicyVersion(Integer value) {
        this.computePolicyVersion = value;
    }

    /**
     * Gets the value of the clusterPlacementSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusterPlacementSupported() {
        return clusterPlacementSupported;
    }

    /**
     * Sets the value of the clusterPlacementSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusterPlacementSupported(Boolean value) {
        this.clusterPlacementSupported = value;
    }

    /**
     * Gets the value of the lifecycleManagementSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLifecycleManagementSupported() {
        return lifecycleManagementSupported;
    }

    /**
     * Sets the value of the lifecycleManagementSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLifecycleManagementSupported(Boolean value) {
        this.lifecycleManagementSupported = value;
    }

    /**
     * Gets the value of the hostSeedingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostSeedingSupported() {
        return hostSeedingSupported;
    }

    /**
     * Sets the value of the hostSeedingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostSeedingSupported(Boolean value) {
        this.hostSeedingSupported = value;
    }

    /**
     * Gets the value of the scalableSharesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScalableSharesSupported() {
        return scalableSharesSupported;
    }

    /**
     * Sets the value of the scalableSharesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScalableSharesSupported(Boolean value) {
        this.scalableSharesSupported = value;
    }

    /**
     * Gets the value of the hadcsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHadcsSupported() {
        return hadcsSupported;
    }

    /**
     * Sets the value of the hadcsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHadcsSupported(Boolean value) {
        this.hadcsSupported = value;
    }

    /**
     * Gets the value of the configMgmtSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigMgmtSupported() {
        return configMgmtSupported;
    }

    /**
     * Sets the value of the configMgmtSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigMgmtSupported(Boolean value) {
        this.configMgmtSupported = value;
    }

}
