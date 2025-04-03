
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemorySizeNotRecommended complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MemorySizeNotRecommended">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualHardwareCompatibilityIssue">
 *       <sequence>
 *         <element name="memorySizeMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="minMemorySizeMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxMemorySizeMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemorySizeNotRecommended", propOrder = {
    "memorySizeMB",
    "minMemorySizeMB",
    "maxMemorySizeMB"
})
public class MemorySizeNotRecommended
    extends VirtualHardwareCompatibilityIssue
{

    protected int memorySizeMB;
    protected int minMemorySizeMB;
    protected int maxMemorySizeMB;

    /**
     * Gets the value of the memorySizeMB property.
     * 
     */
    public int getMemorySizeMB() {
        return memorySizeMB;
    }

    /**
     * Sets the value of the memorySizeMB property.
     * 
     */
    public void setMemorySizeMB(int value) {
        this.memorySizeMB = value;
    }

    /**
     * Gets the value of the minMemorySizeMB property.
     * 
     */
    public int getMinMemorySizeMB() {
        return minMemorySizeMB;
    }

    /**
     * Sets the value of the minMemorySizeMB property.
     * 
     */
    public void setMinMemorySizeMB(int value) {
        this.minMemorySizeMB = value;
    }

    /**
     * Gets the value of the maxMemorySizeMB property.
     * 
     */
    public int getMaxMemorySizeMB() {
        return maxMemorySizeMB;
    }

    /**
     * Sets the value of the maxMemorySizeMB property.
     * 
     */
    public void setMaxMemorySizeMB(int value) {
        this.maxMemorySizeMB = value;
    }

}
