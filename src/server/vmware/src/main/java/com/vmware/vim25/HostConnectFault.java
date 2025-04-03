
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConnectFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConnectFault">
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
@XmlType(name = "HostConnectFault")
@XmlSeeAlso({
    AgentInstallFailed.class,
    AlreadyBeingManaged.class,
    AlreadyConnected.class,
    CannotAddHostWithFTVmAsStandalone.class,
    CannotAddHostWithFTVmToDifferentCluster.class,
    CannotAddHostWithFTVmToNonHACluster.class,
    GatewayConnectFault.class,
    MultipleCertificatesVerifyFault.class,
    NoHost.class,
    NoPermissionOnHost.class,
    NotSupportedHost.class,
    ReadHostResourcePoolTreeFailed.class,
    SSLDisabledFault.class,
    SSLVerifyFault.class,
    TooManyHosts.class
})
public class HostConnectFault
    extends VimFault
{


}
