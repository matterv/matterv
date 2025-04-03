
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostPatchManagerReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostPatchManagerReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="obsoleted"/>
 *     <enumeration value="missingPatch"/>
 *     <enumeration value="missingLib"/>
 *     <enumeration value="hasDependentPatch"/>
 *     <enumeration value="conflictPatch"/>
 *     <enumeration value="conflictLib"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostPatchManagerReason")
@XmlEnum
public enum HostPatchManagerReason {

    @XmlEnumValue("obsoleted")
    OBSOLETED("obsoleted"),
    @XmlEnumValue("missingPatch")
    MISSING_PATCH("missingPatch"),
    @XmlEnumValue("missingLib")
    MISSING_LIB("missingLib"),
    @XmlEnumValue("hasDependentPatch")
    HAS_DEPENDENT_PATCH("hasDependentPatch"),
    @XmlEnumValue("conflictPatch")
    CONFLICT_PATCH("conflictPatch"),
    @XmlEnumValue("conflictLib")
    CONFLICT_LIB("conflictLib");
    private final String value;

    HostPatchManagerReason(String v) {
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
    public static HostPatchManagerReason fromValue(String v) {
        for (HostPatchManagerReason c: HostPatchManagerReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
