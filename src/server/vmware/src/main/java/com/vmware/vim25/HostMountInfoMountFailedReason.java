
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostMountInfoMountFailedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostMountInfoMountFailedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONNECT_FAILURE"/>
 *     <enumeration value="MOUNT_NOT_SUPPORTED"/>
 *     <enumeration value="NFS_NOT_SUPPORTED"/>
 *     <enumeration value="MOUNT_DENIED"/>
 *     <enumeration value="MOUNT_NOT_DIR"/>
 *     <enumeration value="VOLUME_LIMIT_EXCEEDED"/>
 *     <enumeration value="CONN_LIMIT_EXCEEDED"/>
 *     <enumeration value="MOUNT_EXISTS"/>
 *     <enumeration value="OTHERS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostMountInfoMountFailedReason")
@XmlEnum
public enum HostMountInfoMountFailedReason {

    CONNECT_FAILURE,
    MOUNT_NOT_SUPPORTED,
    NFS_NOT_SUPPORTED,
    MOUNT_DENIED,
    MOUNT_NOT_DIR,
    VOLUME_LIMIT_EXCEEDED,
    CONN_LIMIT_EXCEEDED,
    MOUNT_EXISTS,
    OTHERS;

    public String value() {
        return name();
    }

    public static HostMountInfoMountFailedReason fromValue(String v) {
        return valueOf(v);
    }

}
