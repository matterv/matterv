
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverResourcesAdmissionControlPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFailoverResourcesAdmissionControlPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasAdmissionControlPolicy">
 *       <sequence>
 *         <element name="cpuFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memoryFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="failoverLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="autoComputePercentages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="autoComputePMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlPolicy", propOrder = {
    "cpuFailoverResourcesPercent",
    "memoryFailoverResourcesPercent",
    "failoverLevel",
    "autoComputePercentages",
    "pMemFailoverResourcesPercent",
    "autoComputePMemFailoverResourcesPercent"
})
public class ClusterFailoverResourcesAdmissionControlPolicy
    extends ClusterDasAdmissionControlPolicy
{

    protected int cpuFailoverResourcesPercent;
    protected int memoryFailoverResourcesPercent;
    protected Integer failoverLevel;
    protected Boolean autoComputePercentages;
    protected Integer pMemFailoverResourcesPercent;
    protected Boolean autoComputePMemFailoverResourcesPercent;

    /**
     * Gets the value of the cpuFailoverResourcesPercent property.
     * 
     */
    public int getCpuFailoverResourcesPercent() {
        return cpuFailoverResourcesPercent;
    }

    /**
     * Sets the value of the cpuFailoverResourcesPercent property.
     * 
     */
    public void setCpuFailoverResourcesPercent(int value) {
        this.cpuFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the memoryFailoverResourcesPercent property.
     * 
     */
    public int getMemoryFailoverResourcesPercent() {
        return memoryFailoverResourcesPercent;
    }

    /**
     * Sets the value of the memoryFailoverResourcesPercent property.
     * 
     */
    public void setMemoryFailoverResourcesPercent(int value) {
        this.memoryFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the failoverLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailoverLevel() {
        return failoverLevel;
    }

    /**
     * Sets the value of the failoverLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailoverLevel(Integer value) {
        this.failoverLevel = value;
    }

    /**
     * Gets the value of the autoComputePercentages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComputePercentages() {
        return autoComputePercentages;
    }

    /**
     * Sets the value of the autoComputePercentages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComputePercentages(Boolean value) {
        this.autoComputePercentages = value;
    }

    /**
     * Gets the value of the pMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPMemFailoverResourcesPercent() {
        return pMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the pMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPMemFailoverResourcesPercent(Integer value) {
        this.pMemFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the autoComputePMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComputePMemFailoverResourcesPercent() {
        return autoComputePMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the autoComputePMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComputePMemFailoverResourcesPercent(Boolean value) {
        this.autoComputePMemFailoverResourcesPercent = value;
    }

}
