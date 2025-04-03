
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDeviceConfigSpecChangeMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDeviceConfigSpecChangeMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="fail"/>
 *     <enumeration value="skip"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDeviceConfigSpecChangeMode")
@XmlEnum
public enum VirtualDeviceConfigSpecChangeMode {

    @XmlEnumValue("fail")
    FAIL("fail"),
    @XmlEnumValue("skip")
    SKIP("skip");
    private final String value;

    VirtualDeviceConfigSpecChangeMode(String v) {
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
    public static VirtualDeviceConfigSpecChangeMode fromValue(String v) {
        for (VirtualDeviceConfigSpecChangeMode c: VirtualDeviceConfigSpecChangeMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
