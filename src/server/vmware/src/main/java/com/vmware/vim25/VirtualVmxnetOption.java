
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnetOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVmxnetOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualEthernetCardOption">
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
@XmlType(name = "VirtualVmxnetOption")
@XmlSeeAlso({
    VirtualVmxnet2Option.class,
    VirtualVmxnet3Option.class
})
public class VirtualVmxnetOption
    extends VirtualEthernetCardOption
{


}
