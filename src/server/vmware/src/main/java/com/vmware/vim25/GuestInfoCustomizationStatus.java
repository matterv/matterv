
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for GuestInfoCustomizationStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GuestInfoCustomizationStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TOOLSDEPLOYPKG_IDLE"/>
 *     <enumeration value="TOOLSDEPLOYPKG_PENDING"/>
 *     <enumeration value="TOOLSDEPLOYPKG_RUNNING"/>
 *     <enumeration value="TOOLSDEPLOYPKG_SUCCEEDED"/>
 *     <enumeration value="TOOLSDEPLOYPKG_FAILED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GuestInfoCustomizationStatus")
@XmlEnum
public enum GuestInfoCustomizationStatus {

    TOOLSDEPLOYPKG_IDLE,
    TOOLSDEPLOYPKG_PENDING,
    TOOLSDEPLOYPKG_RUNNING,
    TOOLSDEPLOYPKG_SUCCEEDED,
    TOOLSDEPLOYPKG_FAILED;

    public String value() {
        return name();
    }

    public static GuestInfoCustomizationStatus fromValue(String v) {
        return valueOf(v);
    }

}
