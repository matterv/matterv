
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasConfigInfoServiceState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasConfigInfoServiceState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="disabled"/>
 *     <enumeration value="enabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasConfigInfoServiceState")
@XmlEnum
public enum ClusterDasConfigInfoServiceState {

    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("enabled")
    ENABLED("enabled");
    private final String value;

    ClusterDasConfigInfoServiceState(String v) {
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
    public static ClusterDasConfigInfoServiceState fromValue(String v) {
        for (ClusterDasConfigInfoServiceState c: ClusterDasConfigInfoServiceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
