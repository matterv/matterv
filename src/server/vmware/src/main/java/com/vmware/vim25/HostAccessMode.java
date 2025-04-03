
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostAccessMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostAccessMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="accessNone"/>
 *     <enumeration value="accessAdmin"/>
 *     <enumeration value="accessNoAccess"/>
 *     <enumeration value="accessReadOnly"/>
 *     <enumeration value="accessOther"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostAccessMode")
@XmlEnum
public enum HostAccessMode {

    @XmlEnumValue("accessNone")
    ACCESS_NONE("accessNone"),
    @XmlEnumValue("accessAdmin")
    ACCESS_ADMIN("accessAdmin"),
    @XmlEnumValue("accessNoAccess")
    ACCESS_NO_ACCESS("accessNoAccess"),
    @XmlEnumValue("accessReadOnly")
    ACCESS_READ_ONLY("accessReadOnly"),
    @XmlEnumValue("accessOther")
    ACCESS_OTHER("accessOther");
    private final String value;

    HostAccessMode(String v) {
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
    public static HostAccessMode fromValue(String v) {
        for (HostAccessMode c: HostAccessMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
