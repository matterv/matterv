
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ReplicationVmConfigFaultReasonForFault</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReplicationVmConfigFaultReasonForFault">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="incompatibleHwVersion"/>
 *     <enumeration value="invalidVmReplicationId"/>
 *     <enumeration value="invalidGenerationNumber"/>
 *     <enumeration value="outOfBoundsRpoValue"/>
 *     <enumeration value="invalidDestinationIpAddress"/>
 *     <enumeration value="invalidDestinationPort"/>
 *     <enumeration value="invalidExtraVmOptions"/>
 *     <enumeration value="staleGenerationNumber"/>
 *     <enumeration value="reconfigureVmReplicationIdNotAllowed"/>
 *     <enumeration value="cannotRetrieveVmReplicationConfiguration"/>
 *     <enumeration value="replicationAlreadyEnabled"/>
 *     <enumeration value="invalidPriorConfiguration"/>
 *     <enumeration value="replicationNotEnabled"/>
 *     <enumeration value="replicationConfigurationFailed"/>
 *     <enumeration value="encryptedVm"/>
 *     <enumeration value="invalidThumbprint"/>
 *     <enumeration value="incompatibleDevice"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReplicationVmConfigFaultReasonForFault")
@XmlEnum
public enum ReplicationVmConfigFaultReasonForFault {

    @XmlEnumValue("incompatibleHwVersion")
    INCOMPATIBLE_HW_VERSION("incompatibleHwVersion"),
    @XmlEnumValue("invalidVmReplicationId")
    INVALID_VM_REPLICATION_ID("invalidVmReplicationId"),
    @XmlEnumValue("invalidGenerationNumber")
    INVALID_GENERATION_NUMBER("invalidGenerationNumber"),
    @XmlEnumValue("outOfBoundsRpoValue")
    OUT_OF_BOUNDS_RPO_VALUE("outOfBoundsRpoValue"),
    @XmlEnumValue("invalidDestinationIpAddress")
    INVALID_DESTINATION_IP_ADDRESS("invalidDestinationIpAddress"),
    @XmlEnumValue("invalidDestinationPort")
    INVALID_DESTINATION_PORT("invalidDestinationPort"),
    @XmlEnumValue("invalidExtraVmOptions")
    INVALID_EXTRA_VM_OPTIONS("invalidExtraVmOptions"),
    @XmlEnumValue("staleGenerationNumber")
    STALE_GENERATION_NUMBER("staleGenerationNumber"),
    @XmlEnumValue("reconfigureVmReplicationIdNotAllowed")
    RECONFIGURE_VM_REPLICATION_ID_NOT_ALLOWED("reconfigureVmReplicationIdNotAllowed"),
    @XmlEnumValue("cannotRetrieveVmReplicationConfiguration")
    CANNOT_RETRIEVE_VM_REPLICATION_CONFIGURATION("cannotRetrieveVmReplicationConfiguration"),
    @XmlEnumValue("replicationAlreadyEnabled")
    REPLICATION_ALREADY_ENABLED("replicationAlreadyEnabled"),
    @XmlEnumValue("invalidPriorConfiguration")
    INVALID_PRIOR_CONFIGURATION("invalidPriorConfiguration"),
    @XmlEnumValue("replicationNotEnabled")
    REPLICATION_NOT_ENABLED("replicationNotEnabled"),
    @XmlEnumValue("replicationConfigurationFailed")
    REPLICATION_CONFIGURATION_FAILED("replicationConfigurationFailed"),
    @XmlEnumValue("encryptedVm")
    ENCRYPTED_VM("encryptedVm"),
    @XmlEnumValue("invalidThumbprint")
    INVALID_THUMBPRINT("invalidThumbprint"),
    @XmlEnumValue("incompatibleDevice")
    INCOMPATIBLE_DEVICE("incompatibleDevice");
    private final String value;

    ReplicationVmConfigFaultReasonForFault(String v) {
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
    public static ReplicationVmConfigFaultReasonForFault fromValue(String v) {
        for (ReplicationVmConfigFaultReasonForFault c: ReplicationVmConfigFaultReasonForFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
