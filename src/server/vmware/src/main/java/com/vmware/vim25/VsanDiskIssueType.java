
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VsanDiskIssueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VsanDiskIssueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="nonExist"/>
 *     <enumeration value="stampMismatch"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VsanDiskIssueType")
@XmlEnum
public enum VsanDiskIssueType {

    @XmlEnumValue("nonExist")
    NON_EXIST("nonExist"),
    @XmlEnumValue("stampMismatch")
    STAMP_MISMATCH("stampMismatch"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VsanDiskIssueType(String v) {
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
    public static VsanDiskIssueType fromValue(String v) {
        for (VsanDiskIssueType c: VsanDiskIssueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
