
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CannotAccessVmComponent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CannotAccessVmComponent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmConfigFault">
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
@XmlType(name = "CannotAccessVmComponent")
@XmlSeeAlso({
    CannotAccessVmConfig.class,
    CannotAccessVmDevice.class
})
public class CannotAccessVmComponent
    extends VmConfigFault
{


}
