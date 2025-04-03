
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="slots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots", propOrder = {
    "vm",
    "slots"
})
public class ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    protected int slots;

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the slots property.
     * 
     */
    public int getSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     */
    public void setSlots(int value) {
        this.slots = value;
    }

}
