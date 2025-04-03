
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcePoolQuickStats complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResourcePoolQuickStats">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="overallCpuUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="overallCpuDemand" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="guestMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="hostMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="distributedCpuEntitlement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="distributedMemoryEntitlement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="staticCpuEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="staticMemoryEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="privateMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="sharedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="swappedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="balloonedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="overheadMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="consumedOverheadMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="compressedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolQuickStats", propOrder = {
    "overallCpuUsage",
    "overallCpuDemand",
    "guestMemoryUsage",
    "hostMemoryUsage",
    "distributedCpuEntitlement",
    "distributedMemoryEntitlement",
    "staticCpuEntitlement",
    "staticMemoryEntitlement",
    "privateMemory",
    "sharedMemory",
    "swappedMemory",
    "balloonedMemory",
    "overheadMemory",
    "consumedOverheadMemory",
    "compressedMemory"
})
public class ResourcePoolQuickStats
    extends DynamicData
{

    protected Long overallCpuUsage;
    protected Long overallCpuDemand;
    protected Long guestMemoryUsage;
    protected Long hostMemoryUsage;
    protected Long distributedCpuEntitlement;
    protected Long distributedMemoryEntitlement;
    protected Integer staticCpuEntitlement;
    protected Integer staticMemoryEntitlement;
    protected Long privateMemory;
    protected Long sharedMemory;
    protected Long swappedMemory;
    protected Long balloonedMemory;
    protected Long overheadMemory;
    protected Long consumedOverheadMemory;
    protected Long compressedMemory;

    /**
     * Gets the value of the overallCpuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverallCpuUsage() {
        return overallCpuUsage;
    }

    /**
     * Sets the value of the overallCpuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverallCpuUsage(Long value) {
        this.overallCpuUsage = value;
    }

    /**
     * Gets the value of the overallCpuDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverallCpuDemand() {
        return overallCpuDemand;
    }

    /**
     * Sets the value of the overallCpuDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverallCpuDemand(Long value) {
        this.overallCpuDemand = value;
    }

    /**
     * Gets the value of the guestMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestMemoryUsage() {
        return guestMemoryUsage;
    }

    /**
     * Sets the value of the guestMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestMemoryUsage(Long value) {
        this.guestMemoryUsage = value;
    }

    /**
     * Gets the value of the hostMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHostMemoryUsage() {
        return hostMemoryUsage;
    }

    /**
     * Sets the value of the hostMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHostMemoryUsage(Long value) {
        this.hostMemoryUsage = value;
    }

    /**
     * Gets the value of the distributedCpuEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistributedCpuEntitlement() {
        return distributedCpuEntitlement;
    }

    /**
     * Sets the value of the distributedCpuEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistributedCpuEntitlement(Long value) {
        this.distributedCpuEntitlement = value;
    }

    /**
     * Gets the value of the distributedMemoryEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistributedMemoryEntitlement() {
        return distributedMemoryEntitlement;
    }

    /**
     * Sets the value of the distributedMemoryEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistributedMemoryEntitlement(Long value) {
        this.distributedMemoryEntitlement = value;
    }

    /**
     * Gets the value of the staticCpuEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaticCpuEntitlement() {
        return staticCpuEntitlement;
    }

    /**
     * Sets the value of the staticCpuEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaticCpuEntitlement(Integer value) {
        this.staticCpuEntitlement = value;
    }

    /**
     * Gets the value of the staticMemoryEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaticMemoryEntitlement() {
        return staticMemoryEntitlement;
    }

    /**
     * Sets the value of the staticMemoryEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaticMemoryEntitlement(Integer value) {
        this.staticMemoryEntitlement = value;
    }

    /**
     * Gets the value of the privateMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrivateMemory() {
        return privateMemory;
    }

    /**
     * Sets the value of the privateMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrivateMemory(Long value) {
        this.privateMemory = value;
    }

    /**
     * Gets the value of the sharedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedMemory() {
        return sharedMemory;
    }

    /**
     * Sets the value of the sharedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedMemory(Long value) {
        this.sharedMemory = value;
    }

    /**
     * Gets the value of the swappedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwappedMemory() {
        return swappedMemory;
    }

    /**
     * Sets the value of the swappedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwappedMemory(Long value) {
        this.swappedMemory = value;
    }

    /**
     * Gets the value of the balloonedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalloonedMemory() {
        return balloonedMemory;
    }

    /**
     * Sets the value of the balloonedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalloonedMemory(Long value) {
        this.balloonedMemory = value;
    }

    /**
     * Gets the value of the overheadMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverheadMemory() {
        return overheadMemory;
    }

    /**
     * Sets the value of the overheadMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverheadMemory(Long value) {
        this.overheadMemory = value;
    }

    /**
     * Gets the value of the consumedOverheadMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumedOverheadMemory() {
        return consumedOverheadMemory;
    }

    /**
     * Sets the value of the consumedOverheadMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumedOverheadMemory(Long value) {
        this.consumedOverheadMemory = value;
    }

    /**
     * Gets the value of the compressedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompressedMemory() {
        return compressedMemory;
    }

    /**
     * Sets the value of the compressedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompressedMemory(Long value) {
        this.compressedMemory = value;
    }

}
