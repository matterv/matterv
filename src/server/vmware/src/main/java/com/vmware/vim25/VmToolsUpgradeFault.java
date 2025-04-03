
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmToolsUpgradeFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmToolsUpgradeFault">
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
@XmlType(name = "VmToolsUpgradeFault")
@XmlSeeAlso({
    ToolsAlreadyUpgraded.class,
    ToolsAutoUpgradeNotSupported.class,
    ToolsImageCopyFailed.class,
    ToolsImageNotAvailable.class,
    ToolsImageSignatureCheckFailed.class,
    ToolsUpgradeCancelled.class
})
public class VmToolsUpgradeFault
    extends VimFault
{


}
