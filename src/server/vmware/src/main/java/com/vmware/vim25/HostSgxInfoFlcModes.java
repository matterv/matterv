
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostSgxInfoFlcModes</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostSgxInfoFlcModes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="off"/>
 *     <enumeration value="locked"/>
 *     <enumeration value="unlocked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostSgxInfoFlcModes")
@XmlEnum
public enum HostSgxInfoFlcModes {

    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("unlocked")
    UNLOCKED("unlocked");
    private final String value;

    HostSgxInfoFlcModes(String v) {
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
    public static HostSgxInfoFlcModes fromValue(String v) {
        for (HostSgxInfoFlcModes c: HostSgxInfoFlcModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
