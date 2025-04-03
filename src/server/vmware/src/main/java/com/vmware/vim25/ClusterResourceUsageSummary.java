
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterResourceUsageSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterResourceUsageSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cpuUsedMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="cpuCapacityMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memUsedMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memCapacityMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="pMemAvailableMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="pMemCapacityMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="storageUsedMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="storageCapacityMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterResourceUsageSummary", propOrder = {
    "cpuUsedMHz",
    "cpuCapacityMHz",
    "memUsedMB",
    "memCapacityMB",
    "pMemAvailableMB",
    "pMemCapacityMB",
    "storageUsedMB",
    "storageCapacityMB"
})
public class ClusterResourceUsageSummary
    extends DynamicData
{

    protected int cpuUsedMHz;
    protected int cpuCapacityMHz;
    protected int memUsedMB;
    protected int memCapacityMB;
    protected Long pMemAvailableMB;
    protected Long pMemCapacityMB;
    protected long storageUsedMB;
    protected long storageCapacityMB;

    /**
     * Gets the value of the cpuUsedMHz property.
     * 
     */
    public int getCpuUsedMHz() {
        return cpuUsedMHz;
    }

    /**
     * Sets the value of the cpuUsedMHz property.
     * 
     */
    public void setCpuUsedMHz(int value) {
        this.cpuUsedMHz = value;
    }

    /**
     * Gets the value of the cpuCapacityMHz property.
     * 
     */
    public int getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }

    /**
     * Sets the value of the cpuCapacityMHz property.
     * 
     */
    public void setCpuCapacityMHz(int value) {
        this.cpuCapacityMHz = value;
    }

    /**
     * Gets the value of the memUsedMB property.
     * 
     */
    public int getMemUsedMB() {
        return memUsedMB;
    }

    /**
     * Sets the value of the memUsedMB property.
     * 
     */
    public void setMemUsedMB(int value) {
        this.memUsedMB = value;
    }

    /**
     * Gets the value of the memCapacityMB property.
     * 
     */
    public int getMemCapacityMB() {
        return memCapacityMB;
    }

    /**
     * Sets the value of the memCapacityMB property.
     * 
     */
    public void setMemCapacityMB(int value) {
        this.memCapacityMB = value;
    }

    /**
     * Gets the value of the pMemAvailableMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPMemAvailableMB() {
        return pMemAvailableMB;
    }

    /**
     * Sets the value of the pMemAvailableMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPMemAvailableMB(Long value) {
        this.pMemAvailableMB = value;
    }

    /**
     * Gets the value of the pMemCapacityMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPMemCapacityMB() {
        return pMemCapacityMB;
    }

    /**
     * Sets the value of the pMemCapacityMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPMemCapacityMB(Long value) {
        this.pMemCapacityMB = value;
    }

    /**
     * Gets the value of the storageUsedMB property.
     * 
     */
    public long getStorageUsedMB() {
        return storageUsedMB;
    }

    /**
     * Sets the value of the storageUsedMB property.
     * 
     */
    public void setStorageUsedMB(long value) {
        this.storageUsedMB = value;
    }

    /**
     * Gets the value of the storageCapacityMB property.
     * 
     */
    public long getStorageCapacityMB() {
        return storageCapacityMB;
    }

    /**
     * Sets the value of the storageCapacityMB property.
     * 
     */
    public void setStorageCapacityMB(long value) {
        this.storageCapacityMB = value;
    }

}
