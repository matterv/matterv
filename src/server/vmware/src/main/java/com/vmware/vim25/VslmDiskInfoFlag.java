
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for vslmDiskInfoFlag</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="vslmDiskInfoFlag">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="id"/>
 *     <enumeration value="descriptorVersion"/>
 *     <enumeration value="backingObjectId"/>
 *     <enumeration value="path"/>
 *     <enumeration value="parentPath"/>
 *     <enumeration value="name"/>
 *     <enumeration value="deviceName"/>
 *     <enumeration value="capacity"/>
 *     <enumeration value="allocated"/>
 *     <enumeration value="type"/>
 *     <enumeration value="consumers"/>
 *     <enumeration value="tentativeState"/>
 *     <enumeration value="createTime"/>
 *     <enumeration value="ioFilter"/>
 *     <enumeration value="controlFlags"/>
 *     <enumeration value="keepAfterVmDelete"/>
 *     <enumeration value="relocationDisabled"/>
 *     <enumeration value="keyId"/>
 *     <enumeration value="keyProviderId"/>
 *     <enumeration value="nativeSnapshotSupported"/>
 *     <enumeration value="cbtEnabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "vslmDiskInfoFlag")
@XmlEnum
public enum VslmDiskInfoFlag {

    @XmlEnumValue("id")
    ID("id"),
    @XmlEnumValue("descriptorVersion")
    DESCRIPTOR_VERSION("descriptorVersion"),
    @XmlEnumValue("backingObjectId")
    BACKING_OBJECT_ID("backingObjectId"),
    @XmlEnumValue("path")
    PATH("path"),
    @XmlEnumValue("parentPath")
    PARENT_PATH("parentPath"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("deviceName")
    DEVICE_NAME("deviceName"),
    @XmlEnumValue("capacity")
    CAPACITY("capacity"),
    @XmlEnumValue("allocated")
    ALLOCATED("allocated"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("consumers")
    CONSUMERS("consumers"),
    @XmlEnumValue("tentativeState")
    TENTATIVE_STATE("tentativeState"),
    @XmlEnumValue("createTime")
    CREATE_TIME("createTime"),
    @XmlEnumValue("ioFilter")
    IO_FILTER("ioFilter"),
    @XmlEnumValue("controlFlags")
    CONTROL_FLAGS("controlFlags"),
    @XmlEnumValue("keepAfterVmDelete")
    KEEP_AFTER_VM_DELETE("keepAfterVmDelete"),
    @XmlEnumValue("relocationDisabled")
    RELOCATION_DISABLED("relocationDisabled"),
    @XmlEnumValue("keyId")
    KEY_ID("keyId"),
    @XmlEnumValue("keyProviderId")
    KEY_PROVIDER_ID("keyProviderId"),
    @XmlEnumValue("nativeSnapshotSupported")
    NATIVE_SNAPSHOT_SUPPORTED("nativeSnapshotSupported"),
    @XmlEnumValue("cbtEnabled")
    CBT_ENABLED("cbtEnabled");
    private final String value;

    VslmDiskInfoFlag(String v) {
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
    public static VslmDiskInfoFlag fromValue(String v) {
        for (VslmDiskInfoFlag c: VslmDiskInfoFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
