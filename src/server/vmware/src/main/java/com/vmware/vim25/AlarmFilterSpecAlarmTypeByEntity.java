
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AlarmFilterSpecAlarmTypeByEntity</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AlarmFilterSpecAlarmTypeByEntity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="entityTypeAll"/>
 *     <enumeration value="entityTypeHost"/>
 *     <enumeration value="entityTypeVm"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AlarmFilterSpecAlarmTypeByEntity")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByEntity {

    @XmlEnumValue("entityTypeAll")
    ENTITY_TYPE_ALL("entityTypeAll"),
    @XmlEnumValue("entityTypeHost")
    ENTITY_TYPE_HOST("entityTypeHost"),
    @XmlEnumValue("entityTypeVm")
    ENTITY_TYPE_VM("entityTypeVm");
    private final String value;

    AlarmFilterSpecAlarmTypeByEntity(String v) {
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
    public static AlarmFilterSpecAlarmTypeByEntity fromValue(String v) {
        for (AlarmFilterSpecAlarmTypeByEntity c: AlarmFilterSpecAlarmTypeByEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
