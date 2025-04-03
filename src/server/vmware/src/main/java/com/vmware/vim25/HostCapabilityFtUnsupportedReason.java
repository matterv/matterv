
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostCapabilityFtUnsupportedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostCapabilityFtUnsupportedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vMotionNotLicensed"/>
 *     <enumeration value="missingVMotionNic"/>
 *     <enumeration value="missingFTLoggingNic"/>
 *     <enumeration value="ftNotLicensed"/>
 *     <enumeration value="haAgentIssue"/>
 *     <enumeration value="unsupportedProduct"/>
 *     <enumeration value="cpuHvUnsupported"/>
 *     <enumeration value="cpuHwmmuUnsupported"/>
 *     <enumeration value="cpuHvDisabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostCapabilityFtUnsupportedReason")
@XmlEnum
public enum HostCapabilityFtUnsupportedReason {

    @XmlEnumValue("vMotionNotLicensed")
    V_MOTION_NOT_LICENSED("vMotionNotLicensed"),
    @XmlEnumValue("missingVMotionNic")
    MISSING_V_MOTION_NIC("missingVMotionNic"),
    @XmlEnumValue("missingFTLoggingNic")
    MISSING_FT_LOGGING_NIC("missingFTLoggingNic"),
    @XmlEnumValue("ftNotLicensed")
    FT_NOT_LICENSED("ftNotLicensed"),
    @XmlEnumValue("haAgentIssue")
    HA_AGENT_ISSUE("haAgentIssue"),
    @XmlEnumValue("unsupportedProduct")
    UNSUPPORTED_PRODUCT("unsupportedProduct"),
    @XmlEnumValue("cpuHvUnsupported")
    CPU_HV_UNSUPPORTED("cpuHvUnsupported"),
    @XmlEnumValue("cpuHwmmuUnsupported")
    CPU_HWMMU_UNSUPPORTED("cpuHwmmuUnsupported"),
    @XmlEnumValue("cpuHvDisabled")
    CPU_HV_DISABLED("cpuHvDisabled");
    private final String value;

    HostCapabilityFtUnsupportedReason(String v) {
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
    public static HostCapabilityFtUnsupportedReason fromValue(String v) {
        for (HostCapabilityFtUnsupportedReason c: HostCapabilityFtUnsupportedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
