
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="pciPassthru"/>
 *     <enumeration value="nvidiaVgpu"/>
 *     <enumeration value="sriovNic"/>
 *     <enumeration value="dvx"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType")
@XmlEnum
public enum VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType {

    @XmlEnumValue("pciPassthru")
    PCI_PASSTHRU("pciPassthru"),
    @XmlEnumValue("nvidiaVgpu")
    NVIDIA_VGPU("nvidiaVgpu"),
    @XmlEnumValue("sriovNic")
    SRIOV_NIC("sriovNic"),
    @XmlEnumValue("dvx")
    DVX("dvx");
    private final String value;

    VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType(String v) {
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
    public static VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType fromValue(String v) {
        for (VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType c: VirtualMachineVendorDeviceGroupInfoComponentDeviceInfoComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
