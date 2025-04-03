
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiDiskType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiDiskType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="native512"/>
 *     <enumeration value="emulated512"/>
 *     <enumeration value="native4k"/>
 *     <enumeration value="SoftwareEmulated4k"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiDiskType")
@XmlEnum
public enum ScsiDiskType {

    @XmlEnumValue("native512")
    NATIVE_512("native512"),
    @XmlEnumValue("emulated512")
    EMULATED_512("emulated512"),
    @XmlEnumValue("native4k")
    NATIVE_4_K("native4k"),
    @XmlEnumValue("SoftwareEmulated4k")
    SOFTWARE_EMULATED_4_K("SoftwareEmulated4k"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ScsiDiskType(String v) {
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
    public static ScsiDiskType fromValue(String v) {
        for (ScsiDiskType c: ScsiDiskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
