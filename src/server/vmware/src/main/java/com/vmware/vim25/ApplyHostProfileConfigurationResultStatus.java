
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ApplyHostProfileConfigurationResultStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApplyHostProfileConfigurationResultStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="success"/>
 *     <enumeration value="failed"/>
 *     <enumeration value="reboot_failed"/>
 *     <enumeration value="stateless_reboot_failed"/>
 *     <enumeration value="check_compliance_failed"/>
 *     <enumeration value="state_not_satisfied"/>
 *     <enumeration value="exit_maintenancemode_failed"/>
 *     <enumeration value="canceled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ApplyHostProfileConfigurationResultStatus")
@XmlEnum
public enum ApplyHostProfileConfigurationResultStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("reboot_failed")
    REBOOT_FAILED("reboot_failed"),
    @XmlEnumValue("stateless_reboot_failed")
    STATELESS_REBOOT_FAILED("stateless_reboot_failed"),
    @XmlEnumValue("check_compliance_failed")
    CHECK_COMPLIANCE_FAILED("check_compliance_failed"),
    @XmlEnumValue("state_not_satisfied")
    STATE_NOT_SATISFIED("state_not_satisfied"),
    @XmlEnumValue("exit_maintenancemode_failed")
    EXIT_MAINTENANCEMODE_FAILED("exit_maintenancemode_failed"),
    @XmlEnumValue("canceled")
    CANCELED("canceled");
    private final String value;

    ApplyHostProfileConfigurationResultStatus(String v) {
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
    public static ApplyHostProfileConfigurationResultStatus fromValue(String v) {
        for (ApplyHostProfileConfigurationResultStatus c: ApplyHostProfileConfigurationResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
