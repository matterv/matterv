
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for GuestRegKeyWowSpec</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GuestRegKeyWowSpec">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WOWNative"/>
 *     <enumeration value="WOW32"/>
 *     <enumeration value="WOW64"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GuestRegKeyWowSpec")
@XmlEnum
public enum GuestRegKeyWowSpec {

    @XmlEnumValue("WOWNative")
    WOW_NATIVE("WOWNative"),
    @XmlEnumValue("WOW32")
    WOW_32("WOW32"),
    @XmlEnumValue("WOW64")
    WOW_64("WOW64");
    private final String value;

    GuestRegKeyWowSpec(String v) {
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
    public static GuestRegKeyWowSpec fromValue(String v) {
        for (GuestRegKeyWowSpec c: GuestRegKeyWowSpec.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
