
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationFault">
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
@XmlType(name = "CustomizationFault")
@XmlSeeAlso({
    CannotDecryptPasswords.class,
    CustomizationPending.class,
    IpHostnameGeneratorError.class,
    LinuxVolumeNotClean.class,
    MissingLinuxCustResources.class,
    MissingWindowsCustResources.class,
    MountError.class,
    NicSettingMismatch.class,
    NoDisksToCustomize.class,
    UncustomizableGuest.class,
    UnexpectedCustomizationFault.class,
    VolumeEditorError.class
})
public class CustomizationFault
    extends VimFault
{


}
