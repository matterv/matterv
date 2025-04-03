
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestOperationsFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestOperationsFault">
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
@XmlType(name = "GuestOperationsFault")
@XmlSeeAlso({
    GuestAuthenticationChallenge.class,
    GuestComponentsOutOfDate.class,
    GuestMultipleMappings.class,
    GuestOperationsUnavailable.class,
    GuestPermissionDenied.class,
    GuestProcessNotFound.class,
    GuestRegistryFault.class,
    InvalidGuestLogin.class,
    OperationDisabledByGuest.class,
    OperationNotSupportedByGuest.class,
    TooManyGuestLogons.class
})
public class GuestOperationsFault
    extends VimFault
{


}
