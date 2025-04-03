
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineToolsStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineToolsStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="toolsNotInstalled"/>
 *     <enumeration value="toolsNotRunning"/>
 *     <enumeration value="toolsOld"/>
 *     <enumeration value="toolsOk"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineToolsStatus")
@XmlEnum
public enum VirtualMachineToolsStatus {

    @XmlEnumValue("toolsNotInstalled")
    TOOLS_NOT_INSTALLED("toolsNotInstalled"),
    @XmlEnumValue("toolsNotRunning")
    TOOLS_NOT_RUNNING("toolsNotRunning"),
    @XmlEnumValue("toolsOld")
    TOOLS_OLD("toolsOld"),
    @XmlEnumValue("toolsOk")
    TOOLS_OK("toolsOk");
    private final String value;

    VirtualMachineToolsStatus(String v) {
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
    public static VirtualMachineToolsStatus fromValue(String v) {
        for (VirtualMachineToolsStatus c: VirtualMachineToolsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
