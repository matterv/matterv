
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmNptIncompatibleGuest"/>
 *     <enumeration value="vmNptIncompatibleGuestDriver"/>
 *     <enumeration value="vmNptIncompatibleAdapterType"/>
 *     <enumeration value="vmNptDisabledOrDisconnectedAdapter"/>
 *     <enumeration value="vmNptIncompatibleAdapterFeatures"/>
 *     <enumeration value="vmNptIncompatibleBackingType"/>
 *     <enumeration value="vmNptInsufficientMemoryReservation"/>
 *     <enumeration value="vmNptFaultToleranceOrRecordReplayConfigured"/>
 *     <enumeration value="vmNptConflictingIOChainConfigured"/>
 *     <enumeration value="vmNptMonitorBlocks"/>
 *     <enumeration value="vmNptConflictingOperationInProgress"/>
 *     <enumeration value="vmNptRuntimeError"/>
 *     <enumeration value="vmNptOutOfIntrVector"/>
 *     <enumeration value="vmNptVMCIActive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm")
@XmlEnum
public enum VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm {

    @XmlEnumValue("vmNptIncompatibleGuest")
    VM_NPT_INCOMPATIBLE_GUEST("vmNptIncompatibleGuest"),
    @XmlEnumValue("vmNptIncompatibleGuestDriver")
    VM_NPT_INCOMPATIBLE_GUEST_DRIVER("vmNptIncompatibleGuestDriver"),
    @XmlEnumValue("vmNptIncompatibleAdapterType")
    VM_NPT_INCOMPATIBLE_ADAPTER_TYPE("vmNptIncompatibleAdapterType"),
    @XmlEnumValue("vmNptDisabledOrDisconnectedAdapter")
    VM_NPT_DISABLED_OR_DISCONNECTED_ADAPTER("vmNptDisabledOrDisconnectedAdapter"),
    @XmlEnumValue("vmNptIncompatibleAdapterFeatures")
    VM_NPT_INCOMPATIBLE_ADAPTER_FEATURES("vmNptIncompatibleAdapterFeatures"),
    @XmlEnumValue("vmNptIncompatibleBackingType")
    VM_NPT_INCOMPATIBLE_BACKING_TYPE("vmNptIncompatibleBackingType"),
    @XmlEnumValue("vmNptInsufficientMemoryReservation")
    VM_NPT_INSUFFICIENT_MEMORY_RESERVATION("vmNptInsufficientMemoryReservation"),
    @XmlEnumValue("vmNptFaultToleranceOrRecordReplayConfigured")
    VM_NPT_FAULT_TOLERANCE_OR_RECORD_REPLAY_CONFIGURED("vmNptFaultToleranceOrRecordReplayConfigured"),
    @XmlEnumValue("vmNptConflictingIOChainConfigured")
    VM_NPT_CONFLICTING_IO_CHAIN_CONFIGURED("vmNptConflictingIOChainConfigured"),
    @XmlEnumValue("vmNptMonitorBlocks")
    VM_NPT_MONITOR_BLOCKS("vmNptMonitorBlocks"),
    @XmlEnumValue("vmNptConflictingOperationInProgress")
    VM_NPT_CONFLICTING_OPERATION_IN_PROGRESS("vmNptConflictingOperationInProgress"),
    @XmlEnumValue("vmNptRuntimeError")
    VM_NPT_RUNTIME_ERROR("vmNptRuntimeError"),
    @XmlEnumValue("vmNptOutOfIntrVector")
    VM_NPT_OUT_OF_INTR_VECTOR("vmNptOutOfIntrVector"),
    @XmlEnumValue("vmNptVMCIActive")
    VM_NPT_VMCI_ACTIVE("vmNptVMCIActive");
    private final String value;

    VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm(String v) {
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
    public static VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm fromValue(String v) {
        for (VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm c: VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
