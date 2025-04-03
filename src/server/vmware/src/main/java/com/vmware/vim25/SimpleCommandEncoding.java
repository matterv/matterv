
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SimpleCommandEncoding</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SimpleCommandEncoding">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSV"/>
 *     <enumeration value="HEX"/>
 *     <enumeration value="STRING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SimpleCommandEncoding")
@XmlEnum
public enum SimpleCommandEncoding {

    CSV,
    HEX,
    STRING;

    public String value() {
        return name();
    }

    public static SimpleCommandEncoding fromValue(String v) {
        return valueOf(v);
    }

}
