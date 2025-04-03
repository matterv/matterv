
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VsanHostDecommissionModeObjectAction</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VsanHostDecommissionModeObjectAction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="noAction"/>
 *     <enumeration value="ensureObjectAccessibility"/>
 *     <enumeration value="evacuateAllData"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VsanHostDecommissionModeObjectAction")
@XmlEnum
public enum VsanHostDecommissionModeObjectAction {

    @XmlEnumValue("noAction")
    NO_ACTION("noAction"),
    @XmlEnumValue("ensureObjectAccessibility")
    ENSURE_OBJECT_ACCESSIBILITY("ensureObjectAccessibility"),
    @XmlEnumValue("evacuateAllData")
    EVACUATE_ALL_DATA("evacuateAllData");
    private final String value;

    VsanHostDecommissionModeObjectAction(String v) {
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
    public static VsanHostDecommissionModeObjectAction fromValue(String v) {
        for (VsanHostDecommissionModeObjectAction c: VsanHostDecommissionModeObjectAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
