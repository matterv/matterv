
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegacyNetworkInterfaceInUse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LegacyNetworkInterfaceInUse">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CannotAccessNetwork">
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
@XmlType(name = "LegacyNetworkInterfaceInUse")
public class LegacyNetworkInterfaceInUse
    extends CannotAccessNetwork
{


}
