
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VmFaultToleranceConfigIssueReasonForIssue</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VmFaultToleranceConfigIssueReasonForIssue">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="haNotEnabled"/>
 *     <enumeration value="moreThanOneSecondary"/>
 *     <enumeration value="recordReplayNotSupported"/>
 *     <enumeration value="replayNotSupported"/>
 *     <enumeration value="templateVm"/>
 *     <enumeration value="multipleVCPU"/>
 *     <enumeration value="hostInactive"/>
 *     <enumeration value="ftUnsupportedHardware"/>
 *     <enumeration value="ftUnsupportedProduct"/>
 *     <enumeration value="missingVMotionNic"/>
 *     <enumeration value="missingFTLoggingNic"/>
 *     <enumeration value="thinDisk"/>
 *     <enumeration value="verifySSLCertificateFlagNotSet"/>
 *     <enumeration value="hasSnapshots"/>
 *     <enumeration value="noConfig"/>
 *     <enumeration value="ftSecondaryVm"/>
 *     <enumeration value="hasLocalDisk"/>
 *     <enumeration value="esxAgentVm"/>
 *     <enumeration value="video3dEnabled"/>
 *     <enumeration value="hasUnsupportedDisk"/>
 *     <enumeration value="insufficientBandwidth"/>
 *     <enumeration value="hasNestedHVConfiguration"/>
 *     <enumeration value="hasVFlashConfiguration"/>
 *     <enumeration value="unsupportedProduct"/>
 *     <enumeration value="cpuHvUnsupported"/>
 *     <enumeration value="cpuHwmmuUnsupported"/>
 *     <enumeration value="cpuHvDisabled"/>
 *     <enumeration value="hasEFIFirmware"/>
 *     <enumeration value="tooManyVCPUs"/>
 *     <enumeration value="tooMuchMemory"/>
 *     <enumeration value="vMotionNotLicensed"/>
 *     <enumeration value="ftNotLicensed"/>
 *     <enumeration value="haAgentIssue"/>
 *     <enumeration value="unsupportedSPBM"/>
 *     <enumeration value="hasLinkedCloneDisk"/>
 *     <enumeration value="unsupportedPMemHAFailOver"/>
 *     <enumeration value="unsupportedEncryptedDisk"/>
 *     <enumeration value="ftMetroClusterNotEditable"/>
 *     <enumeration value="noHostGroupConfigured"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VmFaultToleranceConfigIssueReasonForIssue")
@XmlEnum
public enum VmFaultToleranceConfigIssueReasonForIssue {

    @XmlEnumValue("haNotEnabled")
    HA_NOT_ENABLED("haNotEnabled"),
    @XmlEnumValue("moreThanOneSecondary")
    MORE_THAN_ONE_SECONDARY("moreThanOneSecondary"),
    @XmlEnumValue("recordReplayNotSupported")
    RECORD_REPLAY_NOT_SUPPORTED("recordReplayNotSupported"),
    @XmlEnumValue("replayNotSupported")
    REPLAY_NOT_SUPPORTED("replayNotSupported"),
    @XmlEnumValue("templateVm")
    TEMPLATE_VM("templateVm"),
    @XmlEnumValue("multipleVCPU")
    MULTIPLE_VCPU("multipleVCPU"),
    @XmlEnumValue("hostInactive")
    HOST_INACTIVE("hostInactive"),
    @XmlEnumValue("ftUnsupportedHardware")
    FT_UNSUPPORTED_HARDWARE("ftUnsupportedHardware"),
    @XmlEnumValue("ftUnsupportedProduct")
    FT_UNSUPPORTED_PRODUCT("ftUnsupportedProduct"),
    @XmlEnumValue("missingVMotionNic")
    MISSING_V_MOTION_NIC("missingVMotionNic"),
    @XmlEnumValue("missingFTLoggingNic")
    MISSING_FT_LOGGING_NIC("missingFTLoggingNic"),
    @XmlEnumValue("thinDisk")
    THIN_DISK("thinDisk"),
    @XmlEnumValue("verifySSLCertificateFlagNotSet")
    VERIFY_SSL_CERTIFICATE_FLAG_NOT_SET("verifySSLCertificateFlagNotSet"),
    @XmlEnumValue("hasSnapshots")
    HAS_SNAPSHOTS("hasSnapshots"),
    @XmlEnumValue("noConfig")
    NO_CONFIG("noConfig"),
    @XmlEnumValue("ftSecondaryVm")
    FT_SECONDARY_VM("ftSecondaryVm"),
    @XmlEnumValue("hasLocalDisk")
    HAS_LOCAL_DISK("hasLocalDisk"),
    @XmlEnumValue("esxAgentVm")
    ESX_AGENT_VM("esxAgentVm"),
    @XmlEnumValue("video3dEnabled")
    VIDEO_3_D_ENABLED("video3dEnabled"),
    @XmlEnumValue("hasUnsupportedDisk")
    HAS_UNSUPPORTED_DISK("hasUnsupportedDisk"),
    @XmlEnumValue("insufficientBandwidth")
    INSUFFICIENT_BANDWIDTH("insufficientBandwidth"),
    @XmlEnumValue("hasNestedHVConfiguration")
    HAS_NESTED_HV_CONFIGURATION("hasNestedHVConfiguration"),
    @XmlEnumValue("hasVFlashConfiguration")
    HAS_V_FLASH_CONFIGURATION("hasVFlashConfiguration"),
    @XmlEnumValue("unsupportedProduct")
    UNSUPPORTED_PRODUCT("unsupportedProduct"),
    @XmlEnumValue("cpuHvUnsupported")
    CPU_HV_UNSUPPORTED("cpuHvUnsupported"),
    @XmlEnumValue("cpuHwmmuUnsupported")
    CPU_HWMMU_UNSUPPORTED("cpuHwmmuUnsupported"),
    @XmlEnumValue("cpuHvDisabled")
    CPU_HV_DISABLED("cpuHvDisabled"),
    @XmlEnumValue("hasEFIFirmware")
    HAS_EFI_FIRMWARE("hasEFIFirmware"),
    @XmlEnumValue("tooManyVCPUs")
    TOO_MANY_VCP_US("tooManyVCPUs"),
    @XmlEnumValue("tooMuchMemory")
    TOO_MUCH_MEMORY("tooMuchMemory"),
    @XmlEnumValue("vMotionNotLicensed")
    V_MOTION_NOT_LICENSED("vMotionNotLicensed"),
    @XmlEnumValue("ftNotLicensed")
    FT_NOT_LICENSED("ftNotLicensed"),
    @XmlEnumValue("haAgentIssue")
    HA_AGENT_ISSUE("haAgentIssue"),
    @XmlEnumValue("unsupportedSPBM")
    UNSUPPORTED_SPBM("unsupportedSPBM"),
    @XmlEnumValue("hasLinkedCloneDisk")
    HAS_LINKED_CLONE_DISK("hasLinkedCloneDisk"),
    @XmlEnumValue("unsupportedPMemHAFailOver")
    UNSUPPORTED_P_MEM_HA_FAIL_OVER("unsupportedPMemHAFailOver"),
    @XmlEnumValue("unsupportedEncryptedDisk")
    UNSUPPORTED_ENCRYPTED_DISK("unsupportedEncryptedDisk"),
    @XmlEnumValue("ftMetroClusterNotEditable")
    FT_METRO_CLUSTER_NOT_EDITABLE("ftMetroClusterNotEditable"),
    @XmlEnumValue("noHostGroupConfigured")
    NO_HOST_GROUP_CONFIGURED("noHostGroupConfigured");
    private final String value;

    VmFaultToleranceConfigIssueReasonForIssue(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static VmFaultToleranceConfigIssueReasonForIssue fromValue(String v) {
        for (VmFaultToleranceConfigIssueReasonForIssue c: VmFaultToleranceConfigIssueReasonForIssue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
