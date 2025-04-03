
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterUsageSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterUsageSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="totalCpuCapacityMhz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalMemCapacityMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="cpuReservationMhz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memReservationMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="poweredOffCpuReservationMhz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="poweredOffMemReservationMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="cpuDemandMhz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memDemandMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="statsGenNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cpuEntitledMhz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memEntitledMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="poweredOffVmCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalVmCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterUsageSummary", propOrder = {
    "totalCpuCapacityMhz",
    "totalMemCapacityMB",
    "cpuReservationMhz",
    "memReservationMB",
    "poweredOffCpuReservationMhz",
    "poweredOffMemReservationMB",
    "cpuDemandMhz",
    "memDemandMB",
    "statsGenNumber",
    "cpuEntitledMhz",
    "memEntitledMB",
    "poweredOffVmCount",
    "totalVmCount"
})
public class ClusterUsageSummary
    extends DynamicData
{

    protected int totalCpuCapacityMhz;
    protected int totalMemCapacityMB;
    protected int cpuReservationMhz;
    protected int memReservationMB;
    protected Integer poweredOffCpuReservationMhz;
    protected Integer poweredOffMemReservationMB;
    protected int cpuDemandMhz;
    protected int memDemandMB;
    protected long statsGenNumber;
    protected int cpuEntitledMhz;
    protected int memEntitledMB;
    protected int poweredOffVmCount;
    protected int totalVmCount;

    /**
     * Gets the value of the totalCpuCapacityMhz property.
     * 
     */
    public int getTotalCpuCapacityMhz() {
        return totalCpuCapacityMhz;
    }

    /**
     * Sets the value of the totalCpuCapacityMhz property.
     * 
     */
    public void setTotalCpuCapacityMhz(int value) {
        this.totalCpuCapacityMhz = value;
    }

    /**
     * Gets the value of the totalMemCapacityMB property.
     * 
     */
    public int getTotalMemCapacityMB() {
        return totalMemCapacityMB;
    }

    /**
     * Sets the value of the totalMemCapacityMB property.
     * 
     */
    public void setTotalMemCapacityMB(int value) {
        this.totalMemCapacityMB = value;
    }

    /**
     * Gets the value of the cpuReservationMhz property.
     * 
     */
    public int getCpuReservationMhz() {
        return cpuReservationMhz;
    }

    /**
     * Sets the value of the cpuReservationMhz property.
     * 
     */
    public void setCpuReservationMhz(int value) {
        this.cpuReservationMhz = value;
    }

    /**
     * Gets the value of the memReservationMB property.
     * 
     */
    public int getMemReservationMB() {
        return memReservationMB;
    }

    /**
     * Sets the value of the memReservationMB property.
     * 
     */
    public void setMemReservationMB(int value) {
        this.memReservationMB = value;
    }

    /**
     * Gets the value of the poweredOffCpuReservationMhz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoweredOffCpuReservationMhz() {
        return poweredOffCpuReservationMhz;
    }

    /**
     * Sets the value of the poweredOffCpuReservationMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoweredOffCpuReservationMhz(Integer value) {
        this.poweredOffCpuReservationMhz = value;
    }

    /**
     * Gets the value of the poweredOffMemReservationMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoweredOffMemReservationMB() {
        return poweredOffMemReservationMB;
    }

    /**
     * Sets the value of the poweredOffMemReservationMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoweredOffMemReservationMB(Integer value) {
        this.poweredOffMemReservationMB = value;
    }

    /**
     * Gets the value of the cpuDemandMhz property.
     * 
     */
    public int getCpuDemandMhz() {
        return cpuDemandMhz;
    }

    /**
     * Sets the value of the cpuDemandMhz property.
     * 
     */
    public void setCpuDemandMhz(int value) {
        this.cpuDemandMhz = value;
    }

    /**
     * Gets the value of the memDemandMB property.
     * 
     */
    public int getMemDemandMB() {
        return memDemandMB;
    }

    /**
     * Sets the value of the memDemandMB property.
     * 
     */
    public void setMemDemandMB(int value) {
        this.memDemandMB = value;
    }

    /**
     * Gets the value of the statsGenNumber property.
     * 
     */
    public long getStatsGenNumber() {
        return statsGenNumber;
    }

    /**
     * Sets the value of the statsGenNumber property.
     * 
     */
    public void setStatsGenNumber(long value) {
        this.statsGenNumber = value;
    }

    /**
     * Gets the value of the cpuEntitledMhz property.
     * 
     */
    public int getCpuEntitledMhz() {
        return cpuEntitledMhz;
    }

    /**
     * Sets the value of the cpuEntitledMhz property.
     * 
     */
    public void setCpuEntitledMhz(int value) {
        this.cpuEntitledMhz = value;
    }

    /**
     * Gets the value of the memEntitledMB property.
     * 
     */
    public int getMemEntitledMB() {
        return memEntitledMB;
    }

    /**
     * Sets the value of the memEntitledMB property.
     * 
     */
    public void setMemEntitledMB(int value) {
        this.memEntitledMB = value;
    }

    /**
     * Gets the value of the poweredOffVmCount property.
     * 
     */
    public int getPoweredOffVmCount() {
        return poweredOffVmCount;
    }

    /**
     * Sets the value of the poweredOffVmCount property.
     * 
     */
    public void setPoweredOffVmCount(int value) {
        this.poweredOffVmCount = value;
    }

    /**
     * Gets the value of the totalVmCount property.
     * 
     */
    public int getTotalVmCount() {
        return totalVmCount;
    }

    /**
     * Sets the value of the totalVmCount property.
     * 
     */
    public void setTotalVmCount(int value) {
        this.totalVmCount = value;
    }

}
