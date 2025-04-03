
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostInternetScsiHbaStaticTargetTargetDiscoveryMethod</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostInternetScsiHbaStaticTargetTargetDiscoveryMethod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="staticMethod"/>
 *     <enumeration value="sendTargetMethod"/>
 *     <enumeration value="slpMethod"/>
 *     <enumeration value="isnsMethod"/>
 *     <enumeration value="unknownMethod"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostInternetScsiHbaStaticTargetTargetDiscoveryMethod")
@XmlEnum
public enum HostInternetScsiHbaStaticTargetTargetDiscoveryMethod {

    @XmlEnumValue("staticMethod")
    STATIC_METHOD("staticMethod"),
    @XmlEnumValue("sendTargetMethod")
    SEND_TARGET_METHOD("sendTargetMethod"),
    @XmlEnumValue("slpMethod")
    SLP_METHOD("slpMethod"),
    @XmlEnumValue("isnsMethod")
    ISNS_METHOD("isnsMethod"),
    @XmlEnumValue("unknownMethod")
    UNKNOWN_METHOD("unknownMethod");
    private final String value;

    HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(String v) {
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
    public static HostInternetScsiHbaStaticTargetTargetDiscoveryMethod fromValue(String v) {
        for (HostInternetScsiHbaStaticTargetTargetDiscoveryMethod c: HostInternetScsiHbaStaticTargetTargetDiscoveryMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
