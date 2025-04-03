
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NetIpConfigInfoIpAddressStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NetIpConfigInfoIpAddressStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="preferred"/>
 *     <enumeration value="deprecated"/>
 *     <enumeration value="invalid"/>
 *     <enumeration value="inaccessible"/>
 *     <enumeration value="unknown"/>
 *     <enumeration value="tentative"/>
 *     <enumeration value="duplicate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetIpConfigInfoIpAddressStatus")
@XmlEnum
public enum NetIpConfigInfoIpAddressStatus {

    @XmlEnumValue("preferred")
    PREFERRED("preferred"),
    @XmlEnumValue("deprecated")
    DEPRECATED("deprecated"),
    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("inaccessible")
    INACCESSIBLE("inaccessible"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate");
    private final String value;

    NetIpConfigInfoIpAddressStatus(String v) {
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
    public static NetIpConfigInfoIpAddressStatus fromValue(String v) {
        for (NetIpConfigInfoIpAddressStatus c: NetIpConfigInfoIpAddressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
