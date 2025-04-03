
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDiskPartitionInfoType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDiskPartitionInfoType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="vmfs"/>
 *     <enumeration value="linuxNative"/>
 *     <enumeration value="linuxSwap"/>
 *     <enumeration value="extended"/>
 *     <enumeration value="ntfs"/>
 *     <enumeration value="vmkDiagnostic"/>
 *     <enumeration value="vffs"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDiskPartitionInfoType")
@XmlEnum
public enum HostDiskPartitionInfoType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("vmfs")
    VMFS("vmfs"),
    @XmlEnumValue("linuxNative")
    LINUX_NATIVE("linuxNative"),
    @XmlEnumValue("linuxSwap")
    LINUX_SWAP("linuxSwap"),
    @XmlEnumValue("extended")
    EXTENDED("extended"),
    @XmlEnumValue("ntfs")
    NTFS("ntfs"),
    @XmlEnumValue("vmkDiagnostic")
    VMK_DIAGNOSTIC("vmkDiagnostic"),
    @XmlEnumValue("vffs")
    VFFS("vffs");
    private final String value;

    HostDiskPartitionInfoType(String v) {
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
    public static HostDiskPartitionInfoType fromValue(String v) {
        for (HostDiskPartitionInfoType c: HostDiskPartitionInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
