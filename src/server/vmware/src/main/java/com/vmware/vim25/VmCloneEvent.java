
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmCloneEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmCloneEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
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
@XmlType(name = "VmCloneEvent")
@XmlSeeAlso({
    VmBeingClonedEvent.class,
    VmBeingClonedNoFolderEvent.class,
    VmCloneFailedEvent.class,
    VmClonedEvent.class
})
public class VmCloneEvent
    extends VmEvent
{


}
