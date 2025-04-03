
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
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
@XmlType(name = "ReplicationFault")
@XmlSeeAlso({
    IncompatibleHostForVmReplication.class,
    ReplicationIncompatibleWithFT.class,
    ReplicationInvalidOptions.class,
    ReplicationNotSupportedOnHost.class,
    ReplicationConfigFault.class,
    ReplicationVmFault.class
})
public class ReplicationFault
    extends VimFault
{


}
