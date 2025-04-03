
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostPartialMaintenanceModeStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostPartialMaintenanceModeStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="notInPartialMM"/>
 *     <enumeration value="enteringPartialMM"/>
 *     <enumeration value="exitingPartialMM"/>
 *     <enumeration value="inPartialMM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostPartialMaintenanceModeStatus")
@XmlEnum
public enum HostPartialMaintenanceModeStatus {

    @XmlEnumValue("notInPartialMM")
    NOT_IN_PARTIAL_MM("notInPartialMM"),
    @XmlEnumValue("enteringPartialMM")
    ENTERING_PARTIAL_MM("enteringPartialMM"),
    @XmlEnumValue("exitingPartialMM")
    EXITING_PARTIAL_MM("exitingPartialMM"),
    @XmlEnumValue("inPartialMM")
    IN_PARTIAL_MM("inPartialMM");
    private final String value;

    HostPartialMaintenanceModeStatus(String v) {
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
    public static HostPartialMaintenanceModeStatus fromValue(String v) {
        for (HostPartialMaintenanceModeStatus c: HostPartialMaintenanceModeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
