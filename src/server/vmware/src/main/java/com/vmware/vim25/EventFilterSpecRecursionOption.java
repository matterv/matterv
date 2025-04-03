
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EventFilterSpecRecursionOption</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EventFilterSpecRecursionOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="self"/>
 *     <enumeration value="children"/>
 *     <enumeration value="all"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFilterSpecRecursionOption")
@XmlEnum
public enum EventFilterSpecRecursionOption {

    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("children")
    CHILDREN("children"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    EventFilterSpecRecursionOption(String v) {
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
    public static EventFilterSpecRecursionOption fromValue(String v) {
        for (EventFilterSpecRecursionOption c: EventFilterSpecRecursionOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
