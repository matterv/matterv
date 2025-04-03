
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TooManyDisksOnLegacyHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TooManyDisksOnLegacyHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="diskCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "TooManyDisksOnLegacyHost", propOrder = {
    "diskCount",
    "timeoutDanger"
})
public class TooManyDisksOnLegacyHost
    extends MigrationFault
{

    protected int diskCount;
    protected boolean timeoutDanger;

    /**
     * Gets the value of the diskCount property.
     * 
     */
    public int getDiskCount() {
        return diskCount;
    }

    /**
     * Sets the value of the diskCount property.
     * 
     */
    public void setDiskCount(int value) {
        this.diskCount = value;
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
