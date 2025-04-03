
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiLunType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiLunType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="disk"/>
 *     <enumeration value="tape"/>
 *     <enumeration value="printer"/>
 *     <enumeration value="processor"/>
 *     <enumeration value="worm"/>
 *     <enumeration value="cdrom"/>
 *     <enumeration value="scanner"/>
 *     <enumeration value="opticalDevice"/>
 *     <enumeration value="mediaChanger"/>
 *     <enumeration value="communications"/>
 *     <enumeration value="storageArrayController"/>
 *     <enumeration value="enclosure"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiLunType")
@XmlEnum
public enum ScsiLunType {

    @XmlEnumValue("disk")
    DISK("disk"),
    @XmlEnumValue("tape")
    TAPE("tape"),
    @XmlEnumValue("printer")
    PRINTER("printer"),
    @XmlEnumValue("processor")
    PROCESSOR("processor"),
    @XmlEnumValue("worm")
    WORM("worm"),
    @XmlEnumValue("cdrom")
    CDROM("cdrom"),
    @XmlEnumValue("scanner")
    SCANNER("scanner"),
    @XmlEnumValue("opticalDevice")
    OPTICAL_DEVICE("opticalDevice"),
    @XmlEnumValue("mediaChanger")
    MEDIA_CHANGER("mediaChanger"),
    @XmlEnumValue("communications")
    COMMUNICATIONS("communications"),
    @XmlEnumValue("storageArrayController")
    STORAGE_ARRAY_CONTROLLER("storageArrayController"),
    @XmlEnumValue("enclosure")
    ENCLOSURE("enclosure"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ScsiLunType(String v) {
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
    public static ScsiLunType fromValue(String v) {
        for (ScsiLunType c: ScsiLunType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
