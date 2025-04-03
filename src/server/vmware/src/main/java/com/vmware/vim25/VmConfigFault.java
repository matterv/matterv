
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmConfigFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmConfigFault">
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
@XmlType(name = "VmConfigFault")
@XmlSeeAlso({
    CannotDisableSnapshot.class,
    CannotUseNetwork.class,
    CpuHotPlugNotSupported.class,
    DeltaDiskFormatNotSupported.class,
    EightHostLimitViolated.class,
    FaultToleranceCannotEditMem.class,
    FtVmHostRuleViolation.class,
    GenericVmConfigFault.class,
    InvalidFormat.class,
    LargeRDMNotSupportedOnDatastore.class,
    MemoryHotPlugNotSupported.class,
    NoCompatibleHardAffinityHost.class,
    NoCompatibleSoftAffinityHost.class,
    NumVirtualCpusIncompatible.class,
    OvfConsumerValidationFault.class,
    QuarantineModeFault.class,
    RDMNotSupportedOnDatastore.class,
    RuleViolation.class,
    SoftRuleVioCorrectionDisallowed.class,
    SoftRuleVioCorrectionImpact.class,
    UnsupportedDatastore.class,
    UnsupportedVmxLocation.class,
    VAppNotRunning.class,
    VAppPropertyFault.class,
    VFlashCacheHotConfigNotSupported.class,
    VFlashModuleNotSupported.class,
    CannotAccessVmComponent.class,
    VmConfigIncompatibleForFaultTolerance.class,
    VmConfigIncompatibleForRecordReplay.class,
    VmHostAffinityRuleViolation.class,
    InvalidVmConfig.class,
    VirtualHardwareCompatibilityIssue.class
})
public class VmConfigFault
    extends VimFault
{


}
