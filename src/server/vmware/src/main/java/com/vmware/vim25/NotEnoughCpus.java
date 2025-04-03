
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotEnoughCpus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotEnoughCpus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualHardwareCompatibilityIssue">
 *       <sequence>
 *         <element name="numCpuDest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numCpuVm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEnoughCpus", propOrder = {
    "numCpuDest",
    "numCpuVm"
})
@XmlSeeAlso({
    NotEnoughLogicalCpus.class
})
public class NotEnoughCpus
    extends VirtualHardwareCompatibilityIssue
{

    protected int numCpuDest;
    protected int numCpuVm;

    /**
     * Gets the value of the numCpuDest property.
     * 
     */
    public int getNumCpuDest() {
        return numCpuDest;
    }

    /**
     * Sets the value of the numCpuDest property.
     * 
     */
    public void setNumCpuDest(int value) {
        this.numCpuDest = value;
    }

    /**
     * Gets the value of the numCpuVm property.
     * 
     */
    public int getNumCpuVm() {
        return numCpuVm;
    }

    /**
     * Sets the value of the numCpuVm property.
     * 
     */
    public void setNumCpuVm(int value) {
        this.numCpuVm = value;
    }

}
