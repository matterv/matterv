
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineQuickStats complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineQuickStats">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="overallCpuUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="overallCpuDemand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="overallCpuReadiness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="guestMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="hostMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="guestHeartbeatStatus" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="distributedCpuEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="distributedMemoryEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="staticCpuEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="staticMemoryEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="grantedMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="privateMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sharedMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="swappedMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="balloonedMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="consumedOverheadMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ftLogBandwidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ftSecondaryLatency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ftLatencyStatus" type="{urn:internalvim25}ManagedEntityStatus" minOccurs="0"/>
 *         <element name="compressedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="uptimeSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ssdSwappedMemory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="activeMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="memoryTierStats" type="{urn:internalvim25}VirtualMachineQuickStatsMemoryTierStats" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineQuickStats", propOrder = {
    "overallCpuUsage",
    "overallCpuDemand",
    "overallCpuReadiness",
    "guestMemoryUsage",
    "hostMemoryUsage",
    "guestHeartbeatStatus",
    "distributedCpuEntitlement",
    "distributedMemoryEntitlement",
    "staticCpuEntitlement",
    "staticMemoryEntitlement",
    "grantedMemory",
    "privateMemory",
    "sharedMemory",
    "swappedMemory",
    "balloonedMemory",
    "consumedOverheadMemory",
    "ftLogBandwidth",
    "ftSecondaryLatency",
    "ftLatencyStatus",
    "compressedMemory",
    "uptimeSeconds",
    "ssdSwappedMemory",
    "activeMemory",
    "memoryTierStats"
})
public class VirtualMachineQuickStats
    extends DynamicData
{

    protected Integer overallCpuUsage;
    protected Integer overallCpuDemand;
    protected Integer overallCpuReadiness;
    protected Integer guestMemoryUsage;
    protected Integer hostMemoryUsage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus guestHeartbeatStatus;
    protected Integer distributedCpuEntitlement;
    protected Integer distributedMemoryEntitlement;
    protected Integer staticCpuEntitlement;
    protected Integer staticMemoryEntitlement;
    protected Integer grantedMemory;
    protected Integer privateMemory;
    protected Integer sharedMemory;
    protected Integer swappedMemory;
    protected Integer balloonedMemory;
    protected Integer consumedOverheadMemory;
    protected Integer ftLogBandwidth;
    protected Integer ftSecondaryLatency;
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus ftLatencyStatus;
    protected Long compressedMemory;
    protected Integer uptimeSeconds;
    protected Long ssdSwappedMemory;
    protected Integer activeMemory;
    protected List<VirtualMachineQuickStatsMemoryTierStats> memoryTierStats;

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
     * Gets the value of the overallCpuDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallCpuDemand() {
        return overallCpuDemand;
    }

    /**
     * Sets the value of the overallCpuDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallCpuDemand(Integer value) {
        this.overallCpuDemand = value;
    }

    /**
     * Gets the value of the overallCpuReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallCpuReadiness() {
        return overallCpuReadiness;
    }

    /**
     * Sets the value of the overallCpuReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallCpuReadiness(Integer value) {
        this.overallCpuReadiness = value;
    }

    /**
     * Gets the value of the guestMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestMemoryUsage() {
        return guestMemoryUsage;
    }

    /**
     * Sets the value of the guestMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestMemoryUsage(Integer value) {
        this.guestMemoryUsage = value;
    }

    /**
     * Gets the value of the hostMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostMemoryUsage() {
        return hostMemoryUsage;
    }

    /**
     * Sets the value of the hostMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostMemoryUsage(Integer value) {
        this.hostMemoryUsage = value;
    }

    /**
     * Gets the value of the guestHeartbeatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getGuestHeartbeatStatus() {
        return guestHeartbeatStatus;
    }

    /**
     * Sets the value of the guestHeartbeatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setGuestHeartbeatStatus(ManagedEntityStatus value) {
        this.guestHeartbeatStatus = value;
    }

    /**
     * Gets the value of the distributedCpuEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributedCpuEntitlement() {
        return distributedCpuEntitlement;
    }

    /**
     * Sets the value of the distributedCpuEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributedCpuEntitlement(Integer value) {
        this.distributedCpuEntitlement = value;
    }

    /**
     * Gets the value of the distributedMemoryEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributedMemoryEntitlement() {
        return distributedMemoryEntitlement;
    }

    /**
     * Sets the value of the distributedMemoryEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributedMemoryEntitlement(Integer value) {
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
     * Gets the value of the grantedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrantedMemory() {
        return grantedMemory;
    }

    /**
     * Sets the value of the grantedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrantedMemory(Integer value) {
        this.grantedMemory = value;
    }

    /**
     * Gets the value of the privateMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivateMemory() {
        return privateMemory;
    }

    /**
     * Sets the value of the privateMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivateMemory(Integer value) {
        this.privateMemory = value;
    }

    /**
     * Gets the value of the sharedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSharedMemory() {
        return sharedMemory;
    }

    /**
     * Sets the value of the sharedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSharedMemory(Integer value) {
        this.sharedMemory = value;
    }

    /**
     * Gets the value of the swappedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwappedMemory() {
        return swappedMemory;
    }

    /**
     * Sets the value of the swappedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwappedMemory(Integer value) {
        this.swappedMemory = value;
    }

    /**
     * Gets the value of the balloonedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalloonedMemory() {
        return balloonedMemory;
    }

    /**
     * Sets the value of the balloonedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalloonedMemory(Integer value) {
        this.balloonedMemory = value;
    }

    /**
     * Gets the value of the consumedOverheadMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumedOverheadMemory() {
        return consumedOverheadMemory;
    }

    /**
     * Sets the value of the consumedOverheadMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumedOverheadMemory(Integer value) {
        this.consumedOverheadMemory = value;
    }

    /**
     * Gets the value of the ftLogBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtLogBandwidth() {
        return ftLogBandwidth;
    }

    /**
     * Sets the value of the ftLogBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtLogBandwidth(Integer value) {
        this.ftLogBandwidth = value;
    }

    /**
     * Gets the value of the ftSecondaryLatency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtSecondaryLatency() {
        return ftSecondaryLatency;
    }

    /**
     * Sets the value of the ftSecondaryLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtSecondaryLatency(Integer value) {
        this.ftSecondaryLatency = value;
    }

    /**
     * Gets the value of the ftLatencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getFtLatencyStatus() {
        return ftLatencyStatus;
    }

    /**
     * Sets the value of the ftLatencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setFtLatencyStatus(ManagedEntityStatus value) {
        this.ftLatencyStatus = value;
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

    /**
     * Gets the value of the uptimeSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUptimeSeconds() {
        return uptimeSeconds;
    }

    /**
     * Sets the value of the uptimeSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUptimeSeconds(Integer value) {
        this.uptimeSeconds = value;
    }

    /**
     * Gets the value of the ssdSwappedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSsdSwappedMemory() {
        return ssdSwappedMemory;
    }

    /**
     * Sets the value of the ssdSwappedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSsdSwappedMemory(Long value) {
        this.ssdSwappedMemory = value;
    }

    /**
     * Gets the value of the activeMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveMemory() {
        return activeMemory;
    }

    /**
     * Sets the value of the activeMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveMemory(Integer value) {
        this.activeMemory = value;
    }

    /**
     * Gets the value of the memoryTierStats property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryTierStats property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMemoryTierStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineQuickStatsMemoryTierStats }
     * </p>
     * 
     * 
     * @return
     *     The value of the memoryTierStats property.
     */
    public List<VirtualMachineQuickStatsMemoryTierStats> getMemoryTierStats() {
        if (memoryTierStats == null) {
            memoryTierStats = new ArrayList<>();
        }
        return this.memoryTierStats;
    }

}
