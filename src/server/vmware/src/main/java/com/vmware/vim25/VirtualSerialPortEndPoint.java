
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualSerialPortEndPoint</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualSerialPortEndPoint">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="client"/>
 *     <enumeration value="server"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualSerialPortEndPoint")
@XmlEnum
public enum VirtualSerialPortEndPoint {

    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("server")
    SERVER("server");
    private final String value;

    VirtualSerialPortEndPoint(String v) {
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
    public static VirtualSerialPortEndPoint fromValue(String v) {
        for (VirtualSerialPortEndPoint c: VirtualSerialPortEndPoint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
