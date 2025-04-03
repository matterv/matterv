
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SoftwarePackageConstraint</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SoftwarePackageConstraint">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="equals"/>
 *     <enumeration value="lessThan"/>
 *     <enumeration value="lessThanEqual"/>
 *     <enumeration value="greaterThanEqual"/>
 *     <enumeration value="greaterThan"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoftwarePackageConstraint")
@XmlEnum
public enum SoftwarePackageConstraint {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanEqual")
    LESS_THAN_EQUAL("lessThanEqual"),
    @XmlEnumValue("greaterThanEqual")
    GREATER_THAN_EQUAL("greaterThanEqual"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan");
    private final String value;

    SoftwarePackageConstraint(String v) {
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
    public static SoftwarePackageConstraint fromValue(String v) {
        for (SoftwarePackageConstraint c: SoftwarePackageConstraint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
