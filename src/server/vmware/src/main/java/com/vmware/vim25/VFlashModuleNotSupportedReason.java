
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VFlashModuleNotSupportedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VFlashModuleNotSupportedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CacheModeNotSupported"/>
 *     <enumeration value="CacheConsistencyTypeNotSupported"/>
 *     <enumeration value="CacheBlockSizeNotSupported"/>
 *     <enumeration value="CacheReservationNotSupported"/>
 *     <enumeration value="DiskSizeNotSupported"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VFlashModuleNotSupportedReason")
@XmlEnum
public enum VFlashModuleNotSupportedReason {

    @XmlEnumValue("CacheModeNotSupported")
    CACHE_MODE_NOT_SUPPORTED("CacheModeNotSupported"),
    @XmlEnumValue("CacheConsistencyTypeNotSupported")
    CACHE_CONSISTENCY_TYPE_NOT_SUPPORTED("CacheConsistencyTypeNotSupported"),
    @XmlEnumValue("CacheBlockSizeNotSupported")
    CACHE_BLOCK_SIZE_NOT_SUPPORTED("CacheBlockSizeNotSupported"),
    @XmlEnumValue("CacheReservationNotSupported")
    CACHE_RESERVATION_NOT_SUPPORTED("CacheReservationNotSupported"),
    @XmlEnumValue("DiskSizeNotSupported")
    DISK_SIZE_NOT_SUPPORTED("DiskSizeNotSupported");
    private final String value;

    VFlashModuleNotSupportedReason(String v) {
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
    public static VFlashModuleNotSupportedReason fromValue(String v) {
        for (VFlashModuleNotSupportedReason c: VFlashModuleNotSupportedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
