
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostProtocolEndpointProtocolEndpointType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostProtocolEndpointProtocolEndpointType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="scsi"/>
 *     <enumeration value="nfs"/>
 *     <enumeration value="nfs4x"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostProtocolEndpointProtocolEndpointType")
@XmlEnum
public enum HostProtocolEndpointProtocolEndpointType {

    @XmlEnumValue("scsi")
    SCSI("scsi"),
    @XmlEnumValue("nfs")
    NFS("nfs"),
    @XmlEnumValue("nfs4x")
    NFS_4_X("nfs4x");
    private final String value;

    HostProtocolEndpointProtocolEndpointType(String v) {
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
    public static HostProtocolEndpointProtocolEndpointType fromValue(String v) {
        for (HostProtocolEndpointProtocolEndpointType c: HostProtocolEndpointProtocolEndpointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
