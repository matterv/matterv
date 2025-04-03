
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineFileLayoutExFileType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineFileLayoutExFileType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="config"/>
 *     <enumeration value="extendedConfig"/>
 *     <enumeration value="diskDescriptor"/>
 *     <enumeration value="diskExtent"/>
 *     <enumeration value="digestDescriptor"/>
 *     <enumeration value="digestExtent"/>
 *     <enumeration value="diskReplicationState"/>
 *     <enumeration value="log"/>
 *     <enumeration value="stat"/>
 *     <enumeration value="namespaceData"/>
 *     <enumeration value="dataSetsDiskModeStore"/>
 *     <enumeration value="dataSetsVmModeStore"/>
 *     <enumeration value="nvram"/>
 *     <enumeration value="snapshotData"/>
 *     <enumeration value="snapshotMemory"/>
 *     <enumeration value="snapshotList"/>
 *     <enumeration value="snapshotManifestList"/>
 *     <enumeration value="suspend"/>
 *     <enumeration value="suspendMemory"/>
 *     <enumeration value="swap"/>
 *     <enumeration value="uwswap"/>
 *     <enumeration value="core"/>
 *     <enumeration value="screenshot"/>
 *     <enumeration value="ftMetadata"/>
 *     <enumeration value="guestCustomization"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineFileLayoutExFileType")
@XmlEnum
public enum VirtualMachineFileLayoutExFileType {

    @XmlEnumValue("config")
    CONFIG("config"),
    @XmlEnumValue("extendedConfig")
    EXTENDED_CONFIG("extendedConfig"),
    @XmlEnumValue("diskDescriptor")
    DISK_DESCRIPTOR("diskDescriptor"),
    @XmlEnumValue("diskExtent")
    DISK_EXTENT("diskExtent"),
    @XmlEnumValue("digestDescriptor")
    DIGEST_DESCRIPTOR("digestDescriptor"),
    @XmlEnumValue("digestExtent")
    DIGEST_EXTENT("digestExtent"),
    @XmlEnumValue("diskReplicationState")
    DISK_REPLICATION_STATE("diskReplicationState"),
    @XmlEnumValue("log")
    LOG("log"),
    @XmlEnumValue("stat")
    STAT("stat"),
    @XmlEnumValue("namespaceData")
    NAMESPACE_DATA("namespaceData"),
    @XmlEnumValue("dataSetsDiskModeStore")
    DATA_SETS_DISK_MODE_STORE("dataSetsDiskModeStore"),
    @XmlEnumValue("dataSetsVmModeStore")
    DATA_SETS_VM_MODE_STORE("dataSetsVmModeStore"),
    @XmlEnumValue("nvram")
    NVRAM("nvram"),
    @XmlEnumValue("snapshotData")
    SNAPSHOT_DATA("snapshotData"),
    @XmlEnumValue("snapshotMemory")
    SNAPSHOT_MEMORY("snapshotMemory"),
    @XmlEnumValue("snapshotList")
    SNAPSHOT_LIST("snapshotList"),
    @XmlEnumValue("snapshotManifestList")
    SNAPSHOT_MANIFEST_LIST("snapshotManifestList"),
    @XmlEnumValue("suspend")
    SUSPEND("suspend"),
    @XmlEnumValue("suspendMemory")
    SUSPEND_MEMORY("suspendMemory"),
    @XmlEnumValue("swap")
    SWAP("swap"),
    @XmlEnumValue("uwswap")
    UWSWAP("uwswap"),
    @XmlEnumValue("core")
    CORE("core"),
    @XmlEnumValue("screenshot")
    SCREENSHOT("screenshot"),
    @XmlEnumValue("ftMetadata")
    FT_METADATA("ftMetadata"),
    @XmlEnumValue("guestCustomization")
    GUEST_CUSTOMIZATION("guestCustomization");
    private final String value;

    VirtualMachineFileLayoutExFileType(String v) {
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
    public static VirtualMachineFileLayoutExFileType fromValue(String v) {
        for (VirtualMachineFileLayoutExFileType c: VirtualMachineFileLayoutExFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
