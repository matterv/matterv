
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VMwareDVSVspanSessionEncapType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VMwareDVSVspanSessionEncapType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="gre"/>
 *     <enumeration value="erspan2"/>
 *     <enumeration value="erspan3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VMwareDVSVspanSessionEncapType")
@XmlEnum
public enum VMwareDVSVspanSessionEncapType {

    @XmlEnumValue("gre")
    GRE("gre"),
    @XmlEnumValue("erspan2")
    ERSPAN_2("erspan2"),
    @XmlEnumValue("erspan3")
    ERSPAN_3("erspan3");
    private final String value;

    VMwareDVSVspanSessionEncapType(String v) {
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
    public static VMwareDVSVspanSessionEncapType fromValue(String v) {
        for (VMwareDVSVspanSessionEncapType c: VMwareDVSVspanSessionEncapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
