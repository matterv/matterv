
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostRuntimeInfoStatelessNvdsMigrationState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostRuntimeInfoStatelessNvdsMigrationState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ready"/>
 *     <enumeration value="notNeeded"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostRuntimeInfoStatelessNvdsMigrationState")
@XmlEnum
public enum HostRuntimeInfoStatelessNvdsMigrationState {

    @XmlEnumValue("ready")
    READY("ready"),
    @XmlEnumValue("notNeeded")
    NOT_NEEDED("notNeeded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostRuntimeInfoStatelessNvdsMigrationState(String v) {
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
    public static HostRuntimeInfoStatelessNvdsMigrationState fromValue(String v) {
        for (HostRuntimeInfoStatelessNvdsMigrationState c: HostRuntimeInfoStatelessNvdsMigrationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
