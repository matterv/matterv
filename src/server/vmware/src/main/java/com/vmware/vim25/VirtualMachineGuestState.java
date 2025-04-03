
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineGuestState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineGuestState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="running"/>
 *     <enumeration value="shuttingDown"/>
 *     <enumeration value="resetting"/>
 *     <enumeration value="standby"/>
 *     <enumeration value="notRunning"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineGuestState")
@XmlEnum
public enum VirtualMachineGuestState {

    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("shuttingDown")
    SHUTTING_DOWN("shuttingDown"),
    @XmlEnumValue("resetting")
    RESETTING("resetting"),
    @XmlEnumValue("standby")
    STANDBY("standby"),
    @XmlEnumValue("notRunning")
    NOT_RUNNING("notRunning"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VirtualMachineGuestState(String v) {
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
    public static VirtualMachineGuestState fromValue(String v) {
        for (VirtualMachineGuestState c: VirtualMachineGuestState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
