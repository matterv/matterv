
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CannotMoveVsanEnabledHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CannotMoveVsanEnabledHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanFault">
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
@XmlType(name = "CannotMoveVsanEnabledHost")
@XmlSeeAlso({
    DestinationVsanDisabled.class,
    VsanClusterUuidMismatch.class
})
public class CannotMoveVsanEnabledHost
    extends VsanFault
{


}
