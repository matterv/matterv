
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostUnresolvedVmfsExtentUnresolvedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostUnresolvedVmfsExtentUnresolvedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="diskIdMismatch"/>
 *     <enumeration value="uuidConflict"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostUnresolvedVmfsExtentUnresolvedReason")
@XmlEnum
public enum HostUnresolvedVmfsExtentUnresolvedReason {

    @XmlEnumValue("diskIdMismatch")
    DISK_ID_MISMATCH("diskIdMismatch"),
    @XmlEnumValue("uuidConflict")
    UUID_CONFLICT("uuidConflict");
    private final String value;

    HostUnresolvedVmfsExtentUnresolvedReason(String v) {
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
    public static HostUnresolvedVmfsExtentUnresolvedReason fromValue(String v) {
        for (HostUnresolvedVmfsExtentUnresolvedReason c: HostUnresolvedVmfsExtentUnresolvedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
