
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostCpuPackageVendor</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostCpuPackageVendor">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unknown"/>
 *     <enumeration value="intel"/>
 *     <enumeration value="amd"/>
 *     <enumeration value="hygon"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostCpuPackageVendor")
@XmlEnum
public enum HostCpuPackageVendor {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("intel")
    INTEL("intel"),
    @XmlEnumValue("amd")
    AMD("amd"),
    @XmlEnumValue("hygon")
    HYGON("hygon");
    private final String value;

    HostCpuPackageVendor(String v) {
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
    public static HostCpuPackageVendor fromValue(String v) {
        for (HostCpuPackageVendor c: HostCpuPackageVendor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
