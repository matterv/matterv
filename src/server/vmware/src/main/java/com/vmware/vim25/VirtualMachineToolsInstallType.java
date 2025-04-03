
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineToolsInstallType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineToolsInstallType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="guestToolsTypeUnknown"/>
 *     <enumeration value="guestToolsTypeMSI"/>
 *     <enumeration value="guestToolsTypeTar"/>
 *     <enumeration value="guestToolsTypeOSP"/>
 *     <enumeration value="guestToolsTypeOpenVMTools"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineToolsInstallType")
@XmlEnum
public enum VirtualMachineToolsInstallType {

    @XmlEnumValue("guestToolsTypeUnknown")
    GUEST_TOOLS_TYPE_UNKNOWN("guestToolsTypeUnknown"),
    @XmlEnumValue("guestToolsTypeMSI")
    GUEST_TOOLS_TYPE_MSI("guestToolsTypeMSI"),
    @XmlEnumValue("guestToolsTypeTar")
    GUEST_TOOLS_TYPE_TAR("guestToolsTypeTar"),
    @XmlEnumValue("guestToolsTypeOSP")
    GUEST_TOOLS_TYPE_OSP("guestToolsTypeOSP"),
    @XmlEnumValue("guestToolsTypeOpenVMTools")
    GUEST_TOOLS_TYPE_OPEN_VM_TOOLS("guestToolsTypeOpenVMTools");
    private final String value;

    VirtualMachineToolsInstallType(String v) {
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
    public static VirtualMachineToolsInstallType fromValue(String v) {
        for (VirtualMachineToolsInstallType c: VirtualMachineToolsInstallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
