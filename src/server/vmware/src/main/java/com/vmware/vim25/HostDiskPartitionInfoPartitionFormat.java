
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDiskPartitionInfoPartitionFormat</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDiskPartitionInfoPartitionFormat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="gpt"/>
 *     <enumeration value="mbr"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDiskPartitionInfoPartitionFormat")
@XmlEnum
public enum HostDiskPartitionInfoPartitionFormat {

    @XmlEnumValue("gpt")
    GPT("gpt"),
    @XmlEnumValue("mbr")
    MBR("mbr"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostDiskPartitionInfoPartitionFormat(String v) {
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
    public static HostDiskPartitionInfoPartitionFormat fromValue(String v) {
        for (HostDiskPartitionInfoPartitionFormat c: HostDiskPartitionInfoPartitionFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
