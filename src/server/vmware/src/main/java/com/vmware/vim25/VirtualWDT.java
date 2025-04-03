
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualWDT complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualWDT">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="runOnBoot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="running" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDT", propOrder = {
    "runOnBoot",
    "running"
})
public class VirtualWDT
    extends VirtualDevice
{

    protected boolean runOnBoot;
    protected boolean running;

    /**
     * Gets the value of the runOnBoot property.
     * 
     */
    public boolean isRunOnBoot() {
        return runOnBoot;
    }

    /**
     * Sets the value of the runOnBoot property.
     * 
     */
    public void setRunOnBoot(boolean value) {
        this.runOnBoot = value;
    }

    /**
     * Gets the value of the running property.
     * 
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     */
    public void setRunning(boolean value) {
        this.running = value;
    }

}
