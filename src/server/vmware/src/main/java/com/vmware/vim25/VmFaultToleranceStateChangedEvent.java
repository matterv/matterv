
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmFaultToleranceStateChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmFaultToleranceStateChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="oldState" type="{urn:internalvim25}VirtualMachineFaultToleranceState"/>
 *         <element name="newState" type="{urn:internalvim25}VirtualMachineFaultToleranceState"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceStateChangedEvent", propOrder = {
    "oldState",
    "newState"
})
public class VmFaultToleranceStateChangedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachineFaultToleranceState oldState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachineFaultToleranceState newState;

    /**
     * Gets the value of the oldState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public VirtualMachineFaultToleranceState getOldState() {
        return oldState;
    }

    /**
     * Sets the value of the oldState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public void setOldState(VirtualMachineFaultToleranceState value) {
        this.oldState = value;
    }

    /**
     * Gets the value of the newState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public VirtualMachineFaultToleranceState getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineFaultToleranceState }
     *     
     */
    public void setNewState(VirtualMachineFaultToleranceState value) {
        this.newState = value;
    }

}
