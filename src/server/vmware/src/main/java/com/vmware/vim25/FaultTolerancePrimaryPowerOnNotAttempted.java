
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultTolerancePrimaryPowerOnNotAttempted complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultTolerancePrimaryPowerOnNotAttempted">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmFaultToleranceIssue">
 *       <sequence>
 *         <element name="secondaryVm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="primaryVm" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultTolerancePrimaryPowerOnNotAttempted", propOrder = {
    "secondaryVm",
    "primaryVm"
})
public class FaultTolerancePrimaryPowerOnNotAttempted
    extends VmFaultToleranceIssue
{

    @XmlElement(required = true)
    protected ManagedObjectReference secondaryVm;
    @XmlElement(required = true)
    protected ManagedObjectReference primaryVm;

    /**
     * Gets the value of the secondaryVm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSecondaryVm() {
        return secondaryVm;
    }

    /**
     * Sets the value of the secondaryVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSecondaryVm(ManagedObjectReference value) {
        this.secondaryVm = value;
    }

    /**
     * Gets the value of the primaryVm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPrimaryVm() {
        return primaryVm;
    }

    /**
     * Sets the value of the primaryVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPrimaryVm(ManagedObjectReference value) {
        this.primaryVm = value;
    }

}
