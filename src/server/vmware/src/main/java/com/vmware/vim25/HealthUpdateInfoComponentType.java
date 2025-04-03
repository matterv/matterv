
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HealthUpdateInfoComponentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HealthUpdateInfoComponentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Memory"/>
 *     <enumeration value="Power"/>
 *     <enumeration value="Fan"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="Storage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HealthUpdateInfoComponentType")
@XmlEnum
public enum HealthUpdateInfoComponentType {

    @XmlEnumValue("Memory")
    MEMORY("Memory"),
    @XmlEnumValue("Power")
    POWER("Power"),
    @XmlEnumValue("Fan")
    FAN("Fan"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("Storage")
    STORAGE("Storage");
    private final String value;

    HealthUpdateInfoComponentType(String v) {
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
    public static HealthUpdateInfoComponentType fromValue(String v) {
        for (HealthUpdateInfoComponentType c: HealthUpdateInfoComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
