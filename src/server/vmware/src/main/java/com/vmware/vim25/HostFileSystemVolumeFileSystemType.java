
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostFileSystemVolumeFileSystemType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostFileSystemVolumeFileSystemType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VMFS"/>
 *     <enumeration value="NFS"/>
 *     <enumeration value="NFS41"/>
 *     <enumeration value="CIFS"/>
 *     <enumeration value="vsan"/>
 *     <enumeration value="VFFS"/>
 *     <enumeration value="VVOL"/>
 *     <enumeration value="PMEM"/>
 *     <enumeration value="vsanD"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostFileSystemVolumeFileSystemType")
@XmlEnum
public enum HostFileSystemVolumeFileSystemType {

    VMFS("VMFS"),
    NFS("NFS"),
    @XmlEnumValue("NFS41")
    NFS_41("NFS41"),
    CIFS("CIFS"),
    @XmlEnumValue("vsan")
    VSAN("vsan"),
    VFFS("VFFS"),
    VVOL("VVOL"),
    PMEM("PMEM"),
    @XmlEnumValue("vsanD")
    VSAN_D("vsanD"),
    OTHER("OTHER");
    private final String value;

    HostFileSystemVolumeFileSystemType(String v) {
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
    public static HostFileSystemVolumeFileSystemType fromValue(String v) {
        for (HostFileSystemVolumeFileSystemType c: HostFileSystemVolumeFileSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
