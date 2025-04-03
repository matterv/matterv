
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadOnlyDisksWithLegacyDestination complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReadOnlyDisksWithLegacyDestination">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="roDiskCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="timeoutDanger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadOnlyDisksWithLegacyDestination", propOrder = {
    "roDiskCount",
    "timeoutDanger"
})
public class ReadOnlyDisksWithLegacyDestination
    extends MigrationFault
{

    protected int roDiskCount;
    protected boolean timeoutDanger;

    /**
     * Gets the value of the roDiskCount property.
     * 
     */
    public int getRoDiskCount() {
        return roDiskCount;
    }

    /**
     * Sets the value of the roDiskCount property.
     * 
     */
    public void setRoDiskCount(int value) {
        this.roDiskCount = value;
    }

    /**
     * Gets the value of the timeoutDanger property.
     * 
     */
    public boolean isTimeoutDanger() {
        return timeoutDanger;
    }

    /**
     * Sets the value of the timeoutDanger property.
     * 
     */
    public void setTimeoutDanger(boolean value) {
        this.timeoutDanger = value;
    }

}
