
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ComputeResourceSummary">
 *       <sequence>
 *         <element name="currentFailoverLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="admissionControlInfo" type="{urn:internalvim25}ClusterDasAdmissionControlInfo" minOccurs="0"/>
 *         <element name="numVmotions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="targetBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="drsScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numVmsPerDrsScoreBucket" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="usageSummary" type="{urn:internalvim25}ClusterUsageSummary" minOccurs="0"/>
 *         <element name="currentEVCModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="currentEVCGraphicsModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dasData" type="{urn:internalvim25}ClusterDasData" minOccurs="0"/>
 *         <element name="clusterMaintenanceModeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcsHealthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcsSlots" type="{urn:internalvim25}ClusterComputeResourceVcsSlots" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceSummary", propOrder = {
    "currentFailoverLevel",
    "admissionControlInfo",
    "numVmotions",
    "targetBalance",
    "currentBalance",
    "drsScore",
    "numVmsPerDrsScoreBucket",
    "usageSummary",
    "currentEVCModeKey",
    "currentEVCGraphicsModeKey",
    "dasData",
    "clusterMaintenanceModeStatus",
    "vcsHealthStatus",
    "vcsSlots"
})
public class ClusterComputeResourceSummary
    extends ComputeResourceSummary
{

    protected int currentFailoverLevel;
    protected ClusterDasAdmissionControlInfo admissionControlInfo;
    protected int numVmotions;
    protected Integer targetBalance;
    protected Integer currentBalance;
    protected Integer drsScore;
    @XmlElement(type = Integer.class)
    protected List<Integer> numVmsPerDrsScoreBucket;
    protected ClusterUsageSummary usageSummary;
    protected String currentEVCModeKey;
    protected String currentEVCGraphicsModeKey;
    protected ClusterDasData dasData;
    protected String clusterMaintenanceModeStatus;
    protected String vcsHealthStatus;
    protected List<ClusterComputeResourceVcsSlots> vcsSlots;

    /**
     * Gets the value of the currentFailoverLevel property.
     * 
     */
    public int getCurrentFailoverLevel() {
        return currentFailoverLevel;
    }

    /**
     * Sets the value of the currentFailoverLevel property.
     * 
     */
    public void setCurrentFailoverLevel(int value) {
        this.currentFailoverLevel = value;
    }

    /**
     * Gets the value of the admissionControlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasAdmissionControlInfo }
     *     
     */
    public ClusterDasAdmissionControlInfo getAdmissionControlInfo() {
        return admissionControlInfo;
    }

    /**
     * Sets the value of the admissionControlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasAdmissionControlInfo }
     *     
     */
    public void setAdmissionControlInfo(ClusterDasAdmissionControlInfo value) {
        this.admissionControlInfo = value;
    }

    /**
     * Gets the value of the numVmotions property.
     * 
     */
    public int getNumVmotions() {
        return numVmotions;
    }

    /**
     * Sets the value of the numVmotions property.
     * 
     */
    public void setNumVmotions(int value) {
        this.numVmotions = value;
    }

    /**
     * Gets the value of the targetBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetBalance() {
        return targetBalance;
    }

    /**
     * Sets the value of the targetBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetBalance(Integer value) {
        this.targetBalance = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentBalance(Integer value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the drsScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrsScore() {
        return drsScore;
    }

    /**
     * Sets the value of the drsScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrsScore(Integer value) {
        this.drsScore = value;
    }

    /**
     * Gets the value of the numVmsPerDrsScoreBucket property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numVmsPerDrsScoreBucket property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNumVmsPerDrsScoreBucket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the numVmsPerDrsScoreBucket property.
     */
    public List<Integer> getNumVmsPerDrsScoreBucket() {
        if (numVmsPerDrsScoreBucket == null) {
            numVmsPerDrsScoreBucket = new ArrayList<>();
        }
        return this.numVmsPerDrsScoreBucket;
    }

    /**
     * Gets the value of the usageSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUsageSummary }
     *     
     */
    public ClusterUsageSummary getUsageSummary() {
        return usageSummary;
    }

    /**
     * Sets the value of the usageSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUsageSummary }
     *     
     */
    public void setUsageSummary(ClusterUsageSummary value) {
        this.usageSummary = value;
    }

    /**
     * Gets the value of the currentEVCModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    /**
     * Sets the value of the currentEVCModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEVCModeKey(String value) {
        this.currentEVCModeKey = value;
    }

    /**
     * Gets the value of the currentEVCGraphicsModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEVCGraphicsModeKey() {
        return currentEVCGraphicsModeKey;
    }

    /**
     * Sets the value of the currentEVCGraphicsModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEVCGraphicsModeKey(String value) {
        this.currentEVCGraphicsModeKey = value;
    }

    /**
     * Gets the value of the dasData property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasData }
     *     
     */
    public ClusterDasData getDasData() {
        return dasData;
    }

    /**
     * Sets the value of the dasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasData }
     *     
     */
    public void setDasData(ClusterDasData value) {
        this.dasData = value;
    }

    /**
     * Gets the value of the clusterMaintenanceModeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterMaintenanceModeStatus() {
        return clusterMaintenanceModeStatus;
    }

    /**
     * Sets the value of the clusterMaintenanceModeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterMaintenanceModeStatus(String value) {
        this.clusterMaintenanceModeStatus = value;
    }

    /**
     * Gets the value of the vcsHealthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsHealthStatus() {
        return vcsHealthStatus;
    }

    /**
     * Sets the value of the vcsHealthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsHealthStatus(String value) {
        this.vcsHealthStatus = value;
    }

    /**
     * Gets the value of the vcsSlots property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcsSlots property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVcsSlots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceVcsSlots }
     * </p>
     * 
     * 
     * @return
     *     The value of the vcsSlots property.
     */
    public List<ClusterComputeResourceVcsSlots> getVcsSlots() {
        if (vcsSlots == null) {
            vcsSlots = new ArrayList<>();
        }
        return this.vcsSlots;
    }

}
