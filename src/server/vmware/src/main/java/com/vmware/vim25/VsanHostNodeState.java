
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VsanHostNodeState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VsanHostNodeState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="error"/>
 *     <enumeration value="disabled"/>
 *     <enumeration value="agent"/>
 *     <enumeration value="master"/>
 *     <enumeration value="backup"/>
 *     <enumeration value="starting"/>
 *     <enumeration value="stopping"/>
 *     <enumeration value="enteringMaintenanceMode"/>
 *     <enumeration value="exitingMaintenanceMode"/>
 *     <enumeration value="decommissioning"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VsanHostNodeState")
@XmlEnum
public enum VsanHostNodeState {

    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("agent")
    AGENT("agent"),
    @XmlEnumValue("master")
    MASTER("master"),
    @XmlEnumValue("backup")
    BACKUP("backup"),
    @XmlEnumValue("starting")
    STARTING("starting"),
    @XmlEnumValue("stopping")
    STOPPING("stopping"),
    @XmlEnumValue("enteringMaintenanceMode")
    ENTERING_MAINTENANCE_MODE("enteringMaintenanceMode"),
    @XmlEnumValue("exitingMaintenanceMode")
    EXITING_MAINTENANCE_MODE("exitingMaintenanceMode"),
    @XmlEnumValue("decommissioning")
    DECOMMISSIONING("decommissioning");
    private final String value;

    VsanHostNodeState(String v) {
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
    public static VsanHostNodeState fromValue(String v) {
        for (VsanHostNodeState c: VsanHostNodeState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
