
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskVFlashCacheConfigInfoCacheMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskVFlashCacheConfigInfoCacheMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="write_thru"/>
 *     <enumeration value="write_back"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskVFlashCacheConfigInfoCacheMode")
@XmlEnum
public enum VirtualDiskVFlashCacheConfigInfoCacheMode {

    @XmlEnumValue("write_thru")
    WRITE_THRU("write_thru"),
    @XmlEnumValue("write_back")
    WRITE_BACK("write_back");
    private final String value;

    VirtualDiskVFlashCacheConfigInfoCacheMode(String v) {
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
    public static VirtualDiskVFlashCacheConfigInfoCacheMode fromValue(String v) {
        for (VirtualDiskVFlashCacheConfigInfoCacheMode c: VirtualDiskVFlashCacheConfigInfoCacheMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
