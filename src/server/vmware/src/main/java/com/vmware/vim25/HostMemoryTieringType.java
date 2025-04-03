
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostMemoryTieringType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostMemoryTieringType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="noTiering"/>
 *     <enumeration value="hardwareTiering"/>
 *     <enumeration value="softwareTiering"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostMemoryTieringType")
@XmlEnum
public enum HostMemoryTieringType {

    @XmlEnumValue("noTiering")
    NO_TIERING("noTiering"),
    @XmlEnumValue("hardwareTiering")
    HARDWARE_TIERING("hardwareTiering"),
    @XmlEnumValue("softwareTiering")
    SOFTWARE_TIERING("softwareTiering");
    private final String value;

    HostMemoryTieringType(String v) {
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
    public static HostMemoryTieringType fromValue(String v) {
        for (HostMemoryTieringType c: HostMemoryTieringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
