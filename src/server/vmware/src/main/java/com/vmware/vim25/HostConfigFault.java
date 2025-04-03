
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConfigFault">
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
@XmlType(name = "HostConfigFault")
@XmlSeeAlso({
    AdminDisabled.class,
    AdminNotDisabled.class,
    BlockedByFirewall.class,
    ClockSkew.class,
    DisableAdminNotSupported.class,
    HostConfigFailed.class,
    HostInDomain.class,
    InvalidHostName.class,
    NoGateway.class,
    NasConfigFault.class,
    NoVirtualNic.class,
    PlatformConfigFault.class,
    VmfsMountFault.class
})
public class HostConfigFault
    extends VimFault
{


}
