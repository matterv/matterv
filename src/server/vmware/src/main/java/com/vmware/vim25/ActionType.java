
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ActionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MigrationV1"/>
 *     <enumeration value="VmPowerV1"/>
 *     <enumeration value="HostPowerV1"/>
 *     <enumeration value="HostMaintenanceV1"/>
 *     <enumeration value="StorageMigrationV1"/>
 *     <enumeration value="StoragePlacementV1"/>
 *     <enumeration value="PlacementV1"/>
 *     <enumeration value="HostInfraUpdateHaV1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {

    @XmlEnumValue("MigrationV1")
    MIGRATION_V_1("MigrationV1"),
    @XmlEnumValue("VmPowerV1")
    VM_POWER_V_1("VmPowerV1"),
    @XmlEnumValue("HostPowerV1")
    HOST_POWER_V_1("HostPowerV1"),
    @XmlEnumValue("HostMaintenanceV1")
    HOST_MAINTENANCE_V_1("HostMaintenanceV1"),
    @XmlEnumValue("StorageMigrationV1")
    STORAGE_MIGRATION_V_1("StorageMigrationV1"),
    @XmlEnumValue("StoragePlacementV1")
    STORAGE_PLACEMENT_V_1("StoragePlacementV1"),
    @XmlEnumValue("PlacementV1")
    PLACEMENT_V_1("PlacementV1"),
    @XmlEnumValue("HostInfraUpdateHaV1")
    HOST_INFRA_UPDATE_HA_V_1("HostInfraUpdateHaV1");
    private final String value;

    ActionType(String v) {
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
    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
