
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostNumericSensorType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostNumericSensorType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="fan"/>
 *     <enumeration value="power"/>
 *     <enumeration value="temperature"/>
 *     <enumeration value="voltage"/>
 *     <enumeration value="other"/>
 *     <enumeration value="processor"/>
 *     <enumeration value="memory"/>
 *     <enumeration value="storage"/>
 *     <enumeration value="systemBoard"/>
 *     <enumeration value="battery"/>
 *     <enumeration value="bios"/>
 *     <enumeration value="cable"/>
 *     <enumeration value="watchdog"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostNumericSensorType")
@XmlEnum
public enum HostNumericSensorType {

    @XmlEnumValue("fan")
    FAN("fan"),
    @XmlEnumValue("power")
    POWER("power"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("voltage")
    VOLTAGE("voltage"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("processor")
    PROCESSOR("processor"),
    @XmlEnumValue("memory")
    MEMORY("memory"),
    @XmlEnumValue("storage")
    STORAGE("storage"),
    @XmlEnumValue("systemBoard")
    SYSTEM_BOARD("systemBoard"),
    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("bios")
    BIOS("bios"),
    @XmlEnumValue("cable")
    CABLE("cable"),
    @XmlEnumValue("watchdog")
    WATCHDOG("watchdog");
    private final String value;

    HostNumericSensorType(String v) {
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
    public static HostNumericSensorType fromValue(String v) {
        for (HostNumericSensorType c: HostNumericSensorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
