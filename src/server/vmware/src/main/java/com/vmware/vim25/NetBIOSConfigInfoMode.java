
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NetBIOSConfigInfoMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NetBIOSConfigInfoMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unknown"/>
 *     <enumeration value="enabled"/>
 *     <enumeration value="disabled"/>
 *     <enumeration value="enabledViaDHCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetBIOSConfigInfoMode")
@XmlEnum
public enum NetBIOSConfigInfoMode {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("enabledViaDHCP")
    ENABLED_VIA_DHCP("enabledViaDHCP");
    private final String value;

    NetBIOSConfigInfoMode(String v) {
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
    public static NetBIOSConfigInfoMode fromValue(String v) {
        for (NetBIOSConfigInfoMode c: NetBIOSConfigInfoMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
