
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidPowerState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidPowerState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidState">
 *       <sequence>
 *         <element name="requestedState" type="{urn:internalvim25}VirtualMachinePowerState" minOccurs="0"/>
 *         <element name="existingState" type="{urn:internalvim25}VirtualMachinePowerState"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidPowerState", propOrder = {
    "requestedState",
    "existingState"
})
public class InvalidPowerState
    extends InvalidState
{

    @XmlSchemaType(name = "string")
    protected VirtualMachinePowerState requestedState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachinePowerState existingState;

    /**
     * Gets the value of the requestedState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public VirtualMachinePowerState getRequestedState() {
        return requestedState;
    }

    /**
     * Sets the value of the requestedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public void setRequestedState(VirtualMachinePowerState value) {
        this.requestedState = value;
    }

    /**
     * Gets the value of the existingState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public VirtualMachinePowerState getExistingState() {
        return existingState;
    }

    /**
     * Sets the value of the existingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public void setExistingState(VirtualMachinePowerState value) {
        this.existingState = value;
    }

}
