
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ValidateMigrationTestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ValidateMigrationTestType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="sourceTests"/>
 *     <enumeration value="compatibilityTests"/>
 *     <enumeration value="diskAccessibilityTests"/>
 *     <enumeration value="resourceTests"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ValidateMigrationTestType")
@XmlEnum
public enum ValidateMigrationTestType {

    @XmlEnumValue("sourceTests")
    SOURCE_TESTS("sourceTests"),
    @XmlEnumValue("compatibilityTests")
    COMPATIBILITY_TESTS("compatibilityTests"),
    @XmlEnumValue("diskAccessibilityTests")
    DISK_ACCESSIBILITY_TESTS("diskAccessibilityTests"),
    @XmlEnumValue("resourceTests")
    RESOURCE_TESTS("resourceTests");
    private final String value;

    ValidateMigrationTestType(String v) {
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
    public static ValidateMigrationTestType fromValue(String v) {
        for (ValidateMigrationTestType c: ValidateMigrationTestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
