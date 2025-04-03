
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PhysicalNicVmDirectPathGen2SupportedMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PhysicalNicVmDirectPathGen2SupportedMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="upt"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PhysicalNicVmDirectPathGen2SupportedMode")
@XmlEnum
public enum PhysicalNicVmDirectPathGen2SupportedMode {

    @XmlEnumValue("upt")
    UPT("upt");
    private final String value;

    PhysicalNicVmDirectPathGen2SupportedMode(String v) {
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
    public static PhysicalNicVmDirectPathGen2SupportedMode fromValue(String v) {
        for (PhysicalNicVmDirectPathGen2SupportedMode c: PhysicalNicVmDirectPathGen2SupportedMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
