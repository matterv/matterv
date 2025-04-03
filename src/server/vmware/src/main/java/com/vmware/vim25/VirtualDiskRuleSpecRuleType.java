
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskRuleSpecRuleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskRuleSpecRuleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="affinity"/>
 *     <enumeration value="antiAffinity"/>
 *     <enumeration value="disabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskRuleSpecRuleType")
@XmlEnum
public enum VirtualDiskRuleSpecRuleType {

    @XmlEnumValue("affinity")
    AFFINITY("affinity"),
    @XmlEnumValue("antiAffinity")
    ANTI_AFFINITY("antiAffinity"),
    @XmlEnumValue("disabled")
    DISABLED("disabled");
    private final String value;

    VirtualDiskRuleSpecRuleType(String v) {
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
    public static VirtualDiskRuleSpecRuleType fromValue(String v) {
        for (VirtualDiskRuleSpecRuleType c: VirtualDiskRuleSpecRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
