
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasVmSettingsIsolationResponse</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasVmSettingsIsolationResponse">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="powerOff"/>
 *     <enumeration value="shutdown"/>
 *     <enumeration value="clusterIsolationResponse"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasVmSettingsIsolationResponse")
@XmlEnum
public enum ClusterDasVmSettingsIsolationResponse {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("powerOff")
    POWER_OFF("powerOff"),
    @XmlEnumValue("shutdown")
    SHUTDOWN("shutdown"),
    @XmlEnumValue("clusterIsolationResponse")
    CLUSTER_ISOLATION_RESPONSE("clusterIsolationResponse");
    private final String value;

    ClusterDasVmSettingsIsolationResponse(String v) {
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
    public static ClusterDasVmSettingsIsolationResponse fromValue(String v) {
        for (ClusterDasVmSettingsIsolationResponse c: ClusterDasVmSettingsIsolationResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
