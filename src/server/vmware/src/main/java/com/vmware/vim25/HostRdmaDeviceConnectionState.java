
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostRdmaDeviceConnectionState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostRdmaDeviceConnectionState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unknown"/>
 *     <enumeration value="down"/>
 *     <enumeration value="init"/>
 *     <enumeration value="armed"/>
 *     <enumeration value="active"/>
 *     <enumeration value="activeDefer"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostRdmaDeviceConnectionState")
@XmlEnum
public enum HostRdmaDeviceConnectionState {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("init")
    INIT("init"),
    @XmlEnumValue("armed")
    ARMED("armed"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("activeDefer")
    ACTIVE_DEFER("activeDefer");
    private final String value;

    HostRdmaDeviceConnectionState(String v) {
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
    public static HostRdmaDeviceConnectionState fromValue(String v) {
        for (HostRdmaDeviceConnectionState c: HostRdmaDeviceConnectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
