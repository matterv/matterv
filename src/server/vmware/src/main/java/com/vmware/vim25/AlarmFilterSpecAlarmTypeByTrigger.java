
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AlarmFilterSpecAlarmTypeByTrigger</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AlarmFilterSpecAlarmTypeByTrigger">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="triggerTypeAll"/>
 *     <enumeration value="triggerTypeEvent"/>
 *     <enumeration value="triggerTypeMetric"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AlarmFilterSpecAlarmTypeByTrigger")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByTrigger {

    @XmlEnumValue("triggerTypeAll")
    TRIGGER_TYPE_ALL("triggerTypeAll"),
    @XmlEnumValue("triggerTypeEvent")
    TRIGGER_TYPE_EVENT("triggerTypeEvent"),
    @XmlEnumValue("triggerTypeMetric")
    TRIGGER_TYPE_METRIC("triggerTypeMetric");
    private final String value;

    AlarmFilterSpecAlarmTypeByTrigger(String v) {
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
    public static AlarmFilterSpecAlarmTypeByTrigger fromValue(String v) {
        for (AlarmFilterSpecAlarmTypeByTrigger c: AlarmFilterSpecAlarmTypeByTrigger.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
