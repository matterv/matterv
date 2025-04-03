
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDigestVerificationSetting</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDigestVerificationSetting">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="digestDisabled"/>
 *     <enumeration value="headerOnly"/>
 *     <enumeration value="dataOnly"/>
 *     <enumeration value="headerAndData"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDigestVerificationSetting")
@XmlEnum
public enum HostDigestVerificationSetting {

    @XmlEnumValue("digestDisabled")
    DIGEST_DISABLED("digestDisabled"),
    @XmlEnumValue("headerOnly")
    HEADER_ONLY("headerOnly"),
    @XmlEnumValue("dataOnly")
    DATA_ONLY("dataOnly"),
    @XmlEnumValue("headerAndData")
    HEADER_AND_DATA("headerAndData");
    private final String value;

    HostDigestVerificationSetting(String v) {
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
    public static HostDigestVerificationSetting fromValue(String v) {
        for (HostDigestVerificationSetting c: HostDigestVerificationSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
