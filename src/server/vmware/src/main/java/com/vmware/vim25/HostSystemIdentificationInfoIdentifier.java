
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostSystemIdentificationInfoIdentifier</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostSystemIdentificationInfoIdentifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AssetTag"/>
 *     <enumeration value="ServiceTag"/>
 *     <enumeration value="OemSpecificString"/>
 *     <enumeration value="EnclosureSerialNumberTag"/>
 *     <enumeration value="SerialNumberTag"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostSystemIdentificationInfoIdentifier")
@XmlEnum
public enum HostSystemIdentificationInfoIdentifier {

    @XmlEnumValue("AssetTag")
    ASSET_TAG("AssetTag"),
    @XmlEnumValue("ServiceTag")
    SERVICE_TAG("ServiceTag"),
    @XmlEnumValue("OemSpecificString")
    OEM_SPECIFIC_STRING("OemSpecificString"),
    @XmlEnumValue("EnclosureSerialNumberTag")
    ENCLOSURE_SERIAL_NUMBER_TAG("EnclosureSerialNumberTag"),
    @XmlEnumValue("SerialNumberTag")
    SERIAL_NUMBER_TAG("SerialNumberTag");
    private final String value;

    HostSystemIdentificationInfoIdentifier(String v) {
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
    public static HostSystemIdentificationInfoIdentifier fromValue(String v) {
        for (HostSystemIdentificationInfoIdentifier c: HostSystemIdentificationInfoIdentifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
