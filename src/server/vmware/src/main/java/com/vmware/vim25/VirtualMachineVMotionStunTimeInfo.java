
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVMotionStunTimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVMotionStunTimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="migrationBW" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="stunTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMotionStunTimeInfo", propOrder = {
    "migrationBW",
    "stunTime"
})
public class VirtualMachineVMotionStunTimeInfo
    extends VirtualMachineTargetInfo
{

    protected long migrationBW;
    protected long stunTime;

    /**
     * Gets the value of the migrationBW property.
     * 
     */
    public long getMigrationBW() {
        return migrationBW;
    }

    /**
     * Sets the value of the migrationBW property.
     * 
     */
    public void setMigrationBW(long value) {
        this.migrationBW = value;
    }

    /**
     * Gets the value of the stunTime property.
     * 
     */
    public long getStunTime() {
        return stunTime;
    }

    /**
     * Sets the value of the stunTime property.
     * 
     */
    public void setStunTime(long value) {
        this.stunTime = value;
    }

}
