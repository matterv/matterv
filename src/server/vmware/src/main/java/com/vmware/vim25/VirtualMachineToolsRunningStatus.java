
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineToolsRunningStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineToolsRunningStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="guestToolsNotRunning"/>
 *     <enumeration value="guestToolsRunning"/>
 *     <enumeration value="guestToolsExecutingScripts"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineToolsRunningStatus")
@XmlEnum
public enum VirtualMachineToolsRunningStatus {

    @XmlEnumValue("guestToolsNotRunning")
    GUEST_TOOLS_NOT_RUNNING("guestToolsNotRunning"),
    @XmlEnumValue("guestToolsRunning")
    GUEST_TOOLS_RUNNING("guestToolsRunning"),
    @XmlEnumValue("guestToolsExecutingScripts")
    GUEST_TOOLS_EXECUTING_SCRIPTS("guestToolsExecutingScripts");
    private final String value;

    VirtualMachineToolsRunningStatus(String v) {
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
    public static VirtualMachineToolsRunningStatus fromValue(String v) {
        for (VirtualMachineToolsRunningStatus c: VirtualMachineToolsRunningStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
