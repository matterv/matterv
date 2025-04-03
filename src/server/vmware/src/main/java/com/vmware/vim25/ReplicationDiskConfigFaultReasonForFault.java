
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ReplicationDiskConfigFaultReasonForFault</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReplicationDiskConfigFaultReasonForFault">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="diskNotFound"/>
 *     <enumeration value="diskTypeNotSupported"/>
 *     <enumeration value="invalidDiskKey"/>
 *     <enumeration value="invalidDiskReplicationId"/>
 *     <enumeration value="duplicateDiskReplicationId"/>
 *     <enumeration value="invalidPersistentFilePath"/>
 *     <enumeration value="reconfigureDiskReplicationIdNotAllowed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReplicationDiskConfigFaultReasonForFault")
@XmlEnum
public enum ReplicationDiskConfigFaultReasonForFault {

    @XmlEnumValue("diskNotFound")
    DISK_NOT_FOUND("diskNotFound"),
    @XmlEnumValue("diskTypeNotSupported")
    DISK_TYPE_NOT_SUPPORTED("diskTypeNotSupported"),
    @XmlEnumValue("invalidDiskKey")
    INVALID_DISK_KEY("invalidDiskKey"),
    @XmlEnumValue("invalidDiskReplicationId")
    INVALID_DISK_REPLICATION_ID("invalidDiskReplicationId"),
    @XmlEnumValue("duplicateDiskReplicationId")
    DUPLICATE_DISK_REPLICATION_ID("duplicateDiskReplicationId"),
    @XmlEnumValue("invalidPersistentFilePath")
    INVALID_PERSISTENT_FILE_PATH("invalidPersistentFilePath"),
    @XmlEnumValue("reconfigureDiskReplicationIdNotAllowed")
    RECONFIGURE_DISK_REPLICATION_ID_NOT_ALLOWED("reconfigureDiskReplicationIdNotAllowed");
    private final String value;

    ReplicationDiskConfigFaultReasonForFault(String v) {
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
    public static ReplicationDiskConfigFaultReasonForFault fromValue(String v) {
        for (ReplicationDiskConfigFaultReasonForFault c: ReplicationDiskConfigFaultReasonForFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
