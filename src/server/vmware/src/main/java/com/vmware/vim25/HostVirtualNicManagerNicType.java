
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostVirtualNicManagerNicType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostVirtualNicManagerNicType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmotion"/>
 *     <enumeration value="faultToleranceLogging"/>
 *     <enumeration value="vSphereReplication"/>
 *     <enumeration value="vSphereReplicationNFC"/>
 *     <enumeration value="management"/>
 *     <enumeration value="vsan"/>
 *     <enumeration value="vSphereProvisioning"/>
 *     <enumeration value="vsanWitness"/>
 *     <enumeration value="vSphereBackupNFC"/>
 *     <enumeration value="ptp"/>
 *     <enumeration value="nvmeTcp"/>
 *     <enumeration value="nvmeRdma"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostVirtualNicManagerNicType")
@XmlEnum
public enum HostVirtualNicManagerNicType {

    @XmlEnumValue("vmotion")
    VMOTION("vmotion"),
    @XmlEnumValue("faultToleranceLogging")
    FAULT_TOLERANCE_LOGGING("faultToleranceLogging"),
    @XmlEnumValue("vSphereReplication")
    V_SPHERE_REPLICATION("vSphereReplication"),
    @XmlEnumValue("vSphereReplicationNFC")
    V_SPHERE_REPLICATION_NFC("vSphereReplicationNFC"),
    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("vsan")
    VSAN("vsan"),
    @XmlEnumValue("vSphereProvisioning")
    V_SPHERE_PROVISIONING("vSphereProvisioning"),
    @XmlEnumValue("vsanWitness")
    VSAN_WITNESS("vsanWitness"),
    @XmlEnumValue("vSphereBackupNFC")
    V_SPHERE_BACKUP_NFC("vSphereBackupNFC"),
    @XmlEnumValue("ptp")
    PTP("ptp"),
    @XmlEnumValue("nvmeTcp")
    NVME_TCP("nvmeTcp"),
    @XmlEnumValue("nvmeRdma")
    NVME_RDMA("nvmeRdma");
    private final String value;

    HostVirtualNicManagerNicType(String v) {
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
    public static HostVirtualNicManagerNicType fromValue(String v) {
        for (HostVirtualNicManagerNicType c: HostVirtualNicManagerNicType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
