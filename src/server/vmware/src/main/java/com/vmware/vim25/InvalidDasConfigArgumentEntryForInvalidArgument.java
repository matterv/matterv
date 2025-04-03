
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for InvalidDasConfigArgumentEntryForInvalidArgument</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="InvalidDasConfigArgumentEntryForInvalidArgument">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="admissionControl"/>
 *     <enumeration value="userHeartbeatDs"/>
 *     <enumeration value="vmConfig"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvalidDasConfigArgumentEntryForInvalidArgument")
@XmlEnum
public enum InvalidDasConfigArgumentEntryForInvalidArgument {

    @XmlEnumValue("admissionControl")
    ADMISSION_CONTROL("admissionControl"),
    @XmlEnumValue("userHeartbeatDs")
    USER_HEARTBEAT_DS("userHeartbeatDs"),
    @XmlEnumValue("vmConfig")
    VM_CONFIG("vmConfig");
    private final String value;

    InvalidDasConfigArgumentEntryForInvalidArgument(String v) {
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
    public static InvalidDasConfigArgumentEntryForInvalidArgument fromValue(String v) {
        for (InvalidDasConfigArgumentEntryForInvalidArgument c: InvalidDasConfigArgumentEntryForInvalidArgument.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
