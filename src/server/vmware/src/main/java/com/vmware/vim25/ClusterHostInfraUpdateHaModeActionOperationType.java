
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterHostInfraUpdateHaModeActionOperationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterHostInfraUpdateHaModeActionOperationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="enterQuarantine"/>
 *     <enumeration value="exitQuarantine"/>
 *     <enumeration value="enterMaintenance"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterHostInfraUpdateHaModeActionOperationType")
@XmlEnum
public enum ClusterHostInfraUpdateHaModeActionOperationType {

    @XmlEnumValue("enterQuarantine")
    ENTER_QUARANTINE("enterQuarantine"),
    @XmlEnumValue("exitQuarantine")
    EXIT_QUARANTINE("exitQuarantine"),
    @XmlEnumValue("enterMaintenance")
    ENTER_MAINTENANCE("enterMaintenance");
    private final String value;

    ClusterHostInfraUpdateHaModeActionOperationType(String v) {
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
    public static ClusterHostInfraUpdateHaModeActionOperationType fromValue(String v) {
        for (ClusterHostInfraUpdateHaModeActionOperationType c: ClusterHostInfraUpdateHaModeActionOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
