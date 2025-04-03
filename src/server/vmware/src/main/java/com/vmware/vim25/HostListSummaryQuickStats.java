
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostListSummaryQuickStats complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostListSummaryQuickStats">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="overallCpuUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="overallMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="distributedCpuFairness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="distributedMemoryFairness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="availablePMemCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="uptime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostListSummaryQuickStats", propOrder = {
    "overallCpuUsage",
    "overallMemoryUsage",
    "distributedCpuFairness",
    "distributedMemoryFairness",
    "availablePMemCapacity",
    "uptime"
})
public class HostListSummaryQuickStats
    extends DynamicData
{

    protected Integer overallCpuUsage;
    protected Integer overallMemoryUsage;
    protected Integer distributedCpuFairness;
    protected Integer distributedMemoryFairness;
    protected Integer availablePMemCapacity;
    protected Integer uptime;

    /**
     * Gets the value of the overallCpuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallCpuUsage() {
        return overallCpuUsage;
    }

    /**
     * Sets the value of the overallCpuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallCpuUsage(Integer value) {
        this.overallCpuUsage = value;
    }

    /**
     * Gets the value of the overallMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallMemoryUsage() {
        return overallMemoryUsage;
    }

    /**
     * Sets the value of the overallMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallMemoryUsage(Integer value) {
        this.overallMemoryUsage = value;
    }

    /**
     * Gets the value of the distributedCpuFairness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributedCpuFairness() {
        return distributedCpuFairness;
    }

    /**
     * Sets the value of the distributedCpuFairness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributedCpuFairness(Integer value) {
        this.distributedCpuFairness = value;
    }

    /**
     * Gets the value of the distributedMemoryFairness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributedMemoryFairness() {
        return distributedMemoryFairness;
    }

    /**
     * Sets the value of the distributedMemoryFairness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributedMemoryFairness(Integer value) {
        this.distributedMemoryFairness = value;
    }

    /**
     * Gets the value of the availablePMemCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailablePMemCapacity() {
        return availablePMemCapacity;
    }

    /**
     * Sets the value of the availablePMemCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailablePMemCapacity(Integer value) {
        this.availablePMemCapacity = value;
    }

    /**
     * Gets the value of the uptime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUptime() {
        return uptime;
    }

    /**
     * Sets the value of the uptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUptime(Integer value) {
        this.uptime = value;
    }

}
