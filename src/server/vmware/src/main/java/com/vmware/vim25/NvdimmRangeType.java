
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NvdimmRangeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NvdimmRangeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="volatileRange"/>
 *     <enumeration value="persistentRange"/>
 *     <enumeration value="controlRange"/>
 *     <enumeration value="blockRange"/>
 *     <enumeration value="volatileVirtualDiskRange"/>
 *     <enumeration value="volatileVirtualCDRange"/>
 *     <enumeration value="persistentVirtualDiskRange"/>
 *     <enumeration value="persistentVirtualCDRange"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NvdimmRangeType")
@XmlEnum
public enum NvdimmRangeType {

    @XmlEnumValue("volatileRange")
    VOLATILE_RANGE("volatileRange"),
    @XmlEnumValue("persistentRange")
    PERSISTENT_RANGE("persistentRange"),
    @XmlEnumValue("controlRange")
    CONTROL_RANGE("controlRange"),
    @XmlEnumValue("blockRange")
    BLOCK_RANGE("blockRange"),
    @XmlEnumValue("volatileVirtualDiskRange")
    VOLATILE_VIRTUAL_DISK_RANGE("volatileVirtualDiskRange"),
    @XmlEnumValue("volatileVirtualCDRange")
    VOLATILE_VIRTUAL_CD_RANGE("volatileVirtualCDRange"),
    @XmlEnumValue("persistentVirtualDiskRange")
    PERSISTENT_VIRTUAL_DISK_RANGE("persistentVirtualDiskRange"),
    @XmlEnumValue("persistentVirtualCDRange")
    PERSISTENT_VIRTUAL_CD_RANGE("persistentVirtualCDRange");
    private final String value;

    NvdimmRangeType(String v) {
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
    public static NvdimmRangeType fromValue(String v) {
        for (NvdimmRangeType c: NvdimmRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
