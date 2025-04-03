
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanFault">
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
@XmlType(name = "VsanFault")
@XmlSeeAlso({
    CannotChangeVsanClusterUuid.class,
    CannotChangeVsanNodeUuid.class,
    CannotReconfigureVsanWhenHaEnabled.class,
    DuplicateVsanNetworkInterface.class,
    CannotMoveVsanEnabledHost.class,
    VsanDiskFault.class
})
public class VsanFault
    extends VimFault
{


}
