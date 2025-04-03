
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineFlagInfoVirtualExecUsage</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineFlagInfoVirtualExecUsage">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="hvAuto"/>
 *     <enumeration value="hvOn"/>
 *     <enumeration value="hvOff"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineFlagInfoVirtualExecUsage")
@XmlEnum
public enum VirtualMachineFlagInfoVirtualExecUsage {

    @XmlEnumValue("hvAuto")
    HV_AUTO("hvAuto"),
    @XmlEnumValue("hvOn")
    HV_ON("hvOn"),
    @XmlEnumValue("hvOff")
    HV_OFF("hvOff");
    private final String value;

    VirtualMachineFlagInfoVirtualExecUsage(String v) {
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
    public static VirtualMachineFlagInfoVirtualExecUsage fromValue(String v) {
        for (VirtualMachineFlagInfoVirtualExecUsage c: VirtualMachineFlagInfoVirtualExecUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
