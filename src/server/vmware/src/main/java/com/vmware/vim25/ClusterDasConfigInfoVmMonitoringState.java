
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasConfigInfoVmMonitoringState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasConfigInfoVmMonitoringState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmMonitoringDisabled"/>
 *     <enumeration value="vmMonitoringOnly"/>
 *     <enumeration value="vmAndAppMonitoring"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasConfigInfoVmMonitoringState")
@XmlEnum
public enum ClusterDasConfigInfoVmMonitoringState {

    @XmlEnumValue("vmMonitoringDisabled")
    VM_MONITORING_DISABLED("vmMonitoringDisabled"),
    @XmlEnumValue("vmMonitoringOnly")
    VM_MONITORING_ONLY("vmMonitoringOnly"),
    @XmlEnumValue("vmAndAppMonitoring")
    VM_AND_APP_MONITORING("vmAndAppMonitoring");
    private final String value;

    ClusterDasConfigInfoVmMonitoringState(String v) {
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
    public static ClusterDasConfigInfoVmMonitoringState fromValue(String v) {
        for (ClusterDasConfigInfoVmMonitoringState c: ClusterDasConfigInfoVmMonitoringState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
