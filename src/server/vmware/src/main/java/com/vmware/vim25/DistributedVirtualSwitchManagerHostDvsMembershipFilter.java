
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchManagerHostDvsMembershipFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchManagerHostDvsMembershipFilter">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DistributedVirtualSwitchManagerHostDvsFilterSpec">
 *       <sequence>
 *         <element name="distributedVirtualSwitch" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostDvsMembershipFilter", propOrder = {
    "distributedVirtualSwitch"
})
public class DistributedVirtualSwitchManagerHostDvsMembershipFilter
    extends DistributedVirtualSwitchManagerHostDvsFilterSpec
{

    @XmlElement(required = true)
    protected ManagedObjectReference distributedVirtualSwitch;

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
