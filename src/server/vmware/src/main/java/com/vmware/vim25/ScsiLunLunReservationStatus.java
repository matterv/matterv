
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiLunLunReservationStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiLunLunReservationStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LUN_RESERVED_UNKNOWN"/>
 *     <enumeration value="LUN_RESERVED_YES"/>
 *     <enumeration value="LUN_RESERVED_NO"/>
 *     <enumeration value="LUN_RESERVED_NOT_SUPPORTED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiLunLunReservationStatus")
@XmlEnum
public enum ScsiLunLunReservationStatus {

    LUN_RESERVED_UNKNOWN,
    LUN_RESERVED_YES,
    LUN_RESERVED_NO,
    LUN_RESERVED_NOT_SUPPORTED;

    public String value() {
        return name();
    }

    public static ScsiLunLunReservationStatus fromValue(String v) {
        return valueOf(v);
    }

}
