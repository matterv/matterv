
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ScsiLunState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ScsiLunState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unknownState"/>
 *     <enumeration value="ok"/>
 *     <enumeration value="error"/>
 *     <enumeration value="off"/>
 *     <enumeration value="quiesced"/>
 *     <enumeration value="degraded"/>
 *     <enumeration value="lostCommunication"/>
 *     <enumeration value="timeout"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScsiLunState")
@XmlEnum
public enum ScsiLunState {

    @XmlEnumValue("unknownState")
    UNKNOWN_STATE("unknownState"),
    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("quiesced")
    QUIESCED("quiesced"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("lostCommunication")
    LOST_COMMUNICATION("lostCommunication"),
    @XmlEnumValue("timeout")
    TIMEOUT("timeout");
    private final String value;

    ScsiLunState(String v) {
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
    public static ScsiLunState fromValue(String v) {
        for (ScsiLunState c: ScsiLunState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
