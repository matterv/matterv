
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnlicensedVirtualMachinesEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnlicensedVirtualMachinesEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}LicenseEvent">
 *       <sequence>
 *         <element name="unlicensed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="available" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlicensedVirtualMachinesEvent", propOrder = {
    "unlicensed",
    "available"
})
public class UnlicensedVirtualMachinesEvent
    extends LicenseEvent
{

    protected int unlicensed;
    protected int available;

    /**
     * Gets the value of the unlicensed property.
     * 
     */
    public int getUnlicensed() {
        return unlicensed;
    }

    /**
     * Sets the value of the unlicensed property.
     * 
     */
    public void setUnlicensed(int value) {
        this.unlicensed = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public int getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(int value) {
        this.available = value;
    }

}
