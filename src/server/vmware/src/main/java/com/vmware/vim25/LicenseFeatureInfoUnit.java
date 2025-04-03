
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LicenseFeatureInfoUnit</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseFeatureInfoUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="host"/>
 *     <enumeration value="cpuCore"/>
 *     <enumeration value="cpuPackage"/>
 *     <enumeration value="server"/>
 *     <enumeration value="vm"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseFeatureInfoUnit")
@XmlEnum
public enum LicenseFeatureInfoUnit {

    @XmlEnumValue("host")
    HOST("host"),
    @XmlEnumValue("cpuCore")
    CPU_CORE("cpuCore"),
    @XmlEnumValue("cpuPackage")
    CPU_PACKAGE("cpuPackage"),
    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("vm")
    VM("vm");
    private final String value;

    LicenseFeatureInfoUnit(String v) {
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
    public static LicenseFeatureInfoUnit fromValue(String v) {
        for (LicenseFeatureInfoUnit c: LicenseFeatureInfoUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
