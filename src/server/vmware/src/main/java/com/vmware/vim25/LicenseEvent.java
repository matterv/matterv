
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
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
@XmlType(name = "LicenseEvent")
@XmlSeeAlso({
    ServerLicenseExpiredEvent.class,
    HostLicenseExpiredEvent.class,
    VMotionLicenseExpiredEvent.class,
    NoLicenseEvent.class,
    LicenseServerUnavailableEvent.class,
    LicenseServerAvailableEvent.class,
    InvalidEditionEvent.class,
    HostInventoryFullEvent.class,
    LicenseRestrictedEvent.class,
    IncorrectHostInformationEvent.class,
    UnlicensedVirtualMachinesEvent.class,
    UnlicensedVirtualMachinesFoundEvent.class,
    AllVirtualMachinesLicensedEvent.class,
    LicenseNonComplianceEvent.class
})
public class LicenseEvent
    extends Event
{


}
