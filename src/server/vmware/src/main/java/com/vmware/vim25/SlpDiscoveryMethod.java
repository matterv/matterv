
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SlpDiscoveryMethod</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SlpDiscoveryMethod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="slpDhcp"/>
 *     <enumeration value="slpAutoUnicast"/>
 *     <enumeration value="slpAutoMulticast"/>
 *     <enumeration value="slpManual"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SlpDiscoveryMethod")
@XmlEnum
public enum SlpDiscoveryMethod {

    @XmlEnumValue("slpDhcp")
    SLP_DHCP("slpDhcp"),
    @XmlEnumValue("slpAutoUnicast")
    SLP_AUTO_UNICAST("slpAutoUnicast"),
    @XmlEnumValue("slpAutoMulticast")
    SLP_AUTO_MULTICAST("slpAutoMulticast"),
    @XmlEnumValue("slpManual")
    SLP_MANUAL("slpManual");
    private final String value;

    SlpDiscoveryMethod(String v) {
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
    public static SlpDiscoveryMethod fromValue(String v) {
        for (SlpDiscoveryMethod c: SlpDiscoveryMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
