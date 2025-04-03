
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotEnoughLicenses complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotEnoughLicenses">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}RuntimeFault">
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
@XmlType(name = "NotEnoughLicenses")
@XmlSeeAlso({
    ExpiredFeatureLicense.class,
    FailToEnableSPBM.class,
    HostInventoryFull.class,
    InUseFeatureManipulationDisallowed.class,
    IncorrectHostInformation.class,
    InvalidEditionLicense.class,
    InventoryHasStandardAloneHosts.class,
    LicenseDowngradeDisallowed.class,
    LicenseExpired.class,
    LicenseKeyEntityMismatch.class,
    LicenseRestricted.class,
    LicenseSourceUnavailable.class,
    NoLicenseServerConfigured.class,
    VmLimitLicense.class,
    VramLimitLicense.class
})
public class NotEnoughLicenses
    extends RuntimeFault
{


}
