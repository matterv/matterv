
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterInfraUpdateHaConfigInfoRemediationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterInfraUpdateHaConfigInfoRemediationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QuarantineMode"/>
 *     <enumeration value="MaintenanceMode"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterInfraUpdateHaConfigInfoRemediationType")
@XmlEnum
public enum ClusterInfraUpdateHaConfigInfoRemediationType {

    @XmlEnumValue("QuarantineMode")
    QUARANTINE_MODE("QuarantineMode"),
    @XmlEnumValue("MaintenanceMode")
    MAINTENANCE_MODE("MaintenanceMode");
    private final String value;

    ClusterInfraUpdateHaConfigInfoRemediationType(String v) {
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
    public static ClusterInfraUpdateHaConfigInfoRemediationType fromValue(String v) {
        for (ClusterInfraUpdateHaConfigInfoRemediationType c: ClusterInfraUpdateHaConfigInfoRemediationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
