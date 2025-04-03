
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualVmxnet3VrdmaOptionDeviceProtocols</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualVmxnet3VrdmaOptionDeviceProtocols">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="rocev1"/>
 *     <enumeration value="rocev2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualVmxnet3VrdmaOptionDeviceProtocols")
@XmlEnum
public enum VirtualVmxnet3VrdmaOptionDeviceProtocols {

    @XmlEnumValue("rocev1")
    ROCEV_1("rocev1"),
    @XmlEnumValue("rocev2")
    ROCEV_2("rocev2");
    private final String value;

    VirtualVmxnet3VrdmaOptionDeviceProtocols(String v) {
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
    public static VirtualVmxnet3VrdmaOptionDeviceProtocols fromValue(String v) {
        for (VirtualVmxnet3VrdmaOptionDeviceProtocols c: VirtualVmxnet3VrdmaOptionDeviceProtocols.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
