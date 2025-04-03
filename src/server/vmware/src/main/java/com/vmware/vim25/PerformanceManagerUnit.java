
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PerformanceManagerUnit</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PerformanceManagerUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="percent"/>
 *     <enumeration value="kiloBytes"/>
 *     <enumeration value="megaBytes"/>
 *     <enumeration value="megaHertz"/>
 *     <enumeration value="number"/>
 *     <enumeration value="microsecond"/>
 *     <enumeration value="millisecond"/>
 *     <enumeration value="second"/>
 *     <enumeration value="kiloBytesPerSecond"/>
 *     <enumeration value="megaBytesPerSecond"/>
 *     <enumeration value="watt"/>
 *     <enumeration value="joule"/>
 *     <enumeration value="teraBytes"/>
 *     <enumeration value="celsius"/>
 *     <enumeration value="nanosecond"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerformanceManagerUnit")
@XmlEnum
public enum PerformanceManagerUnit {

    @XmlEnumValue("percent")
    PERCENT("percent"),
    @XmlEnumValue("kiloBytes")
    KILO_BYTES("kiloBytes"),
    @XmlEnumValue("megaBytes")
    MEGA_BYTES("megaBytes"),
    @XmlEnumValue("megaHertz")
    MEGA_HERTZ("megaHertz"),
    @XmlEnumValue("number")
    NUMBER("number"),
    @XmlEnumValue("microsecond")
    MICROSECOND("microsecond"),
    @XmlEnumValue("millisecond")
    MILLISECOND("millisecond"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("kiloBytesPerSecond")
    KILO_BYTES_PER_SECOND("kiloBytesPerSecond"),
    @XmlEnumValue("megaBytesPerSecond")
    MEGA_BYTES_PER_SECOND("megaBytesPerSecond"),
    @XmlEnumValue("watt")
    WATT("watt"),
    @XmlEnumValue("joule")
    JOULE("joule"),
    @XmlEnumValue("teraBytes")
    TERA_BYTES("teraBytes"),
    @XmlEnumValue("celsius")
    CELSIUS("celsius"),
    @XmlEnumValue("nanosecond")
    NANOSECOND("nanosecond");
    private final String value;

    PerformanceManagerUnit(String v) {
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
    public static PerformanceManagerUnit fromValue(String v) {
        for (PerformanceManagerUnit c: PerformanceManagerUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
