
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineFaultToleranceState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineFaultToleranceState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="notConfigured"/>
 *     <enumeration value="disabled"/>
 *     <enumeration value="enabled"/>
 *     <enumeration value="needSecondary"/>
 *     <enumeration value="starting"/>
 *     <enumeration value="running"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineFaultToleranceState")
@XmlEnum
public enum VirtualMachineFaultToleranceState {

    @XmlEnumValue("notConfigured")
    NOT_CONFIGURED("notConfigured"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("needSecondary")
    NEED_SECONDARY("needSecondary"),
    @XmlEnumValue("starting")
    STARTING("starting"),
    @XmlEnumValue("running")
    RUNNING("running");
    private final String value;

    VirtualMachineFaultToleranceState(String v) {
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
    public static VirtualMachineFaultToleranceState fromValue(String v) {
        for (VirtualMachineFaultToleranceState c: VirtualMachineFaultToleranceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
