
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIPassthroughPluginBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIPassthroughPluginBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
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
@XmlType(name = "VirtualPCIPassthroughPluginBackingInfo")
@XmlSeeAlso({
    VirtualPCIPassthroughVmiopBackingInfo.class
})
public class VirtualPCIPassthroughPluginBackingInfo
    extends VirtualDeviceBackingInfo
{


}
