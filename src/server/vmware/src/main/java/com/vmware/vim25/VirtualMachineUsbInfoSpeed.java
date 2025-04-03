
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineUsbInfoSpeed</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineUsbInfoSpeed">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="low"/>
 *     <enumeration value="full"/>
 *     <enumeration value="high"/>
 *     <enumeration value="superSpeed"/>
 *     <enumeration value="superSpeedPlus"/>
 *     <enumeration value="superSpeed20Gbps"/>
 *     <enumeration value="unknownSpeed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineUsbInfoSpeed")
@XmlEnum
public enum VirtualMachineUsbInfoSpeed {

    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("superSpeed")
    SUPER_SPEED("superSpeed"),
    @XmlEnumValue("superSpeedPlus")
    SUPER_SPEED_PLUS("superSpeedPlus"),
    @XmlEnumValue("superSpeed20Gbps")
    SUPER_SPEED_20_GBPS("superSpeed20Gbps"),
    @XmlEnumValue("unknownSpeed")
    UNKNOWN_SPEED("unknownSpeed");
    private final String value;

    VirtualMachineUsbInfoSpeed(String v) {
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
    public static VirtualMachineUsbInfoSpeed fromValue(String v) {
        for (VirtualMachineUsbInfoSpeed c: VirtualMachineUsbInfoSpeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
