
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ResourceConfigSpecScaleSharesBehavior</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ResourceConfigSpecScaleSharesBehavior">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="disabled"/>
 *     <enumeration value="scaleCpuAndMemoryShares"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResourceConfigSpecScaleSharesBehavior")
@XmlEnum
public enum ResourceConfigSpecScaleSharesBehavior {

    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("scaleCpuAndMemoryShares")
    SCALE_CPU_AND_MEMORY_SHARES("scaleCpuAndMemoryShares");
    private final String value;

    ResourceConfigSpecScaleSharesBehavior(String v) {
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
    public static ResourceConfigSpecScaleSharesBehavior fromValue(String v) {
        for (ResourceConfigSpecScaleSharesBehavior c: ResourceConfigSpecScaleSharesBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
