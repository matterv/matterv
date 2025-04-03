
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostCapabilityVmDirectPathGen2UnsupportedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostCapabilityVmDirectPathGen2UnsupportedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="hostNptIncompatibleProduct"/>
 *     <enumeration value="hostNptIncompatibleHardware"/>
 *     <enumeration value="hostNptDisabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostCapabilityVmDirectPathGen2UnsupportedReason")
@XmlEnum
public enum HostCapabilityVmDirectPathGen2UnsupportedReason {

    @XmlEnumValue("hostNptIncompatibleProduct")
    HOST_NPT_INCOMPATIBLE_PRODUCT("hostNptIncompatibleProduct"),
    @XmlEnumValue("hostNptIncompatibleHardware")
    HOST_NPT_INCOMPATIBLE_HARDWARE("hostNptIncompatibleHardware"),
    @XmlEnumValue("hostNptDisabled")
    HOST_NPT_DISABLED("hostNptDisabled");
    private final String value;

    HostCapabilityVmDirectPathGen2UnsupportedReason(String v) {
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
    public static HostCapabilityVmDirectPathGen2UnsupportedReason fromValue(String v) {
        for (HostCapabilityVmDirectPathGen2UnsupportedReason c: HostCapabilityVmDirectPathGen2UnsupportedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
