
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ReplicationVmFaultReasonForFault</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReplicationVmFaultReasonForFault">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="notConfigured"/>
 *     <enumeration value="poweredOff"/>
 *     <enumeration value="suspended"/>
 *     <enumeration value="poweredOn"/>
 *     <enumeration value="offlineReplicating"/>
 *     <enumeration value="invalidState"/>
 *     <enumeration value="invalidInstanceId"/>
 *     <enumeration value="closeDiskError"/>
 *     <enumeration value="groupExist"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReplicationVmFaultReasonForFault")
@XmlEnum
public enum ReplicationVmFaultReasonForFault {

    @XmlEnumValue("notConfigured")
    NOT_CONFIGURED("notConfigured"),
    @XmlEnumValue("poweredOff")
    POWERED_OFF("poweredOff"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("poweredOn")
    POWERED_ON("poweredOn"),
    @XmlEnumValue("offlineReplicating")
    OFFLINE_REPLICATING("offlineReplicating"),
    @XmlEnumValue("invalidState")
    INVALID_STATE("invalidState"),
    @XmlEnumValue("invalidInstanceId")
    INVALID_INSTANCE_ID("invalidInstanceId"),
    @XmlEnumValue("closeDiskError")
    CLOSE_DISK_ERROR("closeDiskError"),
    @XmlEnumValue("groupExist")
    GROUP_EXIST("groupExist");
    private final String value;

    ReplicationVmFaultReasonForFault(String v) {
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
    public static ReplicationVmFaultReasonForFault fromValue(String v) {
        for (ReplicationVmFaultReasonForFault c: ReplicationVmFaultReasonForFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
