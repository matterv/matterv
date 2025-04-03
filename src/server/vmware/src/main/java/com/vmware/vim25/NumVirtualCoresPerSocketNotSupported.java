
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumVirtualCoresPerSocketNotSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NumVirtualCoresPerSocketNotSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualHardwareCompatibilityIssue">
 *       <sequence>
 *         <element name="maxSupportedCoresPerSocketDest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numCoresPerSocketVm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCoresPerSocketNotSupported", propOrder = {
    "maxSupportedCoresPerSocketDest",
    "numCoresPerSocketVm"
})
public class NumVirtualCoresPerSocketNotSupported
    extends VirtualHardwareCompatibilityIssue
{

    protected int maxSupportedCoresPerSocketDest;
    protected int numCoresPerSocketVm;

    /**
     * Gets the value of the maxSupportedCoresPerSocketDest property.
     * 
     */
    public int getMaxSupportedCoresPerSocketDest() {
        return maxSupportedCoresPerSocketDest;
    }

    /**
     * Sets the value of the maxSupportedCoresPerSocketDest property.
     * 
     */
    public void setMaxSupportedCoresPerSocketDest(int value) {
        this.maxSupportedCoresPerSocketDest = value;
    }

    /**
     * Gets the value of the numCoresPerSocketVm property.
     * 
     */
    public int getNumCoresPerSocketVm() {
        return numCoresPerSocketVm;
    }

    /**
     * Sets the value of the numCoresPerSocketVm property.
     * 
     */
    public void setNumCoresPerSocketVm(int value) {
        this.numCoresPerSocketVm = value;
    }

}
