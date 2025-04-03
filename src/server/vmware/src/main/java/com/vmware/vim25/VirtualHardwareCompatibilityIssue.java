
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualHardwareCompatibilityIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualHardwareCompatibilityIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmConfigFault">
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
@XmlType(name = "VirtualHardwareCompatibilityIssue")
@XmlSeeAlso({
    DrsVmotionIncompatibleFault.class,
    CpuIncompatible.class,
    FeatureRequirementsNotMet.class,
    DiskNotSupported.class,
    MemorySizeNotRecommended.class,
    MemorySizeNotSupported.class,
    MemorySizeNotSupportedByDatastore.class,
    NotEnoughCpus.class,
    NumVirtualCoresPerSocketNotSupported.class,
    NumVirtualCpusNotSupported.class,
    StorageVmotionIncompatible.class,
    DeviceNotSupported.class,
    VirtualHardwareVersionNotSupported.class,
    WakeOnLanNotSupported.class
})
public class VirtualHardwareCompatibilityIssue
    extends VmConfigFault
{


}
