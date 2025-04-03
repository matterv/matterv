
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostReplayUnsupportedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostReplayUnsupportedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="incompatibleProduct"/>
 *     <enumeration value="incompatibleCpu"/>
 *     <enumeration value="hvDisabled"/>
 *     <enumeration value="cpuidLimitSet"/>
 *     <enumeration value="oldBIOS"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostReplayUnsupportedReason")
@XmlEnum
public enum HostReplayUnsupportedReason {

    @XmlEnumValue("incompatibleProduct")
    INCOMPATIBLE_PRODUCT("incompatibleProduct"),
    @XmlEnumValue("incompatibleCpu")
    INCOMPATIBLE_CPU("incompatibleCpu"),
    @XmlEnumValue("hvDisabled")
    HV_DISABLED("hvDisabled"),
    @XmlEnumValue("cpuidLimitSet")
    CPUID_LIMIT_SET("cpuidLimitSet"),
    @XmlEnumValue("oldBIOS")
    OLD_BIOS("oldBIOS"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostReplayUnsupportedReason(String v) {
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
    public static HostReplayUnsupportedReason fromValue(String v) {
        for (HostReplayUnsupportedReason c: HostReplayUnsupportedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
