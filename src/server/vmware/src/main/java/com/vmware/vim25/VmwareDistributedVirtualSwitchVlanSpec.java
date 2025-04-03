
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareDistributedVirtualSwitchVlanSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmwareDistributedVirtualSwitchVlanSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InheritablePolicy">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchVlanSpec")
@XmlSeeAlso({
    VmwareDistributedVirtualSwitchPvlanSpec.class,
    VmwareDistributedVirtualSwitchVlanIdSpec.class,
    VmwareDistributedVirtualSwitchTrunkVlanSpec.class
})
public class VmwareDistributedVirtualSwitchVlanSpec
    extends InheritablePolicy
{


}
