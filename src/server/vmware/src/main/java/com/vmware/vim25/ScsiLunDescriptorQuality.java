
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiLunDescriptorQuality</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiLunDescriptorQuality">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="highQuality"/>
 *     <enumeration value="mediumQuality"/>
 *     <enumeration value="lowQuality"/>
 *     <enumeration value="unknownQuality"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiLunDescriptorQuality")
@XmlEnum
public enum ScsiLunDescriptorQuality {

    @XmlEnumValue("highQuality")
    HIGH_QUALITY("highQuality"),
    @XmlEnumValue("mediumQuality")
    MEDIUM_QUALITY("mediumQuality"),
    @XmlEnumValue("lowQuality")
    LOW_QUALITY("lowQuality"),
    @XmlEnumValue("unknownQuality")
    UNKNOWN_QUALITY("unknownQuality");
    private final String value;

    ScsiLunDescriptorQuality(String v) {
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
    public static ScsiLunDescriptorQuality fromValue(String v) {
        for (ScsiLunDescriptorQuality c: ScsiLunDescriptorQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
