
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineAppHeartbeatStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineAppHeartbeatStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="appStatusGray"/>
 *     <enumeration value="appStatusGreen"/>
 *     <enumeration value="appStatusRed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineAppHeartbeatStatusType")
@XmlEnum
public enum VirtualMachineAppHeartbeatStatusType {

    @XmlEnumValue("appStatusGray")
    APP_STATUS_GRAY("appStatusGray"),
    @XmlEnumValue("appStatusGreen")
    APP_STATUS_GREEN("appStatusGreen"),
    @XmlEnumValue("appStatusRed")
    APP_STATUS_RED("appStatusRed");
    private final String value;

    VirtualMachineAppHeartbeatStatusType(String v) {
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
    public static VirtualMachineAppHeartbeatStatusType fromValue(String v) {
        for (VirtualMachineAppHeartbeatStatusType c: VirtualMachineAppHeartbeatStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
