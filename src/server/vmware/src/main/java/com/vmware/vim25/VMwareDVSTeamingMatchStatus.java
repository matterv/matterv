
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VMwareDVSTeamingMatchStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VMwareDVSTeamingMatchStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="iphashMatch"/>
 *     <enumeration value="nonIphashMatch"/>
 *     <enumeration value="iphashMismatch"/>
 *     <enumeration value="nonIphashMismatch"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VMwareDVSTeamingMatchStatus")
@XmlEnum
public enum VMwareDVSTeamingMatchStatus {

    @XmlEnumValue("iphashMatch")
    IPHASH_MATCH("iphashMatch"),
    @XmlEnumValue("nonIphashMatch")
    NON_IPHASH_MATCH("nonIphashMatch"),
    @XmlEnumValue("iphashMismatch")
    IPHASH_MISMATCH("iphashMismatch"),
    @XmlEnumValue("nonIphashMismatch")
    NON_IPHASH_MISMATCH("nonIphashMismatch");
    private final String value;

    VMwareDVSTeamingMatchStatus(String v) {
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
    public static VMwareDVSTeamingMatchStatus fromValue(String v) {
        for (VMwareDVSTeamingMatchStatus c: VMwareDVSTeamingMatchStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
