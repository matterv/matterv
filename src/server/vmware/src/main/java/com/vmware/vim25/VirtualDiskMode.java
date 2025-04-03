
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="persistent"/>
 *     <enumeration value="nonpersistent"/>
 *     <enumeration value="undoable"/>
 *     <enumeration value="independent_persistent"/>
 *     <enumeration value="independent_nonpersistent"/>
 *     <enumeration value="append"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskMode")
@XmlEnum
public enum VirtualDiskMode {

    @XmlEnumValue("persistent")
    PERSISTENT("persistent"),
    @XmlEnumValue("nonpersistent")
    NONPERSISTENT("nonpersistent"),
    @XmlEnumValue("undoable")
    UNDOABLE("undoable"),
    @XmlEnumValue("independent_persistent")
    INDEPENDENT_PERSISTENT("independent_persistent"),
    @XmlEnumValue("independent_nonpersistent")
    INDEPENDENT_NONPERSISTENT("independent_nonpersistent"),
    @XmlEnumValue("append")
    APPEND("append");
    private final String value;

    VirtualDiskMode(String v) {
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
    public static VirtualDiskMode fromValue(String v) {
        for (VirtualDiskMode c: VirtualDiskMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
