
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PlacementAffinityRuleRuleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PlacementAffinityRuleRuleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="affinity"/>
 *     <enumeration value="antiAffinity"/>
 *     <enumeration value="softAffinity"/>
 *     <enumeration value="softAntiAffinity"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PlacementAffinityRuleRuleType")
@XmlEnum
public enum PlacementAffinityRuleRuleType {

    @XmlEnumValue("affinity")
    AFFINITY("affinity"),
    @XmlEnumValue("antiAffinity")
    ANTI_AFFINITY("antiAffinity"),
    @XmlEnumValue("softAffinity")
    SOFT_AFFINITY("softAffinity"),
    @XmlEnumValue("softAntiAffinity")
    SOFT_ANTI_AFFINITY("softAntiAffinity");
    private final String value;

    PlacementAffinityRuleRuleType(String v) {
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
    public static PlacementAffinityRuleRuleType fromValue(String v) {
        for (PlacementAffinityRuleRuleType c: PlacementAffinityRuleRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
