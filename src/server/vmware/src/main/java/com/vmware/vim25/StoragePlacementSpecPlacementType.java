
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for StoragePlacementSpecPlacementType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StoragePlacementSpecPlacementType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="create"/>
 *     <enumeration value="reconfigure"/>
 *     <enumeration value="relocate"/>
 *     <enumeration value="clone"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StoragePlacementSpecPlacementType")
@XmlEnum
public enum StoragePlacementSpecPlacementType {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("reconfigure")
    RECONFIGURE("reconfigure"),
    @XmlEnumValue("relocate")
    RELOCATE("relocate"),
    @XmlEnumValue("clone")
    CLONE("clone");
    private final String value;

    StoragePlacementSpecPlacementType(String v) {
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
    public static StoragePlacementSpecPlacementType fromValue(String v) {
        for (StoragePlacementSpecPlacementType c: StoragePlacementSpecPlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
