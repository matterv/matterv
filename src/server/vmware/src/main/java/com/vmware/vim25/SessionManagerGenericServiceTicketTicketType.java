
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SessionManagerGenericServiceTicketTicketType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SessionManagerGenericServiceTicketTicketType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HttpNfcServiceTicket"/>
 *     <enumeration value="HostServiceTicket"/>
 *     <enumeration value="VcServiceTicket"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SessionManagerGenericServiceTicketTicketType")
@XmlEnum
public enum SessionManagerGenericServiceTicketTicketType {

    @XmlEnumValue("HttpNfcServiceTicket")
    HTTP_NFC_SERVICE_TICKET("HttpNfcServiceTicket"),
    @XmlEnumValue("HostServiceTicket")
    HOST_SERVICE_TICKET("HostServiceTicket"),
    @XmlEnumValue("VcServiceTicket")
    VC_SERVICE_TICKET("VcServiceTicket");
    private final String value;

    SessionManagerGenericServiceTicketTicketType(String v) {
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
    public static SessionManagerGenericServiceTicketTicketType fromValue(String v) {
        for (SessionManagerGenericServiceTicketTicketType c: SessionManagerGenericServiceTicketTicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
