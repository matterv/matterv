
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScheduledHardwareUpgradeInfoHardwareUpgradeStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScheduledHardwareUpgradeInfoHardwareUpgradeStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="pending"/>
 *     <enumeration value="success"/>
 *     <enumeration value="failed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScheduledHardwareUpgradeInfoHardwareUpgradeStatus")
@XmlEnum
public enum ScheduledHardwareUpgradeInfoHardwareUpgradeStatus {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failed")
    FAILED("failed");
    private final String value;

    ScheduledHardwareUpgradeInfoHardwareUpgradeStatus(String v) {
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
    public static ScheduledHardwareUpgradeInfoHardwareUpgradeStatus fromValue(String v) {
        for (ScheduledHardwareUpgradeInfoHardwareUpgradeStatus c: ScheduledHardwareUpgradeInfoHardwareUpgradeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
