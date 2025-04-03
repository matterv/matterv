
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFeatureCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFeatureCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="networkResourceManagementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vmDirectPathGen2Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nicTeamingPolicy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="networkResourcePoolHighShareValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="networkResourceManagementCapability" type="{urn:internalvim25}DVSNetworkResourceManagementCapability" minOccurs="0"/>
 *         <element name="healthCheckCapability" type="{urn:internalvim25}DVSHealthCheckCapability" minOccurs="0"/>
 *         <element name="rollbackCapability" type="{urn:internalvim25}DVSRollbackCapability" minOccurs="0"/>
 *         <element name="backupRestoreCapability" type="{urn:internalvim25}DVSBackupRestoreCapability" minOccurs="0"/>
 *         <element name="networkFilterSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="macLearningSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFeatureCapability", propOrder = {
    "networkResourceManagementSupported",
    "vmDirectPathGen2Supported",
    "nicTeamingPolicy",
    "networkResourcePoolHighShareValue",
    "networkResourceManagementCapability",
    "healthCheckCapability",
    "rollbackCapability",
    "backupRestoreCapability",
    "networkFilterSupported",
    "macLearningSupported"
})
@XmlSeeAlso({
    VMwareDVSFeatureCapability.class
})
public class DVSFeatureCapability
    extends DynamicData
{

    protected boolean networkResourceManagementSupported;
    protected Boolean vmDirectPathGen2Supported;
    protected List<String> nicTeamingPolicy;
    protected Integer networkResourcePoolHighShareValue;
    protected DVSNetworkResourceManagementCapability networkResourceManagementCapability;
    protected DVSHealthCheckCapability healthCheckCapability;
    protected DVSRollbackCapability rollbackCapability;
    protected DVSBackupRestoreCapability backupRestoreCapability;
    protected Boolean networkFilterSupported;
    protected Boolean macLearningSupported;

    /**
     * Gets the value of the networkResourceManagementSupported property.
     * 
     */
    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }

    /**
     * Sets the value of the networkResourceManagementSupported property.
     * 
     */
    public void setNetworkResourceManagementSupported(boolean value) {
        this.networkResourceManagementSupported = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    /**
     * Sets the value of the vmDirectPathGen2Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmDirectPathGen2Supported(Boolean value) {
        this.vmDirectPathGen2Supported = value;
    }

    /**
     * Gets the value of the nicTeamingPolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicTeamingPolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNicTeamingPolicy().add(newItem);
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
     *     The value of the nicTeamingPolicy property.
     */
    public List<String> getNicTeamingPolicy() {
        if (nicTeamingPolicy == null) {
            nicTeamingPolicy = new ArrayList<>();
        }
        return this.nicTeamingPolicy;
    }

    /**
     * Gets the value of the networkResourcePoolHighShareValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }

    /**
     * Sets the value of the networkResourcePoolHighShareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetworkResourcePoolHighShareValue(Integer value) {
        this.networkResourcePoolHighShareValue = value;
    }

    /**
     * Gets the value of the networkResourceManagementCapability property.
     * 
     * @return
     *     possible object is
     *     {@link DVSNetworkResourceManagementCapability }
     *     
     */
    public DVSNetworkResourceManagementCapability getNetworkResourceManagementCapability() {
        return networkResourceManagementCapability;
    }

    /**
     * Sets the value of the networkResourceManagementCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSNetworkResourceManagementCapability }
     *     
     */
    public void setNetworkResourceManagementCapability(DVSNetworkResourceManagementCapability value) {
        this.networkResourceManagementCapability = value;
    }

    /**
     * Gets the value of the healthCheckCapability property.
     * 
     * @return
     *     possible object is
     *     {@link DVSHealthCheckCapability }
     *     
     */
    public DVSHealthCheckCapability getHealthCheckCapability() {
        return healthCheckCapability;
    }

    /**
     * Sets the value of the healthCheckCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSHealthCheckCapability }
     *     
     */
    public void setHealthCheckCapability(DVSHealthCheckCapability value) {
        this.healthCheckCapability = value;
    }

    /**
     * Gets the value of the rollbackCapability property.
     * 
     * @return
     *     possible object is
     *     {@link DVSRollbackCapability }
     *     
     */
    public DVSRollbackCapability getRollbackCapability() {
        return rollbackCapability;
    }

    /**
     * Sets the value of the rollbackCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSRollbackCapability }
     *     
     */
    public void setRollbackCapability(DVSRollbackCapability value) {
        this.rollbackCapability = value;
    }

    /**
     * Gets the value of the backupRestoreCapability property.
     * 
     * @return
     *     possible object is
     *     {@link DVSBackupRestoreCapability }
     *     
     */
    public DVSBackupRestoreCapability getBackupRestoreCapability() {
        return backupRestoreCapability;
    }

    /**
     * Sets the value of the backupRestoreCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSBackupRestoreCapability }
     *     
     */
    public void setBackupRestoreCapability(DVSBackupRestoreCapability value) {
        this.backupRestoreCapability = value;
    }

    /**
     * Gets the value of the networkFilterSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkFilterSupported() {
        return networkFilterSupported;
    }

    /**
     * Sets the value of the networkFilterSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkFilterSupported(Boolean value) {
        this.networkFilterSupported = value;
    }

    /**
     * Gets the value of the macLearningSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMacLearningSupported() {
        return macLearningSupported;
    }

    /**
     * Sets the value of the macLearningSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMacLearningSupported(Boolean value) {
        this.macLearningSupported = value;
    }

}
