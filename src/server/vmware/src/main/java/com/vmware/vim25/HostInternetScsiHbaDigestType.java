
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostInternetScsiHbaDigestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostInternetScsiHbaDigestType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="digestProhibited"/>
 *     <enumeration value="digestDiscouraged"/>
 *     <enumeration value="digestPreferred"/>
 *     <enumeration value="digestRequired"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostInternetScsiHbaDigestType")
@XmlEnum
public enum HostInternetScsiHbaDigestType {

    @XmlEnumValue("digestProhibited")
    DIGEST_PROHIBITED("digestProhibited"),
    @XmlEnumValue("digestDiscouraged")
    DIGEST_DISCOURAGED("digestDiscouraged"),
    @XmlEnumValue("digestPreferred")
    DIGEST_PREFERRED("digestPreferred"),
    @XmlEnumValue("digestRequired")
    DIGEST_REQUIRED("digestRequired");
    private final String value;

    HostInternetScsiHbaDigestType(String v) {
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
    public static HostInternetScsiHbaDigestType fromValue(String v) {
        for (HostInternetScsiHbaDigestType c: HostInternetScsiHbaDigestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
