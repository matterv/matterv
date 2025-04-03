
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiLunVStorageSupportStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiLunVStorageSupportStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vStorageSupported"/>
 *     <enumeration value="vStorageUnsupported"/>
 *     <enumeration value="vStorageUnknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiLunVStorageSupportStatus")
@XmlEnum
public enum ScsiLunVStorageSupportStatus {

    @XmlEnumValue("vStorageSupported")
    V_STORAGE_SUPPORTED("vStorageSupported"),
    @XmlEnumValue("vStorageUnsupported")
    V_STORAGE_UNSUPPORTED("vStorageUnsupported"),
    @XmlEnumValue("vStorageUnknown")
    V_STORAGE_UNKNOWN("vStorageUnknown");
    private final String value;

    ScsiLunVStorageSupportStatus(String v) {
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
    public static ScsiLunVStorageSupportStatus fromValue(String v) {
        for (ScsiLunVStorageSupportStatus c: ScsiLunVStorageSupportStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
