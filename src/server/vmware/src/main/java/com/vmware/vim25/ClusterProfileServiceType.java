
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterProfileServiceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterProfileServiceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRS"/>
 *     <enumeration value="HA"/>
 *     <enumeration value="DPM"/>
 *     <enumeration value="FT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterProfileServiceType")
@XmlEnum
public enum ClusterProfileServiceType {

    DRS,
    HA,
    DPM,
    FT;

    public String value() {
        return name();
    }

    public static ClusterProfileServiceType fromValue(String v) {
        return valueOf(v);
    }

}
