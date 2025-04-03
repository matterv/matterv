
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostCapabilityUnmapMethodSupported</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostCapabilityUnmapMethodSupported">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="priority"/>
 *     <enumeration value="fixed"/>
 *     <enumeration value="dynamic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostCapabilityUnmapMethodSupported")
@XmlEnum
public enum HostCapabilityUnmapMethodSupported {

    @XmlEnumValue("priority")
    PRIORITY("priority"),
    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic");
    private final String value;

    HostCapabilityUnmapMethodSupported(String v) {
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
    public static HostCapabilityUnmapMethodSupported fromValue(String v) {
        for (HostCapabilityUnmapMethodSupported c: HostCapabilityUnmapMethodSupported.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
