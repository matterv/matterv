
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NetIpStackInfoPreference</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NetIpStackInfoPreference">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="reserved"/>
 *     <enumeration value="low"/>
 *     <enumeration value="medium"/>
 *     <enumeration value="high"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetIpStackInfoPreference")
@XmlEnum
public enum NetIpStackInfoPreference {

    @XmlEnumValue("reserved")
    RESERVED("reserved"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("high")
    HIGH("high");
    private final String value;

    NetIpStackInfoPreference(String v) {
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
    public static NetIpStackInfoPreference fromValue(String v) {
        for (NetIpStackInfoPreference c: NetIpStackInfoPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
