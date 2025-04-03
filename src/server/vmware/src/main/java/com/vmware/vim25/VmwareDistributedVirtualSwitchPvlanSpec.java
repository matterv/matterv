
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareDistributedVirtualSwitchPvlanSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmwareDistributedVirtualSwitchPvlanSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmwareDistributedVirtualSwitchVlanSpec">
 *       <sequence>
 *         <element name="pvlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchPvlanSpec", propOrder = {
    "pvlanId"
})
public class VmwareDistributedVirtualSwitchPvlanSpec
    extends VmwareDistributedVirtualSwitchVlanSpec
{

    protected int pvlanId;

    /**
     * Gets the value of the pvlanId property.
     * 
     */
    public int getPvlanId() {
        return pvlanId;
    }

    /**
     * Sets the value of the pvlanId property.
     * 
     */
    public void setPvlanId(int value) {
        this.pvlanId = value;
    }

}
