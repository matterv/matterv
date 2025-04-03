
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ActionParameter</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActionParameter">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="targetName"/>
 *     <enumeration value="alarmName"/>
 *     <enumeration value="oldStatus"/>
 *     <enumeration value="newStatus"/>
 *     <enumeration value="triggeringSummary"/>
 *     <enumeration value="declaringSummary"/>
 *     <enumeration value="eventDescription"/>
 *     <enumeration value="target"/>
 *     <enumeration value="alarm"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionParameter")
@XmlEnum
public enum ActionParameter {

    @XmlEnumValue("targetName")
    TARGET_NAME("targetName"),
    @XmlEnumValue("alarmName")
    ALARM_NAME("alarmName"),
    @XmlEnumValue("oldStatus")
    OLD_STATUS("oldStatus"),
    @XmlEnumValue("newStatus")
    NEW_STATUS("newStatus"),
    @XmlEnumValue("triggeringSummary")
    TRIGGERING_SUMMARY("triggeringSummary"),
    @XmlEnumValue("declaringSummary")
    DECLARING_SUMMARY("declaringSummary"),
    @XmlEnumValue("eventDescription")
    EVENT_DESCRIPTION("eventDescription"),
    @XmlEnumValue("target")
    TARGET("target"),
    @XmlEnumValue("alarm")
    ALARM("alarm");
    private final String value;

    ActionParameter(String v) {
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
    public static ActionParameter fromValue(String v) {
        for (ActionParameter c: ActionParameter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
