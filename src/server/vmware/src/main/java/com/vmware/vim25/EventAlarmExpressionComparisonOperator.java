
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EventAlarmExpressionComparisonOperator</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EventAlarmExpressionComparisonOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="equals"/>
 *     <enumeration value="notEqualTo"/>
 *     <enumeration value="startsWith"/>
 *     <enumeration value="doesNotStartWith"/>
 *     <enumeration value="endsWith"/>
 *     <enumeration value="doesNotEndWith"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventAlarmExpressionComparisonOperator")
@XmlEnum
public enum EventAlarmExpressionComparisonOperator {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("notEqualTo")
    NOT_EQUAL_TO("notEqualTo"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith"),
    @XmlEnumValue("doesNotStartWith")
    DOES_NOT_START_WITH("doesNotStartWith"),
    @XmlEnumValue("endsWith")
    ENDS_WITH("endsWith"),
    @XmlEnumValue("doesNotEndWith")
    DOES_NOT_END_WITH("doesNotEndWith");
    private final String value;

    EventAlarmExpressionComparisonOperator(String v) {
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
    public static EventAlarmExpressionComparisonOperator fromValue(String v) {
        for (EventAlarmExpressionComparisonOperator c: EventAlarmExpressionComparisonOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
