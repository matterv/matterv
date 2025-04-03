
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ProfileParameterMetadataRelationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ProfileParameterMetadataRelationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="dynamic_relation"/>
 *     <enumeration value="extensible_relation"/>
 *     <enumeration value="localizable_relation"/>
 *     <enumeration value="static_relation"/>
 *     <enumeration value="validation_relation"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProfileParameterMetadataRelationType")
@XmlEnum
public enum ProfileParameterMetadataRelationType {

    @XmlEnumValue("dynamic_relation")
    DYNAMIC_RELATION("dynamic_relation"),
    @XmlEnumValue("extensible_relation")
    EXTENSIBLE_RELATION("extensible_relation"),
    @XmlEnumValue("localizable_relation")
    LOCALIZABLE_RELATION("localizable_relation"),
    @XmlEnumValue("static_relation")
    STATIC_RELATION("static_relation"),
    @XmlEnumValue("validation_relation")
    VALIDATION_RELATION("validation_relation");
    private final String value;

    ProfileParameterMetadataRelationType(String v) {
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
    public static ProfileParameterMetadataRelationType fromValue(String v) {
        for (ProfileParameterMetadataRelationType c: ProfileParameterMetadataRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
