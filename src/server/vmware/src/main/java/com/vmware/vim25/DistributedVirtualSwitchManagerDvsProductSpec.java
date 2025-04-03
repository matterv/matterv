
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchManagerDvsProductSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchManagerDvsProductSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="newSwitchProductSpec" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec" minOccurs="0"/>
 *         <element name="distributedVirtualSwitch" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerDvsProductSpec", propOrder = {
    "newSwitchProductSpec",
    "distributedVirtualSwitch"
})
public class DistributedVirtualSwitchManagerDvsProductSpec
    extends DynamicData
{

    protected DistributedVirtualSwitchProductSpec newSwitchProductSpec;
    protected ManagedObjectReference distributedVirtualSwitch;

    /**
     * Gets the value of the newSwitchProductSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getNewSwitchProductSpec() {
        return newSwitchProductSpec;
    }

    /**
     * Sets the value of the newSwitchProductSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setNewSwitchProductSpec(DistributedVirtualSwitchProductSpec value) {
        this.newSwitchProductSpec = value;
    }

    /**
     * Gets the value of the distributedVirtualSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }

    /**
     * Sets the value of the distributedVirtualSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDistributedVirtualSwitch(ManagedObjectReference value) {
        this.distributedVirtualSwitch = value;
    }

}
