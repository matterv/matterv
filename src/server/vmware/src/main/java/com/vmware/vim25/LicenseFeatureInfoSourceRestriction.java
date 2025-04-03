
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LicenseFeatureInfoSourceRestriction</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseFeatureInfoSourceRestriction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unrestricted"/>
 *     <enumeration value="served"/>
 *     <enumeration value="file"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseFeatureInfoSourceRestriction")
@XmlEnum
public enum LicenseFeatureInfoSourceRestriction {

    @XmlEnumValue("unrestricted")
    UNRESTRICTED("unrestricted"),
    @XmlEnumValue("served")
    SERVED("served"),
    @XmlEnumValue("file")
    FILE("file");
    private final String value;

    LicenseFeatureInfoSourceRestriction(String v) {
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
    public static LicenseFeatureInfoSourceRestriction fromValue(String v) {
        for (LicenseFeatureInfoSourceRestriction c: LicenseFeatureInfoSourceRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
