
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineTicketType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineTicketType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="mks"/>
 *     <enumeration value="device"/>
 *     <enumeration value="guestControl"/>
 *     <enumeration value="webmks"/>
 *     <enumeration value="guestIntegrity"/>
 *     <enumeration value="webRemoteDevice"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineTicketType")
@XmlEnum
public enum VirtualMachineTicketType {

    @XmlEnumValue("mks")
    MKS("mks"),
    @XmlEnumValue("device")
    DEVICE("device"),
    @XmlEnumValue("guestControl")
    GUEST_CONTROL("guestControl"),
    @XmlEnumValue("webmks")
    WEBMKS("webmks"),
    @XmlEnumValue("guestIntegrity")
    GUEST_INTEGRITY("guestIntegrity"),
    @XmlEnumValue("webRemoteDevice")
    WEB_REMOTE_DEVICE("webRemoteDevice");
    private final String value;

    VirtualMachineTicketType(String v) {
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
    public static VirtualMachineTicketType fromValue(String v) {
        for (VirtualMachineTicketType c: VirtualMachineTicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
