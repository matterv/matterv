
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineRelocateDiskMoveOptions</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineRelocateDiskMoveOptions">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="moveAllDiskBackingsAndAllowSharing"/>
 *     <enumeration value="moveAllDiskBackingsAndDisallowSharing"/>
 *     <enumeration value="moveChildMostDiskBacking"/>
 *     <enumeration value="createNewChildDiskBacking"/>
 *     <enumeration value="moveAllDiskBackingsAndConsolidate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineRelocateDiskMoveOptions")
@XmlEnum
public enum VirtualMachineRelocateDiskMoveOptions {

    @XmlEnumValue("moveAllDiskBackingsAndAllowSharing")
    MOVE_ALL_DISK_BACKINGS_AND_ALLOW_SHARING("moveAllDiskBackingsAndAllowSharing"),
    @XmlEnumValue("moveAllDiskBackingsAndDisallowSharing")
    MOVE_ALL_DISK_BACKINGS_AND_DISALLOW_SHARING("moveAllDiskBackingsAndDisallowSharing"),
    @XmlEnumValue("moveChildMostDiskBacking")
    MOVE_CHILD_MOST_DISK_BACKING("moveChildMostDiskBacking"),
    @XmlEnumValue("createNewChildDiskBacking")
    CREATE_NEW_CHILD_DISK_BACKING("createNewChildDiskBacking"),
    @XmlEnumValue("moveAllDiskBackingsAndConsolidate")
    MOVE_ALL_DISK_BACKINGS_AND_CONSOLIDATE("moveAllDiskBackingsAndConsolidate");
    private final String value;

    VirtualMachineRelocateDiskMoveOptions(String v) {
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
    public static VirtualMachineRelocateDiskMoveOptions fromValue(String v) {
        for (VirtualMachineRelocateDiskMoveOptions c: VirtualMachineRelocateDiskMoveOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
