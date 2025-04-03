
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasVmSettingsRestartPriority</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasVmSettingsRestartPriority">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="disabled"/>
 *     <enumeration value="lowest"/>
 *     <enumeration value="low"/>
 *     <enumeration value="medium"/>
 *     <enumeration value="high"/>
 *     <enumeration value="highest"/>
 *     <enumeration value="clusterRestartPriority"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasVmSettingsRestartPriority")
@XmlEnum
public enum ClusterDasVmSettingsRestartPriority {

    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("lowest")
    LOWEST("lowest"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("highest")
    HIGHEST("highest"),
    @XmlEnumValue("clusterRestartPriority")
    CLUSTER_RESTART_PRIORITY("clusterRestartPriority");
    private final String value;

    ClusterDasVmSettingsRestartPriority(String v) {
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
    public static ClusterDasVmSettingsRestartPriority fromValue(String v) {
        for (ClusterDasVmSettingsRestartPriority c: ClusterDasVmSettingsRestartPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
