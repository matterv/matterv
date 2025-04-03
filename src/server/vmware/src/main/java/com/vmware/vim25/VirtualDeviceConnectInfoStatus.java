
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDeviceConnectInfoStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDeviceConnectInfoStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ok"/>
 *     <enumeration value="recoverableError"/>
 *     <enumeration value="unrecoverableError"/>
 *     <enumeration value="untried"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDeviceConnectInfoStatus")
@XmlEnum
public enum VirtualDeviceConnectInfoStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("recoverableError")
    RECOVERABLE_ERROR("recoverableError"),
    @XmlEnumValue("unrecoverableError")
    UNRECOVERABLE_ERROR("unrecoverableError"),
    @XmlEnumValue("untried")
    UNTRIED("untried");
    private final String value;

    VirtualDeviceConnectInfoStatus(String v) {
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
    public static VirtualDeviceConnectInfoStatus fromValue(String v) {
        for (VirtualDeviceConnectInfoStatus c: VirtualDeviceConnectInfoStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
