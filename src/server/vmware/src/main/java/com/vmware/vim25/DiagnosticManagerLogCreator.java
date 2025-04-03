
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DiagnosticManagerLogCreator</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DiagnosticManagerLogCreator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vpxd"/>
 *     <enumeration value="vpxa"/>
 *     <enumeration value="hostd"/>
 *     <enumeration value="serverd"/>
 *     <enumeration value="install"/>
 *     <enumeration value="vpxClient"/>
 *     <enumeration value="recordLog"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DiagnosticManagerLogCreator")
@XmlEnum
public enum DiagnosticManagerLogCreator {

    @XmlEnumValue("vpxd")
    VPXD("vpxd"),
    @XmlEnumValue("vpxa")
    VPXA("vpxa"),
    @XmlEnumValue("hostd")
    HOSTD("hostd"),
    @XmlEnumValue("serverd")
    SERVERD("serverd"),
    @XmlEnumValue("install")
    INSTALL("install"),
    @XmlEnumValue("vpxClient")
    VPX_CLIENT("vpxClient"),
    @XmlEnumValue("recordLog")
    RECORD_LOG("recordLog");
    private final String value;

    DiagnosticManagerLogCreator(String v) {
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
    public static DiagnosticManagerLogCreator fromValue(String v) {
        for (DiagnosticManagerLogCreator c: DiagnosticManagerLogCreator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
