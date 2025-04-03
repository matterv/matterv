
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostInternetScsiHbaChapAuthenticationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostInternetScsiHbaChapAuthenticationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="chapProhibited"/>
 *     <enumeration value="chapDiscouraged"/>
 *     <enumeration value="chapPreferred"/>
 *     <enumeration value="chapRequired"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostInternetScsiHbaChapAuthenticationType")
@XmlEnum
public enum HostInternetScsiHbaChapAuthenticationType {

    @XmlEnumValue("chapProhibited")
    CHAP_PROHIBITED("chapProhibited"),
    @XmlEnumValue("chapDiscouraged")
    CHAP_DISCOURAGED("chapDiscouraged"),
    @XmlEnumValue("chapPreferred")
    CHAP_PREFERRED("chapPreferred"),
    @XmlEnumValue("chapRequired")
    CHAP_REQUIRED("chapRequired");
    private final String value;

    HostInternetScsiHbaChapAuthenticationType(String v) {
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
    public static HostInternetScsiHbaChapAuthenticationType fromValue(String v) {
        for (HostInternetScsiHbaChapAuthenticationType c: HostInternetScsiHbaChapAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
