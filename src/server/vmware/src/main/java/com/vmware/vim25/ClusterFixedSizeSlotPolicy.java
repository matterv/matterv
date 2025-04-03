
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFixedSizeSlotPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFixedSizeSlotPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterSlotPolicy">
 *       <sequence>
 *         <element name="cpu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFixedSizeSlotPolicy", propOrder = {
    "cpu",
    "memory"
})
public class ClusterFixedSizeSlotPolicy
    extends ClusterSlotPolicy
{

    protected int cpu;
    protected int memory;

    /**
     * Gets the value of the cpu property.
     * 
     */
    public int getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     */
    public void setCpu(int value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     */
    public void setMemory(int value) {
        this.memory = value;
    }

}
