
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostImageAcceptanceLevel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostImageAcceptanceLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmware_certified"/>
 *     <enumeration value="vmware_accepted"/>
 *     <enumeration value="partner"/>
 *     <enumeration value="community"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostImageAcceptanceLevel")
@XmlEnum
public enum HostImageAcceptanceLevel {

    @XmlEnumValue("vmware_certified")
    VMWARE_CERTIFIED("vmware_certified"),
    @XmlEnumValue("vmware_accepted")
    VMWARE_ACCEPTED("vmware_accepted"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("community")
    COMMUNITY("community");
    private final String value;

    HostImageAcceptanceLevel(String v) {
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
    public static HostImageAcceptanceLevel fromValue(String v) {
        for (HostImageAcceptanceLevel c: HostImageAcceptanceLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
