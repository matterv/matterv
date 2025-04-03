
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DasConfigFaultDasConfigFaultReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DasConfigFaultDasConfigFaultReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HostNetworkMisconfiguration"/>
 *     <enumeration value="HostMisconfiguration"/>
 *     <enumeration value="InsufficientPrivileges"/>
 *     <enumeration value="NoPrimaryAgentAvailable"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="NoDatastoresConfigured"/>
 *     <enumeration value="CreateConfigVvolFailed"/>
 *     <enumeration value="VSanNotSupportedOnHost"/>
 *     <enumeration value="DasNetworkMisconfiguration"/>
 *     <enumeration value="SetDesiredImageSpecFailed"/>
 *     <enumeration value="ApplyHAVibsOnClusterFailed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DasConfigFaultDasConfigFaultReason")
@XmlEnum
public enum DasConfigFaultDasConfigFaultReason {

    @XmlEnumValue("HostNetworkMisconfiguration")
    HOST_NETWORK_MISCONFIGURATION("HostNetworkMisconfiguration"),
    @XmlEnumValue("HostMisconfiguration")
    HOST_MISCONFIGURATION("HostMisconfiguration"),
    @XmlEnumValue("InsufficientPrivileges")
    INSUFFICIENT_PRIVILEGES("InsufficientPrivileges"),
    @XmlEnumValue("NoPrimaryAgentAvailable")
    NO_PRIMARY_AGENT_AVAILABLE("NoPrimaryAgentAvailable"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NoDatastoresConfigured")
    NO_DATASTORES_CONFIGURED("NoDatastoresConfigured"),
    @XmlEnumValue("CreateConfigVvolFailed")
    CREATE_CONFIG_VVOL_FAILED("CreateConfigVvolFailed"),
    @XmlEnumValue("VSanNotSupportedOnHost")
    V_SAN_NOT_SUPPORTED_ON_HOST("VSanNotSupportedOnHost"),
    @XmlEnumValue("DasNetworkMisconfiguration")
    DAS_NETWORK_MISCONFIGURATION("DasNetworkMisconfiguration"),
    @XmlEnumValue("SetDesiredImageSpecFailed")
    SET_DESIRED_IMAGE_SPEC_FAILED("SetDesiredImageSpecFailed"),
    @XmlEnumValue("ApplyHAVibsOnClusterFailed")
    APPLY_HA_VIBS_ON_CLUSTER_FAILED("ApplyHAVibsOnClusterFailed");
    private final String value;

    DasConfigFaultDasConfigFaultReason(String v) {
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
    public static DasConfigFaultDasConfigFaultReason fromValue(String v) {
        for (DasConfigFaultDasConfigFaultReason c: DasConfigFaultDasConfigFaultReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
