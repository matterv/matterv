
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskDeltaDiskFormat</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskDeltaDiskFormat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="redoLogFormat"/>
 *     <enumeration value="nativeFormat"/>
 *     <enumeration value="seSparseFormat"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskDeltaDiskFormat")
@XmlEnum
public enum VirtualDiskDeltaDiskFormat {

    @XmlEnumValue("redoLogFormat")
    REDO_LOG_FORMAT("redoLogFormat"),
    @XmlEnumValue("nativeFormat")
    NATIVE_FORMAT("nativeFormat"),
    @XmlEnumValue("seSparseFormat")
    SE_SPARSE_FORMAT("seSparseFormat");
    private final String value;

    VirtualDiskDeltaDiskFormat(String v) {
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
    public static VirtualDiskDeltaDiskFormat fromValue(String v) {
        for (VirtualDiskDeltaDiskFormat c: VirtualDiskDeltaDiskFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
