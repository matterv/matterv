
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numVcpus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="cpuMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memoryMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo", propOrder = {
    "numVcpus",
    "cpuMHz",
    "memoryMB"
})
public class ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo
    extends DynamicData
{

    protected int numVcpus;
    protected int cpuMHz;
    protected int memoryMB;

    /**
     * Gets the value of the numVcpus property.
     * 
     */
    public int getNumVcpus() {
        return numVcpus;
    }

    /**
     * Sets the value of the numVcpus property.
     * 
     */
    public void setNumVcpus(int value) {
        this.numVcpus = value;
    }

    /**
     * Gets the value of the cpuMHz property.
     * 
     */
    public int getCpuMHz() {
        return cpuMHz;
    }

    /**
     * Sets the value of the cpuMHz property.
     * 
     */
    public void setCpuMHz(int value) {
        this.cpuMHz = value;
    }

    /**
     * Gets the value of the memoryMB property.
     * 
     */
    public int getMemoryMB() {
        return memoryMB;
    }

    /**
     * Sets the value of the memoryMB property.
     * 
     */
    public void setMemoryMB(int value) {
        this.memoryMB = value;
    }

}
