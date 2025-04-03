
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmFaultToleranceIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmFaultToleranceIssue">
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
@XmlType(name = "VmFaultToleranceIssue")
@XmlSeeAlso({
    CannotChangeDrsBehaviorForFtSecondary.class,
    CannotChangeHaSettingsForFtSecondary.class,
    CannotComputeFTCompatibleHosts.class,
    FaultToleranceNotLicensed.class,
    FaultTolerancePrimaryPowerOnNotAttempted.class,
    FtIssuesOnHost.class,
    HostIncompatibleForFaultTolerance.class,
    IncompatibleHostForFtSecondary.class,
    InvalidOperationOnSecondaryVm.class,
    NoHostSuitableForFtSecondary.class,
    NotSupportedDeviceForFT.class,
    PowerOnFtSecondaryFailed.class,
    SecondaryVmAlreadyDisabled.class,
    SecondaryVmAlreadyEnabled.class,
    SecondaryVmAlreadyRegistered.class,
    SecondaryVmNotRegistered.class,
    VmFaultToleranceConfigIssue.class,
    VmFaultToleranceConfigIssueWrapper.class,
    VmFaultToleranceInvalidFileBacking.class,
    VmFaultToleranceOpIssuesList.class
})
public class VmFaultToleranceIssue
    extends VimFault
{


}
