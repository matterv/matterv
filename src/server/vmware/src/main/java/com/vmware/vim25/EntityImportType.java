
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EntityImportType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EntityImportType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="createEntityWithNewIdentifier"/>
 *     <enumeration value="createEntityWithOriginalIdentifier"/>
 *     <enumeration value="applyToEntitySpecified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntityImportType")
@XmlEnum
public enum EntityImportType {

    @XmlEnumValue("createEntityWithNewIdentifier")
    CREATE_ENTITY_WITH_NEW_IDENTIFIER("createEntityWithNewIdentifier"),
    @XmlEnumValue("createEntityWithOriginalIdentifier")
    CREATE_ENTITY_WITH_ORIGINAL_IDENTIFIER("createEntityWithOriginalIdentifier"),
    @XmlEnumValue("applyToEntitySpecified")
    APPLY_TO_ENTITY_SPECIFIED("applyToEntitySpecified");
    private final String value;

    EntityImportType(String v) {
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
    public static EntityImportType fromValue(String v) {
        for (EntityImportType c: EntityImportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
