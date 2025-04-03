
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CannotPowerOffVmInClusterOperation</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CannotPowerOffVmInClusterOperation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="suspend"/>
 *     <enumeration value="powerOff"/>
 *     <enumeration value="guestShutdown"/>
 *     <enumeration value="guestSuspend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CannotPowerOffVmInClusterOperation")
@XmlEnum
public enum CannotPowerOffVmInClusterOperation {

    @XmlEnumValue("suspend")
    SUSPEND("suspend"),
    @XmlEnumValue("powerOff")
    POWER_OFF("powerOff"),
    @XmlEnumValue("guestShutdown")
    GUEST_SHUTDOWN("guestShutdown"),
    @XmlEnumValue("guestSuspend")
    GUEST_SUSPEND("guestSuspend");
    private final String value;

    CannotPowerOffVmInClusterOperation(String v) {
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
    public static CannotPowerOffVmInClusterOperation fromValue(String v) {
        for (CannotPowerOffVmInClusterOperation c: CannotPowerOffVmInClusterOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
