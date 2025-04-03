
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterPowerOnVmOption</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterPowerOnVmOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OverrideAutomationLevel"/>
 *     <enumeration value="ReserveResources"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterPowerOnVmOption")
@XmlEnum
public enum ClusterPowerOnVmOption {

    @XmlEnumValue("OverrideAutomationLevel")
    OVERRIDE_AUTOMATION_LEVEL("OverrideAutomationLevel"),
    @XmlEnumValue("ReserveResources")
    RESERVE_RESOURCES("ReserveResources");
    private final String value;

    ClusterPowerOnVmOption(String v) {
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
    public static ClusterPowerOnVmOption fromValue(String v) {
        for (ClusterPowerOnVmOption c: ClusterPowerOnVmOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
