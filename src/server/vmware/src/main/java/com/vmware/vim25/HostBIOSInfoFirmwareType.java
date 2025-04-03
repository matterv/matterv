
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostBIOSInfoFirmwareType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostBIOSInfoFirmwareType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIOS"/>
 *     <enumeration value="UEFI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostBIOSInfoFirmwareType")
@XmlEnum
public enum HostBIOSInfoFirmwareType {

    BIOS,
    UEFI;

    public String value() {
        return name();
    }

    public static HostBIOSInfoFirmwareType fromValue(String v) {
        return valueOf(v);
    }

}
