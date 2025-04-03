
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostCpuSchedulerInfoCpuSchedulerPolicyInfo</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostCpuSchedulerInfoCpuSchedulerPolicyInfo">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="systemDefault"/>
 *     <enumeration value="scav1"/>
 *     <enumeration value="scav2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostCpuSchedulerInfoCpuSchedulerPolicyInfo")
@XmlEnum
public enum HostCpuSchedulerInfoCpuSchedulerPolicyInfo {

    @XmlEnumValue("systemDefault")
    SYSTEM_DEFAULT("systemDefault"),
    @XmlEnumValue("scav1")
    SCAV_1("scav1"),
    @XmlEnumValue("scav2")
    SCAV_2("scav2");
    private final String value;

    HostCpuSchedulerInfoCpuSchedulerPolicyInfo(String v) {
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
    public static HostCpuSchedulerInfoCpuSchedulerPolicyInfo fromValue(String v) {
        for (HostCpuSchedulerInfoCpuSchedulerPolicyInfo c: HostCpuSchedulerInfoCpuSchedulerPolicyInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
