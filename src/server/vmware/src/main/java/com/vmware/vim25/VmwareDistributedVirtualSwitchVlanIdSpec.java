
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareDistributedVirtualSwitchVlanIdSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmwareDistributedVirtualSwitchVlanIdSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmwareDistributedVirtualSwitchVlanSpec">
 *       <sequence>
 *         <element name="vlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchVlanIdSpec", propOrder = {
    "vlanId"
})
public class VmwareDistributedVirtualSwitchVlanIdSpec
    extends VmwareDistributedVirtualSwitchVlanSpec
{

    protected int vlanId;

    /**
     * Gets the value of the vlanId property.
     * 
     */
    public int getVlanId() {
        return vlanId;
    }

    /**
     * Sets the value of the vlanId property.
     * 
     */
    public void setVlanId(int value) {
        this.vlanId = value;
    }

}
