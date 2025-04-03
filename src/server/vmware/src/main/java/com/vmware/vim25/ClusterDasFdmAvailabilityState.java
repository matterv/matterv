
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasFdmAvailabilityState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasFdmAvailabilityState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="uninitialized"/>
 *     <enumeration value="election"/>
 *     <enumeration value="master"/>
 *     <enumeration value="connectedToMaster"/>
 *     <enumeration value="networkPartitionedFromMaster"/>
 *     <enumeration value="networkIsolated"/>
 *     <enumeration value="hostDown"/>
 *     <enumeration value="initializationError"/>
 *     <enumeration value="uninitializationError"/>
 *     <enumeration value="fdmUnreachable"/>
 *     <enumeration value="retry"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasFdmAvailabilityState")
@XmlEnum
public enum ClusterDasFdmAvailabilityState {

    @XmlEnumValue("uninitialized")
    UNINITIALIZED("uninitialized"),
    @XmlEnumValue("election")
    ELECTION("election"),
    @XmlEnumValue("master")
    MASTER("master"),
    @XmlEnumValue("connectedToMaster")
    CONNECTED_TO_MASTER("connectedToMaster"),
    @XmlEnumValue("networkPartitionedFromMaster")
    NETWORK_PARTITIONED_FROM_MASTER("networkPartitionedFromMaster"),
    @XmlEnumValue("networkIsolated")
    NETWORK_ISOLATED("networkIsolated"),
    @XmlEnumValue("hostDown")
    HOST_DOWN("hostDown"),
    @XmlEnumValue("initializationError")
    INITIALIZATION_ERROR("initializationError"),
    @XmlEnumValue("uninitializationError")
    UNINITIALIZATION_ERROR("uninitializationError"),
    @XmlEnumValue("fdmUnreachable")
    FDM_UNREACHABLE("fdmUnreachable"),
    @XmlEnumValue("retry")
    RETRY("retry");
    private final String value;

    ClusterDasFdmAvailabilityState(String v) {
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
    public static ClusterDasFdmAvailabilityState fromValue(String v) {
        for (ClusterDasFdmAvailabilityState c: ClusterDasFdmAvailabilityState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
