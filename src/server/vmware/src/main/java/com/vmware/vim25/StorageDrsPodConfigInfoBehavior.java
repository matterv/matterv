
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for StorageDrsPodConfigInfoBehavior</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StorageDrsPodConfigInfoBehavior">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="manual"/>
 *     <enumeration value="automated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StorageDrsPodConfigInfoBehavior")
@XmlEnum
public enum StorageDrsPodConfigInfoBehavior {

    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("automated")
    AUTOMATED("automated");
    private final String value;

    StorageDrsPodConfigInfoBehavior(String v) {
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
    public static StorageDrsPodConfigInfoBehavior fromValue(String v) {
        for (StorageDrsPodConfigInfoBehavior c: StorageDrsPodConfigInfoBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
