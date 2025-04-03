
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostNasVolumeSecurityType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostNasVolumeSecurityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTH_SYS"/>
 *     <enumeration value="SEC_KRB5"/>
 *     <enumeration value="SEC_KRB5I"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostNasVolumeSecurityType")
@XmlEnum
public enum HostNasVolumeSecurityType {

    AUTH_SYS("AUTH_SYS"),
    @XmlEnumValue("SEC_KRB5")
    SEC_KRB_5("SEC_KRB5"),
    @XmlEnumValue("SEC_KRB5I")
    SEC_KRB_5_I("SEC_KRB5I");
    private final String value;

    HostNasVolumeSecurityType(String v) {
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
    public static HostNasVolumeSecurityType fromValue(String v) {
        for (HostNasVolumeSecurityType c: HostNasVolumeSecurityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
