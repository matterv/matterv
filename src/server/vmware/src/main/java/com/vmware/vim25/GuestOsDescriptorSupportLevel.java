
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for GuestOsDescriptorSupportLevel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GuestOsDescriptorSupportLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="experimental"/>
 *     <enumeration value="legacy"/>
 *     <enumeration value="terminated"/>
 *     <enumeration value="supported"/>
 *     <enumeration value="unsupported"/>
 *     <enumeration value="deprecated"/>
 *     <enumeration value="techPreview"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GuestOsDescriptorSupportLevel")
@XmlEnum
public enum GuestOsDescriptorSupportLevel {

    @XmlEnumValue("experimental")
    EXPERIMENTAL("experimental"),
    @XmlEnumValue("legacy")
    LEGACY("legacy"),
    @XmlEnumValue("terminated")
    TERMINATED("terminated"),
    @XmlEnumValue("supported")
    SUPPORTED("supported"),
    @XmlEnumValue("unsupported")
    UNSUPPORTED("unsupported"),
    @XmlEnumValue("deprecated")
    DEPRECATED("deprecated"),
    @XmlEnumValue("techPreview")
    TECH_PREVIEW("techPreview");
    private final String value;

    GuestOsDescriptorSupportLevel(String v) {
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
    public static GuestOsDescriptorSupportLevel fromValue(String v) {
        for (GuestOsDescriptorSupportLevel c: GuestOsDescriptorSupportLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
