
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for GuestInfoAppStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GuestInfoAppStateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="appStateOk"/>
 *     <enumeration value="appStateNeedReset"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GuestInfoAppStateType")
@XmlEnum
public enum GuestInfoAppStateType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("appStateOk")
    APP_STATE_OK("appStateOk"),
    @XmlEnumValue("appStateNeedReset")
    APP_STATE_NEED_RESET("appStateNeedReset");
    private final String value;

    GuestInfoAppStateType(String v) {
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
    public static GuestInfoAppStateType fromValue(String v) {
        for (GuestInfoAppStateType c: GuestInfoAppStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
