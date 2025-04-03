
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PerfSummaryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PerfSummaryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="average"/>
 *     <enumeration value="maximum"/>
 *     <enumeration value="minimum"/>
 *     <enumeration value="latest"/>
 *     <enumeration value="summation"/>
 *     <enumeration value="none"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerfSummaryType")
@XmlEnum
public enum PerfSummaryType {

    @XmlEnumValue("average")
    AVERAGE("average"),
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),
    @XmlEnumValue("latest")
    LATEST("latest"),
    @XmlEnumValue("summation")
    SUMMATION("summation"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    PerfSummaryType(String v) {
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
    public static PerfSummaryType fromValue(String v) {
        for (PerfSummaryType c: PerfSummaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
