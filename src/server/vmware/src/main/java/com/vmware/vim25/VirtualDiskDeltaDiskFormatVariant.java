
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskDeltaDiskFormatVariant</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskDeltaDiskFormatVariant">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmfsSparseVariant"/>
 *     <enumeration value="vsanSparseVariant"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskDeltaDiskFormatVariant")
@XmlEnum
public enum VirtualDiskDeltaDiskFormatVariant {

    @XmlEnumValue("vmfsSparseVariant")
    VMFS_SPARSE_VARIANT("vmfsSparseVariant"),
    @XmlEnumValue("vsanSparseVariant")
    VSAN_SPARSE_VARIANT("vsanSparseVariant");
    private final String value;

    VirtualDiskDeltaDiskFormatVariant(String v) {
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
    public static VirtualDiskDeltaDiskFormatVariant fromValue(String v) {
        for (VirtualDiskDeltaDiskFormatVariant c: VirtualDiskDeltaDiskFormatVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
