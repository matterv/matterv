
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineToolsVersionStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineToolsVersionStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="guestToolsNotInstalled"/>
 *     <enumeration value="guestToolsNeedUpgrade"/>
 *     <enumeration value="guestToolsCurrent"/>
 *     <enumeration value="guestToolsUnmanaged"/>
 *     <enumeration value="guestToolsTooOld"/>
 *     <enumeration value="guestToolsSupportedOld"/>
 *     <enumeration value="guestToolsSupportedNew"/>
 *     <enumeration value="guestToolsTooNew"/>
 *     <enumeration value="guestToolsBlacklisted"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineToolsVersionStatus")
@XmlEnum
public enum VirtualMachineToolsVersionStatus {

    @XmlEnumValue("guestToolsNotInstalled")
    GUEST_TOOLS_NOT_INSTALLED("guestToolsNotInstalled"),
    @XmlEnumValue("guestToolsNeedUpgrade")
    GUEST_TOOLS_NEED_UPGRADE("guestToolsNeedUpgrade"),
    @XmlEnumValue("guestToolsCurrent")
    GUEST_TOOLS_CURRENT("guestToolsCurrent"),
    @XmlEnumValue("guestToolsUnmanaged")
    GUEST_TOOLS_UNMANAGED("guestToolsUnmanaged"),
    @XmlEnumValue("guestToolsTooOld")
    GUEST_TOOLS_TOO_OLD("guestToolsTooOld"),
    @XmlEnumValue("guestToolsSupportedOld")
    GUEST_TOOLS_SUPPORTED_OLD("guestToolsSupportedOld"),
    @XmlEnumValue("guestToolsSupportedNew")
    GUEST_TOOLS_SUPPORTED_NEW("guestToolsSupportedNew"),
    @XmlEnumValue("guestToolsTooNew")
    GUEST_TOOLS_TOO_NEW("guestToolsTooNew"),
    @XmlEnumValue("guestToolsBlacklisted")
    GUEST_TOOLS_BLACKLISTED("guestToolsBlacklisted");
    private final String value;

    VirtualMachineToolsVersionStatus(String v) {
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
    public static VirtualMachineToolsVersionStatus fromValue(String v) {
        for (VirtualMachineToolsVersionStatus c: VirtualMachineToolsVersionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
