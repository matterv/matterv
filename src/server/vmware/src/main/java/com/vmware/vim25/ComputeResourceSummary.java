
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComputeResourceSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="totalCpu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numCpuCores" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="numCpuThreads" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="effectiveCpu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="effectiveMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numEffectiveHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="overallStatus" type="{urn:internalvim25}ManagedEntityStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceSummary", propOrder = {
    "totalCpu",
    "totalMemory",
    "numCpuCores",
    "numCpuThreads",
    "effectiveCpu",
    "effectiveMemory",
    "numHosts",
    "numEffectiveHosts",
    "overallStatus"
})
@XmlSeeAlso({
    ClusterComputeResourceSummary.class
})
public class ComputeResourceSummary
    extends DynamicData
{

    protected int totalCpu;
    protected long totalMemory;
    protected short numCpuCores;
    protected short numCpuThreads;
    protected int effectiveCpu;
    protected long effectiveMemory;
    protected int numHosts;
    protected int numEffectiveHosts;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus overallStatus;

    /**
     * Gets the value of the totalCpu property.
     * 
     */
    public int getTotalCpu() {
        return totalCpu;
    }

    /**
     * Sets the value of the totalCpu property.
     * 
     */
    public void setTotalCpu(int value) {
        this.totalCpu = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     */
    public long getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     */
    public void setTotalMemory(long value) {
        this.totalMemory = value;
    }

    /**
     * Gets the value of the numCpuCores property.
     * 
     */
    public short getNumCpuCores() {
        return numCpuCores;
    }

    /**
     * Sets the value of the numCpuCores property.
     * 
     */
    public void setNumCpuCores(short value) {
        this.numCpuCores = value;
    }

    /**
     * Gets the value of the numCpuThreads property.
     * 
     */
    public short getNumCpuThreads() {
        return numCpuThreads;
    }

    /**
     * Sets the value of the numCpuThreads property.
     * 
     */
    public void setNumCpuThreads(short value) {
        this.numCpuThreads = value;
    }

    /**
     * Gets the value of the effectiveCpu property.
     * 
     */
    public int getEffectiveCpu() {
        return effectiveCpu;
    }

    /**
     * Sets the value of the effectiveCpu property.
     * 
     */
    public void setEffectiveCpu(int value) {
        this.effectiveCpu = value;
    }

    /**
     * Gets the value of the effectiveMemory property.
     * 
     */
    public long getEffectiveMemory() {
        return effectiveMemory;
    }

    /**
     * Sets the value of the effectiveMemory property.
     * 
     */
    public void setEffectiveMemory(long value) {
        this.effectiveMemory = value;
    }

    /**
     * Gets the value of the numHosts property.
     * 
     */
    public int getNumHosts() {
        return numHosts;
    }

    /**
     * Sets the value of the numHosts property.
     * 
     */
    public void setNumHosts(int value) {
        this.numHosts = value;
    }

    /**
     * Gets the value of the numEffectiveHosts property.
     * 
     */
    public int getNumEffectiveHosts() {
        return numEffectiveHosts;
    }

    /**
     * Sets the value of the numEffectiveHosts property.
     * 
     */
    public void setNumEffectiveHosts(int value) {
        this.numEffectiveHosts = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setOverallStatus(ManagedEntityStatus value) {
        this.overallStatus = value;
    }

}
